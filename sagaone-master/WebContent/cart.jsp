<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート確認</title>
</head>
<body onload="allPrice();">
	<div>
		<s:if test="cartList == null">
			<h3>カートは空です</h3>
		</s:if>
		<s:elseif test="message == null">
		<h3>カート詳細</h3>
		<table>
			<tr>
				<th>選択</th>
				<th>商品名</th>
				<th>よみがな</th>
				<th>商品画像</th>
				<th>値段</th>
				<th>購入個数</th>
				<th>製造会社</th>
				<th>発売日</th>
				<th>追加日</th>
				<th>合計金額</th>
			</tr>
			<s:form action="CartAction">
				<s:iterator value="cartList">
					<tr>
						<td><s:checkbox name="checkboxList" value="checked"
								fieldValue="%{id}" /></td>
						<td><s:property value="productName" /></td>
						<td><s:property value="productNameKana" /></td>
						<td><img src="<s:property value="imageFilePath" />"
							height="200"></td>
						<td><s:property value="price" />円</td>
						<td><s:property value="count" />個</td>
						<td><s:property value="releaseCompany" /></td>
						<td><s:property value="releaseDate" /></td>
						<td><s:property value="registDate" /></td>
						<td><span id="total"><s:property value="totalCount"/></span>円</td>
					</tr>
				</s:iterator>
				<tr>
					<td><input type="hidden" name="deleteFlg" value="1"> <s:submit
							value="選択した項目を削除" /></td>
				</tr>
			</s:form>
		</table>
		</s:elseif>
		<div id="text-right">
			<p>
				Homeへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
			</p>
		</div>
	</div>
	<div id="footer"></div>
			カート内合計金額:<span id="allPrice">0</span>円
	<script>
		function allPrice(){
			int total = document.getElementById('total').innerHTML;
			int allPrice += total;
			document.getElementById('allPrice').innerHTML = allPrice;
		}
	</script>
</body>
</html>