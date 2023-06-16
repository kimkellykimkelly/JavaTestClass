<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title>
	</head>
	
	
	<body>
		<h2>1번째 페이지입니다</h2>
		<!-- page 이동하는 3가지 방법 -->
		<script>location.href="top.jsp";</script> <!-- 주소가 바뀜 -->
		<% response.sendRedirect("top.jsp"); %> <!-- 주소가 바뀜 -->
		<jsp:forward page="top.jsp" /> <!-- 주소가 안바뀜 -->
	</body>
</html>