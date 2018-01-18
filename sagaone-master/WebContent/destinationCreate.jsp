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
<title>宛先情報登録</title>
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
			<s:form action="DestinationCreateConfirmAction">
				<table>
					<tr>
						<td>姓</td>
						<td><input type="text" name="familyName"  value="<s:if test="#session.familyName != null"><s:property value="#session.familyName"  /></s:if>" ></td>
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
						<td><input type="text" name="firstName" value="<s:if test="#session.firstName != null"><s:property value="#session.firstName" /></s:if>"></td>
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
						<td><input type="text" name="familyNameKana" value="<s:if test="#session.familyNameKana != null"><s:property value="#session.familyNameKana" /></s:if>"></td>
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
						<td><input type="text" name="firstNameKana" value="<s:if test="#session.firstNameKana != null"><s:property value="#session.firstNameKana" /></s:if>" ></td>
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
						<td><input type="text" name="userAddress" <s:if test="#session.userAddress != null">value='<s:property value="#session.userAddress" />'</s:if>></td>
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
						<td><input type="text" name="telNumber" <s:if test="#session.telNumber != null">value='<s:property value="#session.telNumber" />'</s:if>></td>
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
						<td><input type="text" name="email" <s:if test="#session.email != null">value='<s:property value="#session.email" />'</s:if>></td>
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
						<s:submit value="登録" />
					</tr>
				</table>
			<div>
			<%-- マイページから遷移してくる場合はmyAddressFlg="1"としてリンクを決済確認から切り替える --%>
				<s:if test='destinationFlg == 1'>
					<s:hidden name="destinationFlg" value="1" />
					<a href='<s:url action="DestinationAction" />'>宛先画面へ戻る</a>
				</s:if>
				<s:if test='destinationFlg != 1'>
					<p><a href='<s:url action="PaymentAction" />'>決済確認画面へ戻る</a></p>
				</s:if>
			</div>
			</s:form>
		</div>
	</div>
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>