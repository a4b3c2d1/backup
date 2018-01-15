package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ItemDAO;
import com.internousdevwork.sagaone.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private List<ItemDTO> itemDTOList = new ArrayList<ItemDTO>();
	private ItemDAO itemDAO = new ItemDAO();

	public String execute() {

		// 全商品一覧取得
		itemDTOList = itemDAO.getiteminfo();
		session.put("itemDTOList", itemDTOList);



		// 商品ページへ
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
