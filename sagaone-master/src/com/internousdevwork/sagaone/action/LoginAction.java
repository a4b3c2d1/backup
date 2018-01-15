package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.LoginDAO;
import com.internousdevwork.sagaone.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	// 前衛
	private String loginUserId;
	private String loginPassword;
	private String loginMemory= "";
	public Map<String, Object> session;
	private String errorMessage;
	private String blankErrorMessageID;
	private String blankErrorMessagePassword;

	private LoginDAO loginDAO= new LoginDAO();
	private LoginDTO loginDTO= new LoginDTO();

	public String execute() {
		String ret=ERROR;;
		int ErrorCount= 0;

		// ログイン実行
		loginDTO= loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
		session.put("loginUserId", loginUserId);
		session.put("loginPassword", loginPassword);
		session.put("loginFlg", loginDTO.getLoginFlg());

		if (((LoginDTO) session.get("loginUser")).getLoginFlg()) {
		ret= SUCCESS;

		} else if(!(loginUserId.equals("")) && !(loginPassword.equals(""))){
			setErrorMessage("IDかパスワードが違うよー(○・▽・○)<br>");
			ret= ERROR;
		}

		if (loginMemory.equals("true")) {
			session.put("loginMemory", true);
		} else {
			session.put("loginMemory", false);
		}

		// 未入力時
		if(loginUserId.equals("")) {
		setBlankErrorMessageID("ログインIDが入ってないよー(○・▽・○)<br>");
		ErrorCount++;
		}

		if (loginPassword.equals("")) {
		setBlankErrorMessagePassword("パスワードが入ってないよー(○・▽・○)<br>");
		ErrorCount++;
		}
		if(ErrorCount>0) {
		ret = ERROR;
		}

			return ret;
		}


	// 後衛
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId (String loginUserId) {
		this.loginUserId= loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword (String loginPassword) {
		this.loginPassword= loginPassword;
	}

	public String getLoginMemory() {
		return loginMemory;
	}
	public void setLoginMemory(String loginMemory) {
		this.loginMemory= loginMemory;
	}

	public void setSession (Map<String, Object> session) {
		this.session= session;
	}

	public String getBlankErrorMessageID() {
		return blankErrorMessageID;
	}
	public void setBlankErrorMessageID(String blankErrorMessageID) {
		this.blankErrorMessageID = blankErrorMessageID;
	}

	public String getBlankErrorMessagePassword() {
		return blankErrorMessagePassword;
	}
	public void setBlankErrorMessagePassword(String blankErrorMessagePassword) {
		this.blankErrorMessagePassword = blankErrorMessagePassword;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}


