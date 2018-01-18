/**
 *
 */
package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.DestinationEditCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class DestinationEditCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private DestinationEditCompleteDAO destinationEditCompleteDAO = new DestinationEditCompleteDAO();

	public String execute() throws SQLException {


		destinationEditCompleteDAO.destinationUpdate(session.get("loginUserId").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyNameKana").toString(),
				session.get("firstNameKana").toString(),
				session.get("email").toString(),
				session.get("telNumber").toString(),
				session.get("userAddress").toString(),
				session.get("destinationId").toString()
				);

		return SUCCESS;

	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
