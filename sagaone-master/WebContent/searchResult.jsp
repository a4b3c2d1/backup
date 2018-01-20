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

		<a href= ' <s:url action= "GoHomeAction" /> '><img src="./css/sagaone_logo.png" alt= "logo"></a>
	</div>

	<div id="menu">
			<div id="search-form">

			<s:form action="SearchItemAction">
				<div id="search-box">
					<select name="itemCategory" id="category">
						<option value="0">全てのカテゴリー</option>
						<option value="1">本</option>
						<option value="2">家電・パソコン</option>
						<option value="3">おもちゃ・ゲーム</option>
						<option value= "4">おもちゃ・ぬいぐるみ</option>
					</select>
					<input type="text" name="searchWord" id="search"/>
				</div>
				<div class="search-btn">
				<input type="image" src="./css/searchIcon.png" width="20" height="20" class="icon"/>
				</div>
			</s:form>
		</div>


		<div id="header-container">
			<div class="header-menu">
				<s:if test="session.loginUserId != null">
						<s:property value="#session.loginUserId"/>でログイン中
				</s:if>
			</div>

				<li class= "ex"><div class="home-btn">
					<a href=' <s:url action= "GoHomeAction" />'>&#x1f3e0;</a>
				</div>
				</li>
							<ul id= "normal" class="dropmenu">

				<li class= "ex">アカウントメニュー
					<ul>

						<s:if test="session.loginUserId != null">
							<li>
								<s:form action="MyPageAction">
									<s:submit value="マイページ" cssClass="b-btn"/>
								</s:form>
							</li>
						</s:if>

						<s:if test="session == null">
							<li>
								<s:form action="LoginPageAction">
									<s:submit value="ログイン画面へ" cssClass="b-btn"/>
								</s:form>
							</li>
						</s:if>

						<s:if test="session.loginUser == null">
							<li>
								<s:form action="LoginPageAction">
									<s:submit value="ログイン画面へ" cssClass="b-btn"/>
								</s:form>
							</li>
						</s:if>


						<li>
							<s:form action="UserCreateAction">
								<s:submit value="ユーザー登録" cssClass="b-btn"/>
							</s:form>
						</li>

						<li>
							<s:form action="ItemAction">
								<s:hidden name="offset" value="0"></s:hidden>
								<s:submit value="商品一覧" cssClass="b-btn"/>
							</s:form>
						</li>

						<li>
							<s:form action="CartAction">
								<s:hidden name="cartFlg" value="1"></s:hidden>
								<s:submit value="カート確認" cssClass="b-btn"/>
							</s:form>
						</li>

						<li>
							<s:form action="PaymentAction">
								<s:submit value="決済" cssClass="b-btn"/>
							</s:form>
						</li>
					</ul>
				</li>

			</ul>

							<li class= "ex"><s:if test="session.loginUser != null">
								<a class= "home-btn-logout" href= ' <s:url action= "LogoutAction" />'>&#x1f6aa;</a>
						</s:if></li>



		</div>
	</div>
	</header>



	<br><br><br><br><br><br><br>

	<a href= ' <s:url action= "SortSearchAction" /> '>価格の安い順に並び替え</a>

	<s:if test="session.searchErrorMessage != ''">
		'&thinsp;<s:property value="searchWord"/>&thinsp;'&thinsp;の<s:property value="session.searchErrorMessage"/>
	</s:if>

	<s:if test="session.searchErrorMessage == ''">
		<s:iterator value="session.searchItemList" status="st">

		&#x1f50d;   &#x1f3e0;
				<table>
					<tbody>
					<tr>
						<s:form action="ItemDetailAction">
							<td><input type="hidden" name="product_id" value="<s:property value='productId' />"></input></td>
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
	<s:iterator value="pageNumList" status="status">
		<a href= ' <s:url action= "SearchItemAction" /> '><s:param name="pageNum" value="#status.index" /><s:property/></a>
	</s:iterator>

	</s:if>

</body>
</html>

