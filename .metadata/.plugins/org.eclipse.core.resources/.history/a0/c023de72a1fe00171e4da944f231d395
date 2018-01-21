package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ReviewChangeConpleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewChangeConpleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	public ReviewChangeConpleteDAO reviewChangeConpleteDAO = new ReviewChangeConpleteDAO();

	public String execute() {

		// 入力されたものを更新
		reviewChangeConpleteDAO.updatereview(session.get("review_user_id").toString(),
				session.get("review_product_id").toString(), session.get("review_change_value").toString(),
				session.get("review_change_review").toString());

		// 完了画面へ
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}