<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" type="text/css" href="./css/style2.css">
<title>HOME</title>
</head>
<body>
	<header>

	<div id="main-logo">
		<img src="./css/sagaone_logo.png" height="100px">
	</div>



	<s:form action="SearchItemAction">
		<div class= "search-form">
		<select name="itemCategory">
			<option value="0" <s:if test="session.itemCategory == '0' ">selected</s:if> >全てのカテゴリー</option>
			<option value="1" <s:if test="session.itemCategory == '1' ">selected</s:if> >本</option>
			<option value="2" <s:if test="session.itemCategory == '2' ">selected</s:if> >家電・パソコン</option>
			<option value="3" <s:if test="session.itemCategory == '3' ">selected</s:if> >おもちゃ・ゲーム</option>
		</select>
		<input type="text" name="searchWord" value=<s:property value="searchWord"/> />
		</div>
		<s:submit value="検索"/>
	</s:form>


		<div id="header-container">
			<div class="a-btn">
				<s:if test="session.loginUserId != null">
					<a href= '<s:url action="MyPageAction" /> '>マイページ</a>
				</s:if>
			</div>

			<div class="a-btn">
				<s:if test="session == null">
					<a href= '<s:url action="LoginPageAction" />'>ログイン</a>
				</s:if>
			</div>

			<div class="a-btn">
				<s:if test="session.loginUser == null">
					<a href= '<s:url action="LoginPageAction" />'>ログイン</a>
				</s:if>
			</div>


			<div class="a-btn">
				<s:if test="session.loginUser != null">
					<a href= '<s:url action="LogoutAction" />'>ログイン</a>
				</s:if>
			</div>

			<div class="a-btn">
					<a href= '<s:url action="UserCreateAction" />'>新規登録</a>
			</div>



			<div class= "a-btn"><a href= '<s:url action="GoHomeAction" />' >&#x1f3e0;</a></div>
</div>

	</header>
	<br><br><br><br><br><br>

	<s:if test="session.searchErrorMessage != ''">
		'&thinsp;<s:property value="searchWord"/>&thinsp;'&thinsp;の<s:property value="session.searchErrorMessage"/>
	</s:if>

	<s:if test="session.searchErrorMessage == ''">
		<s:iterator value="session.searchItemList" status="st">
				<table>
					<tbody>
					<tr>
						<s:form action="ItemdetailAction">
							<td><input type="hidden" name="id" value="<s:property value='id' />"></input></td>
							<td><input type="hidden" name="category_id" value="<s:property value='categoryId' />"></input></td>
							<td><input type="image" src="<s:property value="imageFilePath"/>" width=auto height="100" /></td>
						</s:form>
						<td>
							<p>商品名:&nbsp;<s:property value="productName"/></p>
							<p>説明:&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;&thinsp;<s:property value="productDescription"/></p>
							<p>会社:&nbsp;&nbsp;<s:property value="releaseCompany" /></p>
							<p>価格:&nbsp;&nbsp;<s:property value="price" />円</p>
							<p>発売日:&nbsp;&nbsp;<s:property value="releaseDate" /></p>
						</td>

					</tr>
					</tbody>
				</table>
		</s:iterator>
	</s:if>

</body>
</html>