package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ReviewHistoryDAO;
import com.internousdevwork.sagaone.dao.ReviewProductDAO;
import com.internousdevwork.sagaone.dto.ReviewInfoDTO;
import com.internousdevwork.sagaone.dto.ReviewProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewHistoryAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private ReviewHistoryDAO reviewHistoryDAO = new ReviewHistoryDAO();
	private List<ReviewInfoDTO> reviewInfoDTOList = new ArrayList<ReviewInfoDTO>();
	private List<ReviewProductDTO> reviewProductList = new ArrayList<ReviewProductDTO>();
	private String message;
	private String actionPage;

	public String execute() {
		String ret = SUCCESS;

		actionPage = "ReviewHistoryAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
		    return ERROR;
		}

		//レビューした商品を取得
		reviewInfoDTOList = reviewHistoryDAO.getReviewInfo(session.get("loginUserId").toString());

		//レビューした商品の詳細を取得
		for(int i=0; i<reviewInfoDTOList.size(); i++) {
			ReviewProductDTO reviewProductDTO = new ReviewProductDTO();
			ReviewProductDAO reviewProductDAO = new ReviewProductDAO();
			reviewProductDTO = reviewProductDAO.getReviewProductInfo(reviewInfoDTOList.get(i).getProductId());
			reviewProductDTO.setValue(reviewInfoDTOList.get(i).getValue());
			reviewProductDTO.setReview(reviewInfoDTOList.get(i).getReview());
			reviewProductList.add(reviewProductDTO);
		}

		session.put("reviewProductList", reviewProductList);

		if(reviewProductList.isEmpty()) {
			message = "レビューした商品はありません";
		}

		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<ReviewProductDTO> getReviewProductList() {
		return reviewProductList;
	}

	public void setReviewProductList(List<ReviewProductDTO> reviewProductList) {
		this.reviewProductList = reviewProductList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}




}
