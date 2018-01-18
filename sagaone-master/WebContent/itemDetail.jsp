<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
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
	width:100%
}

.main1 {
	margin: 150px;

}
.main1 ul {
	list-style: none;
}

.main1 h1 {
	margin-right: 20px;
}

.main1 h2 {
	color: #B12704;
	margin-right: 20px;
}

#a {
	float: left;
	margin-right: 30px;
}

#b {
	border-style: solid;
	border-color: #999;
	porder: 1px;
	padding: 20px;
	float: right;
	margin-right: 150px;
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
					<span id="a"> <img src=<s:property value="image_file_path"/>
						width=auto height="350"></span>

					<h1>
						<s:property value="product_name" />
						(
						<s:property value="product_name_kana" />
						)
					</h1>
					<br>

					<h2>
						価格： &#xA5;
						<s:property value="price" />
					</h2>
					<ul>
						<li>メーカー：<s:property value="release_company" /></li>
						<li>発売日：<s:property value="release_date" /></li>
						<li>商品詳細：<s:property value="product_description" /></li>
					</ul>

					<input type="hidden" name="product_id"
						value="<s:property value='product_id' />"></input>
					<s:hidden name="addFlg" value="1"></s:hidden>


					<span id="b"> 数量：<select name="count">
							<option value="1" selected="selected">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>

					</select><br> <input type="submit" value="カートに入れる"></span>


				</s:form>
			</s:iterator>

		</div>

		<div class="main2">
			<hr>
			<h2>カスタマーレビュー</h2>
			<s:iterator value="#session.itemdetailDTOList">
				<s:form action="ReviewAction">

					<input type="hidden" name="product_id"
						value="<s:property value='product_id' />"></input>
					<input type="hidden" name="category_id"
						value="<s:property value='category_id' />"></input>
					<input type="submit" value="レビューを書く"
						<s:if test="#session.loginUserId == null">
					onClick="alert('ログインしてください！');"</s:if>>
				</s:form>
			</s:iterator>
			<s:iterator value="#session.reviewDTO2List">
				<ul>
					<li>ユーザー名：<s:property value="user_id" /></li>
					<li>書き込み日：<s:property value="update_date" /></li>
					<li>
						<div class="rating">
							<div class="rating-front"
								style="width:<s:property value="value" />%">★★★★★</div>
							<div class="rating-back">★★★★★</div>
						</div>
					</li>
					<li><br><s:property value="review" escape="false"  /></li>
				</ul>
				<br>

			</s:iterator>

		</div>
		<div class="main3">
			<hr>
			<h2>関連商品</h2>
			<s:iterator value="#session.itemrelativeDTOList" begin="0" end="2">
				<p>
					<a
						href='<s:url action="ItemDetailAction"><s:param name="product_id" value="product_id" /><s:param name="category_id" value="category_id" /></s:url>'>
						<span class="a"> <s:property value="product_name" /> <img
							src=<s:property value="image_file_path"/> width=auto height="100">
					</span>
					</a>
				</p>
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