package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.CardCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CardCreateCompleteAction extends ActionSupport implements SessionAware{
	//変数（クレジットカード）
		private String userId;
		private String cardNumber; 
		private String limitYear;
		private String limitMonth;
		private String securityNumber;
		private String nominee;
		
		public Map<String,Object> session;
		
		private CardCreateCompleteDAO dao = new CardCreateCompleteDAO();
		
		public String execute() throws SQLException{
			dao.card(session.get("userId").toString(),
					session.get("cardNumber").toString(),
					session.get("limitYear").toString(),
					session.get("limitMonth").toString(),
					session.get("securityNumber").toString(),
					session.get("nominee").toString());
					
			String result = SUCCESS;
			return result;
		}
		
		

		public String getUserId() {
			return userId;
		}



		public void setUserId(String userId) {
			this.userId = userId;
		}



		public CardCreateCompleteDAO getDao() {
			return dao;
		}



		public void setDao(CardCreateCompleteDAO dao) {
			this.dao = dao;
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

		public Map<String, Object> getSession() {
			return session;
		}

		public void setSession(Map<String, Object> session) {
			this.session = session;
		}
		
		
}
