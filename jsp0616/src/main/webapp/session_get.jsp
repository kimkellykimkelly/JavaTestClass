<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			table{width: 400px; margin: 0 auto;}
			table,td{border: 1px solid black; border-collapse: collapse;}
			td{width:200px; height:40px;}
		</style>
	</head>
	
	<body>	
		<%
		// set
		session.setAttribute("sessionId", "admin");
		session.setAttribute("sessionNickName", "솔");
		session.setAttribute("sessionName", "김은솔");
		// get
		String sessionId = (String)session.getAttribute("sessionId");
		String sessionNickName = (String)session.getAttribute("sessionNickName");
		String sessionName = (String)session.getAttribute("sessionName");
		%>
		
		<!--표로 출력해라-->
		<table>
			<tr>
			  <td>sessionId</td>
			  <td><%=sessionId%></td>
			</tr>
			<tr>
			  <td>sessionNickName</td>
			  <td><%=sessionNickName%></td>
			</tr>
			<tr>
			  <td>sessionName</td>
			  <td><%=sessionName%></td>
			</tr>
		</table>
		
		<%
		session.removeAttribute("sessionId");
		session.removeAttribute("sessionNickName");
		%>
		
		<a href = "session_confirm.jsp"> 세션 재확인 </a>

		
	</body>
</html>