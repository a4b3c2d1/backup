<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
	
<link rel="stylesheet" type="text/css" href="./css/style.css">
	
<title>クレジットカード登録完了</title>
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
			クレジットカード登録完了
		</div>
	</header>
	
	<div id="main">
		<h3>クレジットカードの登録が完了致しました。</h3>
		<div>
			<a href='<s:url action="MyPageAction" />'>マイページへ</a>
		</div>
	</div>
	
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>