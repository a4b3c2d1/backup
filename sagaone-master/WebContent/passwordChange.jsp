<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />

	
	<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>SAGAONE|パスワード再設定画面</title>	

<style type="text/css">
		#title{
			height: 100px;
			display: flex;
			align-items: center;
			justify-content: center;
		}
		p.error{
			color: red;
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
					パスワード再設定
		</div>
	</header>
	
	<div id="main">
		<s:form action="PasswordChangeConfirmAction">
			
				<p class ="error">
					<s:if test="session.blankMessage != ''">
								<s:property value="session.blankMessage"/>
					</s:if>
				</p>
			
	
		<table>
			<tbody>
				<tr>
					<td>ログインID</td>
					<td>
						<input type="text" name="userId"  <s:if test="session != null"> value="<s:property value="userId"/>"</s:if>placeholder= "ログインID" ><!--「 再設定したい 」は消す-->
						<p class="error">
						<s:if test="errorIdList != null ">
							<s:iterator value="errorIdList" var="errorId">
								<s:property value="errorId" escape="false" />
							</s:iterator>
						</s:if>
						</p>
					</td>
				</tr>
				<tr>
					<td>新しいパスワード</td>
					<td>
						<input type="text" name="newLoginPassword"  <s:if test="session != null"> value="<s:property value="newLoginPassword"/>"</s:if>  placeholder= "新しいパスワード" >
						<p class="error">
						<s:if test="errorPasswordList != null ">
							<s:iterator value="errorPasswordList" var="errorPassword">
								<s:property value="errorPassword" escape="false" />
							</s:iterator>
						</s:if>
						</p>
					</td>
				</tr>
				<!-- 再設定の文字もtr、tdの中にいれる -->
				<tr>
						<td><s:submit value="再設定" /></td>
				</tr>
				<tr>
				<td>
					<input type="button"  value="戻る" onclick="history.back()">
				</td>
				</tr>
				</tbody>
				</table>
				</s:form>
	
				
	</div>

	<footer>© 2017-2018, Sagaone.com</footer>

</body>
</html>