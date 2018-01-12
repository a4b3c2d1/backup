package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.SearchItemFromAllDAO;
import com.internousdevwork.sagaone.dao.SearchItemFromCatDAO;
import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware{
	private String itemCategory;
	private String searchWord;
	private SearchItemFromAllDAO searchItemFromAllDAO = new SearchItemFromAllDAO();
	private SearchItemFromCatDAO searchItemFromCatDAO = new SearchItemFromCatDAO();
	private List<SearchItemInfoDTO> searchItemDTOList = new ArrayList<SearchItemInfoDTO>();
	private String searchErrorMessage;
	public Map<String,Object> session;

	public String execute(){
		String ret = ERROR;
		int categoryNum = Integer.parseInt(itemCategory);


		if(itemCategory.equals("0")){
			searchItemDTOList = searchItemFromAllDAO.getItemInfoFromAll(searchWord);
		}else{
			searchItemDTOList = searchItemFromCatDAO.getItemInfoFromCat(categoryNum, searchWord);
		}

		if(!(searchItemDTOList.isEmpty())){
			session.put("searchItemList", searchItemDTOList);
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
