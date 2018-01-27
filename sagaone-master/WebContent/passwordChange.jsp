<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />

<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>SAGAONE|パスワード再設定画面</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/jquery-ui.min.js"></script>
<link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/themes/redmond/jquery-ui.css">
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.19/i18n/jquery-ui-i18n.min.js"></script>
<script type="text/javascript" src="./js/autocomplete.js"></script>

<style type= "text/css">

.error {
	font-size: 12px;
	color:  #f66;
}

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


	<div id="main">
		<s:form action="PasswordChangeConfirmAction">

				<span class= "error">
					<s:if test="session.blankMessage != ''">
								<s:property value="session.blankMessage"/>
					</s:if></span>

					<span class= "error">
					<s:if test="errorIdList != null ">
						<s:iterator value="errorIdList" var="errorId">
							<s:property value="errorId" escape="false" />
						</s:iterator>
					</s:if></span>

					<span class= "error">
					<s:if test="errorPasswordList != null ">
						<s:iterator value="errorPasswordList" var="errorPassword">
							<s:property value="errorPassword" escape="false" />
						</s:iterator>
					</s:if></span>

					<span class= "error">
					<s:if test="errorPasswordList2 != null ">
						<s:iterator value="errorPasswordList2" var="errorPassword2">
							<s:property value="errorPassword2" escape="false" />
						</s:iterator>
					</s:if>
					</span>


		<table>
			<tbody>
				<tr>
					<td>ログインID</td>
					<td>
						<input type="text" name="userId" value= '<s:property value= "#session.checkedLoginUserId" />' placeholder= "ログインID" ><!--「 再設定したい 」は消す-->
					</td>
				</tr>
				<tr>
					<td>新しいパスワード</td>
					<td>
						<input type="password" name="newLoginPassword" value= ""  placeholder= "新しいパスワード" >
					</td>
				</tr>
				<tr>
					<td>もっかい入力してねー(○・▽・○)</td>
					<td>
						<input type="password" name="newLoginPassword2" value= "" placeholder= "再確認パスワード" >
					</td>
				</tr>
				<!-- 再設定の文字もtr、tdの中にいれる -->
				<tr>
						<td><s:submit value="再設定" /></td>
				</tr>
				<tr>
				<td>
					<input type="button"  value="戻る" onclick="history.back()">
				</td>
				</tr>
				</tbody>
				</table>
				</s:form>


	</div>


	<footer>© 2017-2018, Sagaone.com</footer>

	<form name="form_test">
		<input type="hidden" name="input_test" value="<s:iterator value="#session.allWordsList" ><s:property /></s:iterator>">
	</form>


</body>
</html>