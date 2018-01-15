<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Destination Create Complete</title>
</head>
<body>
<div>
	<p>登録が完了しました。</p>
		<%-- マイページから遷移してくる場合はmyAddressFlg="1"としてリンクを決済確認から切り替える --%>
	<p><a href='<s:url action="PaymentAction" />'>決済確認画面へ戻る</a>
</div>
</body>
</html>