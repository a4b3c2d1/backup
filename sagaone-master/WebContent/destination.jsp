<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宛先情報</title>
</head>
<body>
<div>
	<div>
	新規作成
	<a href='<s:url action="DestinationCreateAction" />'>新規作成</a>
	</div>
	<div>
	既定の住所
	destinationDTOListのstatus="1"の宛先情報
			<table>
				<tr>
					<td>姓</td>
					<td><s:property value="familyName" /></td>
				</tr>
				<tr>
					<td>名</td>
					<td><s:property value="firstName" /></td>
				</tr>
				<tr>
					<td>姓ふりがな</td>
					<td><s:property value="familyNameKana" /></td>
				</tr>
				<tr>
					<td>名ふりがな</td>
					<td><s:property value="firstNameKana" /></td>
				</tr>
				<tr>
					<td>メール</td>
					<td><s:property value="email" /></td>
				</tr>
				<tr>
					<td>住所</td>
					<td><s:property value="userAddress" /></td>
				</tr>
				<tr>
					<td>電話番号</td>
					<td><s:property value="telNumber" /></td>
				</tr>
			</table>
			<s:submit value="登録" />
	</div>
	<div>
	ほかの登録済み住所
	destinationDTOListのstatus="1"の宛先情報をiteratorで表示
		<s:iterator value="destinationDTOList">
			<table>
				<tr>
					<td>姓</td>
					<td><s:property value="familyName" /></td>
				</tr>
				<tr>
					<td>名</td>
					<td><s:property value="firstName" /></td>
				</tr>
				<tr>
					<td>姓ふりがな</td>
					<td><s:property value="familyNameKana" /></td>
				</tr>
				<tr>
					<td>名ふりがな</td>
					<td><s:property value="firstNameKana" /></td>
				</tr>
				<tr>
					<td>メール</td>
					<td><s:property value="email" /></td>
				</tr>
				<tr>
					<td>住所</td>
					<td><s:property value="userAddress" /></td>
				</tr>
				<tr>
					<td>電話番号</td>
					<td><s:property value="telNumber" /></td>
				</tr>
			</table>
		</s:iterator>
			<s:submit value="登録" />
	</div>

</div>

</body>
</html>