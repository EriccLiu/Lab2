<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Update Page</title>
</head>
<body>

	<input type="button" value="返回" onclick="javascript:history.go(-1);" />
	<input type="button" value="首页" onclick="javascript:window.location.href='HomePage.jsp'" />
	
	<%
		String Title= request.getParameter("Title");
	%>

<center>
	<h1>更新信息</h1>
	
	<p>Title:<%out.println(Title); %></p>
	
	<s:form name="updateAuthor" action="Update">		
		<s:hidden name="Title" 				value="%{#parameters.Title}" 		/>
		<s:textfield name="newName"			label="AuthorName" 					/>
		<s:textfield name="newPublisher" 	value="%{#parameters.Publisher}" 	label="Publisher"	/>
		<s:textfield name="newPublishDate"	value="%{#parameters.PublishDate}"	label="PublishDate" />
		<s:textfield name="newPrice" 		value="%{#parameters.Price}"		label="Price" 		/>		
		<s:submit value="更新" />	
	</s:form>
</center>

</body>
</html>