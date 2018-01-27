package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.CardUpdateDAO;
import com.internousdevwork.sagaone.dao.UserCheckDAO;
import com.internousdevwork.sagaone.dto.CardUpdateDTO;
import com.opensymphony.xwork2.ActionSupport;


public class CardUpdateConfirmAction extends ActionSupport implements SessionAware{

	//変数（クレジットカード）
	
		private String cardNumber; 
		private String limitYear;
		private String limitMonth;
		private String securityNumber;
		private String nominee;
		
		private String errorId;
	
		
		public Map<String,Object> session;

		
		//エラーのリスト
		private List<String> errorNumberList = new ArrayList<>();
		private List<String> errorSecurityList = new ArrayList<>();
		private List<String> errorNomineeList = new ArrayList<>();
		private List<String> errorIdList = new ArrayList<>();
		
		private String blank = "";
		
		//エラーの変数
		private String userId;
		private String errorNumber;
		private String errorSecurity;
		private String errorNominee;
		
	
		private CardUpdateDTO cardUpdateDTO= new CardUpdateDTO();
		private UserCheckDAO checkDAO = new UserCheckDAO();
		private CardUpdateDAO cardUpdateDAO= new CardUpdateDAO();
		
		public String execute() throws SQLException{
			String result= ERROR;
			int ErrorCount = 0;
			
			if(cardNumber.equals("") || 
			   limitYear.equals("") || 
			   securityNumber.equals("") || 
			    nominee.equals("")){
				blank = "未入力項目があります。";
				session.put("blankMessage", blank);
				ErrorCount++;
			}else{
				
				//(カード番号)
				if(cardNumber.length()<14||cardNumber.length()>16){
					errorNumber = "14文字以上16文字以内で入力してください。";
					errorNumberList.add(errorNumber);
					ErrorCount++;
				}
				
				if (!cardNumber.matches("^[0-9]+$")) {
					errorNumber = "数字で入力してください。";
					errorNumberList.add(errorNumber);
					ErrorCount++;
				}
				
				//(セキュリティコード)
				if(!(securityNumber.length()==3|| securityNumber.length()==4)){
					errorSecurity = "3桁もしくは4桁です。";
					errorSecurityList.add(errorSecurity);
					ErrorCount++;
				}
				
				if (!securityNumber.matches("^[0-9]+$")) {
					errorSecurity = "数字で入力してください。";
					errorSecurityList.add(errorSecurity);
					ErrorCount++;
				}
				//(カード名義人)
				if(nominee.length()<1 || nominee.length()>16){
					errorNominee ="1文字以上16文字以下で入力してください。";
					errorNomineeList.add(errorNominee);
					ErrorCount++;
				}
				if (!nominee.matches("^[a-z ]+$")) {
					errorNominee = "半角英数で入力してください。";
					errorNomineeList.add(errorNominee);
					ErrorCount++;
				}
				
				session.put("blankMessage", blank);
				
			}
			
			if(ErrorCount > 0){
				result = ERROR;
				session.put("errorIdList", getErrorIdList());
				session.put("errorNumberList", getErrorNumberList());
				session.put("errorSecurity", getErrorSecurityList());
				session.put("errorNominee", getErrorNomineeList());
				return result;
			}else{
				session.put("userId", session.get("loginUserId"));
				session.put("cardNumber", cardNumber);
				session.put("limitYear", limitYear);
				session.put("limitMonth", limitMonth);
				session.put("securityNumber", securityNumber);
				session.put("nominee", nominee);
				session.put("blankMessage", blank);

				return SUCCESS;
		}
			
			
	}

		public String getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public String getLimitYear() {
			return limitYear;
		}

		public void setLimitYear(String limitYear) {
			this.limitYear = limitYear;
		}

		public String getLimitMonth() {
			return limitMonth;
		}

		public void setLimitMonth(String limitMonth) {
			this.limitMonth = limitMonth;
		}

		public String getSecurityNumber() {
			return securityNumber;
		}

		public void setSecurityNumber(String securityNumber) {
			this.securityNumber = securityNumber;
		}

		public String getNominee() {
			return nominee;
		}

		public void setNominee(String nominee) {
			this.nominee = nominee;
		}

		public String getErrorId() {
			return errorId;
		}

		public void setErrorId(String errorId) {
			this.errorId = errorId;
		}

		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}

		public List<String> getErrorNumberList() {
			return errorNumberList;
		}

		public void setErrorNumberList(List<String> errorNumberList) {
			this.errorNumberList = errorNumberList;
		}

		public List<String> getErrorSecurityList() {
			return errorSecurityList;
		}

		public void setErrorSecurityList(List<String> errorSecurityList) {
			this.errorSecurityList = errorSecurityList;
		}

		public List<String> getErrorNomineeList() {
			return errorNomineeList;
		}

		public void setErrorNomineeList(List<String> errorNomineeList) {
			this.errorNomineeList = errorNomineeList;
		}

		public List<String> getErrorIdList() {
			return errorIdList;
		}

		public void setErrorIdList(List<String> errorIdList) {
			this.errorIdList = errorIdList;
		}

		public String getBlank() {
			return blank;
		}

		public void setBlank(String blank) {
			this.blank = blank;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getErrorNumber() {
			return errorNumber;
		}

		public void setErrorNumber(String errorNumber) {
			this.errorNumber = errorNumber;
		}

		public String getErrorSecurity() {
			return errorSecurity;
		}

		public void setErrorSecurity(String errorSecurity) {
			this.errorSecurity = errorSecurity;
		}

		public String getErrorNominee() {
			return errorNominee;
		}

		public void setErrorNominee(String errorNominee) {
			this.errorNominee = errorNominee;
		}

		public CardUpdateDTO getCardUpdateDTO() {
			return cardUpdateDTO;
		}

		public void setCardUpdateDTO(CardUpdateDTO cardUpdateDTO) {
			this.cardUpdateDTO = cardUpdateDTO;
		}

		public UserCheckDAO getCheckDAO() {
			return checkDAO;
		}

		public void setCheckDAO(UserCheckDAO checkDAO) {
			this.checkDAO = checkDAO;
		}

		public CardUpdateDAO getCardUpdateDAO() {
			return cardUpdateDAO;
		}

		public void setCardUpdateDAO(CardUpdateDAO cardUpdateDAO) {
			this.cardUpdateDAO = cardUpdateDAO;
		}
		
		
}























