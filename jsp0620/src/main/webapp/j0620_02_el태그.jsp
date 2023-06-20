<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>el태그는 간편하지만 <% %> 안에 쓸 수 없어서 if, for문 사용 불가능!=>jstl사용 </title>
	</head>
	
	<body>
	
		<% out.println(1+2); %>
		<%= 1+2 %>
		${1+2}
		${1*2} 
		${3/2} 
		
		<% request.getParameter("id"); %>
		${param.id}

		<% session.getAttribute("sessionId"); %>
		${sessionScope.sessionId}
		${sessionId}
	
	</body>
</html>