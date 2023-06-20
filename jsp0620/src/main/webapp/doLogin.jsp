<%@page import="com.java.www.Member"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%
		String userId = request.getParameter("id");
		String userPw = request.getParameter("pw");
		
		MemberDao mdao = new MemberDao();
		Member member = mdao.selectLogin(userId, userPw);
		
		if(member!=null){
			//response.sendRedirect("main.jsp?loginCheck=1");
			session.setAttribute("sessionId", member.getId());
			session.setAttribute("sessionName", member.getName());
		%>
		<script>
		alert("로그인되었습니다");
		location.href="main.jsp";
		</script>
		<%
		}else{
			//response.sendRedirect("login.jsp?loginCheck=0");
		%>
		<script>
		alert("아이디 또는 비밀번호가 잘못되었습니다. 다시 로그인해주세요");
		history.back();
		</script>
		<%}%>
	</body>
</html>