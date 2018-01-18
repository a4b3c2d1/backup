<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>確認画面</title>
<style type="text/css">
#main {
	margin-top: 100px;
	margin-bottom: 60px;
	min-height: 100%;
	height: auto !important;
	height: 100%;
	position: relative;
}

.main1 {
	float: left;
	margin: 50px;
	padding-left: 100px;
}

.text {
	border: solid;
	margin: 50px;
	width: 600px;
	font-size: 20px;
	min-height: 200px;
	font-family: monospace;
	border-color: rgb(169, 169, 169);
	border-width: 1px;
	margin: 50px;
	width: 600px;
	font-size: 20px;
	min-height: 200px;
	font-family: monospace;
	border-color: rgb(169, 169, 169);
}

.rating {
	position: relative;
	width: 5em;
	height: 1em;
	font-size: 40px;
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

.b {
	float: right;
}

.c {
	float: right;
}
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
			<h1>確認画面</h1>
			登録する内容は以下でよろしいですか。

			<div class="rating">
				<div class="rating-front"
					style="width:<s:property value="value2" />%">★★★★★</div>
				<div class="rating-back">★★★★★</div>
			</div>



			<div class="text">
				<s:property value="session.review_review" escape="false" />
			</div>


			<s:form action="ReviewConpleteAction" onClick="alert('完了しました');">


				<span class="b"> <input type="submit" value="完了"></span>

			</s:form>



			<s:iterator value="#session.itemdetailDTOList">
				<s:form action="ReviewAction">

					<input type="hidden" name="product_id"
						value="<s:property value='session.review_product_id' />"></input>
					<input type="hidden" name="category_id"
						value="<s:property value='session.review_category_id' />"></input>
					<span class="c"> <input type="submit" value="戻る"></span>
				</s:form>
			</s:iterator>

		</div>
	</div>
</body>
</html>