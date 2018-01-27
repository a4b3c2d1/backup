<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />

<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/header.css">

<script type="text/javascript"
			src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="./slick/slick.min.js"></script>
	 <script type="text/javascript">
	 function yearLi(){
		 var i;
		  for(i=18; i<=99; i++){
			  document.write('<option value="'+i+'">'+i+'</option>');
		  }
	 }
	</script>
<title>クレジットカード更新</title>

<style type="text/css">
		#title{
			height: 100px;
			display: flex;
			align-items: center;
			justify-content: center;
		}
		p.error{
			color: red;
		}

		input[type="button"]{
			background: #4B99AD;
		    padding: 8px 15px 8px 15px;
		    border: none;
		    color: #fff;
		}

		input[type="submit"]{
			background: #4B99AD;
		    padding: 8px 15px 8px 15px;
		    border: none;
		    color: #fff;
		}
		span.red{
			color: red;
		}	
		
		span.blue{
			color: blue;
		}
		
</style>

</head>
<body>

<header>
		<div id="main-logo">
			<a href=' <s:url action= "GoHomeAction" /> '><img src="./css/sagaone_logo.png" height="100px"></a>
		</div>
		<div id="title">クレジットカード再設定</div>
	</header>

<div id="main">
	<s:form action="CardUpdateConfirmAction">
		<table>
			<tbody>
				<p class ="error">
					<s:if test="session.blankMessage != ''">
						<s:property value="session.blankMessage"/>
					</s:if>
				</p>
				
				<tr>
					<td>新しいカード番号</td>
					<td>
						<input type="text" name="cardNumber" placeholder= "14～16桁,数字,スペース,ハイフンなし"<s:if test="session != null"> value="<s:property value="cardNumber"/>"</s:if>size="35">
					</td>
					<td>
						<p class="error">
						<s:if test="errorNumberList != null ">
							<s:iterator value="errorNumberList" var="errorNumber">
							<s:property value="errorNumber" escape="false" />
							</s:iterator>
						</s:if>
						</p>
					</td>
				</tr>
				<tr>
						<td>
							<label>新しい有効期限</label>
						</td>
						
						<td>
							<select name="limitMonth">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8" selected>8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select> 月
						</td>
						</tr>
						<tr>
						<td></td>
						<td>
							<select name="limitYear">
								<script type="text/javascript">
									yearLi();
								</script>
							</select> 年
						</td>
					</tr>
					<tr>
						<td></td>
						<td>カードの表記 <span class="red">12</span>/<span class="blue">18</span> ==> 実際の入力 <span class="red">12</span>月/<span class="blue">18</span>年</td>
					</tr>
					
					<tr>
						<td>
							<label>新しいセキュリティコード</label>
							<!-- 3桁もしくは4桁  -->
						</td>
						<td>
							<input type="text" name="securityNumber" placeholder="数字,3～4桁" <s:if test="session != null"> value="<s:property value="securityNumber"/>"</s:if> size="35">
						</td>
						<td>
								<p class="error">
								<s:iterator value="errorSecurityList" var="errorSecurity">
									<s:property value="errorSecurity" escape="false" />
								</s:iterator>
								</p>
						</td>
					</tr>
	
					<tr>
						<td>
							<label>新しいカード名義人</label>
							<!-- 半角ローマ字  -->
						</td>
						<td>
							<input type="text" name="nominee" placeholder="taro yamada(半角英字)"<s:if test="session != null"> value="<s:property value="nominee"/>"</s:if>size="35">
						</td>
						<td>
							<p class="error">
							<s:if test="errorNomineeList != null ">
								<s:iterator value="errorNomineeList" var="errorNominee">
									<s:property value="errorNominee" escape="false" />
								</s:iterator>
							</s:if>
							</p>
						</td>
					</tr>
				<tr>
						<td><s:submit value="再設定" /></td>
				</tr>
				<tr>
					<td><input id="page" type="button" onclick="location.href=' <s:url action= "MyPageAction" />'"value="戻る"></td>
				</tr>
				</tbody>
				</table>
	</s:form>
</div>
<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>






















