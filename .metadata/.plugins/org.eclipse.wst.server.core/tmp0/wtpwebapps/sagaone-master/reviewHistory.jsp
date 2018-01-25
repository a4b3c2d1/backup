<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/reviewHistory.css">
	<title>SAGAONE | レビュー履歴</title>
</head>
<body>
	<div  class="main wrapper">
		<s:if test="message != null">
			<p><s:property value="message" /></p>
		</s:if>
		<s:iterator value="#session.reviewProductList">
			<div class="purchase-list">
				<div class="regist clearfix">
					<span class="name">
						<a href='<s:url action="ItemDetailAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'><s:property value="productName" /></a>
					</span>
					<span class="company">
					（<s:property value="releaseCompany" />）
					</span>
				</div>
				<div class="item clearfix">
					<div class="img">
						<a href='<s:url action="ItemDetailAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'><img src='<s:property value="imageFilePath" />' alt='<s:property value="imageFileName" />' ></a>
					</div>
					<div class="detail">
						<p class="price">金額:<s:property value="price" />円</p>
						<p class="release-date">発売日:<s:property value="releaseDate" /></p>
						<p class="release-date">評価:<s:property value="value" /></p>
						<p class="release-date">レビュー:<s:property value="review" /></p>
					</div>
					<div class="review">
						<input class="btn l-btn" type="button" onclick="location.href='<s:url action="ReviewAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /><s:param name="reviewFlg" value="1" /></s:url>'"value="修正">
						<input class="btn l-btn" type="button" onclick="location.href='<s:url action="DeleteReviewHistoryAction"><s:param name="productId" value="productId" /><s:param name="deleteFlg" value="1" /></s:url>'"value="消去">
					</div>
				</div>
			</div>
		</s:iterator>
		<s:if test="message == null">
			<input class="btn l-btn" type="button" onclick="location.href='<s:url action="DeleteReviewHistoryAction"><s:param name="deleteFlg" value="0" /></s:url>'"value="全てのレビューを消去">
		</s:if>
	</div>
</body>
</html>