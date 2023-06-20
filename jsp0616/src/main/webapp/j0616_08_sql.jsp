<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%! // 전역변수로 선언
	Connection conn; // db연결
	PreparedStatement pstmt;
	//Statement stmt; // 더블클릭해서 들어감
	ResultSet rs; // 데이터 받아옴(데이터가 있을때만 기재)
	
	String id,pw,name,phone;
	String query;
	
	/* String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uid = "scott";
	String upw = "tiger";
	String query = "select * from member"; // 쿼리 실행문 */

%>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>sql</title>
	</head>
	
	<body>
		<% 
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // develope 열기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger"); // 더블클릭
			
			String userId = "aaa";
			String userPw = "1111";
			
			query = "select * from member where id=? and pw=?"; // 쿼리 실행문
			pstmt = conn.prepareStatement(query); // 창에 쿼리를 보여줘라
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			
			rs = pstmt.executeQuery(); // 데이터를 rs에 저장
			
			while(rs.next()){ //5명
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				
				out.println("아이디: "+id+", 패스워드: "+pw+", 이름: "+name+", 전화번호: "+phone+"<br>");
			} // while
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		%>	
	</body>
</html>