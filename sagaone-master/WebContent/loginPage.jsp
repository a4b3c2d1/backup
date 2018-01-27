<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/login.css">
<title>login</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript" src="./js/autocomplete.js"></script>
<!-- ===================ここまで前頁共通=================== -->


</head>
<body>
	<header>
		<div id="main-logo">
			<a href=' <s:url action= "GoHomeAction" /> '><img src="./css/sagaone_logo.png" height="100px"></a>
		</div>

		<div id="search-form">

			<s:form action="SearchItemAction">
				<div id="search-box">
					<select name="itemCategory" id="category">
						<option value="0">全てのカテゴリー</option>
						<option value="1">本</option>
						<option value="2">家電・パソコン</option>
						<option value="3">おもちゃ・ゲーム</option>
					</select>
					<input type="text" name="searchWord" id="jquery-ui-autocomplete-input" />
				</div>
				<div class="search-btn">
				<input type="image" src="./css/searchIcon.png" width="20" height="20" class="icon"/>
				</div>
			</s:form>
		</div>

		<div id="header-container">
			<div id="acountmenu">
				<ul id="normal" class="dropmenu">

					<li id="itemmenu"><span class="drop-topic">商品カテゴリー&thinsp;<span class="sankaku">▼</span></span>
						<ul class="item-drop">
							<li>
								<s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="0" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="全てのカテゴリー" cssClass="c-btn" />
								</s:form>
							</li>
							<li>
								<s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="1" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="本" cssClass="c-btn" />
								</s:form>
							</li>
							<li>
								<s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="2" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="家電・パソコン" cssClass="c-btn" />
								</s:form>
							</li>
							<li>
								<s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="3" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="おもちゃ・ゲーム" cssClass="c-btn" />
								</s:form>
							</li>
						</ul>
					</li>

					<li id="acountmenu"><span class="drop-topic">アカウントメニュー&thinsp;<span class="sankaku">▼</span></span>
						<ul class="acount-drop">
							<s:if test="session.loginUser != null">
								<li><s:form action="MyPageAction">
										<s:submit value="マイページ" cssClass="b-btn" />
									</s:form>
								</li>
							</s:if>


							<s:if test="session.loginUser == null">
								<li><s:form action="LoginPageAction">
										<s:submit value="ログイン画面へ" cssClass="b-btn" />
									</s:form>
								</li>
							</s:if>

							<s:if test="session.loginUser != null">
								<li><s:form action="LogoutAction">
										<s:submit value="ログアウト" cssClass="b-btn" />
									</s:form>
								</li>
							</s:if>

							<s:if test="session.loginUser == null">
								<li>
									<s:form action="UserCreateAction">
										<s:submit value="ユーザー登録" cssClass="b-btn" />
									</s:form>
								</li>
							</s:if>

							<li><s:form action="CartAction">
									<s:hidden name="cartFlg" value="1"></s:hidden>
									<s:submit value="カート確認" cssClass="b-btn" />
								</s:form>
							</li>

							<s:if test="session.loginUser != null">
								<li><s:form action="PaymentAction">
										<s:submit value="決済" cssClass="b-btn" />
									</s:form>
								</li>
							</s:if>
						</ul>
					</li>
					<li id="welcome">
						<s:if test="session.loginUser != null" >
							<s:property value="#session.loginUserId" />&nbsp;さんでログイン中
						</s:if>
					</li>
				</ul>
			</div>
		</div>
	</header>


	<s:form action="LoginAction">
	<form>
	<ul class= "form-style">

			<li class= "list">
				<span class= "error">
				<s:if test="errorId == null && errorId1 == null && errorId2 == null &&
							errorPassword== null && errorPassword1== null && errorPassword2== null ">
				<s:property value="errorMessage" escape="false" /></s:if></span></li>

			<li class= "list">
				<span class= "error">
				<s:if test="errorId != null">
					<s:property value="errorId" escape="false" />
				</s:if>

				<s:if test="errorId1 != null">
					<s:property value="errorId1" escape="false" />
				</s:if>

				<s:if test="errorId2 != null">
					<s:property value="errorId2" escape="false" />
				</s:if></span></li>


				<li class= "list">
					<input type="text" name="loginUserId" class= "field-holder" value= '<s:property value= "#session.checkedLoginUserId" />' placeholder= "login ID" ></li>

			<li class= "list">
				<span class= "error">
				<s:if test="errorPassword != null">
					<s:property value="errorPassword" escape="false" />
				</s:if>

				<s:if test="errorPassword1 != null">
					<s:property value="errorPassword1" escape="false" />
				</s:if>

				<s:if test="errorPassword2 != null">
					<s:property value="errorPassword2" escape="false" />
				</s:if></span></li>

				<li class= "list">
					<input type="password" name="loginPassword" class= "field-holder" value= "" placeholder= "password" ></li>

			<li class= "list"><input type="checkbox" id="login" name= "loginMemory" value= "true" checked /><label for="login" data-on-label="On" data-off-label="Off"></label> <label for="login">IDを保存</label></li>
			<li class= "list"><s:submit value="enter" /><br><input type="button" class= "login"  value="戻る" onclick="history.back()">&emsp;&emsp;<a class= "login" href= '<s:url action= "GoHomeAction" />'>&#x1f3e0;</a></li>


			</ul>
		</form>
	</s:form>

	<div class= "form-style">
	パスワード変更<a class= "login" href= '<s:url action= "PasswordChangeAction" />' >(○・▽・○)</a><br>
	<br>
	ユーザー登録<a class= "login" href='<s:url action="UserCreateAction" />'>(○・▽・○)</a>
	<br><br></div>


	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>




</body>
</html>
