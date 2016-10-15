<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Book Information</title>
</head>
<body>

<script type="text/javascript">
	function delete_confirm(){
		if(window.confirm('确认删除？')){
			window.location.href='Delete.action?Title=${Title}';
            return true;
         }
	}

</script>

	<input type="button" value="返回" onclick="javascript:history.go(-1);" />
	<input type="button" value="首页" onclick="javascript:window.location.href='HomePage.jsp'" />

<center>
	
	<table border="1" width="400">
	<caption>图书查询结果</caption>
	
	<tr align="center">
		<td>图书编号</td>
		<td><s:property value="ISBN" /></td>
	</tr>
	<tr align="center">
		<td>书名</td>
		<td><s:property value="Title" /></td>	
	</tr>
	<tr align="center">
		<td>作者编号</td>
		<td><s:property value="AuthorID" /></td>
	</tr>
	<tr align="center">
		<td>出版社</td>
		<td><s:property value="Publisher" /></td>
	</tr>
	<tr align="center">
		<td>出版日期</td>
		<td><s:property value="PublishDate" /></td>
	</tr>
	<tr align="center">
		<td>价格</td>
		<td><s:property value="Price" /></td>
	</tr>
	
	</table>
	
	<input type="button" name="update" value="更新"  onclick="javascript:window.location.href='UpdatePage.jsp?Title=${Title}&Publisher=${Publisher}&PublishDate=${PublishDate}&Price=${Price}'"/>
	<input type="button" name="delete" value="删除"  onclick="delete_confirm();"/>
</center>

</body>
</html>