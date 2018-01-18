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
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
	<header>

		<div id="main-logo">

			<a href=' <s:url action= "GoHomeAction" /> '><img
				src="./css/sagaone_logo.png" alt="logo"></a>
		</div>

		<div id="menu">
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
					<input type="submit" value="検索" class="search-btn" />
				</s:form>
			</div>


			<div id="header-container">
				<span class="header-menu"> <s:if
						test="session.loginUserId != null">
						<s:property value="#session.loginUserId" />でログイン中
				</s:if>
				</span> <span class="home-btn"> <a
					href=' <s:url action= "GoHomeAction" />'>&#x1f3e0;</a>
				</span> <span class="header-list"> &#128131; アカウントメニュー &#128131;
					<li><s:if test="session.loginUserId != null">
							<ul>
								<s:form action="MyPageAction">
									<s:submit value="マイページ" cssClass="b-btn" />
								</s:form>
							</ul>
						</s:if> <s:if test="session == null">
							<ul>
								<s:form action="LoginPageAction">
									<s:submit value="ログイン画面へ" cssClass="b-btn" />
								</s:form>
							</ul>
						</s:if> <s:if test="session.loginUser == null">
							<ul>
								<s:form action="LoginPageAction">
									<s:submit value="ログイン画面へ" cssClass="b-btn" />
								</s:form>
							</ul>
						</s:if> <s:if test="session.loginUser != null">
							<ul>
								<s:form action="LogoutAction">
									<s:submit value="ログアウト" cssClass="b-btn" />
								</s:form>
							</ul>
						</s:if>

						<ul>
							<s:form action="UserCreateAction">
								<s:submit value="ユーザー登録" cssClass="b-btn" />
							</s:form>
						</ul>

						<ul>
							<s:form action="ItemAction">
								<s:hidden name="offset" value="0"></s:hidden>
								<s:submit value="商品一覧" cssClass="b-btn" />
							</s:form>
						</ul>

						<ul>
							<s:form action="CartAction">
								<s:hidden name="cartFlg" value="1"></s:hidden>
								<s:submit value="カート確認" cssClass="b-btn" />
							</s:form>
						</ul>

						<ul>
							<s:form action="PaymentAction">
								<s:submit value="決済" cssClass="b-btn" />
							</s:form>
						</ul></li>
				</span>

			</div>
		</div>
	</header>

	<div id="main">
		<s:if test="cartList == null">
			<h3>カートは空です</h3>
		</s:if>
		<s:elseif test="message == null">
			<h3>カート詳細</h3>
			<s:form action="CartAction" name="cart">
				<table class="zebra">
					<thead>
						<tr>
							<th></th>
							<th>商品名</th>
							<th>よみがな</th>
							<th>商品画像</th>
							<th>値段</th>
							<th>購入個数</th>
							<th>製造会社</th>
							<th>発売日</th>
							<th>追加日</th>
							<th>合計金額</th>
						</tr>
					</thead>
					<s:iterator value="cartList">
						<tr>
							<td><s:checkbox name="checkboxList" value="checked"
									fieldValue="%{id}" class="check" /></td>
							<td><s:property value="productName" /></td>
							<td><s:property value="productNameKana" /></td>
							<td><img src="<s:property value="imageFilePath" />"
								height="100"></td>
							<td><s:property value="price" />円</td>
							<td><s:property value="count" />個</td>
							<td><s:property value="releaseCompany" /></td>
							<td><s:property value="releaseDate" /></td>
							<td><s:property value="registDate" /></td>
							<td><s:property value="totalCount" />円</td>
						</tr>
					</s:iterator>
				</table>
				<div class="allCheck">
					<input type="checkbox" id="allCheck01"><label
						for="allCheck01">全選択・全解除</label>
				</div>
				<div id="deletebtn">
					<input type="hidden" name="deleteFlg" value="1"> <input
						type="submit" value="選択した項目を削除" id="btn_confirmation" />
				</div>
			</s:form>

		</s:elseif>
		<div>
			<s:form action="CartAction">
				<s:if test="cartList != null">
			カート内合計金額:<s:property value="allPrice" />円<br>
					<s:if test="cartJugde == null">
						<a href='<s:url action="LoginPageAction" />'><span id="login">決済に進むにはログインしてください</span></a>
					</s:if>
					<s:elseif test="cartJugde == 1">
						<a href='<s:url action="PaymentAction" />'><span id="kessai">決済へ進む</span></a>
					</s:elseif>
				</s:if>
			</s:form>
		</div>
	</div>
	<div id="footer"></div>

	<script type="text/javascript">
		$(function() {
	        $('.check').change(function() {
	            if ($('.check').is(':checked')) {
	                $('#btn_confirmation').prop('disabled', false);
	                $('#btn_confirmation').css('background-color','#4B99AD');
	            } else {
	                $('#btn_confirmation').prop('disabled', true);
	                $('#btn_confirmation').css('background-color','#777');
	            }
	        } ).change();
	    });

		$(function() {
	        $('#allCheck01').change(function() {
	            if ($('#allCheck01').is(':checked')) {
	                $('#btn_confirmation').prop('disabled', false);
	                $('#btn_confirmation').css('background-color','#4B99AD');
	            } else {
	                $('#btn_confirmation').prop('disabled', true);
	                $('#btn_confirmation').css('background-color','#777');
	            }
	        } ).change();
	    });


		$(function() {
			  $('#allCheck01').on('click', function() {
			    $('.check').prop('checked', this.checked);
			  });

			  $('.check').on('click', function() {
			    if ($('.s :checked').length == $('.zebra :input').length){
			      $('#allCheck01').prop('checked', 'checked');
			    }else{
			      $('#allCheck01').prop('checked', false);
			    }
			  });
			});
	</script>
</body>
</html>