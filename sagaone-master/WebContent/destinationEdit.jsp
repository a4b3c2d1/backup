<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宛先情報変更</title>
</head>
<body>
<div>
	<div>
		<s:form action="DestinationCreateConfirmAction">
			<table>
				<tr>
					<td>姓</td>
					<td><input type="text" name="familyName" value="<s:property value="#session.familyName" />"></td>
				</tr>
				<%-- エラーメッセージをiteratorで表示 --%>
				<s:if test="errorFamilyNameList != null">
					<tr><td colspan="2">
						<s:iterator value="errorFamilyNameList" var="errorFamilyName">
							<s:property value="errorFamilyName" /><br>
						</s:iterator></td>
					</tr>
				</s:if>
				<tr>
					<td>名</td>
					<td><input type="text" name="firstName" value="<s:property value="#session.firstName" />"></td>
				</tr>
				<s:if test="errorFirstNameList != null">
					<tr>
					<td colspan="2">
						<s:iterator value="errorFirstNameList" var="errorFirstName">
							<s:property value="errorFirstName" /><br>
						</s:iterator>
					</td>
					</tr>
				</s:if>
				<tr>
					<td>姓ふりがな</td>
					<td><input type="text" name="familyNameKana" value="<s:property value="#session.familyNameKana" />"></td>
				</tr>
				<s:if test="errorFamilyNameKanaList != null">
					<tr>
					<td colspan="2">
						<s:iterator value="errorFamilyNameKanaList" var="errorFamilyNameKana">
							<s:property value="errorFamilyNameKana" /><br>
						</s:iterator>
					</td>
					</tr>
				</s:if>
				<tr>
					<td>名ふりがな</td>
					<td><input type="text" name="firstNameKana" value="<s:property value="#session.firstNameKana" />" ></td>
				</tr>
				<s:if test="errorFirstNameKanaList != null">
					<tr>
					<td colspan="2">
						<s:iterator value="errorFirstNameKanaList" var="errorFirstNameKana">
							<s:property value="errorFirstNameKana" /><br>
						</s:iterator>
					</td>
					</tr>
				</s:if>
				<tr>
					<td>性別</td>
					<td>
							<input type="radio" name="sex" value="0" <s:if test="#session.sex == 0"> checked="checked"</s:if>>男性
							<input type="radio" name="sex" value="1" <s:if test="#session.sex == 1"> checked="checked"</s:if>>女性
					</td>
				</tr>
				<tr>
					<td>住所</td>
					<td><input type="text" name="userAddress" value='<s:property value="#session.userAddress" />'></td>
				</tr>
				<s:if test="errorUserAddressList != null">
					<tr>
					<td colspan="2">
						<s:iterator value="errorUserAddressList" var="errorUserAddress">
							<s:property value="errorUserAddress" /><br>
						</s:iterator>
					</td>
					</tr>
				</s:if>
				<tr>
					<td>電話番号</td>
					<td><input type="text" name="telNumber" value='<s:property value="#session.telNumber" />'></td>
				</tr>
				<s:if test="errorTelNumberList != null">
					<tr>
					<td colspan="2">
						<s:iterator value="errorTelNumberList" var="errorTelNumber">
							<s:property value="errorTelNumber" /><br>
						</s:iterator>
					</td>
					</tr>
				</s:if>
				<tr>
					<td>メール</td>
					<td><input type="text" name="email" value='<s:property value="#session.email" />'></td>
				</tr>
				<s:if test="errorEmailList != null">
					<tr>
					<td colspan="2">
						<s:iterator value="errorEmailList" var="errorEmail">
							<s:property value="errorEmail" /><br>
						</s:iterator>
					</td>
					</tr>
				</s:if>
				<tr>
					<s:submit value="この内容で変更" />
				</tr>
			</table>
		<div>
			<p><a href='<s:url action="MyPageAction" />'>マイページへ戻る</a></p>
		</div>
		</s:form>
	</div>
</div>
</body>
</html>