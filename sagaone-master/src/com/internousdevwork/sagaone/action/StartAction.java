package com.internousdevwork.sagaone.action;

import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class StartAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;

	public String execute(){
		Random randomId = new java.util.Random();
		boolean loginFlg = false;
		session.put("temp_user_id", randomId);
		session.put("loginFlg", loginFlg);
		System.out.println(randomId);
		System.out.println(loginFlg);
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
