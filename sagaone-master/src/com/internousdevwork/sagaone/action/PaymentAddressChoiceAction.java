package com.internousdevwork.sagaone.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dto.PaymentUserAddressDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentAddressChoiceAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	private int adNum;
	private String choicedAddress;

	public String execute(){
		String ret = SUCCESS;

		List<PaymentUserAddressDTO> addressDTOList = (List<PaymentUserAddressDTO>)session.get("addressDTOList");
		choicedAddress = addressDTOList.get(adNum).getUserAddress();
		session.put("choicedAddress", choicedAddress);

		return ret;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getAdNum() {
		return adNum;
	}

	public void setAdNum(int adNum) {
		this.adNum = adNum;
	}

}
