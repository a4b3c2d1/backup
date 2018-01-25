<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>レビュー表示</title>
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
	height: 380px;
}

.rating {
	float: left;
	position: relative;
	width: 5em;
	height: 100px;
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

.botton1 {
	float: right;
	margin: 10px;
}

.main2 {
	width: 100%;
	clear: both;
}

.a:hover {
	color: #eb1515;
	cursor: pointer;
	text-decoration: underline;
}

.review2 {
	float: left;
	width: 650px;
}

.text {
	border: solid;
	border-width: 1px;
	width: 600px;
	font-size: 25px;
	min-height: 200px;
	font-family: monospace;
	border-color: rgb(169, 169, 169);
}

input[type=submit] {
	background: #4B99AD;
	padding: 8px 15px 8px 15px;
	border: none;
	color: #fff;
}
</style>

<script type="text/javascript">
	function showConfirm() {

		if (window.confirm('削除してもよろしいですか？')) {
			window.alert("削除されました")
			return true;
		} else {
			return false;
		}
	}
</script>
</head>
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
			<input type="image" src="./css/searchIcon.png" width="20" height="20"
				class="icon" />
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
<body>
	<div id="main">

		<div class="main1">

			<h2>以前この商品に書いた内容</h2>
			<s:iterator value="#session.reviewDTOList">

				<div class="review1">
					<span>ユーザー名： <s:property value="user_id" /></span> <br> <span>
						書き込み日：<s:property value="update_date" />
					</span>
				</div>

				<div class="rating">
					<div class="rating-front"
						style="width:calc(<s:property value="value" />*20%)">★★★★★</div>
					<div class="rating-back">★★★★★</div>
				</div>

				<div class="review2">
					<div class="text">
						<s:property value="review" escape="false" />
					</div>

					<s:form action="ReviewEditAction">
						<input type="hidden" name="changeflg" value="1"></input>
						<span class="botton1"> <s:submit value="新しく書き直す"></s:submit></span>

					</s:form>

					<s:form action="ReviewEditAction" onSubmit="return showConfirm()">
						<input type="hidden" name="deleteflg" value="1"></input>
						<span class="botton1"> <s:submit value="削除する"></s:submit></span>
					</s:form>
				</div>
			</s:iterator>
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