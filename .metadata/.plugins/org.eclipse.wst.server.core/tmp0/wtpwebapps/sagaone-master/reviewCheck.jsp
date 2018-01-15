<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>レビュー表示</title>
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

<script type="text/javascript">
	function showConfirm() {

		if (window.confirm('削除してもよろしいですか？')) {
			window.alert("削除されました")
			return true;
		} else {
			return false;
		}
	}
</script>
</head>
<body>
	<s:iterator value="#session.reviewDTOList">

		<tr>
			<td><s:property value="user_id" /></td>
			<td><s:property value="update_date" /></td>

			<td>
				<div class="rating">
					<div class="rating-front"
						style="width:<s:property value="value" />%">★★★★★</div>
					<div class="rating-back">★★★★★</div>
				</div>
			</td>

			<td><s:property value="review" /></td>
		</tr>

	</s:iterator>

	<s:form action="ReviewEditAction">
		<td><input type="hidden" name="changeflg" value="1"></input></td>
		<s:submit value="新しく書き直す"></s:submit>

	</s:form>

	<s:form action="ReviewEditAction" onSubmit="return showConfirm()">
		<td><input type="hidden" name="deleteflg" value="1"></input></td>
		<s:submit value="削除"></s:submit>
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