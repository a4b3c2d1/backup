package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.internousdevwork.sagaone.util.SearchComparator;
import com.opensymphony.xwork2.ActionSupport;

public class SortSearchAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	public String execute(){
		String ret = SUCCESS;


		ArrayList<SearchItemInfoDTO> siiDTO = (ArrayList<SearchItemInfoDTO>)session.get("searchItemList");

		Collections.sort(siiDTO, new SearchComparator());


		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
