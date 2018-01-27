package com.internousdevwork.sagaone.action;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware{
	private String itemCategory;
	private String searchWord;
	private String[] searchWordList;
	private String searchErrorMessage;
	public Map<String,Object> session;
	private List<SearchItemInfoDTO> searchResultList = new ArrayList<SearchItemInfoDTO>();
	private List<String> reformedSearchWordList = new ArrayList<String>();
	private List<String> normalSearchWordList = new ArrayList<String>();
	private List<SearchItemInfoDTO> pageItemList = new ArrayList<SearchItemInfoDTO>();
	private int page;
	private List<Integer> pageNumList = new ArrayList<Integer>();
	private int nowPage;


	public String execute(){
		String ret = ERROR;
		nowPage=0;

		//検索ワードを整備しリスト化
		char[] c={'\u3000'};
		String wspace=new String(c);
		String result=searchWord.replaceAll(wspace," ");
		searchWordList = result.split(" ");

		//スペースが連なった状態を解消（たぶん現在は必要ない）
		for(int i=0; i<searchWordList.length; i++){
			if(!(searchWordList[i].equals(" ") || searchWordList[i].equals("　"))){
				reformedSearchWordList.add(searchWordList[i]);
			}
		}

		//検索ワードをノーマライズ
		for(int i=0; i<reformedSearchWordList.size(); i++){
			String normSW = Normalizer.normalize(reformedSearchWordList.get(i).toString(),Normalizer.Form.NFKC );
			normalSearchWordList.add(normSW);
		}

		//全商品取得
		List<SearchItemInfoDTO> searchItemDTOList =(List<SearchItemInfoDTO>)session.get("allItem");

		for(int i=0; i<searchItemDTOList.size(); i++){
			searchItemDTOList.get(i).setSearchFlg("1");
		}

		//検索カテゴリー・ワードを全商品と比較
		if(!(itemCategory.equals("0"))){
			for(int i=0; i<searchItemDTOList.size(); i++){
				for(int j=0; j<normalSearchWordList.size(); j++){
					if(!(searchItemDTOList.get(i).getDescriptionAll().contains(normalSearchWordList.get(j))) ||
						!(searchItemDTOList.get(i).getCategoryId().equals(itemCategory))){
						searchItemDTOList.get(i).setSearchFlg("0");
				}
				}
			}
		}else{
			for(int i=0; i<searchItemDTOList.size(); i++){
				for(int j=0; j<normalSearchWordList.size(); j++){
					if(!(searchItemDTOList.get(i).getDescriptionAll().contains(normalSearchWordList.get(j)))){
						searchItemDTOList.get(i).setSearchFlg("0");

					}
				}
			}
		}

		//検索該当商品のみ抜き出してリストに入れる
		for(int i=0; i<searchItemDTOList.size(); i++){
			if(searchItemDTOList.get(i).getSearchFlg().toString().equals("1")){
				searchResultList.add(searchItemDTOList.get(i));
			}
		}
		session.put("searchResultList", searchResultList);

		// 1ページ目の9商品抜き出し
		page = searchResultList.size() / 9 + 1;
		for(int i=0; i<page; i++){
			pageNumList.add(i + 1);
		}

		for(int i=0; i<1; i++){
			if(searchResultList.size() >= 9){
				for(int j=0; j<9; j++){
					pageItemList.add(i,searchResultList.get(j));
				}

			}else{
				for(int j=0; j<searchResultList.size(); j++){
					pageItemList.add(i,searchResultList.get(j));
				}
			}
		}




		//検索にヒットしているか判定
		if(!(pageItemList.isEmpty())){
			session.put("searchItemList", pageItemList);
			searchErrorMessage = "";
			ret = SUCCESS;
		}else{
			ret = ERROR;
			searchErrorMessage = "検索結果がありません";
			session.put("searchErrorMessage", searchErrorMessage);
		}
		session.put("searchErrorMessage", searchErrorMessage);
		return ret;
	}



	public String getItemCategory() {
		return itemCategory;
	}



	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}



	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}



	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public List<Integer> getPageNumList() {
		return pageNumList;
	}



	public void setPageNumList(List<Integer> pageNumList) {
		this.pageNumList = pageNumList;
	}




	public int getNowPage() {
		return nowPage;
	}



	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
