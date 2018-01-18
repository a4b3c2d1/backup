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

	public String execute(){
		String ret = ERROR;


		searchWordList = searchWord.split(" ");
		searchWordList = searchWord.split("　");

		for(int i=0; i<searchWordList.length; i++){
			if(!(searchWordList[i].equals(" ") || searchWordList[i].equals("　"))){
				reformedSearchWordList.add(searchWordList[i]);
			}
		}

		for(int i=0; i<reformedSearchWordList.size(); i++){
			String normSW = Normalizer.normalize(reformedSearchWordList.get(i).toString(),Normalizer.Form.NFKC );
			normalSearchWordList.add(normSW);
		}

		List<SearchItemInfoDTO> searchItemDTOList =(List<SearchItemInfoDTO>)session.get("allItem");


		if(!(itemCategory.equals("0"))){
			for(int i=0; i<searchItemDTOList.size(); i++){
				for(int j=0; j<normalSearchWordList.size(); j++){
					if(searchItemDTOList.get(i).getDescriptionAll().contains(normalSearchWordList.get(j)) &&
						searchItemDTOList.get(i).getCategoryId().equals(itemCategory)){
						searchItemDTOList.get(i).setSearchFlg("1");
					}else{
						searchItemDTOList.get(i).setSearchFlg("0");
					}

				}
			}

		}else{
			for(int i=0; i<searchItemDTOList.size(); i++){
				for(int j=0; j<normalSearchWordList.size(); j++){
					if(searchItemDTOList.get(i).getDescriptionAll().contains(normalSearchWordList.get(j))){
						searchItemDTOList.get(i).setSearchFlg("1");
					}else{
						searchItemDTOList.get(i).setSearchFlg("0");
					}

				}
			}
		}

		for(int i=0; i<searchItemDTOList.size(); i++){
			if(searchItemDTOList.get(i).getSearchFlg().toString().equals("1")){
				searchResultList.add(searchItemDTOList.get(i));
			}
		}



		if(!(searchResultList.isEmpty())){
			session.put("searchItemList", searchResultList);
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
