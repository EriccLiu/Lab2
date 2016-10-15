<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8"> 
<title>菜鸟教程(runoob.com)</title> 
</head>
<body>
	
<h1>This is my first web page by javascript</h1>
<p id="demo">first paragraph</p>
	<script>
	function fun_1(){
		document.getElementById("demo").innerHTML="not first paragraph。";
	}
	function fun_2(){
		document.getElementById("demo").innerHTML="first paragraph。";
	}
	</script>
	
	<button onclick="fun_1()" >button1</button>
	<button onclick="fun_2()">button2</button>
	<button onclick>button3</button>
	
	<p></br>This is paragraph 2</p>
	
</body>
</html>