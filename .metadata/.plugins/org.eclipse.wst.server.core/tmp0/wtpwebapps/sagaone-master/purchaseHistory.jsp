<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品購入履歴</title>
</head>
<body>
<div>

	<s:if test="message != null">
		<p><s:property value="message" /></p>
	</s:if>
	<s:form action="PurchaseHistoryAction">
		<table border="1">
			<tr>
				<th></th>
				<th>商品名</th>
				<th>ふりがな</th>
				<th>商品画像</th>
				<th>値段</th>
				<th>発売会社名</th>
				<th>発売年月日</th>
			</tr>
			<s:iterator value="purchaseHistoryList">
				<tr>
					<td><input type="checkbox" name="checkboxList" value="${id}"></td>
					<td><s:property value="productName" /></td>
					<td><s:property value="productNameKana" /></td>
					<td><a href='<s:url action="ItemDetailAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'><img src='<s:property value="imageFilePath" />' alt='<s:property value="imageFileName" />' style=" width:100px; height: 100px;" ></a></td>
					<td><s:property value="price" />円</td>
					<td><s:property value="releaseCompany" /></td>
					<td><s:property value="releaseDate" /></td>
					<td>
						<input type="button" onclick="location.href='<s:url action="ReviewAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'"value="レビューする">
						<input type="button" onclick="location.href='<s:url action="CartAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'"value="再度購入する">
					</td>
				</tr>
			</s:iterator>
		</table>
		<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
			<button type="submit" name="deleteFlg" value="0">履歴をすべて削除</button>
		</s:url>
		<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
			<button type="submit" name="deleteFlg" value="1">選択した項目を削除</button>
		</s:url>

		<%-- まだマイページと繋がっていない為、仮の更新ボタン --%>
		<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
			<button type="submit">更新</button>
		</s:url>
	</s:form>
		<a href='<s:url action="MyPageAction" />'>マイページに戻る</a>
</div>

</body>
</html>