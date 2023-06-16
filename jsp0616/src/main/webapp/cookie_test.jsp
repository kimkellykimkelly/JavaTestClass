<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <h2>쿠키 재확인</h2>
	  <%
	    Cookie[] cookies = request.getCookies(); //쿠키 모두 가져오기
	    
	     if(cookies != null){
	          for(int i=0; i<cookies.length;i++){
	    	     out.println("name: "+cookies[i].getName()+"<br>");
	    	     out.println("value: "+cookies[i].getValue()+"<br>");  	 
	     }
     }
	         
	  %>
	  <h2>
	    <a href="cookie_test.jsp">쿠키 다시확인</a>
	  </h2>
	 
	 
	 
	
	</body>
</html>