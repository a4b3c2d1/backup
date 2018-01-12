<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>SAGAONE | ログインページ</title>
</head>
<body>
	<h3>新しいパスワードは以下でよろしいですか？</h3>
	<table>
	<s:form action= "PasswordChangeCompleteAction">
		<tr>
			<td>
				<label>ログインID:</label>
			</td>
			<td>
				<s:property value="userId" escape="false" />
			</td>
		</tr>
		<tr>
			<td>
				<label>新しいパスワード:</label>
			</td>
			<td>
				<s:property value=" newLoginPassword" escape="false" />
			</td>
		</tr>
		<tr>
			<td>
				<s:submit value="完了" />
			</td>
		</tr>
		<tr>
			<td>
				<a href= '<s:url action= "PasswordChangeAction" />'>戻る</a>
			</td>
	</s:form>
	</table>
</body>
</html>

