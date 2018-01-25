package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.SearchItemFromAllDAO;
import com.internousdevwork.sagaone.dao.StartDAO;
import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.internousdevwork.sagaone.dto.StartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class StartAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	private List<StartDTO> itemdto = new ArrayList<StartDTO>();
	StartDAO startdto = new StartDAO();
	private List<SearchItemInfoDTO> searchItemDTOList = new ArrayList<SearchItemInfoDTO>();
	private SearchItemFromAllDAO searchItemFromAllDAO = new SearchItemFromAllDAO();
	private ArrayList<List<String>> descriptionMeishi = new ArrayList<List<String>>();
	private ArrayList<String> array = new ArrayList<String>();
	private String test1;
	private Set<String> allWordsList = new LinkedHashSet<String>();

	public String execute() {
		Random randomId = new java.util.Random();
		boolean loginFlg = false;
		session.put("temp_user_id", randomId);
		session.put("loginFlg", loginFlg);


		itemdto = startdto.getiteminfo();
		Collections.shuffle(itemdto);
		session.put("pickupitem",itemdto );

		//全商品DTOに詰めます
		searchItemDTOList = searchItemFromAllDAO.getItemInfoFromAll();
		ReformCharaAction reformedItemList = new ReformCharaAction();
		searchItemDTOList = reformedItemList.reformDescription(searchItemDTOList);
		GetSearchWordsAction gswa = new GetSearchWordsAction();
		searchItemDTOList = gswa.getSearghWord(searchItemDTOList);
		session.put("allItem", searchItemDTOList);

		//名詞のみ抜き出しリスト格納
		for(int i=0; i<searchItemDTOList.size(); i++){
			ArrayList<String> meishiList =new ArrayList<String>();
			DescriptionWordAction da = new DescriptionWordAction();
			meishiList = da.getWords(searchItemDTOList.get(i).getSearchWords());
			List<String> listB = new ArrayList<String>(new LinkedHashSet<>(meishiList));
			descriptionMeishi.add(listB);
		}

		for(int i=0; i<descriptionMeishi.size(); i++) {
			AllAutoCompleteAction aaca = new AllAutoCompleteAction();
			List<String> list = aaca.allAutoComplete(descriptionMeishi.get(i));
			for(int j=0; j<list.size(); j++) {
				allWordsList.add(list.get(j));
			}
		}

		session.put("allWordsList", allWordsList);

		return SUCCESS;
	}




	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<SearchItemInfoDTO> getSearchItemDTOList() {
		return searchItemDTOList;
	}

	public void setSearchItemDTOList(List<SearchItemInfoDTO> searchItemDTOList) {
		this.searchItemDTOList = searchItemDTOList;
	}

	public ArrayList<String> getArray() {
		return array;
	}

	public void setArray(ArrayList<String> array) {
		this.array = array;
	}

	public String getTest1() {
		return test1;
	}

	public void setTest1(String test1) {
		this.test1 = test1;
	}




	public Set<String> getAllWordsList() {
		return allWordsList;
	}




	public void setAllWordsList(Set<String> allWordsList) {
		this.allWordsList = allWordsList;
	}





}
