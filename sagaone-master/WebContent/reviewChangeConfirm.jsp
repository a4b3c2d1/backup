<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>変更確認画面</title>
</head>
<body>
	変更前
	<s:iterator value="#session.reviewDTOList">

		<tr>
			<td><s:property value="user_id" /></td>
			<td><s:property value="update_date" /></td>

			<td>	評価<s:property value="value" /></td>
			<td><s:property value="review" /></td>
		</tr>

	</s:iterator>

	↓ 変更内容
	<br> 評価


	<s:property value="session.review_change_value" />

	内容
	<s:property value="session.review_change_review" />


	<s:form action="ReviewChangeConpleteAction">
		<s:submit value="完了">
		</s:submit>
	</s:form>

	<s:form action="ReviewChangeAction">
		<s:submit value="戻る">
		</s:submit>
	</s:form>

</body>
</html>