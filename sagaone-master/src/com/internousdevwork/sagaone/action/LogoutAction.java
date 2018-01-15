package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{

	private LoginDTO loginDTO= new LoginDTO();
	public Map<String, Object> session;

	public String execute(){
		String loginUserId= session.get("loginUserId").toString();
		boolean loginMemory= session.get("loginMemory").equals(true);
		loginDTO.setLoginId(session.get("loginUserId").toString());

		session.clear();

		if(loginMemory) {
			session.put("checkedLoginUserId", loginUserId);
		}


		String ret = SUCCESS;

		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
