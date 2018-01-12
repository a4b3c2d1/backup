<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
</head>
<body>

<s:form action="SearchItemAction">
	<select name="itemCategory">
		<option value="0">全てのカテゴリー</option>
		<option value="1">本</option>
		<option value="2">家電・パソコン</option>
		<option value="3">おもちゃ・ゲーム</option>
	</select>
	<input type="text" name="searchWord" />
	<s:submit value="検索"/>
</s:form>


<s:if test="session.loginUser != null">
	<s:iterator value="session.loginUser">
		<s:property value="loginId"/>でログイン中
	</s:iterator>
</s:if>

<s:if test="session == null">
	<s:form action="LoginPageAction">
		<s:submit value="ログイン画面へ" />
	</s:form>
</s:if>

<s:if test="session.loginUser == null">
	<s:form action="LoginPageAction">
		<s:submit value="ログイン画面へ" />
	</s:form>
</s:if>

<s:if test="session.loginUser != null">
	<s:form action="MyPageAction">
		<s:submit value="マイページ" />
	</s:form>
</s:if>


<s:if test="session.loginUser != null">
	<s:form action="LogoutAction">
		<s:submit value="ログアウト" />
	</s:form>
</s:if>

<s:form action="UserCreateAction">
	<s:submit value="ユーザー登録" />
</s:form>

<s:form action="ItemAction">
	<s:submit value="商品一覧" />
</s:form>

<s:form action="CartAction">
	<s:hidden name="cartFlg" value="1"></s:hidden>
	<s:submit value="カート確認" />
</s:form>

<s:form action="PaymentAction">
	<s:submit value="決済" />
</s:form>

</body>
</html>