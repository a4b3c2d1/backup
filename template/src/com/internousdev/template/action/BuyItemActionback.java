package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemActionback extends ActionSupport implements SessionAware {

	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	public Map<String, Object> session;

	private String result;

	public String execute() {
		result = SUCCESS;

		session.put("id", buyItemDTO.getId());
		session.put("buyItem_name", buyItemDTO.getItemName());
		session.put("buyItem_price", buyItemDTO.getItemPrice());

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
