package com.internousdev.library.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.library.dao.InfochangeConpleteDAO;
import com.internousdev.library.dao.LoginDAO;
import com.internousdev.library.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InfochangeConpleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	InfochangeConpleteDAO infochangeConpleteDAO = new InfochangeConpleteDAO();

	private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	private LoginDAO loginDAO = new LoginDAO();

	public String execute() {

		String result;

		infochangeConpleteDAO.getloginuserinfo(session.get("loginid").toString(),
				session.get("newloginuserid").toString(), session.get("newloginpassword").toString(),
				session.get("newusername").toString());

		loginDTOList = loginDAO.getloginuserinfo(session.get("newloginuserid").toString(),
				session.get("newloginpassword").toString());

		session.put("loginuser", loginDTOList);

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
