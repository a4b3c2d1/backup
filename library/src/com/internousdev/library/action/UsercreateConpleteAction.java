package com.internousdev.library.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.library.dao.UsercreateConpleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UsercreateConpleteAction extends ActionSupport implements SessionAware{

	private  String Username;
	private Map<String, Object> session;
	
	public UsercreateConpleteDAO usercreateConpleteDAO =new UsercreateConpleteDAO();
	public String execute()
	{
		
		
		
		
		
		return SUCCESS;
	}
}
