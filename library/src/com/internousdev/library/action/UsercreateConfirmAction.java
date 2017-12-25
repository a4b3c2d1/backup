package com.internousdev.library.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UsercreateConfirmAction extends ActionSupport implements SessionAware {

	private String Username;
	public String result;
	private String errormessage;
	public Map<String, Object> session;

	public String execute() {

		if (!(Username.equals(""))) {
			result = SUCCESS;
			session.put("username", Username);
		} else {
			errormessage = "未入力です。";
			result = ERROR;
		}
		return result;
	}

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
