<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>レビュー</title>
</head>
<body>
	<s:if test="reviewErrormessage !=''">
		<s:property value="reviewErrormessage" escape="false" />

	</s:if>
	<s:form action="ReviewConfirmAction">


		<select name="value">
			<option value="1" selected="selected">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>
	レビュー:
	<s:textarea name="review" />
		<br>
		<s:submit value="レビューする" />
	</s:form>

	<s:form action="ItemDetailAction">

		<td><input type="hidden" name="product_id"
			value="<s:property value='session.review_product_id' />"></input></td>
		<td><input type="hidden" name="category_id"
			value="<s:property value='session.review_category_id' />"></input></td>
		<s:submit value="商品詳細へ戻る">
		</s:submit>
	</s:form>
</body>
</html>