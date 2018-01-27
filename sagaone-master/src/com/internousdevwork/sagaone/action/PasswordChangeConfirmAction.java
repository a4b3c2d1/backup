package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.PasswordChangeDAO;
import com.internousdevwork.sagaone.dao.UserCheckDAO;
import com.internousdevwork.sagaone.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PasswordChangeConfirmAction extends ActionSupport implements SessionAware {
	private String userId;
	private String newLoginPassword;
	private String newLoginPassword2;
	private String errorId;
	private String errorPassword;
	private String errorPassword2;

	private List<String> errorIdList = new ArrayList<>();
	private List<String> errorPasswordList = new ArrayList<>();
	private List<String> errorPasswordList2 = new ArrayList<>();
	private String blank;

	public Map<String,Object> session;
	private LoginDTO loginDTO= new LoginDTO();
	private UserCheckDAO checkDAO = new UserCheckDAO();
	private PasswordChangeDAO passwordChangeDAO= new PasswordChangeDAO();
	private String actionPage;

	public String execute() throws SQLException {
		String ret= ERROR;

		actionPage = "PasswordChangeAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}

		int errorCount= 0;

		loginDTO= passwordChangeDAO.getNewLoginUserInfo(newLoginPassword, userId);

		if(userId.equals("") ||
				newLoginPassword.equals("") || newLoginPassword2.equals("")){
			blank = "未入力項目があります。";
			session.put("blankMessage", blank);
			errorCount++;
		}else{

			session.put("newLoginPassword", newLoginPassword);
			session.put("newLoginPassword2", newLoginPassword2);



			//ログインID
			if(!(checkDAO.checkCount(userId)>0)){
				errorId = "ログインIDが間違っています(○・▽・○)！";
				errorIdList.add(errorId);
				errorCount++;
			}

			//パスワード
			if(newLoginPassword.length()<3||newLoginPassword.length()>16){
				errorPassword="新しいパスワードは3文字以上16文字以内で入力してください。";
				errorPasswordList.add(errorPassword);
				errorCount++;
			}

			if (!newLoginPassword.matches("^[0-9a-zA-Z]+$")) {
				errorPassword = "新しいパスワードは半角英数字で入力してください。";
				errorPasswordList.add(errorPassword);
				errorCount++;
			}
			if (!(session.get("newLoginPassword").toString().equals(session.get("newLoginPassword2").toString()))) {
				errorPassword2= "再確認パスワードが異なります(○・▽・○)！";
				errorPasswordList2.add(errorPassword2);
				errorCount++;
			}


		session.put("blankMessage", blank);
		}


		if (errorCount>0){
			ret= ERROR;
		}else {
			session.put("newLoginPassword", newLoginPassword);
			ret= SUCCESS;
		}

		actionPage = "PasswordChangeConfirmAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}

		return ret;
	}



	public String getUserId() {
		return userId;
	}
	public void setUserId (String userId) {
		this.userId= userId;
	}

	public String getNewLoginPassword() {
		return newLoginPassword;
	}
	public void setNewLoginPassword (String newLoginPassword) {
		this.newLoginPassword= newLoginPassword;
	}

	public String getNewLoginPassword2() {
		return newLoginPassword2;
	}
	public void setNewLoginPassword2 (String newLoginPassword2) {
		this.newLoginPassword2= newLoginPassword2;
	}




	//エラー関係
	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorPassword() {
		return errorPassword;
	}

	public void setErrorPassword(String errorPassword) {
		this.errorPassword = errorPassword;
	}

	public List<String> getErrorIdList() {
		return errorIdList;
	}

	public void setErrorIdList(List<String> errorIdList) {
		this.errorIdList = errorIdList;
	}

	public List<String> getErrorPasswordList() {
		return errorPasswordList;
	}

	public void setErrorPasswordList(List<String> errorPasswordList) {
		this.errorPasswordList = errorPasswordList;
	}

	public List<String> getErrorPasswordList2() {
		return errorPasswordList2;
	}

	public void setErrorPasswordList2(List<String> errorPasswordList2) {
		this.errorPasswordList2 = errorPasswordList2;
	}

	public Map<String,Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}


}
