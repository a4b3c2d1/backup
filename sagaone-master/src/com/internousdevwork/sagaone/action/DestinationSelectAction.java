package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.DestinationDAO;
import com.internousdevwork.sagaone.dao.DestinationDefaultDAO;
import com.internousdevwork.sagaone.dto.DestinationDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DestinationSelectAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String myAddressFlg;
	private String selectFlg;
	private String destinationId;

	public Map<String, Object> session;
	private DestinationDTO defaultDestinationDTO;
	private ArrayList<DestinationDTO> destinationDTOList = new ArrayList<DestinationDTO>();

	public String execute() {
		/**
		 * radioで選択したDTOをDBでmyAddressFlg="1"を受け取ったstatusを"1"に元々status="1"のものをstatus="0"に書き換える。
		 */

		try {
			DestinationDefaultDAO destinationDefaultDAO = new DestinationDefaultDAO();
			defaultDestinationDTO = destinationDefaultDAO.defaultSelect(selectFlg, session.get("loginUserId").toString());

			DestinationDAO destinationListDAO = new DestinationDAO();
			destinationDTOList = destinationListDAO.destinationInfo(session.get("loginUserId").toString());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		session.put("defaultDestinationDTO", defaultDestinationDTO);
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

	public String getSelectFlg() {
		return selectFlg;
	}

	public void setSelectFlg(String selectFlg) {
		this.selectFlg = selectFlg;
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
