package com.internousdevwork.sagaone.dto;

public class CardUpdateDTO {

	private String userId;
	private String cardNumber;
	private String limitYear;
	private String limitMonth;
	private String securityNumber;
	private String nominee;
	private String cardNumberLastFour;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getCardNumberLastFour() {
		return cardNumberLastFour;
	}
	public void setCardNumberLastFour(String cardNumberLastFour) {
		this.cardNumberLastFour = cardNumberLastFour;
	}


}
