<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>レビュー</title>
<style type="text/css">
a {
	text-decoration: none;
}

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
}

.main1 {
	padding: 20px;
	width: 100%;
	height: 350px;
}

.review1 {
	height: 250px;
	float: left;
	width: 650px;
}

.text {
	width: 600px;
	height: 200px;
	font-size: 25px;

}
.botton1{
float:right;
margin:10px;

}

.main2 {
	width: 100%;
	clear: both;
}

.hyouka {
	float: left;
	height: 100px;
	display: -ms-flex;
	display: -webkit-flex;
	display: -moz-flex;
	display: -o-flex;
	display: flex;
	flex-direction: -ms-row-reverse;
	flex-direction: -webkit-row-reverse;
	flex-direction: -moz-row-reverse;
	flex-direction: -o-row-reverse;
	flex-direction: row-reverse;
	justify-content: -ms-right;
	justify-content: -webkit-right;
	justify-content: -moz-right;
	justify-content: -o-right;
	justify-content: right;
}

.a:hover {
	color: #eb1515;
	cursor: pointer;
	text-decoration: underline;
}

.hyouka input[type='radio'] {
	display: none;
}

.hyouka label {
	position: relative;
	padding: 10px 0px 20px 0px;
	color: #bbb;
	cursor: pointer;
	font-size: 40px;
}

.hyouka label:hover, .hyouka label:hover ~ label, .hyouka input[type='radio']:checked
	 ~ label {
	color: #ffcc33;
}


</style>

<script type="text/javascript">
	function hoge() {
		document.getElementById("text").value = "";
	}
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
			<h1>カスタマーレビューフォーム</h1>
			<s:if test="reviewErrormessage !=''">
				<s:property value="reviewErrormessage" escape="false" />

			</s:if>
			<s:form action="ReviewConfirmAction">

				<div class="hyouka">
					<input id="hoshi1" type="radio" name="value" value="5" /> <label
						for="hoshi1">★</label> <input id="hoshi2" type="radio"
						name="value" value="4" /> <label for="hoshi2">★</label> <input
						id="hoshi3" type="radio" name="value" value="3" /> <label
						for="hoshi3">★</label> <input id="hoshi4" type="radio"
						name="value" value="2" /> <label for="hoshi4">★</label> <input
						id="hoshi5" type="radio" name="value" value="1" /> <label
						for="hoshi5">★</label> <input type="radio" name="value" value=""
						checked="checked" style="display: none;" />
				</div>
				<div class="review1">
					<s:textarea class="text" name="review" placeholder="レビュー内容"></s:textarea>

					<span class="botton1"><input type="submit" value="レビューする" /></span><span
						class="botton1"> <input type="button" value="クリア"
						onClick="hoge()" /></span>
				</div>
			</s:form>
		</div>

		<div class="main2">

			<a
				href='<s:url action="ItemDetailAction"><s:param name="product_id" value="session.review_product_id" /><s:param name="category_id" value="session.review_category_id" /></s:url>'>
				<span class="a">商品詳細へ戻る</span>
			</a>
		</div>
	</div>
</body>

</html>