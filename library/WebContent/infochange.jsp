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
	<br>
	<br>
	<s:if test="errorMessage !=''">
		<s:property value="errorMessage" escape="false" />

	</s:if>

	<s:if test='%{#session.selectmessage=="a"}'>
		<s:form action="InfochangeConfirmAction">
			<tr>
				<td><span>ログインID</span></td>
				<s:textfield name="NewLoginUserId" />
			</tr>
			<s:submit value="変更" method="aaa">
			</s:submit>
		</s:form>


	</s:if>
	<s:elseif test='%{#session.selectmessage=="b"}'>
		<s:form action="InfochangeConfirmAction">

			<tr>
				<td><span>ログインPASS</span></td>
				<s:password name="NewLoginPassword" />
			</tr>
			<s:submit value="変更" method="bbb">
			</s:submit>
		</s:form>
	</s:elseif>
	<s:elseif test='{#session.selectmessage =="c"}'>
		<s:form action="InfochangeConfirmAction">

			<tr>
				<td><span>ユーザー名</span></td>
				<s:textfield name="NewUserName" />
			</tr>

			<s:submit value="変更" method="ccc">
			</s:submit>
		</s:form>
	</s:elseif>
	<s:form action="UserinfoAction">
		<s:submit value="戻る">
		</s:submit>
	</s:form>

</body>
</html>