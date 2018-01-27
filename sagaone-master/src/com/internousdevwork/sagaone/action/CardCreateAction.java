package com.internousdevwork.sagaone.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



public class CardCreateAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private String actionPage;

	public String execute(){
		actionPage = "CardCreateAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}else{
		return SUCCESS;
		}
	}
		

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getActionPage() {
		return actionPage;
	}

	public void setActionPage(String actionPage) {
		this.actionPage = actionPage;
	}

}