
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<html>
	<head>
		<meta charset="UTF-8">
			<meta http-equiv="Content-Script-Type" content="text/javascript" />
		<link rel = "stylesheet" type="text/css" href="./css/login.css">
		<title>SAGAONE | ログインページ</title>


		<script type="text/javascript"
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
			<script src="./slick/slick.min.js"></script>


	</head>

	<body>

	<header>

	<div id="main-logo">

		<a href= ' <s:url action= "GoHomeAction" /> '><img src="./css/sagaone_logo.png" alt= "logo"></a>
	</div>

	<div id="menu">
			<div id="search-form">

			<s:form action="SearchItemAction">
				<div id="search-box">
					<select name="itemCategory" id="category">
						<option value="0">全てのカテゴリー</option>
						<option value="1">本</option>
						<option value="2">家電・パソコン</option>
						<option value="3">おもちゃ・ゲーム</option>
						<option value= "4">おもちゃ・ぬいぐるみ</option>
					</select>
					<input type="text" name="searchWord" id="search"/>
				</div>
				<div class="search-btn">
				<input type="image" src="./css/searchIcon.png" width="20" height="20" class="icon"/>
				</div>
			</s:form>
		</div>


		<div id="header-container">
			<div class="header-menu">
				<s:if test="session.loginUserId != null">
						<s:property value="#session.loginUserId"/>でログイン中
				</s:if>
			</div>

				<div class= "ex"><div class="home-btn">
					<a href=' <s:url action= "GoHomeAction" />'>&#x1f3e0;</a>
				</div>


				<div class= "home-btn">
								<s:if test="session.loginUser == null">
								<a href= '<s:url action="LoginPageAction" />'>ログイン</a>
						</s:if></div>


				<div class= "home-btn">
								<a href= '<s:form action="UserCreateAction" />'>ユーザー登録</a></div>


							<ul id= "normal" class="dropmenu">

				<li>アカウントメニュー
					<ul>

						<s:if test="session.loginUserId != null">
							<li>
								<s:form action="MyPageAction">
									<s:submit value="マイページ" cssClass="b-btn"/>
								</s:form>
							</li>
						</s:if>


						<li>
							<s:form action="ItemAction">
								<s:hidden name="offset" value="0"></s:hidden>
								<s:submit value="商品一覧" cssClass="b-btn"/>
							</s:form>
						</li>

						<li>
							<s:form action="CartAction">
								<s:hidden name="cartFlg" value="1"></s:hidden>
								<s:submit value="カート確認" cssClass="b-btn"/>
							</s:form>
						</li>

						<li>
							<s:form action="PaymentAction">
								<s:submit value="決済" cssClass="b-btn"/>
							</s:form>
						</li>
					</ul>
					</li>


			</ul>

						<s:if test="session.loginUser != null">
								<a class= "home-btn-logout" href= ' <s:url action= "LogoutAction" />'>&#x1f6aa;</a>
						</s:if></div>



</div>
		</div>

	</header>

	<br><br><br><br><br>

	<s:form action="LoginAction">
	<form>
	<ul class= "form-style">



			<li>
				<span class= "error">
				<s:if test="errorId == null && errorId1 == null && errorId2 == null &&
							errorPassword== null && errorPassword1== null && errorPassword2== null ">
				<s:property value="errorMessage" escape="false" /></s:if></span></li>

			<li>
				<span class= "error">
				<s:if test="errorId != null && errorMessage == null ">
					<s:property value="errorId" escape="false" />
				</s:if>

				<s:if test="errorId1 != null && errorMessage == null ">
					<s:property value="errorId1" escape="false" />
				</s:if>

				<s:if test="errorId2 != null && errorMessage == null ">
					<s:property value="errorId2" escape="false" />
				</s:if></span></li>


				<li>
					<input type="text" name="loginUserId" class= "field-holder" value= '<s:property value= "#session.checkedLoginUserId" />' placeholder= "login ID" ></li>

			<li>
				<span class= "error">
				<s:if test="errorPassword != null && errorMessage == null ">
					<s:property value="errorPassword" escape="false" />
				</s:if>

				<s:if test="errorPassword1 != nulll && errorMessage == null ">
					<s:property value="errorPassword1" escape="false" />
				</s:if>

				<s:if test="errorPassword2 != null && errorMessage == null ">
					<s:property value="errorPassword2" escape="false" />
				</s:if></span></li>

				<li>
					<input type="password" name="loginPassword" class= "field-holder" value= "" placeholder= "password" ></li>

			<li><input type="checkbox" id="login" name= "loginMemory" value= "true" checked /><label for="login" data-on-label="On" data-off-label="Off"></label> <label for="login">IDを保存</label></li>
			<li><s:submit value="enter" /><br><a class= "login" href="history.back()">戻る</a>&emsp;&emsp;<a class= "login" href= '<s:url action= "GoHomeAction" />'>&#x1f3e0;</a></li>


			</ul>
		</form>
	</s:form>

	<div class= "form-style">
	パスワード忘れちゃったのー<a class= "login" href= '<s:url action= "PasswordChangeAction" />' >(○・▽・○)</a><br>
	<br>
	ユーザー登録したいなー<a class= "login" href='<s:url action="UserCreateAction" />'>(○・▽・○)</a>
	<br><br></div>





</body>
</html>


