package com.internousdev.library.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.library.dao.UsercreateConpleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UsercreateConpleteAction extends ActionSupport implements SessionAware {

	private String Username;

	public UsercreateConpleteDAO usercreateConpleteDAO = new UsercreateConpleteDAO();
	public Map<String, Object> session;

	public String execute() throws SQLException {
		usercreateConpleteDAO.adduser(session.get("username").toString());

		return SUCCESS;
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
