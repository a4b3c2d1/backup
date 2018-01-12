<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
	<title>UserCreate画面</title>
	<style type="text/css">
		/* ========TAG LAYOUT======== */
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========ID LAYOUT======== */
		#top {
		   width:780px;
		   margin:30px auto;
		   border:1px solid #333;
		}

		#header {
		   width: 100%;
		   height: 80px;
		   background:black;
		}

		#main {
		   width: 100%;
		   height: 700px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 80px;
			background: black;
			clear:both;
		}
		
		p.error{
			color: red;
		}
	</style>
</head>
<body>
	<div id="header">
	 	<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>
		<div>
		<table>
			
			<s:form action="UserCreateConfirmAction">
			
			<p class ="error">
				<s:if test="session.blankMessage != ''">
					<s:property value="session.blankMessage"/>
				</s:if>
			</p>
			<tr>
					<td>
						<label>ログインID</label>
					</td>
					<td>
						<input type="text" name="userId" <s:if test="session != null"> value="<s:property value="userId"/>"</s:if>>
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
					<td>
						<label>パスワード</label>
					</td>
					<td>
						<input type="text" name="password" <s:if test="session != null"> value="<s:property value="password"/>"</s:if>>	
							<p class="error">
							<s:iterator value="errorPasswordList" var="errorPassword">
								<s:property value="errorPassword" escape="false" />
							</s:iterator>
							</p>
					</td>
				</tr>
				<tr>
					<td>
						<label>苗字</label>
					</td>
					<td>
						<input type="text" name="familyName" <s:if test="session != null"> value="<s:property value="familyName"/>"</s:if>>
							<p class="error">
							<s:iterator value="errorFamilyList" var="errorFamily">
								<s:property value="errorFamily" escape="false" />
							</s:iterator>
							</p>
					</td>
				</tr>
				<tr>
					<td>
						<label>名前</label>
					</td>
					<td>
						<input type="text" name="firstName" <s:if test="session != null"> value="<s:property value="firstName"/>"</s:if>>
							<p class="error">
							<s:iterator value="errorFirstList" var="errorFirst">
								<s:property value="errorFirst" escape="false" />
							</s:iterator>
							</p>
					</td>
				</tr>
				<tr>
					<td>
						<label>みょうじ</label>
					</td>
					<td>
						<input type="text" name="familyNameKana" <s:if test="session != null"> value="<s:property value="familyNameKana"/>"</s:if>>
							<p class="error">
							<s:iterator value="errorFamilyKanaList" var="errorFamilyKana">
								<s:property value="errorFamilyKana" escape="false" />
							</s:iterator>
							</p>
					</td>
				</tr>
				<tr>
					<td>
						<label>なまえ</label>
					</td>
					<td>
						<input type="text" name="firstNameKana" <s:if test="session != null"> value="<s:property value="firstNameKana"/>"</s:if>>
							<p class="error">
							<s:iterator value="errorFirstKanaList" var="errorFirstKana">
								<s:property value="errorFirstKana" escape="false" />
							</s:iterator>
							</p>
					</td>
				</tr>

				<tr>
					<td>
						<label>性別</label>
					</td>
					<td>
						<s:if test="session != null">
							<input type="radio" name="sex" value="0" <s:if test="sex == 0"> checked="checked" </s:if>/>男性
							<input type="radio" name="sex" value="1" <s:if test="sex == 1">checked="checked"</s:if> />女性
						</s:if>
						<s:if test="session == null">
							<input type="radio" name="sex" value="0" checked="checked" />男性
							<input type="radio" name="sex" value="1"  />女性
						</s:if>
					</td>
				</tr>

				<tr>
					<td>
						<label>メールアドレス</label>
					</td>
					<td>
						<input type="text" name="email" <s:if test="session != null"> value="<s:property value="email"/>"</s:if>>
							<p class="error">
							<s:iterator value="errorEmailList" var="errorEmail">
								<s:property value="errorEmail" escape="false" />
							</s:iterator>
							</p>
					</td>
				</tr>




				<s:submit value="登録"/>
			</s:form>
		</table>




			<div>
				<button onclick="history.back()">戻る</button>
			</div>
		</div>
	</div>
		<div id="footer">
	 	<div id="pr">
		</div>
	</div>
</body>
</html>