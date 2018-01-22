<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />

<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>PaymentPage画面</title>

</head>

<body>
<style>
/* アコーディオン */
.ac-container{
    width: auto;
    margin: 20px auto;
}
.ac-container label{
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
.ac-container label:hover{
    background: rgba( 255, 155, 155, 0.55 );
    -webkit-transition: all .3s;
    transition: all .3s;
}
.ac-container label:after{
 color: #fff;
    font-family:"FontAwesome";
    content:"\f067";
}
.ac-container input:checked ~ label::after {
 color: #fff;
   font-family:"FontAwesome";
   content:"\f068";
}
.ac-container input{
   display: none;
}
.ac-container div{
   background: rgba(255, 255, 255, 0.5);
   margin-top: -1px;
   overflow: hidden;
   height: 0px;
   position: relative;
   z-index: 10;
   transition:
   height 0.3s ease-in-out,
   box-shadow 0.6s linear;
}
.ac-container input:checked ~ div{
   transition:
   height 0.5s ease-in-out,
   box-shadow 0.1s linear;
   box-shadow: 0px 0px 0px 1px rgba(155,155,155,0.3);
}
.ac-container div p{
   color: #777;
   line-height: 23px;
   font-size: 14px;
   padding: 20px;
}
/* 高さの定義 */
.ac-container input:checked ~ div.ac-small{
   height: 150px;
}
.ac-container input:checked ~ div.ac-medium{
   height: 200px;
}
.ac-container input:checked ~ div.ac-large{
   height: 300px;
}
</style>
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
<body>

	<!--PaymentAction-->
	<div id="paymentPage">
		<div id="main">
			<s:if test="paymentMessage != null">
				<h3>カートに商品が入っていません</h3>
			</s:if>
		</div>

		<s:if test="paymentMessage == null">


			<s:iterator value="session.paymentUserInfoDTO">

				<p>
					ユーザーID :
					<s:property value="userId" />
				</p>

				<p>
					氏名 :
					<s:property value="familyName" />
					<s:property value="firstName" />
				</p>
				<p>
					ふりがな :
					<s:property value="familyNameKana" />
					<s:property value="firstNameKana" />
				</p>
				<s:if test="sex == 0">
					<p>性別 : 男性</p>
				</s:if>
				<s:if test="sex == 1">
					<p>性別 : 女性</p>
				</s:if>
				<p>
					メールアドレス :
					<s:property value="email" />
				</p>
				<p>
					電話番号 :
					<s:property value="telNumber" />
				</p>
			</s:iterator>

			<s:iterator value="#session.addressDTOList" status="st">
				<p>

					<s:if test="status == 1">
					住所 :
						<s:property value="userAddress" />



						<a
							href='<s:url action="PaymentAddressChoiceAction" ><s:param name="adNum" value="#st.index"/></s:url>'>この住所を使う</a>
					</s:if>
				</p>




				<div class="ac-container">






					<input id="ac-1" name="accordion-1" type="checkbox" /> <label
						for="ac-1">クリック</label>



					<div class="ac-small">
						<s:if test="status == 0">


							<p>

								<a
									href='<s:url action="PaymentAddressChoiceAction" ><s:param name="adNum" value="#st.index"/></s:url>'>この住所を使う</a>
							</p>
					</div>
		</s:if>
	</div>





	</s:iterator>




	<s:iterator value="#session.productDTOList">
				<p>
					商品名 : <s:property value="productName" /><br>
					ふりがな : <s:property value="productNameKana" />
				</p>

				<p>
					金額 :
					<s:property value="price" />
					円
				</p>
				<p>
					個数 :
					<s:property value="productCount" />
				</p>
				<p>
					合計金額 :
					<s:property value="totalPrice" />
					円
				</p>
				<p>
					発売日 :
					<s:property value="releaseDate" />
				</p>
				<p>
					販売元 :
					<s:property value="releaseCompany" />
				</p>
				<img src='<s:property value="imageFilePath" />'
					alt='<s:property value="imageFileName" />'
					style="width: 100px; height: 100px;">
			</s:iterator>


			<p>
				合計金額:
				<s:property value="#session.sumPrice" />
				円
			</p>

		</s:if>
	</div>


	<div>
		<p>
			<a href='<s:url action="DestinationCreateAction" />'>宛先登録はこちらから</a>
		</p>
	</div>



	<div>
		<p>
			<a href='<s:url action = "GoHomeAction"/>'>Homeへ戻る</a>
		</p>
	</div>

</body>
</html>