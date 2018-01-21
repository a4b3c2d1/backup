package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ReviewDAO;
import com.internousdevwork.sagaone.dto.LoginDTO;
import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport implements SessionAware {

	private ReviewDAO reviewDAO = new ReviewDAO();
	private List<ReviewDTO> reviewDTOList = new ArrayList<ReviewDTO>();

	// 商品情報格納
	private String product_id;

	// カテゴリー情報格納
	private String category_id;

	private String reviewFlg;

	public Map<String, Object> session;

	// loginUserId情報格納の変数
	private String reviewloginuser_id;

	// 戻り値変数
	public String ret;

	public String execute() {

		// セッション名("loginUser")の存在確認
		if ((session.get("loginUser")) != null) {

			// loginflg確認
			if (((LoginDTO) session.get("loginUser")).getLoginFlg()) {

				// loginUserId情報格納
				reviewloginuser_id = (session.get("loginUserId")).toString();

				// そのユーザが商品のレビューを書いたことがあるかの確認メソッド
				reviewDTOList = reviewDAO.getreviewinfo1(reviewloginuser_id, product_id);
				session.put("reviewDTOList", reviewDTOList);

				session.put("review_user_id", reviewloginuser_id);
				session.put("review_product_id", product_id);
				session.put("review_category_id", category_id);
				session.put("reviewFlg", reviewFlg);


				// 書いたことがない場合
				if (reviewDTOList.size() == 0) {

					ret = SUCCESS;

					// 書いたことがある場合
				} else {

					ret = "confirm";
				}
			}
		} else {
			ret = ERROR;

		}
		return ret;
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

	public String getReviewloginuser_id() {
		return reviewloginuser_id;
	}

	public void setReviewloginuser_id(String reviewloginuser_id) {
		this.reviewloginuser_id = reviewloginuser_id;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getReviewFlg() {
		return reviewFlg;
	}

	public void setReviewFlg(String reviewFlg) {
		this.reviewFlg = reviewFlg;
	}

}
