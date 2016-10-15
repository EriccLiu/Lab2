<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Home Page</title>
</head>
<body>


	<input type="button" value="返回" onclick="javascript:history.go(-1);" />
	
<center>
	<h1>图书查找</h1>
	<center>
	<s:form name="queryBook" action="showBookInformation">
		<s:textfield name="Title" label="请输入书名" />
		<s:submit value="查找"/>
	</s:form> 
	<br></br>
	</center>
	<center>
	<s:form name="queryAuthor" action="showAuthorInformation">	
		<s:textfield name="Name" label="请输入作者名" />
		<s:submit value="查找"/>
	</s:form>
	</center>
	<br></br>
		<input type="button" value="显示全部图书信息" onclick="location.href='showLibrary.action'"/>
		<input type="button" value="添加图书" onclick="javascript:window.location.href='CreateBook.jsp'"/>
</center>

</body>
</html>