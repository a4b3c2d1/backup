/**
 *
 */
package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class DestinationCreateConfirmAction extends ActionSupport implements SessionAware {

	public String userId;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String userAddress;
	private String telNumber;
	private String email;

	private String destinationFlg;

	public Map<String, Object> session;

	//エラーメッセージ変数
	private String errorFamilyName;
	private String errorFirstName;
	private String errorFamilyNameKana;
	private String errorFirstNameKana;
	private String errorUserAddress;
	private String errorTelNumber;
	private String errorEmail;

	//エラーメッセージ表示用List
	private List<String> errorFamilyNameList = new ArrayList<>();
	private List<String> errorFirstNameList = new ArrayList<>();
	private List<String> errorFamilyNameKanaList = new ArrayList<>();
	private List<String> errorFirstNameKanaList = new ArrayList<>();
	private List<String> errorUserAddressList = new ArrayList<>();
	private List<String> errorTelNumberList = new ArrayList<>();
	private List<String> errorEmailList = new ArrayList<>();

	private String actionPage;

	public String execute()  throws SQLException{

		actionPage = "DestinationCreateConfirmAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}
		String result = ERROR;
		int ErrorCount= 0;

		// ↓バリデーション始まり↓
		//姓
		if(familyName.equals("")) {
			errorFamilyName = "・姓を入力してください。";
			errorFamilyNameList.add(errorFamilyName);
			ErrorCount++;
		} else if(familyName.length() < 1 || familyName.length() > 16){
			errorFamilyName = "・姓は1文字以上16文字以下で入力してください。";
			errorFamilyNameList.add(errorFamilyName);
			ErrorCount++;
		} else if (!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶー]+$")) {
			errorFamilyName = "・姓は半角英数、ひらがな、カタカナ、漢字で入力してください。";
			errorFamilyNameList.add(errorFamilyName);
			ErrorCount++;
		}
		//名前
		if(firstName.equals("")) {
			errorFirstName = "・名前を入力してください。";
			errorFirstNameList.add(errorFirstName);
			ErrorCount++;
		} else if(firstName.length() < 1 || firstName.length() > 16){
			errorFirstName = "・名前は1文字以上16文字以下で入力してください。";
			errorFirstNameList.add(errorFirstName);
			ErrorCount++;
		} else if (!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶー]+$")) {
			errorFirstName = "・名前は半角英数、ひらがな、カタカナ、漢字で入力してください。";
			errorFirstNameList.add(errorFirstName);
			ErrorCount++;
		}
		//姓ふりがな
		if(familyNameKana.equals("")) {
			errorFamilyNameKana = "・姓（ふりがな）を入力してください。";
			errorFamilyNameKanaList.add(errorFamilyNameKana);
			ErrorCount++;
		} else if(familyNameKana.length() < 1 || familyNameKana.length() > 16){
			errorFamilyNameKana = "・姓（ふりがな）は1文字以上16文字以下で入力してください。";
			errorFamilyNameKanaList.add(errorFamilyNameKana);
			ErrorCount++;
		} else if (!familyNameKana.matches("^[ぁ-ゞ]+$")) {
			errorFamilyNameKana = "・姓（ふりがな）はひらがなで入力してください。";
			errorFamilyNameKanaList.add(errorFamilyNameKana);
			ErrorCount++;
		}
		//名前ふりがな
		if(firstNameKana.equals("")) {
			errorFirstNameKana = "・名前(ふりがな）を入力してください。";
			errorFirstNameKanaList.add(errorFirstNameKana);
			ErrorCount++;
		} else if(firstNameKana.length() < 1 || firstNameKana.length() > 16){
			errorFirstNameKana = "・名前(ふりがな）は1文字以上16文字以下で入力してください。";
			errorFirstNameKanaList.add(errorFirstNameKana);
			ErrorCount++;
		} else if (!firstNameKana.matches("^[ぁ-ゞ]+$")) {
			errorFirstNameKana = "・名前（ふりがな）はひらがなで入力してください。";
			errorFirstNameKanaList.add(errorFirstNameKana);
			ErrorCount++;
		}
		//住所
		if(userAddress.equals("")) {
			errorUserAddress = "・住所を入力してください。";
			errorUserAddressList.add(errorUserAddress);
			ErrorCount++;
		} else if(userAddress.length() < 15 || userAddress.length() > 50){
			errorUserAddress = "・住所は15文字以上50文字以下で入力してください。";
			errorUserAddressList.add(errorUserAddress);
			ErrorCount++;
		} else if (!userAddress.matches("^[a-zA-Z0-9 -/:-@\\[-\\`\\{-\\~ぁ-ゞ一-龠々ァ-ヶー]+$")) {
			errorUserAddress = "・住所は半角英数記号、ひらがな、カタカナ、漢字で入力してください。";
			errorUserAddressList.add(errorUserAddress);
			ErrorCount++;
		}
		//電話番号
		if(telNumber.equals("")){
			errorTelNumber = "・電話番号を入力してください。";
			errorTelNumberList.add(errorTelNumber);
			ErrorCount++;
		} else if(telNumber.length() < 11 || telNumber.length() > 13){
			errorTelNumber = "・電話番号は11桁以上13桁以内で入力してください。";
			errorTelNumberList.add(errorTelNumber);
			ErrorCount++;
		} else if (!telNumber.matches("^[0-9]+$")) {
			errorTelNumber = "・電話番号は半角数字で入力してください。";
			errorTelNumberList.add(errorTelNumber);
			ErrorCount++;
		}
		//メール
		if(email.equals("")){
			errorEmail = "・メールアドレスを入力してください。";
			errorEmailList.add(errorEmail);
			ErrorCount++;
		} else if(email.length() <18 || email.length() > 32){
			errorEmail = "・メールアドレスは18文字以上32文字以下で入力してください。";
			errorEmailList.add(errorEmail);
			ErrorCount++;
		} else if (!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			errorEmail = "・正しいメールアドレスの形式で入力してください。";
			errorEmailList.add(errorEmail);
			ErrorCount++;
		}
		// ↑バリデーション終わり↑

		if(ErrorCount > 0) {
			result = ERROR;
		}else{
			// 入力情報をsessionに格納
			session.put("userId", userId);
			session.put("familyName", familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);
			session.put("userAddress", userAddress);
			session.put("telNumber", telNumber);
			session.put("email", email);

			result = SUCCESS;
		}


		return result;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public List<String> getErrorFamilyNameList() {
		return errorFamilyNameList;
	}
	public void setErrorFamilyNameList(List<String> errorFamilyNameList) {
		this.errorFamilyNameList = errorFamilyNameList;
	}
	public List<String> getErrorFirstNameList() {
		return errorFirstNameList;
	}
	public void setErrorFirstNameList(List<String> errorFirstNameList) {
		this.errorFirstNameList = errorFirstNameList;
	}
	public List<String> getErrorFamilyNameKanaList() {
		return errorFamilyNameKanaList;
	}
	public void setErrorFamilyNameKanaList(List<String> errorFamilyNameKanaList) {
		this.errorFamilyNameKanaList = errorFamilyNameKanaList;
	}
	public List<String> getErrorFirstNameKanaList() {
		return errorFirstNameKanaList;
	}
	public void setErrorFirstNameKanaList(List<String> errorFirstNameKanaList) {
		this.errorFirstNameKanaList = errorFirstNameKanaList;
	}
	public List<String> getErrorUserAddressList() {
		return errorUserAddressList;
	}
	public void setErrorUserAddressList(List<String> errorUserAddressList) {
		this.errorUserAddressList = errorUserAddressList;
	}
	public List<String> getErrorTelNumberList() {
		return errorTelNumberList;
	}
	public void setErrorTelNumberList(List<String> errorTelNumberList) {
		this.errorTelNumberList = errorTelNumberList;
	}
	public List<String> getErrorEmailList() {
		return errorEmailList;
	}
	public void setErrorEmailList(List<String> errorEmailList) {
		this.errorEmailList = errorEmailList;
	}

}
