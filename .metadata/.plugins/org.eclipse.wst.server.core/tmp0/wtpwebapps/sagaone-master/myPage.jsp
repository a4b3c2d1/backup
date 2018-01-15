<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>SAGAONE | マイページ</title>
</head>
<body>
	<s:iterator value="session.myPageDTO" status="st">
		<table>
			<tbody>
			<tr>
				<td>
					<p>氏名:&nbsp;<s:property value="familyName"/>&thinsp;<s:property value="firstName"/></p>
					<p>ふりがな:&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;<s:property value="familyNameKana"/>&thinsp;<s:property value="firstNameKana"/></p>
					<p>性別:&nbsp;&nbsp;<s:if test="sex == 0">男性</s:if><s:if test="sex == 1">女性</s:if></p>
					<p>メールアドレス:&nbsp;&nbsp;<s:property value="email" /></p>
				</td>
			</tr>
			<tr>
				<td>
					<p>既存の住所:<s:property value="#session.myPageAddress.userAddress"/>
				</td>
				<td><a id="b-btn" href='<s:url action="DestinationCreateAction" />' >住所の設定</a></td>
			</tr>
			</tbody>
		</table>
	</s:iterator>
<a id="goHome-btn" href='<s:url action="GoHomeAction" />' >ホーム</a>
</body>
</html>
