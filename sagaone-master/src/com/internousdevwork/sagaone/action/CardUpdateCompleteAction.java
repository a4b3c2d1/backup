package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.CardUpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CardUpdateCompleteAction extends ActionSupport implements SessionAware{
	//変数（クレジットカード）
			private String userId;
			private String cardNumber; 
			private String limitYear;
			private String limitMonth;
			private String securityNumber;
			private String nominee;
			
			public Map<String,Object> session;
			
			private CardUpdateDAO dao = new CardUpdateDAO();
			
			public String execute() throws SQLException{
				dao.getNewCardInfo(session.get("userId").toString(),
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



			public CardUpdateDAO getDao() {
				return dao;
			}



			public void setDao(CardUpdateDAO dao) {
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
