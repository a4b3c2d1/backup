package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PaymentConfirmAction extends ActionSupport implements SessionAware{

	Map<String,Object> session;
	private String payMethod;

	public String execute(){
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
