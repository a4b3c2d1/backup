package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ItemDAO;
import com.internousdevwork.sagaone.dao.ItemrelativeDAO;
import com.internousdevwork.sagaone.dao.ReviewDAO;
import com.internousdevwork.sagaone.dto.ItemDTO;
import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDetailAction extends ActionSupport implements SessionAware {

	private List<ItemDTO> itemdetailDTOList = new ArrayList<ItemDTO>();
	private List<ItemDTO> itemrelativeDTOList = new ArrayList<ItemDTO>();
	private List<ReviewDTO> reviewDTO2List = new ArrayList<ReviewDTO>();
	private List<ItemDTO> itemDTOList = new ArrayList<ItemDTO>();

	private ItemrelativeDAO itemrelativeDAO = new ItemrelativeDAO();
	private ReviewDAO reviewDAO = new ReviewDAO();
	private ItemDAO itemDAO = new ItemDAO();

	public Map<String, Object> session;

	// 商品id情報格納
	private String product_id;

	// 商品カテゴリ情報格納
	private String category_id;

	private int offset;

	public String execute() {

		// 商品詳細表示用リスト作成
		itemdetailDTOList = itemrelativeDAO.getdetailinfo(product_id);
		session.put("itemdetailDTOList", itemdetailDTOList);

		// 関連商品表示用リスト作成
		itemrelativeDTOList = itemrelativeDAO.getrelativeinfo(product_id, category_id);
		session.put("itemrelativeDTOList", itemrelativeDTOList);

		// レビュー表示用リスト作成
		reviewDTO2List = reviewDAO.getreviewinfo2(product_id);
		session.put("reviewDTO2List", reviewDTO2List);

		// 商品一覧再読み込み用
		itemDTOList = itemDAO.getiteminfo2(offset);
		session.put("itemDTOList", itemDTOList);
		return SUCCESS;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
