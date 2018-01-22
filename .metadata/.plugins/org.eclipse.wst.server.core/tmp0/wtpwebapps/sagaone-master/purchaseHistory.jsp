<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- <link rel="stylesheet" type="text/css" href="./css/style.css"> --%>
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

</head>
<body>
	<header class="header clearfix">
		<div class="main-logo">
			<a href='<s:url action="GoHomeAction" />'><img src="./css/sagaone_logo.png"></a>
		</div>
		<div class="clearfix">
			<div class="search-form">
				<s:form action="SearchItemAction">
					<div class="search-box">
						<select class="category" name="itemCategory">
							<option value="0">全てのカテゴリー</option>
							<option value="1">本</option>
							<option value="2">家電・パソコン</option>
							<option value="3">おもちゃ・ゲーム</option>
						</select>
						<div class="search-text">
							<input class="search" type="text" name="searchWord" />
						</div>
						<div class="search-btn">
							<input class="-btn" type="image" src="./css/searchIcon.png" />
						</div>
					</div>
				</s:form>
			</div>
			<div class="header-container">
				<ul class="normal dropmenu">
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
		</div>
	</header>
	<div  class="main wrapper">
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
							<p class="count">数量:<s:property value="productCount" />個</p>
							<p class="price">金額:<s:property value="price" />円</p>
							<p class="company">販売元:<s:property value="releaseCompany" /></p>
							<p class="release-date">発売日:<s:property value="releaseDate" /></p>
						</div>
						<div class="review">
							<input class="btn l-btn" type="button" onclick="location.href='<s:url action="ReviewAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /><s:param name="reviewFlg" value="1" /></s:url>'"value="レビューする">
							<input class="btn l-btn" type="button" onclick="location.href='<s:url action="ItemDetailAction"><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>'"value="再度購入する">
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
			</div>
		</s:form>
	</div>
	<footer class="footer">
		<p>© 2017-2018, Sagaone.com</p>
	</footer>
</body>
</html>