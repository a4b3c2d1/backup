<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" type="text/css" href="./css/style.css">
<title>HOME</title>
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
					<input type="text" name="searchWord" id="search"/>
				</div>
					<input type="submit" value="検索" class="search-btn"/>
			</s:form>
		</div>

		<div id="header-container">
			<div class="header-menu">
				<s:if test="session.loginUserId != null">
						<s:property value="#session.loginUserId"/>でログイン中
				</s:if>
			</div>

			<ul class="header-list">
				<li>アカウント情報
					<ul>
						<li>
							<s:if test="session.loginUserId != null">
								<s:form action="MyPageAction">
									<s:submit value="マイページ" />
								</s:form>
							</s:if>
						</li>

						<li>
							<s:if test="session == null">
								<s:form action="LoginPageAction">
									<s:submit value="ログイン画面へ" />
								</s:form>
							</s:if>
						</li>

						<li>
							<s:if test="session.loginUser == null">
								<s:form action="LoginPageAction">
									<s:submit value="ログイン画面へ" />
								</s:form>
							</s:if>
						</li>


						<li>
							<s:if test="session.loginUser != null">
								<s:form action="LogoutAction">
									<s:submit value="ログアウト" />
								</s:form>
							</s:if>
						</li>

						<li>
							<s:form action="UserCreateAction">
								<s:submit value="ユーザー登録" />
							</s:form>
						</li>

						<li>
							<s:form action="ItemAction">
								<s:submit value="商品一覧" />
							</s:form>
						</li>

						<li>
							<s:form action="CartAction">
								<s:hidden name="cartFlg" value="1"></s:hidden>
								<s:submit value="カート確認" />
							</s:form>
						</li>

						<li>
							<s:form action="PaymentAction">
								<s:submit value="決済" />
							</s:form>
						</li>
					</ul>
				</li>
			</ul>
		</div>


	</header>
	<div id="main">
	</div>
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>