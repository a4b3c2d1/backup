package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReviewConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;


	//評価情報格納
	private String value;

	//レビュー情報格納
	private String review;

	//レビューエラーメッセージ格納用
	private String reviewErrormessage;

	public String execute() {

		//入力されているかの確認
		if (!(value.equals("")) && !(review.equals(""))) {
			session.put("review_value", value);
			session.put("review_review", review);
			//確認画面へ
			return SUCCESS;
		} else {

			setReviewErrormessage("未入力です");
			//元の画面に戻す
			return ERROR;
		}
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReviewErrormessage() {
		return reviewErrormessage;
	}

	public void setReviewErrormessage(String reviewErrormessage) {
		this.reviewErrormessage = reviewErrormessage;
	}
}