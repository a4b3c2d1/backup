package com.internousdevwork.sagaone.dto;

public class SearchItemInfoDTO {
	private String id;
	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String categoryId;
	private int price;
	private String imageFilePath;
	private String imageFileName;
	private String releaseDate;
	private String releaseCompany;
	private int status;
	private String searchFlg = "1";
	private String descriptionAll = productDescription;
	private String searchWords;
	private float avgvalue;
	private int countvalue;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSearchFlg() {
		return searchFlg;
	}
	public void setSearchFlg(String searchFlg) {
		this.searchFlg = searchFlg;
	}
	public String getDescriptionAll() {
		return descriptionAll;
	}
	public void setDescriptionAll(String descriptionAll) {
		this.descriptionAll = descriptionAll;
	}
	public String getSearchWords() {
		return searchWords;
	}
	public void setSearchWords(String searchWords) {
		this.searchWords = searchWords;
	}
	public float getAvgvalue() {
		return avgvalue;
	}
	public void setAvgvalue(float avgvalue) {
		this.avgvalue = avgvalue;
	}
	public int getCountvalue() {
		return countvalue;
	}
	public void setCountvalue(int countvalue) {
		this.countvalue = countvalue;
	}





	}
