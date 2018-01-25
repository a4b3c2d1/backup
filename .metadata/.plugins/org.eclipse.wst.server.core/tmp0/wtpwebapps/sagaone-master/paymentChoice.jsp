<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />

	<link rel="stylesheet" type="text/css" href="./css/payment.css">
		<link rel="stylesheet" type="text/css" href="./css/style.css">

	<title>PaymentChoice画面</title>



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

							<li><s:form action="UserCreateAction">
									<s:submit value="ユーザー登録" cssClass="b-btn" />
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
					<li id="welcome">
						<s:if test="session.loginUser != null" >
							<s:property value="#session.loginUserId" />&nbsp;さんでログイン中
						</s:if>
					</li>
				</ul>
			</div>
		</div>
	</header>


	<div id = "main">
		<table class= "myPage">

		<div style = "text-align: center;">
		<h2>支払い方法を選択してください</h2>
		</div>

			<s:iterator value="session.paymentUserInfoDTO">
			<tr><th>ユーザーID</th><td><s:property value= "userId" />&thinsp;&thinsp;</td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>氏名</th><td><s:property value="familyName"/>&thinsp;&thinsp;<s:property value="firstName"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>ふりがな</th><td><s:property value="familyNameKana"/>&thinsp;&thinsp;&thinsp;<s:property value="firstNameKana"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>性別</th><td><s:if test="sex == 0">男性</s:if><s:if test="sex == 1">女性</s:if></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>メールアドレス</th><td><s:property value="email" /></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<s:if test= '<s:property value="#session.telNumber" /> '><tr><th>電話番号</th><td><s:property value="#session.telNumber" /></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr></s:if>

			<%--<tr><th>住所</th><td><s:property value="#session.myPageAddress.userAddress"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>--%>

			<tr><th>住所</th><td><s:property value = "#session.choicedAddress"/>&thinsp;&thinsp;</td></tr>
			<tr><td class = "bar" colspan = "6"></td></tr>

			<tr><th>クレジットカード（カード番号）</th><td><s:property value="#session.cardUpdateDTO.cardNumber"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>
			</s:iterator>

			<s:form action="PaymentConfirmAction">
			<tr><th>支払い方法</th><td>
				<input type="radio" name="payMethod" value="0" checked = "checked" checked id="radio01" /><label for="radio01" class="radio">クレジットカード</label>
				<input type="radio" name="payMethod" value="c" id="radio02" /><label for="radio02" class="radio">現金</label></td><td>
				<s:submit value="購入確認へ" /></td></tr>
			</s:form>
		</table>
	</div>

	<p><a class= "page" href='<s:url action="GoHomeAction" />' >Homeへ戻る</a></p>

	<p><a class="page" href='<s:url action="PaymentAction" />' >前のページへ戻る</a></p>


</body>
</html>