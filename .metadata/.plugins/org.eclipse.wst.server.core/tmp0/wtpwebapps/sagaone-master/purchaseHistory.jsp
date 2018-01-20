<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/purchaseHistory.css">
<link type="text/css" rel="stylesheet"
  href="http://code.jquery.com/ui/1.10.3/themes/cupertino/jquery-ui.min.css" />
<script type="text/javascript"
  src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
  src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>

<script type="text/javascript" src = "autocomplete.js"></script>
<title>商品購入履歴</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="./slick/slick.min.js"></script>

<script>
	$(document).ready(function() {
		$('.abc').slick({
			infinite : true,

			slidesToShow : 3,
			slidesToScroll : 3

		});
	});
</script>

</head>
<body>
	<header>

		<div id="main-logo">
			<img src="./css/sagaone_logo.png" height="100px">
		</div>

		<div id="search-form">

			<s:form action="SearchItemAction">
				<div id="search-box">
					<select name="itemCategory" id="category">
						<option value="0">全てのカテゴリー</option>
						<option value="1">本</option>
						<option value="2">家電・パソコン</option>
						<option value="3">おもちゃ・ゲーム</option>
					</select> <input type="text" name="searchWord" id="search" />
				</div>
				<div class="search-btn">
				<input type="image" src="./css/searchIcon.png" width="20" height="20" class="icon"/>
				</div>
			</s:form>
		</div>

		<div id="header-container">

			<ul id="normal" class="dropmenu">

				<li>
					<s:if test="session.loginUserId != null">
						<s:property value="#session.loginUserId" />でログイン中
					</s:if>
				</li>

				<li>アカウントメニュー
					<ul>
						<s:if test="session.loginUserId != null">
							<li><s:form action="MyPageAction">
									<s:submit value="マイページ" cssClass="b-btn" />
								</s:form>
							</li>
						</s:if>

						<s:if test="session == null">
							<li><s:form action="LoginPageAction">
									<s:submit value="ログイン画面へ" cssClass="b-btn" />
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

						<li><s:form action="ItemAction">
								<s:hidden name="offset" value="0"></s:hidden>
								<s:submit value="商品一覧" cssClass="b-btn" />
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
			</ul>
		</div>
	</header>
	<div id="main" class="wrapper">
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
							<a href='<s:url action="ItemDetailAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /></s:url>'><img src='<s:property value="imageFilePath" />' alt='<s:property value="imageFileName" />' ></a>
						</div>
						<div class="detail">
							<p class="hurigana"><small><s:property value="productNameKana" /></small></p>
							<p class="name"><a href='<s:url action="ItemDetailAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /></s:url>'><s:property value="productName" /></a></p>
							<p class="count">数量:<s:property value="productCount" />個</p>
							<p class="price">金額:<s:property value="price" />円</p>
							<p class="company">販売元:<s:property value="releaseCompany" /></p>
							<p class="release-date">発売日:<s:property value="releaseDate" /></p>
						</div>
						<div class="review">
							<input class="btn l-btn" type="button" onclick="location.href='<s:url action="ReviewAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'"value="レビューする">
							<input class="btn l-btn" type="button" onclick="location.href='<s:url action="CartAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'"value="再度購入する">
						</div>
					</div>
				</div>
			</s:iterator>
			<div class="delete">
				<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
					<button class="btn" type="submit" name="deleteFlg" value="0">履歴をすべて削除</button>
				</s:url>
				<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
					<button class="btn" type="submit" name="deleteFlg" value="1">選択した項目を削除</button>
				</s:url>

				<%-- まだマイページと繋がっていない為、仮の更新ボタン --%>
				<s:url var="PurchaseHistoryAction_url" action="PurchaseHistoryAction">
					<button class="btn" type="submit">更新</button>
				</s:url>
			</div>
		</s:form>
			<a href='<s:url action="MyPageAction" />'>マイページに戻る</a>
	</div>
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>