<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>変更画面</title>
</head>
<body>
	管理者情報変更
<br><br>
	<s:if test="errorMessage !=''">
		<s:property value="errorMessage" escape="false" />

	</s:if>
	<s:form action="InfochangeConfirmAction">
		<tr>
			<td><span>USERID</span></td>
			<s:textfield name="NewLoginUserId" />
		</tr>
		<tr>
			<td><span>PASSWORD</span></td>
			<s:password name="NewLoginPassword" />
		</tr>
		<tr>
			<td><span>USERNAME</span></td>
			<s:textfield name="NewUserName" />
		</tr>
		<s:submit value="変更">
		</s:submit>
	</s:form>

</body>
</html>