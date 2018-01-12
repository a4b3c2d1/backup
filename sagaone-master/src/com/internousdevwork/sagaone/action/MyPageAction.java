package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.MyPageDAO;
import com.internousdevwork.sagaone.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	private MyPageDTO myPageDTO = new MyPageDTO();

	public String execute(){
		String ret = ERROR;

		if( session.get("loginUserId") != null){
			myPageDTO = myPageDAO.myPageInfo(session.get("loginUserId").toString());
			ret = SUCCESS;
		}

		session.put("myPageDTO", myPageDTO);

		return ret;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
