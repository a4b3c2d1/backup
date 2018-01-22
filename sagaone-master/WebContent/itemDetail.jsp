<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>商品詳細</title>
<style type="text/css">
a:visited {
	color: #0066c0;
	text-decoration: none
}

#main {
	margin-top: 100px;
	margin-bottom: 60px;
	min-height: 100%;
	height: auto !important;
	height: 100%;
	position: relative;
	width: 100%
}

.main1 {
	padding: 55px;
	height: 400px;
	width: 1000px;
	margin: 0 auto;
}

.main1-1 {
	float: left;
	width: 500px;
    height: 500px;
	margin: 0 25px 50px 0;
}
.main1-1 img {
	width: 450px;
    height: 450px;
    margin: 50px 25px;}

.main1-2 {
	width: 460px;
	float: left;
}

.main1-3 {
	float: left;
	height: 400px;
	width: 200px;
	position: relative;
}
.name-box {

}
.name {
	font-size: 35px;
	width: 400px;
	margin-bottom: 0;
}
.kana {
	font-size: 20px;
	margin: 0;
}
.price {
	font-size: 25px;
	color: #B12704;
	margin-right: 20px;
	width: 350px;
}

.main1 ul {
	list-style: none;
	padding: 0;
	width: 350px;
}

#a {
	float: left;
	margin-right: 30px;
}

.cart {
	margin-top: 30px;
}
.cart-btn {
	display: block;
 	background: #4B99AD;
    margin: 10px 0 0 0;
    padding: 8px 15px 8px 15px;
    width: 350px;
    border: none;
    color: #fff;
}
.main2 {
	clear: both;
	margin: 50px;
}

.main2 ul {
	list-style: none;
}

.rating {
	position: relative;
	width: 5em;
	height: 1em;
	font-size: 20px;
}

.rating-front {
	position: absolute;
	top: 0;
	left: 0;
	overflow: hidden;
	color: #ffcc33;
}

.rating-back {
	color: #ccc;
}

.count {
	color: #000;
}

.main3 {
	margin: 50px;
}

.main3 p {
	float: left;
	margin: 30px;
}

#info:hover {
	color: #9aa132;
	cursor: pointer;
	text-decoration: underline;
}

.main4 {
	clear: both;
}

.a:hover {
	color: #eb1515;
	cursor: pointer;
	text-decoration: underline;
}

input[type=submit] {
	background: #4B99AD;
	padding: 8px 15px 8px 15px;
	border: none;
	color: #fff;
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
.title{
	width: 350px;
	margin: 5px;
    padding: 10px;
    padding-bottom: 15px;
    border-bottom: 1px solid #d4d4d4;}

</style>
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
				<input type="image" src="./css/searchIcon.png" width="20"
					height="20" class="icon" />
			</div>
		</s:form>
	</div>

	<div id="header-container">

		<ul id="normal" class="dropmenu">

			<li><s:if test="session.loginUserId != null">
					<s:property value="#session.loginUserId" />でログイン中
					</s:if></li>

			<li>アカウントメニュー
				<ul>
					<s:if test="session.loginUserId != null">
						<li><s:form action="MyPageAction">
								<s:submit value="マイページ" cssClass="b-btn" />
							</s:form></li>
					</s:if>

					<s:if test="session == null">
						<li><s:form action="LoginPageAction">
								<s:submit value="ログイン画面へ" cssClass="b-btn" />
							</s:form></li>
					</s:if>

					<s:if test="session.loginUser == null">
						<li><s:form action="LoginPageAction">
								<s:submit value="ログイン画面へ" cssClass="b-btn" />
							</s:form></li>
					</s:if>

					<s:if test="session.loginUser != null">
						<li><s:form action="LogoutAction">
								<s:submit value="ログアウト" cssClass="b-btn" />
							</s:form></li>
					</s:if>

					<li><s:form action="UserCreateAction">
							<s:submit value="ユーザー登録" cssClass="b-btn" />
						</s:form></li>

					<li><s:form action="ItemAction">
							<s:hidden name="offset" value="0"></s:hidden>
							<s:submit value="商品一覧" cssClass="b-btn" />
						</s:form></li>

					<li><s:form action="CartAction">
							<s:hidden name="cartFlg" value="1"></s:hidden>
							<s:submit value="カート確認" cssClass="b-btn" />
						</s:form></li>

					<s:if test="session.loginUser != null">
						<li><s:form action="PaymentAction">
								<s:submit value="決済" cssClass="b-btn" />
							</s:form></li>
					</s:if>
				</ul>
			</li>
		</ul>
	</div>


	</header>
	<div id="main">

		<div class="main1">
			<s:iterator value="#session.itemdetailDTOList">
				<s:form action="CartAction">
					<div class="main1-1">
						<img src=<s:property value="imageFilePath"/>>
					</div>
					<div class="main1-2">
						<div class="title">
							<div class="name-box">
								<p class="name"><s:property value="productName" /></p>
								<p class="kana"><s:property value="productNameKana" /></p>

							</div>
							<div class="rating">
								<div class="rating-front"
									style="width: calc(<s:property value="avgValue" />*20%)">★★★★★</div>
								<div class="rating-back">
									★★★★★<span class="count">(<s:property value="countValue" />)
									</span>
								</div>


								<span class="balloon2"> 5つ星のうち<s:property
										value="avgValue" /></span>


							</div>
						</div>
						<br> <span class="price"> 価格： &#xA5; <s:property
								value="price" />
						</span>
						<ul>
							<li>メーカー：<s:property value="releaseCompany" /></li>
							<li>発売日：<s:property value="releaseDate" /></li>
							<li>商品詳細：<s:property value="productDescription" /></li>
						</ul>

						<input type="hidden" name="product_id"
							value="<s:property value='productId' />"></input>
						<s:hidden name="addFlg" value="1"></s:hidden>


						<div class="cart">
							<span id="b"> 数量：</span>
								<select name="count">
									<option value="1" selected="selected">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
								</select>
							<input class="cart-btn" type="submit" value="カートに入れる">
						</div>
					</div>

				</s:form>
			</s:iterator>

		</div>
		<hr width="95%">
		<div class="main2">

			<h2>カスタマーレビュー</h2>
			<s:iterator value="#session.itemdetailDTOList">
				<s:form action="ReviewAction">

					<input type="hidden" name="product_id"
						value="<s:property value='productId' />"></input>
					<input type="hidden" name="category_id"
						value="<s:property value='categoryId' />"></input>
					<input type="hidden" name="reviewFlg" value="1"></input>

					<input type="submit" value="レビューを書く"
						<s:if test="#session.loginUserId == null">
					onClick="alert('ログインしてください！');"</s:if>>
				</s:form>
			</s:iterator>


			<s:iterator value="session.itemdetailDTOList">

				<div class="rating">
					<div class="rating-front"
						style="width: calc(<s:property value="avgValue" />*20%)">★★★★★</div>
					<div class="rating-back">★★★★★</div>


					<span class="balloon2"> 5つ星のうち<s:property value="avgValue" /></span>

					<span class="count"> (<s:property value="countValue" />)
					</span>
				</div>

			</s:iterator>
			<s:iterator value="#session.reviewdetailDTO1List">
				<ul>
					<li><s:property value="value" />：<s:property value="cnt" /></li>
				</ul>
			</s:iterator>
			<s:iterator value="#session.reviewDTO2List">
				<ul>
					<li>ユーザー名：<s:property value="userId" /></li>
					<li>書き込み日：<s:property value="updateDate" /></li>
					<li>
						<div class="rating">
							<div class="rating-front"
								style="width:calc(<s:property value="value" />*20%)">★★★★★</div>
							<div class="rating-back">★★★★★</div>
						</div>
					</li>
					<li><br> <s:property value="review" escape="false" /></li>
				</ul>
				<br>

			</s:iterator>

		</div>
		<hr width="95%">
		<div class="main3">

			<h2>関連商品</h2>
			<s:iterator value="#session.itemrelativeDTOList" begin="0" end="2">
				<p>
					<a
						href='<s:url action="ItemDetailAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /></s:url>'>
						<span class="a"> <s:property value="productName" /> <img
							src=<s:property value="imageFilePath"/> width=auto height="100">
					</span>
					</a>
			</s:iterator>
			<s:iterator value="#session.itemrelativeDTOList" begin="0" end="0">
				さらに関連商品を見たい方は<s:a href="SearchItemAction">
					<s:param name="itemCategory" value="categoryId" />
					<s:param name="searchWord" value=" " />こちら</s:a>
			</s:iterator>
		</div>
		<div class="main4">
			<s:a href="ItemAction?offset=0">
				<span class="a">商品一覧へ</span>
			</s:a>
		</div>
	</div>

</body>
</html>