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
	private List<ItemDTO> itemDTOList2 = new ArrayList<ItemDTO>();
	private ItemDAO itemDAO = new ItemDAO();
	private int offset;
	private int page;
	private int[] allpages;

	public String execute() {

		// 現在のページ
		page = offset + 1;

		// 商品一覧取得

		offset = offset * 9;
		itemDTOList = itemDAO.getiteminfo2(offset);
		session.put("itemDTOList", itemDTOList);

		//


		// 表示するページ数を計算。

		itemDTOList2 = itemDAO.getiteminfo1();
		int pgs = itemDTOList2.size() / 9;

		// あまりが０以外の場合、

		if (itemDTOList2.size() % 9 != 0) {

			pgs = pgs + 1;

		}

		// １から最終ページまでの数字を格納するための配列
		allpages = new int[pgs];

		for (int i = 0; i < pgs; i++) {

			allpages[i] = i + 1;

		}

		// 商品ページへ
		return SUCCESS;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int[] getAllpages() {
		return allpages;
	}

	public void setAllpages(int[] allpages) {
		this.allpages = allpages;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

}
