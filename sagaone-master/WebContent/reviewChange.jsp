<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>レビュー変更</title>
</head>
<body>
	<s:if test="reviewErrormessage !=''">
		<s:property value="reviewErrormessage" escape="false" />

	</s:if>
	<s:form action="ReviewChangeConfirmAction">


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
	<s:iterator value="#session.itemdetailDTOList">
		<s:form action="ReviewAction">
			<tr>
				<td><input type="hidden" name="product_id"
					value="<s:property value='product_id' />"></input></td>
				<td><input type="hidden" name="category_id"
					value="<s:property value='category_id' />"></input></td>
				<s:submit value="戻る"></s:submit>
			</tr>
		</s:form>
	</s:iterator>
</body>
</html>