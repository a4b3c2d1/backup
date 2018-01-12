<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAYMENT</title>
</head>
<body>

<!--PaymentAction-->
<s:iterator value="session.paymentUserInfoDTO">
	<p><s:property value="userId"/></p>
	<p><s:property value="familyName"/><s:property value="firstName"/></p>
	<p><s:property value="familyNameKana"/><s:property value="firstNameKana"/></p>
	<p><s:property value="sex"/></p>
	<p><s:property value="email"/></p>
	<p><s:property value="telNumber"/></p>
</s:iterator>

<s:iterator value = "session.userAddressDTO">
	<p><s:property value = "userAddress"/></p>
</s:iterator>


<s:iterator value = "#session.productDTOList">
	<p><s:property value = "productName"/><s:property value = "productNameKana"/></p>
	<p><s:property value = "categoryId"/></p>
	<p><s:property value = "price"/></p>
	<p><s:property value = "productCount"/></p>
		<p><s:property value = "totalPrice"/></p>
	<p><s:property value = "releaseDate"/></p>
	<p><s:property value = "releaseCompany"/></p>
	<p><s:property value = "imageFilePath"/></p>
	<img src='<s:property value="imageFilePath" />' alt='<s:property value="imageFileName" />' style=" width:100px; height: 100px;" >
</s:iterator>

<s:form action="PaymentCompleteAction">
	<s:submit value="購入確定"/>
</s:form>

<div>
	<p><a href='<s:url action="DestinationCreateAction" />' >宛先登録はこちらから</a></p>
</div>

</body>
</html>