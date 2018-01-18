<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<html>
	<head>
		<meta charset="UTF-8">
		<link rel = "stylesheet" type="text/css" href="./css/userCreate.css">
		<title>SAGAONE | マイページ</title>
	</head>

<body>

	<div class= "form-style">
	<s:iterator value="session.myPageDTO" status="st">

		<table id= "myPage">
			<tr><th>氏名：</th><td><s:property value="familyName"/>&thinsp;&thinsp;<s:property value="firstName"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>ふりがな：</th><td><s:property value="familyNameKana"/>&thinsp;&thinsp;&thinsp;<s:property value="firstNameKana"/></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>性別：</th><td><s:if test="sex == 0">男性</s:if><s:if test="sex == 1">女性</s:if></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr><th>メールアドレス：</th><td><s:property value="email" /></td></tr>
			<tr><td class="bar" colspan="6"></td> </tr>

			<tr>
				<th>既定の住所：</th><td><s:property value="#session.myPageAddress.userAddress"/></td></tr>
			<tr><td></td><td></td><td><a id= "page" href= ' <s:url action= "DestinationAction" /> '>&#x1f527;</a>&emsp;&emsp;&emsp;<a id= "page" href= '<s:url action= "GoHomeAction" />'>&#x1f3e0;</a></td></tr>

		</table>
	</s:iterator>

</div>
</body>
</html>

