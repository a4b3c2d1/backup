package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ReviewConpleteDAO;
import com.internousdevwork.sagaone.dao.ReviewDAO;
import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewConpleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	private String product_id;
	private String category_id;
	private List<ReviewDTO> reviewDTO2List = new ArrayList<ReviewDTO>();

	private ReviewDAO reviewDAO = new ReviewDAO();
	ReviewConpleteDAO reviewConpleteDAO = new ReviewConpleteDAO();

	public String execute() {
		// レビューを登録

		if (session.get("reviewFlg").toString().equals("1")) {
			reviewConpleteDAO.insertreview(session.get("review_user_id").toString(),
					session.get("review_product_id").toString(), session.get("review_value").toString(),
					session.get("review_review").toString());

			session.put("reviewFlg", 0);

			// レビュー表示用再読み込み
			reviewDTO2List = reviewDAO.getreviewinfo2(session.get("review_product_id").toString());
			session.put("reviewDTO2List", reviewDTO2List);
			// 完了画面へ
		}
		return SUCCESS;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
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

}
