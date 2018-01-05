package com.internousdev.library.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class BooksearchAction extends ActionSupport {
	public Map<String, Object> session;

	public String execute() {
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
