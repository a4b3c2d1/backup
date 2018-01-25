package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.DeleteReviewHistoryDAO;
import com.internousdevwork.sagaone.dto.ReviewProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteReviewHistoryAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	private String deleteFlg;
	private String productId;
	private int productIdInt;
	private DeleteReviewHistoryDAO deleteReviewHistory = new DeleteReviewHistoryDAO();
	private String message;

	public String execute() {
		String ret = SUCCESS;

		ArrayList<ReviewProductDTO> reviewProductList = (ArrayList<ReviewProductDTO>)session.get("reviewProductList");

		if(productId != null) {
			productIdInt = Integer.parseInt(productId);
		}


		if(deleteFlg.equals("0")) {
			deleteReviewHistory.deleteAll(session.get("loginUserId").toString());
			reviewProductList.removeAll(reviewProductList);
		}else if(deleteFlg.equals("1")){
			deleteReviewHistory.deleteOne(session.get("loginUserId").toString(), productIdInt);
			for(int i=0; i<reviewProductList.size(); i++) {
				if(reviewProductList.get(i).getProductId() == productIdInt) {
					reviewProductList.remove(i);
				}
			}
		}

		if(reviewProductList.isEmpty()) {
			message = "レビューした商品はありません";
		}
		session.put("reviewProductList", reviewProductList);

		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
