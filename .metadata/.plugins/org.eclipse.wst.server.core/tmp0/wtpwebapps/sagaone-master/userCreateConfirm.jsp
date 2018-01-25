
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	
	
	<link rel="stylesheet" type="text/css" href="./css/style.css">
	<link rel="stylesheet" type="text/css" href="./css/header.css">
	
	<title>UserCreateConfirm画面</title>
	
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
		<div id="title">ユーザー登録確認</div>
	</header>
	
	<div id="main">
		<div>
			<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action="UserCreateCompleteAction">
					<tr id="box">
						<td>
							<label>ログインID:</label>
						</td>
						<td>
							<s:property value="userId" escape="false" />
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>ログインPASS:</label>
						</td>
						<td>
							<s:property value="password" escape="false" />
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>苗字:</label>
						</td>
						<td>
							<s:property value="familyName" escape="false" />
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>名前:</label>
						</td>
						<td>
							<s:property value="firstName" escape="false" />
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>みょうじ:</label>
						</td>
						<td>
							<s:property value="familyNameKana" escape="false" />
						</td>
					</tr>
					<tr id="box">
						<td>
							<label>なまえ:</label>
						</td>
						<td>
							<s:property value="firstNameKana" escape="false" />
						</td>
					</tr>
					  
					<tr id="box">
						<td>
							<label>性別:</label>
						</td>
						<td>
							<s:if test="sex == 0">男</s:if>
                    		<s:if test="sex == 1">女</s:if>
						</td>
					</tr>
					
					<tr id="box">
						<td>
							<label>メール:</label>
						</td>
						<td>
							<s:property value="email" escape="false" />
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
	</div>
	
		<footer>© 2017-2018, Sagaone.com</footer>
	
</body>
</html>