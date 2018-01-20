<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />

<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>SAGAONE パスワード再設定確認画面</title>
<style type="text/css">
		#title{
			height: 100px;
			display: flex;
			align-items: center;
			justify-content: center;
		}
		
		input[type="button"]{
			background: #4B99AD;
		    padding: 8px 15px 8px 15px;
		    border: none;
		    color: #fff;
		}
		
		input[type="submit"]{
			background: #4B99AD;
		    padding: 8px 15px 8px 15px;
		    border: none;
		    color: #fff;
		}
</style>	
</head>
<body>

	<header>
		<div id="main-logo">
			<img src="./css/sagaone_logo.png" height="100px">	
		</div>
		<div id="title">
					パスワード再設定確認
		</div>
	</header>

	<div id="main">
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
					<input type="button"  value="戻る" onclick="history.back()">
				</td>
			</tr>
		</s:form>
		</table>
	</div>
	
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>

