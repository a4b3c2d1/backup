<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />

	<link rel="stylesheet" type="text/css" href="./css/payment.css">
	<link rel="stylesheet" type="text/css" href="./css/style.css">

	<title>PaymentPage画面</title>

</head>

<body>

<style>
/* アコーディオン */
}
.ac-th input label{
    width: 300px;
    text-align: center;
    background: #ff9b9b;
    margin: auto;
    padding: 10px 5px;
    position: relative;
    display: block;
    height: 30px;
    cursor: pointer;
    color: #fff;

}
.ac-th input{
   display: none;
}
.ac-small {
	display: none;
   background: rgba(255, 255, 255, 0.5);
}
.ac-th input:checked .ac-small {
   display: table-row;
}

</style>

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


	<!--PaymentAction-->
	<div id="main">
		<div class="subPaymentPage">
			<s:if test="paymentMessage != null">
				<h2>カートに商品が入っていません</h2>
			</s:if>
		</div>

		<s:if test="paymentMessage == null">

		<div style = "text-align: center;">
		<h2>住所を選択してください</h2>
		</div>

		<table class= "myPage">

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


				<s:iterator value="#session.addressDTOList" status="st">

					<s:if test="status == 1">
						<tr><th>住所</th><td><s:property value="userAddress" />&thinsp;&thinsp;
						<a class = "radio" href = '<s:url action="PaymentAddressChoiceAction" ><s:param  name="adNum" value="#st.index"/></s:url>'>この住所を使う</a></td></tr>
						<tr>
						<td class = "bar" colspan = "6"></td>
					</s:if>
				</s:iterator>


					<tr><td>
					<a class = "page" href='<s:url action="DestinationAction" />'>住所の変更/登録</a>
					</td></tr>
					<td class = "bar" colspan = "6"></td>
					</s:iterator>
					<%--<s:if test = "status == 0">
						<tr>
							<th class="ac-th"><input class="ac-input" id="ac-1" name="accordion-1" type="checkbox" /> <label class="ac-label" for="ac-1">別の住所を使う</label></th>
						</tr>
						<tr class="ac-small">
							<th>住所</th>
							<td>
								<s:property value = "userAddress" />&thinsp;&thinsp;
								<a href='<s:url action="PaymentAddressChoiceAction" ><s:param name="adNum" value="#st.index"/></s:url>'>この住所を使う</a>
							</td>
						</tr>
					</s:if>

				</s:iterator>
			</s:iterator>--%>

			<%--<tr><td class="bar" colspan="6"></td> </tr>
			<tr><th>クレジットカード<br>（カード番号）</th><td><s:property value="#session.cardUpdateDTO.cardNumber" /></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>
			<tr><th>クレジットカード<br>（有効期限）</th><td><s:property value="#session.cardUpdateDTO.limitMonth"/> 月　<s:property value="#session.cardUpdateDTO.limitYear"/> 年</td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>
			<tr><th>クレジットカード<br>（セキュリティコード）</th><td><s:property value="#session.cardUpdateDTO.securityNumber"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>
			<tr><th>クレジットカード<br>（名義人）</th><td><s:property value="#session.cardUpdateDTO.nominee"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>--%>



			<%--<s:iterator value="#session.productDTOList">

				<tr><th>商品名 : </th><td><s:property value="productName" />&thinsp;&thinsp;</td></tr>
				<tr><td class = "bar" colspan = "6"></td>

				<tr><th>ふりがな : </th><td><s:property value="productNameKana" />&thinsp;&thinsp;</td></tr>
				<tr><td class = "bar" colspan = "6"></td>

				<tr><th>金額 : </th><td><s:property value="price" />&thinsp;&thinsp;円</td></tr>
				<tr><td class = "bar" colspan = "6"></td>

				<tr><th>個数 : </th><td><s:property value="productCount" />&thinsp;&thinsp;</td></tr>
				<tr><td class = "bar" colspan = "6"></td>

				<tr><th>合計金額 : </th><td><s:property value="totalPrice" />&thinsp;&thinsp;円</td></tr>
				<tr><td class = "bar" colspan = "6"></td>

				<tr><th>発売日 : </th><td><s:property value="releaseDate" />&thinsp;&thinsp;</td></tr>
				<tr><td class = "bar" colspan = "6"></td>

				<tr><th>販売元 : </th><td><s:property value="releaseCompany" />&thinsp;&thinsp;</td></tr>
				<tr><td class = "bar" colspan = "6"></td>

				<tr><td><img src='<s:property value="imageFilePath" />'alt='<s:property value="imageFileName" />' style="width: 100px; height: 100px;"></td></tr>
			</s:iterator>


			<tr><th>合計金額: </th><td><s:property value="#session.sumPrice" />&thinsp;&thinsp;円</td></tr>
			<tr><td class = "bar" colspan = "6"></td>--%>

			</table>
		</s:if>
	</div>



		<%--<p>
			<a class = "page" href='<s:url action="DestinationCreateAction" />'>宛先登録はこちらから</a>
		</p>--%>

		<p>
			<s:if test="#session.cardUpdateDTO.cardNumber == null">
				<a class = "page" href='<s:url action="CardCreateAction" />'>クレジットカード新規</a>
			</s:if>
		</p>

		<p>
			<s:if test="#session.cardUpdateDTO.cardNumber != null">
				<a class = "page" href='<s:url action="CardUpdateAction" />'>クレジットカード編集</a>
			</s:if>
		</p>

		<p>
			<a class = "page" href='<s:url action = "GoHomeAction"/>'>Homeへ戻る</a>
		</p>

</body>
</html>