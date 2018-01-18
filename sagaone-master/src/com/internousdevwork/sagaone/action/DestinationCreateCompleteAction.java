/**
 *
 */
package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.DestinationCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class DestinationCreateCompleteAction extends ActionSupport implements SessionAware {

	private String destinationFlg;

	public Map<String,Object> session;

	private DestinationCreateCompleteDAO destinationCreateCompleteDAO = new DestinationCreateCompleteDAO();

	public String execute() throws SQLException {

		// 宛先情報をDBに登録します。userIdはsessionではloginUserIdとなっています。
		destinationCreateCompleteDAO.destinationCreate(session.get("loginUserId").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyNameKana").toString(),
				session.get("firstNameKana").toString(),
				session.get("email").toString(),
				session.get("telNumber").toString(),
				session.get("userAddress").toString()
				);

		return SUCCESS ;
	}

	public String getDestinationFlg() {
		return destinationFlg;
	}
	public void setDestinationFlg(String destinationFlg) {
		this.destinationFlg = destinationFlg;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
