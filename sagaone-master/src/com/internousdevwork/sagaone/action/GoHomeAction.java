package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.StartDAO;
import com.internousdevwork.sagaone.dto.StartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private List<StartDTO> itemdto = new ArrayList<StartDTO>();
	StartDAO startdto = new StartDAO();

	public String execute() {
		String ret = SUCCESS;

		itemdto = startdto.getiteminfo();
		Collections.shuffle(itemdto);
		session.put("pickupitem", itemdto);
		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
