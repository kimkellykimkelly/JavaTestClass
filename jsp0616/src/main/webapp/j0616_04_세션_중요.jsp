<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션</title>
	</head>
	
	<body>
	<!-- 나중에 세션은 jsp가 아닌 db(server)에서 받음 -->
	
	<%
		session.setAttribute("sessionId", "admin");
		session.setAttribute("sessionNickName", "솔");
		session.setAttribute("sessionName", "김은솔");
	%>
	
	<a href = "session_get.jsp"> 세션 읽어오기 </a>
	
	
	
	
	</body>
</html>