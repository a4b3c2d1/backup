<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/destination.css">
<link rel="stylesheet" type="text/css" href="./css/destinationCreate.css">
<link rel="stylesheet" type="text/css" href="./slick/slick.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="./slick/slick-theme.css"
	media="screen" />
<title>宛先情報変更</title>
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
			<s:form action="DestinationEditConfirmAction">
				<table class="t-body">
					<tr class="input-area">
						<td class="topic">姓</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" size="32" name="familyName" value="<s:if test="#session.familyName != null"><s:property value="#session.familyName" /></s:if><s:else><s:property value="#session.defaultDestinationDTO.familyName" /></s:else>"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" size="32" name="familyName" value="<s:if test="#session.familyName != null"><s:property value="#session.familyName" /></s:if><s:else><s:property value="#session.selectDestinationDTO.familyName" /></s:else>"></td>
						</s:if>
					</tr>
					<%-- エラーメッセージをiteratorで表示 --%>
					<s:if test="errorFamilyNameList != null">
						<tr><td class="error" colspan="2">
							<s:iterator value="errorFamilyNameList" var="errorFamilyName">
								<s:property value="errorFamilyName" /><br>
							</s:iterator></td>
						</tr>
					</s:if>
					<tr class="input-area">
						<td class="topic">名</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" size="32" name="firstName" value="<s:if test="#session.firstName != null"><s:property value="#session.firstName" /></s:if><s:else><s:property value="#session.defaultDestinationDTO.firstName" /></s:else>"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" size="32" name="firstName" value="<s:if test="#session.firstName != null"><s:property value="#session.firstName" /></s:if><s:else><s:property value="#session.selectDestinationDTO.firstName" /></s:else>"></td>
						</s:if>
					</tr>
					<s:if test="errorFirstNameList != null">
						<tr>
						<td class="error" colspan="2">
							<s:iterator value="errorFirstNameList" var="errorFirstName">
								<s:property value="errorFirstName" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr class="input-area">
						<td class="topic">姓ふりがな</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" size="32" name="familyNameKana" value="<s:if test="#session.familyNameKana != null"><s:property value="#session.familyNameKana" /></s:if><s:else><s:property value="#session.defaultDestinationDTO.familyNameKana" /></s:else>"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" size="32" name="familyNameKana" value="<s:if test="#session.familyNameKana != null"><s:property value="#session.familyNameKana" /></s:if><s:else><s:property value="#session.selectDestinationDTO.familyNameKana" /></s:else>"></td>
						</s:if>
					</tr>
					<s:if test="errorFamilyNameKanaList != null">
						<tr>
						<td class="error" colspan="2">
							<s:iterator value="errorFamilyNameKanaList" var="errorFamilyNameKana">
								<s:property value="errorFamilyNameKana" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr class="input-area">
						<td class="topic">名ふりがな</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" size="32" name="firstNameKana" value="<s:if test="#session.firstNameKana != null"><s:property value="#session.firstNameKana" /></s:if><s:else><s:property value="#session.defaultDestinationDTO.firstNameKana" /></s:else>"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" size="32" name="firstNameKana" value="<s:if test="#session.firstNameKana != null"><s:property value="#session.firstNameKana" /></s:if><s:else><s:property value="#session.selectDestinationDTO.firstNameKana" /></s:else>"></td>
						</s:if>
					</tr>
					<s:if test="errorFirstNameKanaList != null">
						<tr>
						<td class="error" colspan="2">
							<s:iterator value="errorFirstNameKanaList" var="errorFirstNameKana">
								<s:property value="errorFirstNameKana" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr class="input-area">
						<td class="topic">住所</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" size="32" name="userAddress" value="<s:if test="#session.userAddress != null"><s:property value="#session.userAddress" /></s:if><s:else><s:property value="#session.defaultDestinationDTO.userAddress" /></s:else>"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" size="32" name="userAddress" value="<s:if test="#session.userAddress != null"><s:property value="#session.userAddress" /></s:if><s:else><s:property value="#session.selectDestinationDTO.userAddress" /></s:else>"></td>
						</s:if>
					</tr>
					<s:if test="errorUserAddressList != null">
						<tr>
						<td class="error" colspan="2">
							<s:iterator value="errorUserAddressList" var="errorUserAddress">
								<s:property value="errorUserAddress" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr class="input-area">
						<td class="topic">電話番号</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" size="32" name="telNumber" value="<s:if test="#session.telNumber != null"><s:property value="#session.telNumber" /></s:if><s:else><s:property value="#session.defaultDestinationDTO.telNumber" /></s:else>"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" size="32" name="telNumber" value="<s:if test="#session.telNumber != null"><s:property value="#session.telNumber" /></s:if><s:else><s:property value="#session.selectDestinationDTO.telNumber" /></s:else>"></td>
						</s:if>
					</tr>
					<s:if test="errorTelNumberList != null">
						<tr>
						<td class="error" colspan="2">
							<s:iterator value="errorTelNumberList" var="errorTelNumber">
								<s:property value="errorTelNumber" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr class="input-area">
						<td class="topic">メール</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" size="32" name="email" value="<s:if test="#session.email != null"><s:property value="#session.email" /></s:if><s:else><s:property value="#session.defaultDestinationDTO.email" /></s:else>"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" size="32" name="email" value="<s:if test="#session.email != null"><s:property value="#session.email" /></s:if><s:else><s:property value="#session.selectDestinationDTO.email" /></s:else>"></td>
						</s:if>
					</tr>
					<s:if test="errorEmailList != null">
						<tr>
						<td class="error" colspan="2">
							<s:iterator value="errorEmailList" var="errorEmail">
								<s:property value="errorEmail" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr>
					</tr>
				</table>
				<div class="sub-btn">
					<s:submit class="btn l-btn" value="この内容で変更" />
				</div>
				<div>
					<p class="back"><a href='<s:url action="DestinationAction" />'>宛先情報ページへ戻る</a></p>
					<p class="back"><a href='<s:url action="MyPageAction" />'>マイページへ戻る</a></p>
				</div>
			</s:form>
		</div>
	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>
</body>
</html>
