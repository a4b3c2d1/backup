package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemActionback extends ActionSupport implements SessionAware {

	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public Map<String, Object> session;

	private String result;

	public List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	public String execute() {
		result = SUCCESS;

		buyItemDTOList = buyItemDAO.getBuyItemInfo();

		session.put("buyItem_name", buyItemDTOList.get(0).getItemName());
		session.put("buyItem_price", buyItemDTOList.get(0).getItemPrice());
		session.put("buyItem_stock", buyItemDTOList.get(0).getItemStock());

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
