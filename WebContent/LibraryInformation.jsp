<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Library Information</title>
</head>
<body>

<script type="text/javascript">
function delete_confirm(Title){
		if(window.confirm('确认删除？')){
			window.location.href='Delete.action?Title'+Title;
            return true;
         }
	}
</script>

	<input type="button" value="返回" onclick="javascript:history.go(-1);" />
	<input type="button" value="首页" onclick="javascript:window.location.href='HomePage.jsp'" />

<center>
	<h1>全部图书信息</h1>
	
	<table border="1" width="650" class="BookActionShowLibrary">
		<tr>
			<th>图书编号</th>
			<th>书名</th>
			<th>作者编号</th>
			<th>出版社</th>
			<th>出版日期</th>
			<th>价格</th>
			<th>操作</th>
		</tr>
		
		<s:iterator value="#request.Books">
		<tr>
			<td><s:property value="ISBN"/></td>
			<td>
				<a href="showBookInformation.action?Title=${Title}" >
				<s:property value="Title"/></a>
			</td>
			<td><s:property value="AuthorID"/></td>
			<td><s:property value="Publisher"/></td>
			<td><s:property value="PublishDate"/></td>
			<td><s:property value="Price"/></td>
			<td>
				<input type="button" name="update" value="更新"  onclick="javascript:window.location.href='UpdatePage.jsp?Title=${Title}&Publisher=${Publisher}&PublishDate=${PublishDate}&Price=${Price}'"/>
				<input type="button" name="delete" value="删除"  onclick="if(window.confirm('确认删除？')){window.location.href='Delete.action?Title=${Title}'}"/>
			</td>
		</tr>
		</s:iterator>
		

	</table>
</center>

</body>
</html>
