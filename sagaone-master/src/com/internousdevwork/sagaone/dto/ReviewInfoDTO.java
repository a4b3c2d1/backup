package com.internousdevwork.sagaone.dto;

public class ReviewInfoDTO {

	private String userId;
	private int productId;
	private int value;
	private String review;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}


}
