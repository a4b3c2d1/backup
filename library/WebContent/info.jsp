<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>userinfo</title>
</head>
<body>
<s:iterator value="#session.loginuser">
<tr>
<td><s:property value="Id"></s:property>
</td>
<td><s:property value="Login_id"></s:property>
</td>
<td><s:property value="Login_password"></s:property>
</td>
<td><s:property value="Username"></s:property>
</td>
<td><s:property value="lastlogin_time"></s:property>
</td>
<td><s:property value="updated_time"></s:property>
</td>
</tr></s:iterator>
変更したい場合
<s:form action InfochangeAction>
<s:submit value="変更">
</s:submit>
</s:form>
</body>
</html>