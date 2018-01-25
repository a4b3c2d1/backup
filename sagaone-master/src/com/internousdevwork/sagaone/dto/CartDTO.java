package com.internousdevwork.sagaone.dto;

public class CartDTO {
	private String id;
	private int productId = 0;
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private int price;
	private String count;
	private String releaseCompany;
	private String releaseDate;
	private String registDate;
	private int totalCount = 0;

	public int getProductId(){
		return productId;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}

	public String getProductName(){
		return productName;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductNameKana(){
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana){
		this.productNameKana = productNameKana;
	}

	public String getImageFilePath(){
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}

	public int getPrice(){
		return price;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public String getReleaseCompany(){
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany){
		this.releaseCompany = releaseCompany;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getRegistDate(){
		return registDate;
	}

	public void setRegistDate(String registDate){
		this.registDate = registDate;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getCount(){
		return count;
	}

	public void setCount(String count){
		this.count = count;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}


}