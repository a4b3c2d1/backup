package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ReviewDAO;
import com.internousdevwork.sagaone.dao.ReviewEditDAO;
import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewEditAction extends ActionSupport implements SessionAware {

	private ReviewEditDAO reviewEditDAO = new ReviewEditDAO();

	private List<ReviewDTO> reviewDTO2List = new ArrayList<ReviewDTO>();

	private ReviewDAO reviewDAO = new ReviewDAO();

	public Map<String, Object> session;

	private String changeflg;

	private String deleteflg;

	public String result;

	public String execute() {

		if (changeflg != null) {
			// レビュー変更画面へ

			result = "change";

		} else if (deleteflg != null) {
			// レビュー削除
			reviewEditDAO.deletereview(session.get("review_user_id").toString(),
					session.get("review_product_id").toString());

			// レビュー再読み込み用
			reviewDTO2List = reviewDAO.getreviewinfo2(session.get("review_product_id").toString());
			session.put("reviewDTO2List", reviewDTO2List);

			result = "delete";

		}
		return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getChangeflg() {
		return changeflg;
	}

	public void setChangeflg(String changeflg) {
		this.changeflg = changeflg;
	}

	public String getDeleteflg() {
		return deleteflg;
	}

	public void setDeleteflg(String deleteflg) {
		this.deleteflg = deleteflg;
	}
}