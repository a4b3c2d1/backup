<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート確認</title>
<link rel="stylesheet" type="text/css" href="./css/cart.css">
<link rel="stylesheet" type="text/css" href="./slick/slick.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="./slick/slick-theme.css"
	media="screen" />

	<!-- *******************ここから前頁共通******************* -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript" src="./js/autocomplete.js"></script>
<!-- ===================ここまで前頁共通=================== -->
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



	<div id="main">

		<!-- カートに何も入っていない場合 -->
		<s:if test="cartList == null">
			<h3 class= "blank">カートに何も入っていません。</h3>
		</s:if>


		<!-- カートに商品が入っている場合 -->

		<s:elseif test="message == null">
			<h3>カート詳細</h3>

			<s:form action="CartAction" name="cart">
				<table class="zebra">
					<thead>
						<tr>
							<th class= "check0"></th>
							<th class= "cart1">商品名</th>
							<th class= "cart2">よみがな</th>
							<th class= "cart3">商品画像</th>
							<th class= "cart4">値段</th>
							<th class= "cart5">購入個数</th>
							<th class= "cart6">製造会社</th>
							<th class= "cart7">発売日</th>
							<th class= "cart8">追加日</th>
							<th class= "cart9">合計金額</th>
						</tr>
					</thead>


					<s:iterator value="cartList">
						<tr>
							<td class= "check1"><s:checkbox name="checkboxList" value="checked"
									fieldValue="%{id}" class= "check" /></td>
							<td class= "cart10"><s:property value="productName" /></td>
							<td class= "cart11"><s:property value="productNameKana" /></td>
							<td class= "cart12"><img src='<s:property value="imageFilePath" />'
								height="100"></td>
							<td class= "cart13"><s:property value="price" />円</td>
							<td class= "cart14"><s:property value="count" />個</td>
							<td class= "cart15"><s:property value="releaseCompany" /></td>
							<td class= "cart16"><s:property value="releaseDate" /></td>
							<td class= "cart17"><s:property value="registDate" /></td>
							<td class= "cart18"><s:property value="totalCount" />円</td>
						</tr>
					</s:iterator>
				</table>


				<div class="allCheck">
					<input type="checkbox" id="allCheck01"><label
						for="allCheck01">全選択・全解除</label>
				</div>
				<div id="deletebtn">
					<input type="hidden" name="deleteFlg" value="1"> <input
						type="submit" value="選択した項目を削除" id="btnConfirmation" />
				</div>
			</s:form>
		</s:elseif>


		<div class= "price">
			<s:form action="CartAction">
				<s:if test="cartList != null">
			カート内合計金額:<div class= "allPrice"><s:property value="allPrice" />円</div><br>
					<s:if test="cartJugde == null">
						<input type="hidden" name="paymentFlg" value="1">
						<input type="submit" class= "pay" value="決済に進むにはログインしてください"  />
					</s:if>
					<s:elseif test="cartJugde == 1">
						<a class= "pay" href='<s:url action="PaymentAction" />'>決済へ進む</a>
					</s:elseif>
				</s:if>
			</s:form>
		</div>
	</div>
<!-- *******************ここから前頁共通******************* -->
	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>
<!-- ===================ここまで前頁共通=================== -->


	<script type="text/javascript">
		$(function() {
	        $('.check').change(function() {
	            if ($('.check').is(':checked')) {
	                $('#btnConfirmation').prop('disabled', false);
	                $('#btnConfirmation').css('background-color','#4B99AD');
	            } else {
	                $('#btnConfirmation').prop('disabled', true);
	                $('#btnConfirmation').css('background-color','#777');
	            }
	        } ).change();
	    });

		$(function() {
	        $('#allCheck01').change(function() {
	            if ($('#allCheck01').is(':checked')) {
	                $('#btnConfirmation').prop('disabled', false);
	                $('#btnConfirmation').css('background-color','#4B99AD');
	            } else {
	                $('#btnConfirmation').prop('disabled', true);
	                $('#btnConfirmation').css('background-color','#777');
	            }
	        } ).change();
	    });


		$(function() {
			  $('#allCheck01').on('click', function() {
			    $('.check').prop('checked', this.checked);
			  });

			  $('.check').on('click', function() {
			    if ($('.zebra :checked').length == $('.zebra :input[name=checkboxList]').length){
			      $('#allCheck01').prop('checked', 'checked');
			    }else{
			      $('#allCheck01').prop('checked', false);
			    }
			  });
			});
	</script>
</body>
</html>