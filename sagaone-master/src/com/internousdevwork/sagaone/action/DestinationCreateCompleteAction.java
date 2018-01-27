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

	private String actionPage;

	public String execute() throws SQLException {

		actionPage = "DestinationCreateCompleteAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}

		String result;

		if (!session.containsKey("loginUserId") || !session.containsKey("familyName") || !session.containsKey("firstName") || !session.containsKey("familyNameKana") || !session.containsKey("firstNameKana") || !session.containsKey("email") || !session.containsKey("telNumber") || !session.containsKey("userAddress")) {
			result = ERROR;
		}


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

		session.remove("familyName");
		session.remove("firstName");
		session.remove("familyNameKana");
		session.remove("firstNameKana");
		session.remove("email");
		session.remove("telNumber");
		session.remove("userAddress");

		result = SUCCESS;
		return result;
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
