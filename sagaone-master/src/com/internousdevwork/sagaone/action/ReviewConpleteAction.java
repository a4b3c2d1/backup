package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ReviewConpleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewConpleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	ReviewConpleteDAO reviewConpleteDAO = new ReviewConpleteDAO();

	public String execute() {
		// レビューを登録
		reviewConpleteDAO.insertreview(session.get("review_user_id").toString(),
				session.get("review_product_id").toString(), session.get("review_value").toString(),
				session.get("review_review").toString());
		// 完了画面へ
		return SUCCESS;

	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
