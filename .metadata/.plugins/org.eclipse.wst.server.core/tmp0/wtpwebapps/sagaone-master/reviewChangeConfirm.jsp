<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>変更確認画面</title>
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
	変更前
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

	↓ 変更内容
	<br> 評価


	<div class="rating">
		<div class="rating-front"
			style="width:<s:property value="value2" />%">★★★★★</div>
		<div class="rating-back">★★★★★</div>
	</div>


	<s:property value="session.review_change_review" />
	内容


	<s:form action="ReviewChangeConpleteAction">
		<s:submit value="完了">
		</s:submit>
	</s:form>

	<s:form action="ReviewEditAction">
		<td><input type="hidden" name="changeflg" value="1"></input></td>
		<s:submit value="戻る">
		</s:submit>
	</s:form>

</body>
</html>