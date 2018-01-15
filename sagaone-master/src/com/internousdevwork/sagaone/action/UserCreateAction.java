package com.internousdevwork.sagaone.action;

import org.apache.commons.lang3.RandomStringUtils;

import com.opensymphony.xwork2.ActionSupport;


public class UserCreateAction extends ActionSupport {

	public String execute() {
		return SUCCESS;
	}
	

	//パスワードジェネレーター
	private String pass;
	
    public  String getPass(){
        pass = RandomStringUtils.random(7,"abcdefghijklmnopqrstuvwxyz1234567890");
        return pass;
    }

	public void setPass(String pass) {
		this.pass = pass;
	}
}
