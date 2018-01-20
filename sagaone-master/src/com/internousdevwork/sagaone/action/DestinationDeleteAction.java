package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.DestinationDAO;
import com.internousdevwork.sagaone.dao.DestinationDeleteDAO;
import com.internousdevwork.sagaone.dto.DestinationDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DestinationDeleteAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String myAddressFlg;
	private String deleteFlg;
	private String destinationId;

	public Map<String, Object> session;
	private ArrayList<DestinationDTO> destinationDTOList = new ArrayList<DestinationDTO>();

	public String execute() {

		try {
			DestinationDeleteDAO destinationDeleteDAO = new DestinationDeleteDAO();
			destinationDeleteDAO.delete(deleteFlg);

			DestinationDAO destinationListDAO = new DestinationDAO();
			destinationDTOList = destinationListDAO.destinationInfo(session.get("loginUserId").toString());


	} catch (SQLException e) {
			e.printStackTrace();
		}

		session.put("destinationDTOList", destinationDTOList);
		return SUCCESS;
	}

	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
	public String getMyAddressFlg() {
		return myAddressFlg;
	}

	public void setMyAddressFlg(String myAddressFlg) {
		this.myAddressFlg = myAddressFlg;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
