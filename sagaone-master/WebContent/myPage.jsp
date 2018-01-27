<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<html>
	<head>
		<meta charset="UTF-8">
		<link rel = "stylesheet" type="text/css" href="./css/style.css">
		<link rel = "stylesheet" type="text/css" href="./css/mypage.css">
		<title>SAGAONE | マイページ</title>
		<!-- *******************ここから前頁共通******************* -->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
		<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
		<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
		<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>
		<script type="text/javascript" src="./js/autocomplete.js"></script>
		<!-- ===================ここまで前頁共通=================== -->

	</head>

<body>
<!-- *******************ここから前頁共通******************* -->
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
<!-- ===================ここまで前頁共通=================== -->
	<div class= "form-style">
	<s:iterator value="session.myPageDTO" status="st">

		<table id= "myPage">
			<tr><th>氏名：</th><td><s:property value="familyName"/>&thinsp;&thinsp;<s:property value="firstName"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>ふりがな：</th><td><s:property value="familyNameKana"/>&thinsp;&thinsp;&thinsp;<s:property value="firstNameKana"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>性別：</th><td><s:if test="sex == 0">男性</s:if><s:if test="sex == 1">女性</s:if></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>メールアドレス：</th><td><s:property value="email" /></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>既定の住所：</th><td><s:property value="#session.myPageAddress.userAddress"/></td>
			<td><a id= "page" href= '<s:url action= "DestinationAction" />'>住所の設定</a></td>
			<tr><td class="bar" colspan="6"></td>
			</tr>

			<tr><th>クレジットカード<br>（番号下4桁）：</th><td><s:property value="#session.cardUpdateDTO.cardNumberLastFour"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>
			<tr><th>クレジットカード<br>（有効期限）：</th><td><s:property value="#session.cardUpdateDTO.limitMonth"/> 月　<s:property value="#session.cardUpdateDTO.limitYear"/> 年</td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>
			<tr><th>クレジットカード<br>（名義人）：</th><td><s:property value="#session.cardUpdateDTO.nominee"/></td>
			<s:if test="#session.cardUpdateDTO.cardNumber == null">
			<td><input id="page" type="button" onclick="location.href=' <s:url action= "CardCreateAction" />'"value="クレジットカード新規"></td>
			</s:if>
			<s:if test="#session.cardUpdateDTO.cardNumber != null">
				<td><input id="page" type="button" onclick="location.href=' <s:url action= "CardUpdateAction" />'"value="クレジットカード編集"></td>
			</s:if>
			</tr>
			<tr><td class="bar" colspan="6"></td> </tr>
		</table>

			<a id= "page" href= '<s:url action= "GoHomeAction" />'>ホームへ</a>
			<a id = "page" href = ' <s:url action= "PurchaseHistoryAction" /> '>購入履歴</a>
			<a id = "page" href = ' <s:url action= "ReviewHistoryAction" /> '>レビュー履歴</a>
			<a id= "page" href= '<s:url action= "PasswordChangeAction" />'>パスワード変更</a>

	</s:iterator>

</div>
<!-- *******************ここから前頁共通******************* -->
	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>
<!-- ===================ここまで前頁共通=================== -->
</body>
</html>

