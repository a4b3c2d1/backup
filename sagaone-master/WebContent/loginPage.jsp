
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta charset="UTF-8">

<title>SAGAONE | ログインページ</title>
</head>
<body>

	<s:if test="blankErrorMessageID != null ">
		<s:property value="blankErrorMessageID" escape="false" />
	</s:if>
	<s:if test="blankErrorMessagePassword != null ">
		<s:property value="blankErrorMessagePassword" escape="false" />
	</s:if>
	<s:if test="errorMessage != null ">
		<s:property value="errorMessage" escape="false" />
	</s:if>


	<s:form action="LoginAction">

	<table>
		<tbody>
			<tr>
				<td>
					<form name= "memory">
					<input type="text" name="loginUserId" value= '<s:property value= "session.loginMemoryId" />' placeholder= "ログインID" >
					</form>
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="loginPassword" value= "" placeholder= "パスワード" >
				</td>
			</tr>
		</tbody>
	</table>
	<label><input type= "checkbox" name= "loginMemory" value= ""> ログインIDを保存する</label>
		<s:submit value="ログイン" onClick= "setLoginMemory" />
	</s:form>

	パスワード忘れたならこっち<a href='<s:url action="PasswordChangeAction" />'>(○・▽・○)</a>だよー<br>
	ユーザー登録するなら<a href='<s:url action="UserCreateAction" />'>(○・▽・○)</a>だよー
	<br><br>

	ログインFlgでチェックボックスtrueとfalseを判断、trueならlogoutActionでsession.putでsession.clearした後にログインIDを保存、
	sessionで呼び出し

</body>
</html>


