<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SAGAONE|パスワード再設定画面</title>	
</head>
<body>
	


		<s:form action="PasswordChangeConfirmAction">
		
		
		<s:if test="session.blankMessage != ''">
					<s:property value="session.blankMessage"/>
		</s:if>
		

	<table>
		<tbody>
			<tr>
				<td>ログインID</td>
				<td>
					<input type="text" name="userId"  <s:if test="session != null"> value="<s:property value="userId"/>"</s:if>placeholder= "再設定したいログインID" >
					<s:if test="errorIdList != null ">
						<s:iterator value="errorIdList" var="errorId">
							<s:property value="errorId" escape="false" />
						</s:iterator>
					</s:if>
				</td>
			</tr>
			<tr>
				<td>新しいパスワード</td>
				<td>
					<input type="text" name="newLoginPassword"  <s:if test="session != null"> value="<s:property value="newLoginPassword"/>"</s:if>  placeholder= "新しいパスワード" >
					<s:if test="errorPasswordList != null ">
						<s:iterator value="errorPasswordList" var="errorPassword">
							<s:property value="errorPassword" escape="false" />
						</s:iterator>
					</s:if>
				</td>
			</tr>

					<s:submit value="再設定" />
			</tbody>
			</table>
			</s:form>

			ログインに戻るなら<a href= ' <s:url action= "LoginPageAction" />'>こちら</a><br>

</body>
</html>