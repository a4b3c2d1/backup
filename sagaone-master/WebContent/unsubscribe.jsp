<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Unsubscribe</title>
<link rel="stylesheet" type="text/css" href="./css/unsubscribe.css">
<link rel="stylesheet" type="text/css" href="./slick/slick.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="./slick/slick-theme.css"
	media="screen" />
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
	<header>

		<div id="main-logo">

			<a href=' <s:url action= "GoHomeAction" /> '><img
				src="./css/sagaone_logo.png" alt="logo"></a>
		</div>
	</header>

	<div id="main">
		<h2>退会処理が完了しました</h2>
		<br>
		<h3>ご利用ありがとうございました</h3>

		<div id="homebtn">
			<a href='<s:url action="StartAction" />'><button>Homeに戻る</button></a>
		</div>
	</div>
</body>
</html>