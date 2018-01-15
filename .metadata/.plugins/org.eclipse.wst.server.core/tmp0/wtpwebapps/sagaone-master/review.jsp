<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>レビュー</title>
<style type="text/css">
.hyouka {
	float: left;
	display: -ms-flex;
	display: -webkit-flex;
	display: -moz-flex;
	display: -o-flex;
	display: flex;
	flex-direction: -ms-row-reverse;
	flex-direction: -webkit-row-reverse;
	flex-direction: -moz-row-reverse;
	flex-direction: -o-row-reverse;
	flex-direction: row-reverse;
	justify-content: -ms-right;
	justify-content: -webkit-right;
	justify-content: -moz-right;
	justify-content: -o-right;
	justify-content: right;
}

.hyouka input[type='radio'] {
	display: none;
}

.hyouka label {
	position: relative;
	padding: 10px 0px 20px 0px;
	color: #bbb;
	cursor: pointer;
	font-size: 30px;
}

.hyouka label:hover, .hyouka label:hover ~ label, .hyouka input[type='radio']:checked
	 ~ label {
	color: #faee2e;
}
</style>
</head>
<body>
	<s:if test="reviewErrormessage !=''">
		<s:property value="reviewErrormessage" escape="false" />

	</s:if>
	<s:form action="ReviewConfirmAction">

		<div class="hyouka">
			<input id="hoshi1" type="radio" name="value" value="5" /> <label for="hoshi1">★</label>
			<input id="hoshi2" type="radio" name="value" value="4" /> <label for="hoshi2">★</label>
			<input id="hoshi3" type="radio" name="value" value="3" /> <label for="hoshi3">★</label>
			<input id="hoshi4" type="radio" name="value" value="2" /> <label for="hoshi4">★</label>
			<input id="hoshi5" type="radio" name="value" value="1" /> <label for="hoshi5">★</label>
			<input type="radio" name="value" value="" checked="checked" style="display:none;" />
		</div>
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