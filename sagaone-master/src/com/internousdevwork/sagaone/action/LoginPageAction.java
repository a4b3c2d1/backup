package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginPageAction extends ActionSupport implements SessionAware{
	Map<String, Object> session;

	public String execute(){
		String ret = SUCCESS;
		return ret;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
