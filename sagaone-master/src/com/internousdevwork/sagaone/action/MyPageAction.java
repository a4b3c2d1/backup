package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.MyPageAddressDAO;
import com.internousdevwork.sagaone.dao.MyPageDAO;
import com.internousdevwork.sagaone.dto.MyPageAddressDTO;
import com.internousdevwork.sagaone.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	private MyPageDTO myPageDTO = new MyPageDTO();
	private MyPageAddressDTO myPageAddressDTO = new MyPageAddressDTO();
	private String myAddressFlg = "0";

	public String execute(){
		String ret = ERROR;

		if( session.get("loginUserId") != null){
			myPageDTO = myPageDAO.myPageInfo(session.get("loginUserId").toString());
			ret = SUCCESS;
		}

		myPageAddressDTO = new MyPageAddressDAO().getUserAddress(session.get("loginUserId").toString());

		myAddressFlg = "1";

		session.put("myPageDTO", myPageDTO);
		session.put("myPageAddress", myPageAddressDTO);
		session.put("myAddressFlg", myAddressFlg);


		return ret;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
