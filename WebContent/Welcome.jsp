<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Welcome Page</title>
</head>
<body>

	<center>
<h1>欢迎来到我的图书管理系统</h1>
	
	<script>
		function validateUser(){
			var username=document.form.username.value;
			if(username=="")
				alert("请输入用户名！");
		}
	</script>
	

	<s:form name="form" action="login">
		<s:textfield name="username" label="username" />
		<s:password name="password" label="password" />
		<s:submit value="log in" onclick="validateUser();"/>
	</s:form>
	</center>
	
</body>
</html>