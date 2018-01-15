<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Destination Create Confirm</title>
</head>
<body>
<div>
	<div>
		<s:form action="DestinationCreateCompleteAction" theme="simple">
			<table>
				<tr>
					<td>姓</td>
					<td><s:property value="#session.familyName" /></td>
				</tr>
				<tr>
					<td>名</td>
					<td><s:property value="#session.firstName" /></td>
				</tr>
				<tr>
					<td>姓ふりがな</td>
					<td><s:property value="#session.familyNameKana" /></td>
				</tr>
				<tr>
					<td>名ふりがな</td>
					<td><s:property value="#session.firstNameKana" /></td>
				</tr>
				<tr>
					<td>性別</td>
					<td>
						<s:if test="#session.sex == 0">男性</s:if>
						<s:if test="#session.sex == 1">女性</s:if>
					</td>
				</tr>
				<tr>
					<td>住所</td>
					<td><s:property value="#session.userAddress" /></td>
				</tr>
				<tr>
					<td>電話番号</td>
					<td><s:property value="#session.telNumber" /></td>
				</tr>
				<tr>
					<td>メール</td>
					<td><s:property value="#session.email" /></td>
				</tr>
				<tr>
				</tr>
			</table>
			<s:submit value="登録" />
			<input type="button" onclick="location.href='<s:url action="DestinationCreateAction" />' "value="修正する">
		</s:form>
	</div>
</div>
</body>
</html>