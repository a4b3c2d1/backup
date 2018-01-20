<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./slick/slick.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="./slick/slick-theme.css"
	media="screen" />
<title>登録情報変更確認画面</title>
<link type="text/css" rel="stylesheet"
  href="http://code.jquery.com/ui/1.10.3/themes/cupertino/jquery-ui.min.css" />
<script type="text/javascript"
  src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
  src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>
<script type="text/javascript" src="./js/autocomplete.js"></script>

<script type="text/javascript" src="./js/test.js"></script>
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
					</select>
					<input type="text" name="searchWord" id="search" />
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
	<div id="main">
		<p>変更が完了しました。</p>
		<p><a href='<s:url action="DestinationAction" />'>宛先情報ページへ戻る</a>
		<p><a href='<s:url action="MyPageAction" />'>マイページへ戻る</a>
	</div>
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>