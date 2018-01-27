package com.internousdevwork.sagaone.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class PasswordChangeAction extends ActionSupport {
	Map<String, Object> session;
	private String actionPage;

	public String execute() {
		actionPage = "PasswordChangeAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}

	return SUCCESS;

	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}

