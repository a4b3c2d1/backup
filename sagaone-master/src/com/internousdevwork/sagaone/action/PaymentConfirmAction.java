package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PaymentConfirmAction extends ActionSupport implements SessionAware{

	Map<String,Object> session;
	private String payMethod;

	//不具合修正用
	private String actionPage;

	public String execute(){

		//不具合修正用
		actionPage = "PaymentConfirmAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}

		String ret = SUCCESS;

		session.put("payMethod", payMethod);

		return ret;

	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}




}
