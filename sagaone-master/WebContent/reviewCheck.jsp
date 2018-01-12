<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>レビュー表示</title>
</head>
<body>
	<s:iterator value="#session.reviewDTOList">

		<tr>
			<td><s:property value="user_id" /></td>
			<td><s:property value="update_date" /></td>
			<td><s:property value="value" /></td>
			<td><s:property value="review" /></td>
		</tr>

	</s:iterator>


	<s:form action="ReviewChangeAction">
		<s:submit value="新しく書き換える"></s:submit>
	</s:form>



	<s:form action="ItemDetailAction">

		<td><input type="hidden" name="product_id"
			value="<s:property value='session.review_product_id' />"></input></td>
		<td><input type="hidden" name="category_id"
			value="<s:property value='session.review_category_id' />"></input></td>
		<s:submit value="商品詳細へ">
		</s:submit>
	</s:form>

</body>
</html>