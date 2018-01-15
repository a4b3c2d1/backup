package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReviewChangeConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private String value;
	private String review;
	private String reviewErrormessage;

	private int value2;

	public String execute() {

		// 入力されているかの確認
		if (!(value.equals("")) && !(review.equals(""))) {
			session.put("review_change_value", value);
			session.put("review_change_review", review);

			//次ページで表示させるため

			value2=Integer.parseInt(value)*20;

			// 確認画面へ
			return SUCCESS;
		} else {
			setReviewErrormessage("未入力です");

			// 入力画面へ
			return ERROR;
		}
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
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

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
