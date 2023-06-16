<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세션 모두 읽기(이럴 일은 없음)</title>
	</head>
	
	<body>
		<%
		Enumeration enumeration = session.getAttributeNames();
		while(enumeration.hasMoreElements()){
			String sName = enumeration.nextElement().toString(); // 형변환
			String sValue = (String)session.getAttribute(sName);
			out.println("name: "+sName+"<br>");
			out.println("value: "+sValue+"<br>");
		}
		
		session.invalidate(); // 세션 모두 지우기
		%>
	</body>
</html>