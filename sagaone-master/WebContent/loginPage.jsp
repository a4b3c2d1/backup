<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/login.css">
<title>HOME</title>
</head>
<style type="text/css">
a {
	text-decoration: none;
}

a:visited {
	color: #0066c0;
	text-decoration: none
}

.a:hover {
	color: #9aa132;
	cursor: pointer;
	text-decoration: underline;
}

.b:hover {
	color: #eb1515;
	cursor: pointer;
	text-decoration: underline;
}

.main1 {
	position: relative;
	width: 100%;
	padding: 20px;
	margin: 0 auto;
}

.cartitem {
	height: 100px;
	width: 1100px;
	margin: auto;
	border-style: solid;
	border-color: #999;
	border-width: 1px;
}

.check {
	padding-left: 20px;
	margin: 5px;
	height: 100px;
	float: left;
	margin: 5px;
	font-size: 75px;
	margin: auto;
}

.cartitem1 {
	float: left;
	height: 90px;
	margin: 5px;
}

.tuika {
	padding-right: 5px;
	padding-left: 5px;
	float: left;
	height: 100px;
	font-size: 20px;
	display: flex;
	align-items: center;
	border-right-style: solid;
	border-right-color: #999;
	border-right-width: 1px;
	float: left;
}

.cartitem2 {
	padding-right: 5px;
	padding-left: 5px;
	float: left;
	height: 100px;
	font-size: 20px;
	display: flex;
	align-items: center;
	float: left;
}

.cartitem3 {
	float: right;
	height: 100px;
	display: flex;
	align-items: center;
	right: 10px;
}

.botton1 {
	margin: 20px;
}

.main2 {
	padding-top: 10px;
	margin: 0 auto;
	width: 100%;
	display: table;
}

#price {
	color: #B12704;
}

#price:hover {
	text-decoration: none;
}

.items {
	width: 900px;
	margin: 0 auto;
}

.items2 {
	clear: both;
}

.item {
	float: left;
	width: 250px;
	height: 280px;
	margin: 20px;
	text-align: center;
}

.main3, .main4 {
	text-align: center;
}

.hyouka {
	width: 250px;
	text-align: center;
	position: relative;
}

.rating:hover .balloon {
	display: inline;
}

.rating {
	margin: auto;
	position: relative;
	width: 100px;
	height: 1em;
	font-size: 20px;
}

.rating-front {
	position: absolute;
	top: 0;
	left: 0;
	overflow: hidden;
	color: #ffcc33;
	width: 100px;
}

.rating-back {
	color: #ccc;
}

.balloon2 {
	border-color: #999;
	position: absolute;
	border-style: solid;
	border-width: 1px;
	display: none;
	padding: 2px;
	background-color: #ffffff;
	width: 100px;
	left: 30%;
	top: 100%;
	margin-top: 12px;
	font-size: 10px;
	position: absolute;
}

.balloon2:after {
	border-bottom: 12px solid rgba(102, 102, 255, 0.50);
	border-left: 10px solid transparent;
	border-right: 10px solid transparent;
	top: -12px;
	left: 5%;
	content: "";
	position: absolute;
	top: -12px;
	left: 5%;
	content: "";
}

.count {
	font-size: 15px;
}

.aa, .bb, .cc, .dd {
	float: left;
	width: 250px;
}
</style>
<body>
	<header class="clearfix">
		<div id="main-logo">
			<a href=' <s:url action= "GoHomeAction" /> '><img src="./css/sagaone_logo.png" height="100px"></a>
		</div>
		<div class="clearfix">
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
			<div id="header-container" class="">
				<ul id="normal" class="dropmenu clearfix">
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

							<li><s:form action="UserCreateAction">
									<s:submit value="ユーザー登録" cssClass="b-btn" />
								</s:form>
							</li>

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
				<s:if test="errorId != null">
					<s:property value="errorId" escape="false" />
				</s:if>

				<s:if test="errorId1 != null">
					<s:property value="errorId1" escape="false" />
				</s:if>

				<s:if test="errorId2 != null">
					<s:property value="errorId2" escape="false" />
				</s:if></span></li>


				<li>
					<input type="text" name="loginUserId" class= "field-holder" value= '<s:property value= "#session.checkedLoginUserId" />' placeholder= "login ID" ></li>

			<li>
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


