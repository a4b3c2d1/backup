<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
	
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>SAGAONEパスワード再設定完了</title>
<style type="text/css">
		#title{
			height: 100px;
			display: flex;
			align-items: center;
			justify-content: center;
		}
</style>
</head>
<body>
	<header>
		<div id="main-logo">
			<img src="./css/sagaone_logo.png" height="100px">	
		</div>
		<div id="title">
			パスワード再設定完了
		</div>
	</header>
	
	<div id="main">
		<h3>パスワードを再設定しました。</h3>
		<div>
			<a href='<s:url action="LoginPageAction" />'>ログインへ</a>
		</div>
	</div>

</body>
</html>

