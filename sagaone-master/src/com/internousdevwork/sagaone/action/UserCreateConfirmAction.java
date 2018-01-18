package com.internousdevwork.sagaone.action;

/*
*・execute():userCreateConfirm.jsp用の処理。（session.putの段階）新規登録（userCreate.jsp）で入力した情報。
*・エラーの変数をエラーのリストにいれていく
*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.UserCheckDAO;
import com.opensymphony.xwork2.ActionSupport;



public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	
	private String userId; //ログインIDのこと

	private String password;

	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;

	private String sex;
	
	private int sexNum;

	private String email;
	
	

	public Map<String,Object> session;

	
	
	//エラーのリスト
	private List<String> errorIdList = new ArrayList<>();
	private List<String> errorPasswordList = new ArrayList<>();
	private List<String> errorFamilyList = new ArrayList<>();
	private List<String> errorFirstList = new ArrayList<>();
	private List<String> errorFamilyKanaList = new ArrayList<>();
	private List<String> errorFirstKanaList = new ArrayList<>();
	private List<String> errorEmailList = new ArrayList<>();
	
	
	
	private String blank = "";
	private String duplicate = "ログインIDが登録済みです。";
	
	//エラーの変数
	private String errorId;
	private String errorPassword;
	private String errorFamily;
	private String errorFirst;
	private String errorFamilyKana;
	private String errorFirstKana;
	private String errorEmail;
	

	
	private UserCheckDAO checkDAO = new UserCheckDAO();

	public String execute()  throws SQLException{

		String result = ERROR;
		int ErrorCount= 0;
		System.out.println(getSex());



		
		if(userId.equals("") || 
				password.equals("") || 
				familyName.equals("") || 
				firstName.equals("") || 
				familyNameKana.equals("") || 
				firstNameKana.equals("") ||
				email.equals("")){
			blank = "未入力項目があります。";
			session.put("blankMessage", blank);
			ErrorCount++;
		}else{
		
			//ユーザーID(ログインID)
			if((checkDAO.checkCount(userId)>0)){
				errorId = duplicate;
				errorIdList.add(errorId);
				ErrorCount++;
			}
	
			if(userId.length()<1||userId.length()>8){
				errorId = "1文字以上8文字以内で入力してください。";
				errorIdList.add(errorId);
				ErrorCount++;
			}
			
			if (!userId.matches("^[0-9a-zA-Z]+$")) {
				errorId = "半角英数字で入力してください。";
				errorIdList.add(errorId);
				ErrorCount++;
			}
			//パスワード
	
			
			if(password.length()<1||password.length()>16){
				errorPassword = "1文字以上16文字以内で入力してください。";
				errorPasswordList.add(errorPassword);
				ErrorCount++;
			}
			
			if (!password.matches("^[0-9a-zA-Z]+$")) {
				errorPassword = "半角英数字で入力してください。";
				errorPasswordList.add(errorPassword);
				ErrorCount++;
			}
	
			//姓
	
			if(familyName.length()<1 || familyName.length()>16){
				errorFamily = "1文字以上16文字以下で入力してください。";
				errorFamilyList.add(errorFamily);
				ErrorCount++;
			}
			if (!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")) {
				errorFamily = "半角英数、ひらがな、カタカナ、漢字で入力してください。";
				errorFamilyList.add(errorFamily);
				ErrorCount++;
			}
			//名前
	
			if(firstName.length()<1 || firstName.length()>16){
				errorFirst ="1文字以上16文字以下で入力してください。";
				errorFirstList.add(errorFirst);
				ErrorCount++;
			}
			if (!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")) {
				errorFirst = "半角英数、ひらがな、カタカナ、漢字で入力してください。";
				errorFirstList.add(errorFirst);
				ErrorCount++;
			}
			//姓ふりがな
	
			if(familyNameKana.length()<1 || familyNameKana.length()>16){
				errorFamilyKana = "1文字以上16文字以下で入力してください。";
				errorFamilyKanaList.add(errorFamilyKana);
				ErrorCount++;
			}
			if (!familyNameKana.matches("^[ぁ-ゞ]+$")) {
				errorFamilyKana = "ひらがなで入力してください。";
				errorFamilyKanaList.add(errorFamilyKana);
				ErrorCount++;
			}
			//名前ふりがな
	
			if(firstNameKana.length()<1 || firstNameKana.length()>16){
				errorFirstKana = "1文字以上16文字以下で入力してください。";
				errorFirstKanaList.add(errorFirstKana);
				ErrorCount++;
			}
			if (!firstNameKana.matches("^[ぁ-ゞ]+$")) {
				errorFirstKana = "ひらがなで入力してください。";
				errorFirstKanaList.add(errorFirstKana);
				ErrorCount++;
			}
			//メール
	
			if(email.length()<14 || email.length()>32){
				errorEmail = "14文字以上32文字以下で入力してください。";
				errorEmailList.add(errorEmail);
				ErrorCount++;
			}
			if (!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
				errorEmail = "正しいメールアドレスの形式で入力してください。";
				errorEmailList.add(errorEmail);
				ErrorCount++;
			}
			
			session.put("blankMessage", blank);
		}

		if(ErrorCount>0) {
		result = ERROR;
		}else{
		session.put("userId", userId);
		session.put("password", password);
		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		
		sexNum = Integer.parseInt(getSex());
		
		session.put("sex",sexNum);
		session.put("email", email);
		session.put("blankMessage", blank);
		result = SUCCESS;
		
		
	}
		
	
	
		
		
	session.put("errorIdList", getErrorIdList());
	session.put("errorPassword", getErrorPasswordList());
	session.put("errorFamily", getErrorFamilyList());
	session.put("errorFirst", getErrorFirstList());
	session.put("errorFamilyKana", getErrorFamilyKanaList());
	session.put("errorFirstKana", getErrorFirstKanaList());
	session.put("errorEmail", getErrorEmailList());
	

	return result;

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
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email= email;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this. userId= userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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


	public List<String> getErrorFamilyList() {
		return errorFamilyList;
	}


	public void setErrorFamilyList(List<String> errorFamilyList) {
		this. errorFamilyList = errorFamilyList;
	}


	public List<String> getErrorFirstList() {
		return errorFirstList;
	}


	public void setErrorFirstList(List<String> errorFirstList) {
		this.errorFirstList = errorFirstList;
	}


	public List<String> getErrorFamilyKanaList() {
		return errorFamilyKanaList;
	}


	public void setErrorFamilyKanaList(List<String> errorFamilyKanaList) {
		this.errorFamilyKanaList = errorFamilyKanaList;
	}


	public List<String> getErrorFirstKanaList() {
		return errorFirstKanaList;
	}


	public void setErrorFirstKanaList(List<String> errorFirstKanaList) {
		this.errorFirstKanaList = errorFirstKanaList;
	}


	public List<String> getErrorEmailList() {
		return errorEmailList;
	}


	public void setErrorEmailList(List<String> errorEmailList) {
		this.errorEmailList = errorEmailList;
	}


	public Map<String,Object> getSession() {
		return session;
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
}
