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

	<s:form action="BookpageAction">
		<s:submit value="目録管理">
		</s:submit>
	</s:form>

	<s:form action="UserAction">
		<s:submit value="閲覧管理">
		</s:submit>
	</s:form>
	<s:form action="UserinfoAction">
		<s:submit value="管理者情報">
		</s:submit>
	</s:form>
	<s:form action="CreatemanagerAction">
		<s:submit value="新規管理者登録">
		</s:submit>
	</s:form>


	ログアウトする場合は
	<a href='<s:url action="LogoutAction"/>'>こちら</a>
</body>
</html>