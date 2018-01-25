<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />

<link rel="stylesheet" type="text/css" href="./css/paymentComplete.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>PaymentConfirm画面</title>



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

	<div id="main">
		<table class="myPage">
			<s:iterator value="#session.paymentUserInfoDTO">
				<tr>
					<th>ユーザーID :</th>
					<td><s:property value="userId" />&thinsp;&thinsp;</td>
				</tr>
				<tr>
					<td class="bar" colspan="6"></td>
				</tr>

				<tr>
					<th>氏名：</th>
					<td><s:property value="familyName" />&thinsp;&thinsp;<s:property
							value="firstName" /></td>
				</tr>
				<tr>
					<td class="bar" colspan="6"></td>
				</tr>

				<tr>
					<th>ふりがな：</th>
					<td><s:property value="familyNameKana" />&thinsp;&thinsp;&thinsp;<s:property
							value="firstNameKana" /></td>
				</tr>
				<tr>
					<td class="bar" colspan="6"></td>
				</tr>

				<tr>
					<th>性別：</th>
					<td><s:if test="sex == 0">男性</s:if> <s:if test="sex == 1">女性</s:if></td>
				</tr>
				<tr>
					<td class="bar" colspan="6"></td>
				</tr>

				<tr>
					<th>メールアドレス：</th>
					<td><s:property value="email" /></td>
				</tr>
				<tr>
					<td class="bar" colspan="6"></td>
				</tr>

				<s:if test='<s:property value="#session.telNumber" /> '>
					<tr>
						<th>電話番号：</th>
						<td><s:property value="#session.telNumber" /></td>
					</tr>
					<tr>
						<td class="bar" colspan="6"></td>
					</tr>

					<tr>
						<th>住所 :</th>
						<td><s:property value="#session.choicedAddress" />&thinsp;&thinsp;</td>
					</tr>
					<tr>
						<td class="bar" colspan="6"></td>
					</tr>
				</s:if>
			</s:iterator>



			<tr>
				<th>支払い方法 :</th>
				<td><s:if test='#session.payMethod == "0" '>
						&thinsp;&thinsp;
						<p>クレジットカード</p>
					</s:if> <s:if test='#session.payMethod == "c" '>
						&thinsp;&thinsp;
						<p>現金</p>
					</s:if> <s:iterator value="#session.productDTOList">

						<tr>
							<th>商品名 :</th>
							<td><s:property value="productName" />&thinsp;&thinsp;</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						<tr>
							<th>ふりがな :</th>
							<td><s:property value="productNameKana" />&thinsp;&thinsp;</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						<tr>
							<th>金額 :</th>
							<td><s:property value="price" />&thinsp;&thinsp;円</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						<tr>
							<th>個数 :</th>
							<td><s:property value="productCount" />&thinsp;&thinsp;</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						<tr>
							<th>合計金額 :</th>
							<td><s:property value="totalPrice" />&thinsp;&thinsp;円</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						<tr>
							<th>発売日 :</th>
							<td><s:property value="releaseDate" />&thinsp;&thinsp;</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						<tr>
							<th>販売元 :</th>
							<td><s:property value="releaseCompany" />&thinsp;&thinsp;</td>
						</tr>
						<tr>
							<td class="bar" colspan="6"></td>
						<tr>
							<td><img src='<s:property value="imageFilePath" />'
								alt='<s:property value="imageFileName" />'
								style="width: 100px; height: 100px;"></td>
						</tr>
					</s:iterator>
			<tr>
				<th>合計金額:</th>
				<td><s:property value="#session.sumPrice" />&thinsp;&thinsp;円
					<p>
						<a class="page1" href='<s:url action="PaymentCompleteAction" />'>購入完了</a>
					</p></td>
			</tr>
			<tr>
				<td class="bar" colspan="6"></td>
		</table>
	</div>





	<p>
		<a class="page" href='<s:url action="DestinationCreateAction" />'>宛先登録はこちらから</a>
	</p>

	<p>
		<a class="page" href='<s:url action="PaymentAddressChoiceAction" />'>前のページへ戻る</a>
	</p>


</body>
</html>