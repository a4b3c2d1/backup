package com.internousdevwork.sagaone.dto;

public class PaymentUserAddressDTO {
	private String telNumber;
	private String userAddress;



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


}
