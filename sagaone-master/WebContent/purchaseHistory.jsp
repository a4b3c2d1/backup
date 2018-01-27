<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/purchaseHistory.css">
<link rel="stylesheet" type="text/css" href="./slick/slick.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="./slick/slick-theme.css"
	media="screen" />

<script type="text/javascript" src = "autocomplete.js"></script>
<title>商品購入履歴</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>

<script type="text/javascript" src="./js/autocomplete.js"></script>

<script type="text/javascript" src="./js/test.js"></script>
<script src="./slick/slick.min.js"></script>
<style>
<!--
.ui-autocomplete {
    max-height: 90px;
    overflow-y: auto;
    overflow-x: hidden;
    padding-right: 20px;
    border-radius: 0px;
    font-size: 12px;
}
#jquery-ui-autocomplete label {
    float: left;
    margin-right: 0.5em;
    color: black;
    font-size: 15px;
}
-->
</style>
</head>
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
	<div id="main" class=" wrapper">
		<s:if test="message != null">
			<p><s:property value="message" /></p>
		</s:if>
		<s:form action="PurchaseHistoryAction">
			<s:iterator value="purchaseHistoryList">
				<div class="purchase-list">
					<div class="regist clearfix">
						<div class="checkbox">
							<input type="checkbox" name="checkboxList" value="${id}">
						</div>
						<div class="regist-date">
							<p><small>購入日</small></p>
							<p><s:property value="registDate" /></p>
						</div>
					</div>
					<div class="item clearfix">
						<div class="img">
							<a href='<s:url action="ItemDetailAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'><img src='<s:property value="imageFilePath" />' alt='<s:property value="imageFileName" />' ></a>
						</div>
						<div class="detail">
							<p class="hurigana"><small><s:property value="productNameKana" /></small></p>
							<p class="name"><a href='<s:url action="ItemDetailAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'><s:property value="productName" /></a></p>
							<p class="count"><span class="let-space">数量</span><s:property value="productCount" />個</p>
							<p class="price"><span class="let-space">金額</span><s:property value="price" />円</p>
							<p class="company"><span class="let-space">販売元</span><s:property value="releaseCompany" /></p>
							<p class="release-date"><span class="let-space">発売日</span><s:property value="releaseDate" /></p>
						</div>
						<div class="review">
							<input class="btn l-btn" type="button" onclick="location.href='<s:url action="ReviewAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /><s:param name="reviewFlg" value="1" /></s:url>'"value="レビューする">
							<input class="btn l-btn" type="button" onclick="location.href='<s:url action="ItemDetailAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /></s:url>'"value="再度購入する">
						</div>
					</div>
				</div>
			</s:iterator>
			<s:if test="purchaseHistoryList != null">
				<div class="delete">
					<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
						<button class="btn" type="submit" name="deleteFlg" value="0">履歴をすべて削除</button>
					</s:url>
					<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
						<button class="btn" type="submit" name="deleteFlg" value="1">選択した項目を削除</button>
					</s:url>
				</div>
			</s:if>
		</s:form>
	</div>
	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>
</body>
</html>
