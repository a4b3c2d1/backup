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
<title>宛先情報変更</title>
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
		<div>
			<s:form action="DestinationEditConfirmAction">
				<table>
					<tr>
						<td>姓</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" name="familyName" value="<s:property value="#session.defaultDestinationDTO.familyName" />"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" name="familyName" value="<s:property value="#session.selectDestinationDTO.familyName" />"></td>
						</s:if>
					</tr>
					<%-- エラーメッセージをiteratorで表示 --%>
					<s:if test="errorFamilyNameList != null">
						<tr><td colspan="2">
							<s:iterator value="errorFamilyNameList" var="errorFamilyName">
								<s:property value="errorFamilyName" /><br>
							</s:iterator></td>
						</tr>
					</s:if>
					<tr>
						<td>名</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" name="firstName" value="<s:property value="#session.defaultDestinationDTO.firstName" />"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" name="firstName" value="<s:property value="#session.selectDestinationDTO.firstName" />"></td>
						</s:if>
					</tr>
					<s:if test="errorFirstNameList != null">
						<tr>
						<td colspan="2">
							<s:iterator value="errorFirstNameList" var="errorFirstName">
								<s:property value="errorFirstName" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr>
						<td>姓ふりがな</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" name="familyNameKana" value="<s:property value="#session.defaultDestinationDTO.familyNameKana" />"></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" name="familyNameKana" value="<s:property value="#session.selectDestinationDTO.familyNameKana" />"></td>
						</s:if>
					</tr>
					<s:if test="errorFamilyNameKanaList != null">
						<tr>
						<td colspan="2">
							<s:iterator value="errorFamilyNameKanaList" var="errorFamilyNameKana">
								<s:property value="errorFamilyNameKana" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr>
						<td>名ふりがな</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" name="firstNameKana" value="<s:property value="#session.defaultDestinationDTO.firstNameKana" />" ></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" name="firstNameKana" value="<s:property value="#session.selectDestinationDTO.firstNameKana" />" ></td>
						</s:if>
					</tr>
					<s:if test="errorFirstNameKanaList != null">
						<tr>
						<td colspan="2">
							<s:iterator value="errorFirstNameKanaList" var="errorFirstNameKana">
								<s:property value="errorFirstNameKana" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr>
						<td>住所</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" name="userAddress" value='<s:property value="#session.defaultDestinationDTO.userAddress" />'></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" name="userAddress" value='<s:property value="#session.selectDestinationDTO.userAddress" />'></td>
						</s:if>
					</tr>
					<s:if test="errorUserAddressList != null">
						<tr>
						<td colspan="2">
							<s:iterator value="errorUserAddressList" var="errorUserAddress">
								<s:property value="errorUserAddress" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr>
						<td>電話番号</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" name="telNumber" value='<s:property value="#session.defaultDestinationDTO.telNumber" />'></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" name="telNumber" value='<s:property value="#session.selectDestinationDTO.telNumber" />'></td>
						</s:if>
					</tr>
					<s:if test="errorTelNumberList != null">
						<tr>
						<td colspan="2">
							<s:iterator value="errorTelNumberList" var="errorTelNumber">
								<s:property value="errorTelNumber" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr>
						<td>メール</td>
						<s:if test='myAddressFlg == "1"'>
							<td><input type="text" name="email" value='<s:property value="#session.defaultDestinationDTO.email" />'></td>
						</s:if>
						<s:if test='myAddressFlg != "1"'>
							<td><input type="text" name="email" value='<s:property value="#session.selectDestinationDTO.email" />'></td>
						</s:if>
					</tr>
					<s:if test="errorEmailList != null">
						<tr>
						<td colspan="2">
							<s:iterator value="errorEmailList" var="errorEmail">
								<s:property value="errorEmail" /><br>
							</s:iterator>
						</td>
						</tr>
					</s:if>
					<tr>
					</tr>
				</table>
						<s:submit value="この内容で変更" />
						<input type="button" onclick="location.href='<s:url action="DestinationAction" />' "value="宛先情報ページへ戻る">
			<div>
				<p><a href='<s:url action="MyPageAction" />'>マイページへ戻る</a></p>
			</div>
			</s:form>
		</div>
	</div>
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>