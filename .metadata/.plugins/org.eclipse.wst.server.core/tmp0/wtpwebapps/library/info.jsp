<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userinfo</title>
</head>
<body>
	<table>

		<s:iterator value="#session.loginuser">
			<tr>
				<td><span>USERID</span></td>
				<td><s:property value="Login_id"></s:property></td>
			</tr>
			<tr>
				<td><span>PASSWORD</span></td>
				<td><s:property value="Login_password"></s:property></td>
			</tr>
			<tr>
				<td><span>USERNAME</span></td>
				<td><s:property value="Username"></s:property></td>
			</tr>
			<tr>
				<td><span>最終ログイン時間</span></td>
				<td><s:property value="lastlogin_time"></s:property></td>
			</tr>
			<tr>
				<td><span>変更時間</span></td>
				<td><s:property value="updated_time"></s:property></td>
			</tr>
		</s:iterator>

	</table>
	<br>
	ユーザー情報を変更したい場合
	<s:form action="InfochangeAction">
		<s:submit value="変更">
		</s:submit>
	</s:form>
</body>
</html>