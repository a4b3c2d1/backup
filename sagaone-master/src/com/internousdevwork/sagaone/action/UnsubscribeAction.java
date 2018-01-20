package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.UnsubscribeDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UnsubscribeAction extends ActionSupport implements SessionAware{
	private String user_id;
	private UnsubscribeDAO uns = new UnsubscribeDAO();
	private Map<String, Object> session;

	public String execute() throws SQLException{
		String result = SUCCESS;
		user_id = session.get("loginUserId").toString();

		uns.delete_destination(user_id);

		uns.delete_cart(user_id);

		uns.delete_purchase(user_id);

		uns.delete_user(user_id);

		session.clear();

		return result;
	}

	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}