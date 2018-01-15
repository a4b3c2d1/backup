<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>確認画面</title>
<style type="text/css">
.rating {
	position: relative;
	width: 5em;
	height: 1em;
	font-size: 25px;
}

.rating-front {
	position: absolute;
	top: 0;
	left: 0;
	overflow: hidden;
	color: #ffcc33;
}

.rating-back {
	color: #ccc;
}
</style>
</head>
<body>
	登録する内容は以下でよろしいですか。
	<br> 評価
	<div class="rating">
		<div class="rating-front" style="width:<s:property value="value2" />%">★★★★★</div>
		<div class="rating-back">★★★★★</div>
	</div>

	内容
	<s:property value="session.review_review" />


	<s:form action="ReviewConpleteAction">
		<s:submit value="完了">
		</s:submit>
	</s:form>



	<s:iterator value="#session.itemdetailDTOList">
		<s:form action="ReviewAction">
			<tr>
				<td><input type="hidden" name="product_id"
					value="<s:property value='session.review_product_id' />"></input></td>
				<td><input type="hidden" name="category_id"
					value="<s:property value='session.review_category_id' />"></input></td>
				<s:submit value="戻る"></s:submit>
			</tr>
		</s:form>
	</s:iterator>


</body>
</html>