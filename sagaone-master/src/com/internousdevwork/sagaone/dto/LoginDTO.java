package com.internousdevwork.sagaone.dto;

public class LoginDTO {
	private String loginId;
	private String loginPassword;
	private boolean loginFlg= false;

	public String getLoginId() {
		return loginId;
	}
	public void setLoginId (String loginId) {
		this.loginId= loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword (String loginPassword){
		this.loginPassword= loginPassword;
	}

	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg (boolean loginFlg) {
		this.loginFlg= loginFlg;
	}

}
