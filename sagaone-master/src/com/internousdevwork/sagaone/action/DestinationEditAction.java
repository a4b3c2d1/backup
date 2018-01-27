/**
 *
 */
package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.DestinationEditDAO;
import com.internousdevwork.sagaone.dto.DestinationDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class DestinationEditAction extends ActionSupport implements SessionAware {

	private String destinationId;
	private String myAddressFlg;
	private String selectFlg;

	private DestinationDTO destinationDTO = new DestinationDTO();
	private DestinationDTO selectDestinationDTO = new DestinationDTO();
	public Map<String, Object> session;

	private String actionPage;

	public String execute() throws SQLException {

		actionPage = "DestinationEditAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}

		DestinationEditDAO destinationEditDAO = new DestinationEditDAO();

		if (myAddressFlg == null) {
			myAddressFlg = session.get("myAddressFlg").toString();
		}
		if (destinationId == null) {
			destinationId = session.get("destinationId").toString();
		}

		if (myAddressFlg.equals("1")) {
			destinationDTO = (DestinationDTO) session.get("defaultDestinationDTO");
			destinationId = destinationDTO.getDestinationId();
			session.put("destinationId", destinationId);
		} else {
			selectDestinationDTO = destinationEditDAO.destinationSelect(destinationId);
			session.put("destinationId", destinationId);
			session.put("selectDestinationDTO", selectDestinationDTO);
		}
		session.put("myAddressFlg", myAddressFlg);
		return SUCCESS;

	}


	public String getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
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

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
