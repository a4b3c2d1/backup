/**
 *
 */
package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.DestinationDAO;
import com.internousdevwork.sagaone.dto.DestinationDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class DestinationAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	public String execute() {

		DestinationDAO destinationDAO = new DestinationDAO();
		ArrayList<DestinationDTO> destinationDTOList = new ArrayList<DestinationDTO>();

		try {
			destinationDTOList = destinationDAO.DestinationInfo(session.get("userId").toString());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		session.put("destinationDTOList", destinationDTOList);

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
