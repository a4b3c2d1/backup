<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAYMENT CONFIRM</title>
</head>
<body>

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

	<a href='<s:url action="PaymentCompleteAction" />' >購入完了</a>
</body>
</html>