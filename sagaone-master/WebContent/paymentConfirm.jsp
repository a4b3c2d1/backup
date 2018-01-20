<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />

	<link rel="stylesheet" type="text/css" href="./css/style.css">

	<title>PaymentConfirm画面</title>



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

<body>
  <div id = "main">
	<s:iterator value="#session.paymentUserInfoDTO">
		<p><s:property value="userId"/></p>
		<p><s:property value="familyName"/><s:property value="firstName"/></p>
		<p><s:property value="familyNameKana"/><s:property value="firstNameKana"/></p>
		<s:if test="sex == 0"><p>男性</p></s:if>
		<s:if test="sex == 1"><p>女性</p></s:if>
		<p><s:property value="email"/></p>
		<p><s:property value="telNumber"/></p>
	</s:iterator>
	<s:property value="#session.choicedAddress"/>
	<br>
	<s:if test='#session.payMethod == "0" ' >
		<p>クレジットカード</p>
	</s:if>
	<s:if test='#session.payMethod == "c" '>
		<p>	現金</p>
	</s:if>

	<s:iterator value = "#session.productDTOList">
	<p><s:property value = "productName"/>
	<p><s:property value = "price"/></p>
	<p><s:property value = "productCount"/></p>
		<p><s:property value = "totalPrice"/></p>
	<p><s:property value = "releaseCompany"/></p>
	<img src='<s:property value="imageFilePath" />' alt='<s:property value="imageFileName" />' style=" width:100px; height: 100px;" >
</s:iterator>

<div>
	<p><a href='<s:url action="GoHomeAction" />' >Homeへ戻る</a></p>
</div>

<div>
	<p><a href='<s:url action="PaymentAddressChoiceAction" />' >前のページへ戻る</a></p>
</div>

	<a href='<s:url action="PaymentCompleteAction" />' >購入完了</a>
	</div>
</body>
</html>