<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user</title>
</head>
<body>
	<s:form action="">
		<s:submit value="貸出">
		</s:submit>
	</s:form>

	<s:form action="">
		<s:submit value="返却">
		</s:submit>
	</s:form>
	<s:form action="">
		<s:submit value="利用者情報">
		</s:submit>
	</s:form>
	<s:form action="UsercreateAction">
		<s:submit value="利用者登録">
		</s:submit>
	</s:form>
	<s:form action="MainpagebackAction">
		<s:submit value="戻る">
		</s:submit>
	</s:form>
</body>
</html>