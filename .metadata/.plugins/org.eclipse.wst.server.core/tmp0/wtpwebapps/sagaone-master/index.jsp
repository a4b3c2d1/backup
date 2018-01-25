<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/home.css">
<link rel="stylesheet" type="text/css" href="./slick/slick.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="./slick/slick-theme.css"
	media="screen" />




<title>HOME</title>

<!-- *******************ここから前頁共通******************* -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript" src="./js/autocomplete.js"></script>
<!-- ===================ここまで前頁共通=================== -->

<script src="./slick/slick.min.js"></script>

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
<!-- ===================ここまで前頁共通=================== -->
	<div id="main">
		<div class="slider-top">
			<a href= '<s:url action="SearchItemAction"><s:param name="itemCategory" value="1" /><s:param name="searchWord" /></s:url> '><img src="./img/top-book.jpg" alt="book"></a>
			<a href= '<s:url action="SearchItemAction"><s:param name="itemCategory" value="2" /><s:param name="searchWord" /></s:url> '><img src="./img/top-electronics.jpg" alt="electronics"></a>
			<a href= '<s:url action="SearchItemAction"><s:param name="itemCategory" value="3" /><s:param name="searchWord" /></s:url> '><img src="./img/top-game.jpg" alt="game"></a>
		</div>
		<div>
			<p class="pickup">注目商品</p>
		</div>
		<div class="slider-sub">
			<s:iterator value="#session.pickupitem" begin="0" end="9">
				<div>
					<s:form action="ItemDetailAction">
						<input type="hidden" name="product_id" value="<s:property value='product_id' />"></input>
						<input type="hidden" name="category_id" value="<s:property value='category_id' />"></input>
						<input type="image" src="<s:property value="image_file_path"/>" width="200" height="200" />
					</s:form>
				</div>
			</s:iterator>
		</div>
	</div>

<!-- *******************ここから前頁共通******************* -->
	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>
<!-- ===================ここまで前頁共通=================== -->

	<script>
	$(function() {
		$('.slider-top').slick({
			infinite: true,
			fade: true,
			speed: 2000,
			autoplay: true,
			autoplaySpeed: 3000,
			slidesToShow: 1,
			slidesToScroll: 1,
			dots: true,
			arrows: false,
		});
	});
	$(function() {
		$('.slider-sub').slick({
			infinite: true,
			adaptiveHeight: true,
			centerMode: true,
			centerPadding: '80px',
			autoplay: true,
			autoplaySpeed: 2000,
			slidesToShow: 3,
			slidesToScroll: 3,
			cssEase: 'ease'
		});
	});
	</script>
</body>
</html>