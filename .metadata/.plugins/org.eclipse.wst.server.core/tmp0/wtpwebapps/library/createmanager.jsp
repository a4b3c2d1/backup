<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>createmanager</title>
</head>
<body>
	<s:if test="errorMessage !=''">
		<s:property value="errorMessage" escape="false" />

	</s:if>

	<table>
		<s:form action="CreatemanagerConfirmAction">
			<tr>
				<td><span>ログインID</span>
				<td><s:textfield name="NewUserId" /></td>
			</tr>

			<tr>
				<td><span>ログインPASS</span>
				<td><s:password name="NewPassword" /></td>
			</tr>

			<tr>
				<td><span>ユーザー名</span></td>
				<td><s:textfield name="NewUsername" /></td>
			</tr>
			<s:submit value="作成">
			</s:submit>
		</s:form>

	</table>
	<s:form action="MainpagebackAction">
		<s:submit value="戻る">
		</s:submit>
	</s:form>

</body>
</html>