<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" type="text/css" href="./css/style.css">


<title>商品一覧</title>
</head>
<style type="text/css">
#main {
	margin-top: 100px;
	margin-bottom: 60px;
	min-height: 100%;
	height: auto !important;
	height: 100%;
	position: relative;
	width: 100%;
}

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

		<s:if test='%{addFlg =="1"}'>
			<div class="main1">

				<div class="cartitem">
					<s:iterator value="#session.itemdetailDTOList">
						<s:form action="ItemDetailAction">

							<div class="check">&#10003;</div>
							<div class="cartitem1">
								<a
									href='<s:url action="ItemDetailAction"><s:param name="product_id" value="product_id" /><s:param name="category_id" value="category_id" /></s:url>'>
									<img src=<s:property value="image_file_path"/>
									style="width: 90px; height: 90px; border-style: solid; border-color: #999; border-width: 1px;" />
								</a>
							</div>


							<div class="tuika">追加されました！</div>
						</s:form>
					</s:iterator>
					<div class="cartitem2">
						カートの小計 <span id="price" style="font-size: 40px;">&nbsp;&#xA5;&nbsp;&nbsp;<s:property
								value="allPrice" /></span> 円
					</div>
					<div class="cartitem3">

						<form action="CartAction">
							<input type="hidden" name="cartFlg" value="1"> <span
								class="botton1"><input type="submit" value="カート編集へ"></span>
						</form>
						<s:if test="#session.loginUserId != null">
							<form action="PaymentAction">
								<span class="botton1"> <input type="submit" value="決済へ"></span>

							</form>

						</s:if>

					</div>
				</div>

			</div>
		</s:if>
		<div class="main2">
			<div class="items">
				<s:iterator value="#session.itemDTOList" status="st">

					<div class="item">
						<div class="aa">
							<a
								href='<s:url action="ItemDetailAction"><s:param name="product_id" value="product_id" /><s:param name="category_id" value="category_id" /></s:url>'>
								<img src=<s:property value="image_file_path"/>
								style="width: 130px; height: 130px; margin: 10px;">
							</a>
						</div>
						<div class="bb">
							<a
								href='<s:url action="ItemDetailAction"><s:param name="product_id" value="product_id" /><s:param name="category_id" value="category_id" /></s:url>'>
								<span class="a"> <s:property value="product_name" /> （ <s:property
										value="product_name_kana" /> ）
							</span>
							</a>
						</div>
						<div class="cc">
							<a
								href='<s:url action="ItemDetailAction"><s:param name="product_id" value="product_id" /><s:param name="category_id" value="category_id" /></s:url>'>
								<span id="price">&#xA5;&nbsp;&nbsp;<s:property
										value="price" /></span>
							</a>
						</div>
						<div class="dd">
							<div class="rating">
								<div class="rating-front"
									style="width: calc(<s:property value="avgvalue" />*20%)">★★★★★</div>
								<div class="rating-back">★★★★★</div>


								<span class="balloon2"> 5つ星のうち<s:property value="avgvalue" /></span>

								<span class="count"> (<s:property value="countvalue" />)
								</span>
							</div>
						</div>
					</div>

					<s:if test='%{#st.count%3==0}'>
						<div class="items2">
							<hr />
						</div>
					</s:if>

				</s:iterator>

			</div>
		</div>
		<div class="main3">
			<s:iterator id="itm" value="allpages" status="st">
				<s:if test='%{#st.count==page}'>
					<s:property value="itm" />
				</s:if>
				<s:else>
					<s:a href="ItemAction?offset=%{#st.index} ">
						<span class="b"> <s:property value="itm" /></span>

					</s:a>
				</s:else>
			</s:iterator>
		</div>
		<div class="main4">
			<s:a href="GoHomeAction">
				<span class="b">ホームへ戻る</span>
			</s:a>
		</div>
	</div>



</body>
</html>