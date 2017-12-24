<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>確認画面</title>
</head>
<body>

	登録する内容は以下でよろしいですか。
	<table>
		<s:form action="CreatemanagerConpleteAction">
			<tr>
				<td><label>ログインID:</label></td>
				<td><s:property value="NewUserId" escape="false" /></td>
			</tr>
			<tr>
				<td><label>ログインPASS:</label></td>
				<td><s:property value="NewPassword" escape="false" /></td>
			</tr>
			<tr>
				<td><label>ユーザー名:</label></td>
				<td><s:property value="NewUsername" escape="false" /></td>
			</tr>
			<tr>
				<td><s:submit value="完了" /></td>
			</tr>
		</s:form>
	</table>
</body>
</html>