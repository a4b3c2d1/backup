<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者login画面</title>
</head>
<body>

	<s:form action="LoginAction">
		<s:textfield name="LoginUserId" />
		<s:password name="LoginPassword" />
		<s:submit value="ログイン">
		</s:submit>
	</s:form>




</body>
</html>