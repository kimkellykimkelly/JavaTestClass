<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>뷰페이지</title>
	</head>
	<body>
	  <h2>dispatcher페이지</h2>
	  
	  <h3><%= request.getAttribute("id") %></h3>
	  <h3><%= request.getAttribute("pw") %></h3>
	  <hr>
	  
	  <!--  EL태그 사용(객체 사용 시 변수 바로 사용가능한 게 장점!)  -->
	  <h3>${id }</h3>
	  <h3>${requestScope.id }</h3> <!-- requestScope: request객체를 참조하는 객체 -->
	  
	  
	</body>
</html>