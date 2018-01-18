<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAYMENT</title>
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" type="text/css" href="./css/style.css">

<style type="text/css">


a:visited {
	color: #0066c0;
	text-decoration: none
}

#main {
	margin-top: 100px;
	margin-bottom: 60px;
	min-height: 100%;
	height: auto !important;
	height: 100%;
	position: relative;
	width:100%
}

.main1 {
	margin: 150px;

}

.main1 h1 {
	margin-right: 20px;
}

.main1 h2 {
	color: #B12704;
	margin-right: 20px;
}

#a {
	float: left;
	margin-right: 30px;
}

#b {
	border-style: solid;
	border-color: #999;
	porder: 1px;
	padding: 20px;
	float: right;
	margin-right: 150px;
}

.main2 {
	clear: both;
	margin: 50px;
}

.main2 ul {
	list-style: none;
}

.rating {
	position: relative;
	width: 5em;
	height: 1em;
	font-size: 20px;
}

.rating-front {
	position: absolute;
	top: 0;
	left: 0;
	overflow: hidden;
	color: #ffcc33;
}

.rating-back {
	color: #ccc;
}

.main3 {
	margin: 50px;
}

.main3 p {
	float: left;
	margin: 30px;
}

#info:hover {
	color: #9aa132;
	cursor: pointer;
	text-decoration: underline;
}

.main4 {
	clear: both;
}

.a:hover {
	color: #eb1515;
	cursor: pointer;
	text-decoration: underline;
}
</style>
</head>
<body>
	<header>

	<div id="main-logo">
		<img src="./css/sagaone_logo.png" height="100px">
	</div>


	</header>
</head>
<body>

<!--PaymentAction-->

<div id = "main">
	<div id = "sub">
		<s:if test = "cartInfoList == null">
		<h3>カートに商品が入っていません</h3>
		</s:if>
	</div>
	<s:if test = "cartInfoList == null">
		<s:iterator value="session.paymentUserInfoDTO">
		<p><s:property value="userId"/></p>
		<p><s:property value="familyName"/><s:property value="firstName"/></p>
		<p><s:property value="familyNameKana"/><s:property value="firstNameKana"/></p>
		<s:if test="sex == 0"><p>男性</p></s:if>
		<s:if test="sex == 1"><p>女性</p></s:if>
		<p><s:property value="email"/></p>
		<p><s:property value="telNumber"/></p>
		</s:iterator>

	<s:iterator value = "#session.addressDTOList" status="st">
		<p><s:property value = "userAddress"/></p>
		<a href='<s:url action="PaymentAddressChoiceAction" ><s:param name="adNum" value="#st.index"/></s:url>' >この住所を使う</a>
	</s:iterator>


	<s:iterator value = "#session.productDTOList">
		<p><s:property value = "productName"/><s:property value = "productNameKana"/></p>
		<p><s:property value = "categoryId"/></p>
		<p><s:property value = "price"/></p>
		<p><s:property value = "productCount"/></p>
		<p><s:property value = "totalPrice"/></p>
		<p><s:property value = "releaseDate"/></p>
		<p><s:property value = "releaseCompany"/></p>
		<img src='<s:property value="imageFilePath" />' alt='<s:property value="imageFileName" />' style=" width:100px; height: 100px;" >
	</s:iterator>


		<p>合計金額:<s:property value="#session.sumPrice"/>円</p>


	<div>
		<p><a href='<s:url action="DestinationCreateAction" />' >宛先登録はこちらから</a></p>
	</div>

	</s:if>
</div>

<div>
	<p><a href = '<s:url action = "GoHomeAction"/>'>Homeへ戻る</a></p>
</div>

</body>
</html>