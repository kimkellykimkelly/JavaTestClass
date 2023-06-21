<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL위해 필요=>for,if 등 사용가능! -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member</title>
	</head>
	
	<body>
	 
	 <c:forEach var="member" items="${list}"> <!-- 게시글 수만큼 반복됨 -->
		 <h3>아이디: ${member.id}</h3>
		 <h3>패스워드: ${member.pw}</h3>
		 <h3>이름: ${member.name}</h3>
		 
		 <br>	 
	 </c:forEach>
	 	


	  
	</body>
</html>