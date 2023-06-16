<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% String id = request.getParameter("id");  
		   String name = request.getParameter("name");  
		   String[] hobbys = request.getParameterValues("hobbys"); 
		   
		   // id aaa,bbb, 이라고 가정
		   if(id.equals("aaa") || id.equals("bbb") || id.equals("ccc")){
			 response.sendRedirect("join02_info_input.jsp?memberCheck=0");  
			 //값 보내고 싶을때 ? ~ = ~ 사용. 0이면 false 라는 뜻으로 많이 쓰임
		   } else{
			   response.sendRedirect("join03_success.jsp?id="+id+"&name="+name);
		   }
		
		
		%>
	
	</body>
</html>