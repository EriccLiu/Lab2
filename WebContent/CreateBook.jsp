<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Create Book Page</title>
</head>
<body>

	<input type="button" value="返回" onclick="javascript:history.go(-1);" />
	<input type="button" value="首页" onclick="javascript:window.location.href='HomePage.jsp'" />

<center>
	<h1>创建图书</h1>

	<s:form name="createBook" action="createBook">
		<s:textfield name="ISBN" label="ISBN" />
		<s:textfield name="Title" label="Title" />
		<s:textfield name="AuthorID" label="AuthorID" />
		<s:textfield name="Publisher" label="Publisher" />
		<s:textfield name="PublishDate" label="PublishDate" />
		<s:textfield name="Price" label="Price" />		
		<s:submit value="创建"/>
	</s:form>
</center>
	

</body>
</html>