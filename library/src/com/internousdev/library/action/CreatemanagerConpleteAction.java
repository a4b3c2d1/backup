package com.internousdev.library.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.library.dao.CreatemanagerConpleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreatemanagerConpleteAction extends ActionSupport implements SessionAware {

	private String NewUserId;

	private String NewPassword;

	private String NewUsername;

	private String result;

	public Map<String, Object> session;

	public CreatemanagerConpleteDAO createmanagerConpleteDAO = new CreatemanagerConpleteDAO();

	public String execute() throws SQLException {
		createmanagerConpleteDAO.createmanager(session.get("NewUserId").toString(),
				session.get("NewPassword").toString(), session.get("NewUsername").toString());
		result = SUCCESS;
		return result;

	}

	public String getNewUserId() {
		return NewUserId;
	}

	public void setNewUserId(String newUserId) {
		NewUserId = newUserId;
	}

	public String getNewPassword() {
		return NewPassword;
	}

	public void setNewPassword(String newPassword) {
		NewPassword = newPassword;
	}

	public String getNewUsername() {
		return NewUsername;
	}

	public void setNewUsername(String newUsername) {
		NewUsername = newUsername;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
