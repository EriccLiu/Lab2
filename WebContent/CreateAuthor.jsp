<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Create Author Page</title>
</head>
<body>
<%
	
%>
	<input type="button" value="返回上一级" onclick="javascript:history.go(-1);" />
	<input type="button" value="首页" onclick="javascript:window.location.href='HomePage.jsp'" />

<center>
	<h1>添加作者</h1>

	<s:form name="createAuthor" action="createAuthor">
		<s:hidden name="Title" value="%{#parameters.Title}" />
		<s:textfield name="AuthorID" label="AuthorID" />
		<s:textfield name="Name" value="%{#parameters.Name}" label="Name" />
		<s:textfield name="Age" label="Age" />
		<s:textfield name="Country" label="Country" />
		<s:submit value="添加"/>
	</s:form>
</center>

</body>
</html>