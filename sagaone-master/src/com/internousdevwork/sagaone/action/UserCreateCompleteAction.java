package com.internousdevwork.sagaone.action;

/*
*・（session.getの段階）新規登録（userCreate.jsp）で入力した情報がデータベースに入る。
*/

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String email;
	



	public Map<String,Object> session;

	private UserCreateCompleteDAO DAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {

		DAO.create(session.get("userId").toString(),
				session.get("password").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyNameKana").toString(),
				session.get("firstNameKana").toString(),
				Integer.parseInt(session.get("sex").toString()),
				session.get("email").toString()
				);

		String result = SUCCESS;

		return result ;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId= userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password= password;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName= familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana= familyNameKana;
	}


	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana= firstNameKana;
	}


	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex= sex;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}