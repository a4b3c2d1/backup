<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
		
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/header.css">


<title>クレジットカード登録確認</title>

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
			<a href=' <s:url action= "GoHomeAction" /> '><img src="./css/sagaone_logo.png" height="100px"></a>
		</div>
		<div id="title">クレジットカード登録確認</div>
</header>	
<div id="main">
	<h3>登録する内容は以下でよろしいですか。</h3>
	<table>
				<s:form action="CardCreateCompleteAction">
					<tr>
						<td>
							<label>カード番号:</label>
						</td>
						<td>
							<s:property value="cardNumber" escape="false" />
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>有効期限:</label>
						</td>
						<td>
						
							<s:property value="limitMonth" escape="false" /> 月
						
							<s:property value="limitYear" escape="false" /> 年
						
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>セキュリティコード:</label>
						</td>
						<td>
							<s:property value="securityNumber" escape="false" />
						</td>
					</tr>
					<tr>
						<td>
							<label>カード名義人:</label>
						</td>
						<td>
							<s:property value="nominee" escape="false" />
						</td>
					</tr>
					<tr>
						<td>
							<s:submit value="完了" />
						</td>
					</tr>
				</s:form>
				<tr>
					<td><input type="button"  value="戻る" onclick="history.back()"></td>
				<tr>
			</table>
</div>	

<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>