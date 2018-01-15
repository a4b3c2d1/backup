<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAYMENT CHOICE</title>
</head>
<body>

<s:iterator value="session.paymentUserInfoDTO">
	<p><s:property value="userId"/></p>
	<p><s:property value="familyName"/><s:property value="firstName"/></p>
	<p><s:property value="familyNameKana"/><s:property value="firstNameKana"/></p>
	<s:if test="sex == 0"><p>男性</p></s:if>
	<s:if test="sex == 1"><p>女性</p></s:if>
	<p><s:property value="email"/></p>
	<p><s:property value="telNumber"/></p>
</s:iterator>
<s:property value="session.choicedAddress"/>

<s:form action="PaymentConfirmAction">
	<input type="radio" name="payMethod" value="0" checked="checked">クレジットカード
	<input type="radio" name="payMethod" value="c">現金
	<s:submit value="購入確認へ" />
</s:form>

</body>
</html>