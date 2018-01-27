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

	<link rel="stylesheet" type="text/css" href="./css/style.css">
	<link rel="stylesheet" type="text/css" href="./css/header.css">
	
			<script type="text/javascript"
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
			<script src="./slick/slick.min.js"></script>

				<script>
				jQuery(function($) {
					jQuery(document).on("click", "#btn", function(){
						var length = document.getElementById("length").value;
						var randamStr = getRandom(length);
						document.getElementById("stringRow").value = randamStr;
					});
				});

				function getRandom(length) {
					if(length > 16 || length < 3){
						var result = "";
						return result;
					}else{
						var ram = 0;
						var result = "";
						var str = "";

							str += "0123456789abcdefghijklmnopqrstuvwxyz";
							ram += 36;

						// ランダム文字列生成
						for(var i=0; i<length; i++) {
							result += str.charAt(Math.floor(Math.random() * ram));
						}
						return result;
					}
				}

				</script>

	<title>UserCreate画面</title>

	<style type="text/css">
		p.error{
			color: red;
		}

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
		<div id="title">ユーザー新規登録</div>
	</header>


	<div id="main">

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
							<input type="text" name="userId" <s:if test="session != null"> value="<s:property value="userId"/>"</s:if>placeholder="半角英数字・1～8字"size="35">
						</td>
						<td>
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
								<input id="stringRow" type="text" name="password" type= "text"  <s:if test="session != null"> value="<s:property value="password"/>"</s:if>placeholder="半角英数字・3～16字" size="35"/>
						</td>
						<td>
								<input type="button" id="btn"  name="btn" value="自動生成"/>
								桁数：<input id="length" type="number" name="length" value="5" min="1" max="16"/>
						</td>
						<td>
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
							<input type="text" name="familyName" <s:if test="session != null"> value="<s:property value="familyName"/>"</s:if>placeholder="半角英数/ひらがな/カタカナ/漢字・1～16字" size="35">
						</td>
						<td>
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
							<input type="text" name="firstName" <s:if test="session != null"> value="<s:property value="firstName"/>"</s:if>placeholder="半角英数/ひらがな/カタカナ/漢字・1～16字" size="35">
						</td>
						<td>
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
							<input type="text" name="familyNameKana" <s:if test="session != null"> value="<s:property value="familyNameKana"/>"</s:if>placeholder="ひらがな・1～16字" size="35">
						</td>
						<td>
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
							<input type="text" name="firstNameKana" <s:if test="session != null"> value="<s:property value="firstNameKana"/>"</s:if>placeholder="ひらがな・1～16字" size="35">
						</td>
						<td>
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
							<input type="text" name="email" <s:if test="session != null"> value="<s:property value="email"/>"</s:if> placeholder="abcdefg@gmail.com" size="35">
						</td>
						<td>
								<p class="error">
								<s:iterator value="errorEmailList" var="errorEmail">
									<s:property value="errorEmail" escape="false" />
								</s:iterator>
								</p>
						</td>
					</tr>
					<tr>
						<td><s:submit value="登録"/></td>
					</tr>

				</s:form>
					<tr>
						<td><input id="page" type="button" onclick="location.href=' <s:url action= "StartAction" />'"value="戻る"></td>
					<tr>
			</table>
	</div>

	<footer>© 2017-2018, Sagaone.com</footer>

</body>
</html>