<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<link rel="stylesheet" type="text/css" href="./css/style.css">
	
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
<title>クレジットカード登録画面</title>
<style type="text/css">
		p.error{
			color: red;
		}
		
		#title{
			
			height: 100px;
			display: flex;
			align-items: center;
			justify-content: center;
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
			<img src="./css/sagaone_logo.png" height="100px">
		</div>
		<div id="title">クレジットカード登録</div>
	</header>
	
	<div id="main">
		<table>
				<s:form action="CardCreateConfirmAction">
				
				<p class ="error">
					<s:if test="session.blankMessage != ''">
						<s:property value="session.blankMessage"/>
					</s:if>
				</p>
					<tr>
						<td>
							<label>ログインID</label>
						</td>
						<td>
							<input type="text" name="userId" value= '<s:property value= "#session.checkedLoginUserId" />' placeholder= "ログインID" >
						</td>
						<td>
							<p class="error">
							<s:if test="errorIdList != null ">
							<s:iterator value="errorIdList" var="errorId">
								<s:property value="errorId" escape="false" />
							</s:iterator>
							</s:if>
							</p>
						</td>
					</tr>
					<tr>
						<td>
							<label>カード番号</label>
						</td>
						<td>
							<input type="text" name="cardNumber" placeholder="例）1234123412341234（スペース,ハイフンなし）" <s:if test="session != null"> value="<s:property value="cardNumber"/>"</s:if>>
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
							<label>有効期限</label>
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
							<label>セキュリティコード</label>
							<!-- 3桁もしくは4桁  -->
						</td>
						<td>
							<input type="text" name="securityNumber" placeholder="例）123" <s:if test="session != null"> value="<s:property value="securityNumber"/>"</s:if> >
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
							<label>カード名義人</label>
							<!-- 半角ローマ字  -->
						</td>
						<td>
							<input type="text" name="nominee" placeholder="例）taro yamada"<s:if test="session != null"> value="<s:property value="nominee"/>"</s:if>>
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
						<td><s:submit value="登録"/></td>
					</tr>
				
				</s:form>
					<tr>
						<td><input type="button"  value="戻る" onclick="history.back()"></td>
					<tr>
			</table>
	</div>
	
	<footer>© 2017-2018, Sagaone.com</footer>
</body>
</html>