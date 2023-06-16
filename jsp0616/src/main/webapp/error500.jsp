<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--에러 예외저리-->
<%@ page isErrorPage ="true"%> <!--에러일때 쓰는 페이지가 맞다는 뜻  -->
<% response.setStatus(200);%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error404</title>
		<style>
			*{margin:0; padding: 0;}
			div{width: 500px; height: 180px; padding: 30px; margin: 50px auto; border: 1px solid #efefef;}
			img{width: 500px;}
		</style>
	</head>
	
	
	<body>
		<div>
			<a href="main.jsp"><img src="images/error500.png"></a>
		</div>
	</body>
</html>