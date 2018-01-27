package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReviewConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	// 評価情報格納
	private String value;

	// レビュー情報格納
	private String review;

	// レビュー確認用
	public String review2;

	// レビューエラーメッセージ格納用
	private String reviewErrormessage;

	public String result;

	public String execute() {

		if(session.get("loginFlg").toString()!=("false")){

			// 改行だけの場合を回避
			review2 = review;
			review2 = review.replaceAll("\r\n", "").replaceAll("&nbsp", " ").replaceAll("　", "");

			// 入力されているかの確認
			if (!(value.equals("")) && !(review.equals("")) && !(review2.trim().length() == 0)) {

				review = review.replaceAll("\r\n", "<br/>").replaceAll(" ", "&nbsp;").replaceAll("　", "&emsp;");

				if (review.length() > 255) {
					setReviewErrormessage("文字数オーバーです");
					review = review.replaceAll("<br/>", "\r\n").replaceAll("&nbsp;", " ").replaceAll("&emsp;", "　");

					return ERROR;

				} else {

					session.put("review_review", review);
					session.put("review_value", value);

					review2 = review;
					review2 = review.replaceAll("<br/>", "\r\n").replaceAll("&nbsp;", " ").replaceAll("&emsp;", "　");
					session.put("review_review2", review2);

					// 確認画面へ
					result = SUCCESS;
				}
			} else {

				setReviewErrormessage("未入力です");
				// 元の画面に戻す
				result = ERROR;
			}
		} else {

			result = "error2";
		}

		return result;
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