<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mainpage</title>
</head>
<body>

	ログイン中
	<s:iterator value="#session.loginuser">
		<s:property value="Username" />さん
	</s:iterator>

	<s:form action="">
		<s:submit value="目録管理">
		</s:submit>
	</s:form>

	<s:form action="">
		<s:submit value="閲覧管理">
		</s:submit>
	</s:form>
	<s:form action="UserinfoAction">
		<s:submit value="管理者設定">
		</s:submit>
	</s:form>
</body>
</html>