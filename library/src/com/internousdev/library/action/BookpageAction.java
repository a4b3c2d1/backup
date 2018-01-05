package com.internousdev.library.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BookpageAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute() {
		return SUCCESS;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
