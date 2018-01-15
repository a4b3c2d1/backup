<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧</title>
</head>
<body>
	<s:a href="GoHomeAction">ホームへ戻る</s:a>
	<p>
		<s:if test='%{addFlg =="1"}'>カートに入りました！
		<s:iterator value="#session.itemdetailDTOList">
				<s:form action="ItemDetailAction">
					<tr>
						<td><s:property value="product_name" />
						<td><input type="hidden" name="product_id"
							value="<s:property value='product_id' />"></input></td>
						<td><input type="hidden" name="category_id"
							value="<s:property value='category_id' />"></input></td>
						<td><input type="image"
							src="<s:property value="image_file_path"/>" width=auto
							height="100" /></td>
					</tr>
				</s:form>
			</s:iterator>


			<s:a href="CartAction?cartFlg=1">カート編集へ</s:a>
			<s:a href="PaymentAction">決済へ</s:a>

		</s:if>
	</p>


	<p>
		<s:iterator value="#session.itemDTOList">
			<s:form action="ItemDetailAction">
				<tr>
					<td><s:property value="product_name" />
					<td><s:property value="product_name_kana" />
					<td><img src=<s:property value="image_file_path"/> width=auto
						height="100"></td>
					<td><s:property value="price" />円</td>
					<td><input type="hidden" name="product_id"
						value="<s:property value='product_id' />"></input></td>
					<td><input type="hidden" name="category_id"
						value="<s:property value='category_id' />"></input></td>
					<s:submit value="商品詳細"></s:submit>
				</tr>
				<br>
			</s:form>
		</s:iterator>
	</p>


</body>
</html>