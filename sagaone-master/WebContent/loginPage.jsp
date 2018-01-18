
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<html>
	<head>
		<meta charset="UTF-8">
			<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<link rel = "stylesheet" type="text/css" href="./css/login.css">
		<title>SAGAONE | ログインページ</title>


		<script type="text/javascript"
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
			<script src="./slick/slick.min.js"></script>



	</head>

	<body>

	<s:form action="LoginAction">
	<form>
	<ul class= "form-style">



			<li>
				<span class= "error">
				<s:if test="errorMessage != null ">
					<s:if test="errorMessageUser == null ">
				<s:property value="errorMessage" escape="false" /></s:if></s:if></span>

				<span class= "error">
				<s:if test="errorMessageUser != null ">
					<s:if test="errorMessage == null ">
				<s:property value="errorMessageUser" escape="false" /></s:if></s:if></span>

				<span class= "error">
				<s:if test="blankErrorMessageID != null ">
				<s:property value="blankErrorMessageID" escape="false" /></s:if></span>
				<input type="text" name="loginUserId" class= "field-holder" value= '<s:property value= "#session.checkedLoginUserId" />' placeholder= "login ID" ></li>

			<li>
				<span class= "error">
				<s:if test="blankErrorMessagePassword != null ">
				<s:property value="blankErrorMessagePassword" escape="false" /></s:if></span>
				<input type="password" name="loginPassword" class= "field-holder" value= "" placeholder= "password" ></li>

			<li><input type="checkbox" id="login" name= "loginMemory" value= "true" checked /><label for="login" data-on-label="On" data-off-label="Off"></label> <label for="login">IDを保存</label></li>
			<li><input type= "hidden" name= "cartFlg" value= "1"><s:submit value="enter" /><br><a class= "login" href="history.back()">戻る</a>&emsp;&emsp;<a class= "login" href= '<s:url action= "GoHomeAction" />'>&#x1f3e0;</a></li>


			</ul>
		</form>
	</s:form>

	<div class= "form-style">
	パスワード忘れちゃったのー<a class= "login" href= '<s:url action= "PasswordChangeAction" />' >(○・▽・○)</a><br>
	<br>
	ユーザー登録したいなー<a class= "login" href='<s:url action="UserCreateAction" />'>(○・▽・○)</a>
	<br><br></div>





</body>
</html>


