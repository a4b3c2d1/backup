<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />


<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/itemdetail.css">


<!-- *******************ここから前頁共通******************* -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
<link rel="stylesheet"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript" src="./js/autocomplete.js"></script>
<!-- ===================ここまで前頁共通=================== -->

<title>商品詳細画面</title>
</head>
<body>
	<!-- *******************ここから前頁共通******************* -->
	<header class="clearfix">
		<div id="main-logo">
			<a href=' <s:url action= "GoHomeAction" /> '><img
				src="./css/sagaone_logo.png" height="100px"></a>
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
						</select> <input type="text" name="searchWord"
							id="jquery-ui-autocomplete-input" />
					</div>
					<div class="search-btn">
						<input type="image" src="./css/searchIcon.png" width="20"
							height="20" class="icon" />
					</div>
				</s:form>
			</div>
			<div id="header-container" class="">
				<ul id="normal" class="dropmenu clearfix">
					<li id="itemmenu"><span class="drop-topic">商品カテゴリー&thinsp;<span
							class="sankaku">▼</span></span>
						<ul class="item-drop">
							<li><s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="0" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="全てのカテゴリー" cssClass="c-btn" />
								</s:form></li>
							<li><s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="1" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="本" cssClass="c-btn" />
								</s:form></li>
							<li><s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="2" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="家電・パソコン" cssClass="c-btn" />
								</s:form></li>
							<li><s:form action="SearchItemAction">
									<input type="hidden" name="itemCategory" value="3" />
									<input type="hidden" name="searchWord" value="" />
									<s:submit value="おもちゃ・ゲーム" cssClass="c-btn" />
								</s:form></li>
						</ul></li>
					<li id="acountmenu"><span class="drop-topic">アカウントメニュー&thinsp;<span
							class="sankaku">▼</span></span>
						<ul class="acount-drop">
							<s:if test="session.loginUser != null">
								<li><s:form action="MyPageAction">
										<s:submit value="マイページ" cssClass="b-btn" />
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

							<s:if test="session.loginUser == null">
								<li><s:form action="UserCreateAction">
										<s:submit value="ユーザー登録" cssClass="b-btn" />
									</s:form></li>
							</s:if>

							<li><s:form action="CartAction">
									<s:hidden name="cartFlg" value="1"></s:hidden>
									<s:submit value="カート確認" cssClass="b-btn" />
								</s:form></li>

							<s:if test="session.loginUser != null">
								<li><s:form action="PaymentAction">
										<s:submit value="決済" cssClass="b-btn" />
									</s:form></li>
							</s:if>
						</ul></li>
					<li id="welcome"><s:if test="session.loginUser != null">
							<s:property value="#session.loginUserId" />&nbsp;さんでログイン中
						</s:if></li>
				</ul>
			</div>
		</div>
	</header>
	<!-- ===================ここまで前頁共通=================== -->
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
								<p class="name">
									<s:property value="productName" />
								</p>
								<p class="kana">
									<s:property value="productNameKana" />
								</p>

							</div>
							<div class="rating">
								<div class="rating-front"
									style="width: calc(<s:property value="avgValue" />*20%)">★★★★★</div>
								<div class="rating-back">
									★★★★★<span class="count">(<s:property value="countValue" />件)
									</span>
								</div>


								<div class="balloon2">
									5つ星のうち
									<s:property value="avgValue" />
								</div>


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
							<span id="b"> 数量：</span> <select id="select1" name="count">
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select> <input class="cart-btn" type="submit" value="カートに入れる">
						</div>
					</div>

				</s:form>
			</s:iterator>

		</div>
		<hr />
		<div class="main2">

			<h2>カスタマーレビュー</h2>

			<div class="main2-1">
				<div class="main2-1-1">
					<s:iterator value="#session.itemdetailDTOList">
						<div class="rating">
							<div class="rating-front"
								style="width: calc(<s:property value="avgValue" />*20%)">★★★★★</div>
							<div class="rating-back">
								★★★★★<span class="count"> (<s:property value="countValue" />件)
								</span>
							</div>
							<span class="balloon2"> 5つ星のうち<s:property value="avgValue" /></span>
						</div>

					</s:iterator>

					<s:iterator value="#session.reviewdetailDTO1List">
						<div class="graph">
							<div class="graph1">
								<span>星<s:property value="value" />つ
								</span>
							</div>
							<div class="graph2">
								<s:if test='session.itemdetailDTOList.get(0).countValue != "0"'>
									<span class="bar"
										style="width:calc(<s:property value="cnt" />/<s:property value="session.itemdetailDTOList.get(0).countValue"/>*100%)"></span>
								</s:if>

								<s:else>

									<span class="bar" style="width: 0%"></span>

								</s:else>
							</div>
							<div class="graph3">
								<s:property value="cnt" />
								人
							</div>
						</div>
					</s:iterator>
				</div>
				<div class="main2-2-2">
					<s:iterator value="#session.itemdetailDTOList">
						<s:form action="ReviewAction">

							<input type="hidden" name="product_id"
								value="<s:property value='productId' />"></input>
							<input type="hidden" name="category_id"
								value="<s:property value='categoryId' />"></input>

							<input type="submit" class="form-style" value="レビューを書く"
								<s:if test="#session.loginUserId == null">
					onClick="alert('ログインしてください！');"
					</s:if>>
						</s:form>
					</s:iterator>
				</div>

			</div>
			<div class="main2-2">
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
						<li>
							<div class="text">
								<textarea class="text" name="review" readonly="readonly"><s:property
										value="review" escape="false" /></textarea>
							</div>

						</li>
					</ul>


				</s:iterator>
			</div>
		</div>
		<hr />
		<div class="main3">

			<h2>関連商品</h2>
			<div class="itemrelate">
				<s:if test="%{session.itemrelativeDTOList.size<=3}">
					<s:iterator value="#session.itemrelativeDTOList">
						<div class="main3-1">
							<a
								href='<s:url action="ItemDetailAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /></s:url>'>
								<span class="a"> <img
									src=<s:property value="imageFilePath"/> width="100"
									height="100"> <br> <s:property value="productName" />
							</span>
							</a>

						</div>
					</s:iterator>
				</s:if>
				<s:else>

					<s:iterator value="#session.itemrelativeDTOList" begin="0" end="2">
						<div class="main3-1">
							<a
								href='<s:url action="ItemDetailAction"><s:param name="product_id" value="productId" /><s:param name="category_id" value="categoryId" /></s:url>'>
								<span class="a"> <img
									src=<s:property value="imageFilePath"/> width="100"
									height="100"><br> <s:property value="productName" />
							</span>
							</a>

						</div>
					</s:iterator>


				</s:else>

				<div class="main3-2">

					<s:form action="SearchItemAction">
						<input type="hidden" name="itemCategory"
							value="<s:property value="session.itemrelativeDTOList.get(0).categoryId"/>" />
						<input type="hidden" name="searchWord" value="" />
						<s:submit class="form-style" value="関連商品一覧へ" />
					</s:form>
				</div>
			</div>
		</div>
		<hr />
		<div class="main4">
			<s:form action="SearchItemAction">
				<input type="hidden" name="itemCategory" value="0" />
				<input type="hidden" name="searchWord" value="" />
				<s:submit class="form-style" value="商品一覧へ戻る" />
			</s:form>
		</div>
	</div>
	<!-- *******************ここから前頁共通******************* -->
	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test"
			value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>
	<!-- ===================ここまで前頁共通=================== -->
</body>
</html>