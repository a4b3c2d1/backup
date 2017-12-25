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
	こちらでよろしいですか？
	<table>
		<s:if test="%{NewLoginUserId!=null}">
			<tr>
				<td><span>USERID</span></td>
				<td><s:property value="NewLoginUserId"></s:property></td>
			</tr>
			<s:form action="InfochangeConpleteAction">
				<s:submit value="確定" method="aaa">
				</s:submit>
			</s:form>
		</s:if>
		<s:if test="%{NewLoginPassword!=null}">
			<tr>
				<td><span>PASSWORD</span></td>
				<td><s:property value="NewLoginPassword"></s:property></td>
			</tr>
			<s:form action="InfochangeConpleteAction">
				<s:submit value="確定" method="bbb">
				</s:submit>
			</s:form>
		</s:if>
		<s:if test="%{NewUserName!=null}">
			<tr>
				<td><span>USERNAME</span></td>
				<td><s:property value="NewUserName"></s:property></td>
			</tr>
			<s:form action="InfochangeConpleteAction">
				<s:submit value="確定" method="ccc">
				</s:submit>
			</s:form>
		</s:if>
	</table>


</body>
</html>
