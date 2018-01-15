<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カート確認</title>
<link rel="stylesheet" type="text/css" href="./css/cart.css">
</head>
<body onload="allPrice();">
	<div>
		<s:if test="cartList == null">
			<h3>カートは空です</h3>
		</s:if>
		<s:elseif test="message == null">
			<h3>カート詳細</h3>
			<table border="1">
				<s:form action="CartAction">
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
					<s:iterator value="cartList">
						<tr>
							<td><s:checkbox name="checkboxList" value="checked"
									fieldValue="%{id}" /></td>
							<td><s:property value="productName" /></td>
							<td><s:property value="productNameKana" /></td>
							<td><img src="<s:property value="imageFilePath" />"
								height="100"></td>
							<td><s:property value="price" />円</td>
							<td><s:property value="count" />個</td>
							<td><s:property value="releaseCompany" /></td>
							<td><s:property value="releaseDate" /></td>
							<td><s:property value="registDate" /></td>
							<td><s:property value="totalCount" />円</td>
						</tr>
					</s:iterator>
					<input type="hidden" name="deleteFlg" value="1">
					<s:submit value="選択した項目を削除" />
				</s:form>
			</table>
		</s:elseif>
		<s:form action="CartAction">
			<s:if test="cartList != null">
			カート内合計金額:<s:property value="allPrice" />円<br>
				<s:if test="cartJugde == null">
					<a href='<s:url action="LoginPageAction" />'>決済に進むにはログインしてください</a>
				</s:if>
				<s:elseif test="cartJugde == 1">
					<a href='<s:url action="PaymentAction" />'>決済へ進む</a>
				</s:elseif>
			</s:if>
		</s:form>
		<div id="text-right">
			<p>
				Homeへ戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>
			</p>
		</div>
	</div>
	<div id="footer"></div>
	<script type="text/javascript">
		function allcheck(tf) {
			var ElementsCount = document.all.elements.length; // チェックボックスの数
			for (i = 0; i < ElementsCount; i++) {
				document.all.elements[i].checked = tf; // ON・OFFを切り替え
			}
		}
	</script>
</body>
</html>