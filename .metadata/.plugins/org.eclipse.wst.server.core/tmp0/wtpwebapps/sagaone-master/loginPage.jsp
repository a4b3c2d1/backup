
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
					<input type="text" name="loginUserId" value= '<s:property value= "#session.checkedLoginUserId" />' placeholder= "ログインIDだよー(○・▽・○)" >
					</form>
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="loginPassword" value= "" placeholder= "パスワードだよー(○・▽・○)" >
				</td>
			</tr>
		</tbody>
	</table>
	<label><input type= "checkbox" name= "loginMemory" value= "true" > ログインIDを保存する(○・▽・○)？</label>
		<s:submit value="ログイン" />
	</s:form>

	パスワード忘れたならこっち<a href='<s:url action="PasswordChangeAction" />'>(○・▽・○)</a>だよー<br>
	ユーザー登録するなら<a href='<s:url action="UserCreateAction" />'>(○・▽・○)</a>だよー
	<br><br>

	(○・▽・○)(○・▽・○)むつかしいねー(○・▽・○)(○・▽・○)


</body>
</html>


