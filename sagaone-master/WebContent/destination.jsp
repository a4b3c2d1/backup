<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/destination.css">
<link rel="stylesheet" type="text/css" href="./slick/slick.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="./slick/slick-theme.css"
	media="screen" />
<title>宛先情報</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>

<script type="text/javascript" src="./js/autocomplete.js"></script>

<script type="text/javascript" src="./js/test.js"></script>
<script src="./slick/slick.min.js"></script>
<style>
<!--
.ui-autocomplete {
    max-height: 90px;
    overflow-y: auto;
    overflow-x: hidden;
    padding-right: 20px;
    border-radius: 0px;
    font-size: 12px;
}
#jquery-ui-autocomplete label {
    float: left;
    margin-right: 0.5em;
    color: black;
    font-size: 15px;
}
-->
</style>
</head>
<body>
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

							<s:if test="session.loginUser == null">
								<li>
									<s:form action="UserCreateAction">
										<s:submit value="ユーザー登録" cssClass="b-btn" />
									</s:form>
								</li>
							</s:if>

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
	<div id="main" class=" wrapper">
		<div >
			<div class="default">
				<div class="default-header">
					<p>既定の住所</p>
				</div>
				<div class="default-main">
					<s:form action="DestinationEditAction">
						<table class="data">
							<tr>
								<td class="column">名前</td>
								<td class="parameter"><s:property value="#session.defaultDestinationDTO.familyName" /><span class="space"></span><s:property value="#session.defaultDestinationDTO.firstName" /></td>
							</tr>
							<tr>
								<td class="column">ふりがな</td>
								<td class="parameter"><s:property value="#session.defaultDestinationDTO.familyNameKana" /><span class="space"></span><s:property value="#session.defaultDestinationDTO.firstNameKana" /></td>
							</tr>
							<tr>
								<td class="column">メール</td>
								<td class="parameter"><s:property value="#session.defaultDestinationDTO.email" /></td>
							</tr>
							<tr>
								<td class="column">住所</td>
								<td class="parameter"><s:property value="#session.defaultDestinationDTO.userAddress" /></td>
							</tr>
							<tr>
								<td class="column">電話番号</td>
								<td class="parameter"><s:property value="#session.defaultDestinationDTO.telNumber" /></td>
							</tr>
						</table>
						<s:hidden name="myAddressFlg" value="1" />
						<button class="btn" type="submit" name="destinationId" value="${destinationId}">変更</button>
					</s:form>
				</div>
			</div>
			<div class="create">
				<a href='<s:url action="DestinationCreateAction"><s:param name="destinationFlg" value="1" /></s:url>'>新規作成</a>
			</div>
		</div>
		<div class="other clearfix">
		<p>ほかの登録済み住所</p>
			<s:iterator value="#session.destinationDTOList" status="st">
				<div class="other-main">
					<s:form action="DestinationEditAction">
						<table class="data">
							<tr>
								<td class="column">名前</td>
								<td class="parameter"><s:property value="familyName" /><span class="space"></span><s:property value="firstName" /></td>
							</tr>
							<tr>
								<td class="column">ふりがな</td>
								<td class="parameter"><s:property value="familyNameKana" /><span class="space"></span><s:property value="firstNameKana" /></td>
							</tr>
							<tr>
								<td class="column">メール</td>
								<td class="parameter"><s:property value="email" /></td>
							</tr>
							<tr>
								<td class="column">住所</td>
								<td class="parameter"><s:property value="userAddress" /></td>
							</tr>
							<tr>
								<td class="column">電話番号</td>
								<td class="parameter"><s:property value="telNumber" /></td>
							</tr>
						</table>
						<s:hidden name="myAddressFlg" value="%{myAddressFlg}" />
						<div class="btn-area">
							<button class="btn" type="submit" name="destinationId" value="${destinationId}">変更</button>
							<input class="btn" type="button" onclick="location.href='<s:url action="DestinationDeleteAction"><s:param name="deleteFlg" value="%{destinationId}" /></s:url>'"value="削除">
							<input class="btn" type="button" onclick="location.href='<s:url action="DestinationSelectAction"><s:param name="selectFlg" value="%{destinationId}" /></s:url>'"value="既定の住所にする">
						</div>
					</s:form>
				</div>
			</s:iterator>
		</div>
	</div>
	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>
</body>
</html>
