<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>업로드</title>
	</head>
	
	<body>
		<%
		//String title = request.getParameter("title");
		//파일은 위와 같은 형태가 아닌, 아래 형태로 받음.
		
		//String uploadPath = "/fileFolder"; // 파일 저장 위치
		String uploadPath = "c:/upload"; //파일저장위치
		int size = 10*1024*1024; //10mb
		
		MultipartRequest multi = 
		new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
		
		String title = multi.getParameter("title");
		String fileName = multi.getFilesystemName("bfile");
		%>
		
		<h2>제목: <%= title  %></h2>
		<h2>파일명: <%= fileName  %></h2>

	</body>
</html>