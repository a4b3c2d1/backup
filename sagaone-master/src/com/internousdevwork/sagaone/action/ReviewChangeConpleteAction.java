package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ReviewChangeConpleteDAO;
import com.internousdevwork.sagaone.dao.ReviewDAO;
import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewChangeConpleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	public ReviewChangeConpleteDAO reviewChangeConpleteDAO = new ReviewChangeConpleteDAO();
	private List<ReviewDTO> reviewDTO2List = new ArrayList<ReviewDTO>();
	private ReviewDAO reviewDAO = new ReviewDAO();

	public String execute() {

		// 入力されたものを更新

		reviewChangeConpleteDAO.updatereview(session.get("review_user_id").toString(),
				session.get("review_product_id").toString(), session.get("review_change_value").toString(),
				session.get("review_change_review").toString());

		// レビュー表示用再読み込み
		reviewDTO2List = reviewDAO.getreviewinfo2(session.get("review_product_id").toString());
		session.put("reviewDTO2List", reviewDTO2List);

		// 完了画面へ
		return SUCCESS;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}