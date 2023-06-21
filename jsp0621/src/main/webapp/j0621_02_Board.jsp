<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL위해 필요=>for,if 등 사용가능! -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %> <!-- 타입 바꾸기 위해 필요하지만 잘 쓰이지 않음. -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
	</head>
	<body>
	
	<!--변수 선언 및 출력  -->
	  <c:set var="varName" value="홍길동" /> <!--변수 선언 -->
	  <h3>이름: <c:out value="${varName} }"/></h3> <!-- 변수 출력  -->
	  <h3>이름: ${varName} </h3> <!-- 위와 똑같은 결과  --> 
	  
	  <% String name = "이순신"; %>
	  <h3>스크립트릿 이름: ${name} </h3> <!-- 결과 안나옴(el태그는 스크립트릿 안먹힘) --> 
	  
	  <hr>
	  
	<!-- if -->  
	  <c:if test="${varName == '홍길동'}">
	  	<h2>정답입니다. 홍길동</h2>
	  </c:if>
	  <c:if test="${varName != '홍길동'}">
	  	<h2>오답입니다. ${varName} 입니다.</h2>
	  </c:if>
	  
	  <hr>
	  <!-- 위와 같은 내용을 스크립트릿으로 쓰기  -->
	  <%
	  if(name.equals("홍길동")){
		  %> 
		  <h2>정답입니다. 홍길동</h2> 
	  <%}else{ %>
		  <h2> 오답입니다. <%=name%> 입니다.</h2>
	 <% } %>
	 
	 <!-- for -->
	 <c:forEach var="i" begin="0" end="10" step="1">  <!-- 10포함임 -->
	 	${i} <br> 	
	 </c:forEach>
	 
	 <hr>
	 
	 <h3>board객체</h3>
	 <h3>${board.bno}</h3>
	 <h3>${board.id}</h3>
	 <h3>${board.btitle}</h3>

	 <hr>
	 
	 <c:forEach var="b" items="${list}"> <!-- 게시글 수만큼 반복됨 -->
		 <h3>${b.bno}</h3>
		 <h3>${b.id}</h3>
		 <h3>${b.btitle}</h3>
		 
		 <br>
	 </c:forEach>
	 	


	  
	</body>
</html>