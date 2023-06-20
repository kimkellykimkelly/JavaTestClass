package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	//db접근불가능하게 private으로 막음
	private Context context = null;
	private DataSource dataSource = null;
	private Connection conn = null;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String id,pw,name,phone,gender,hobby;
	
	private String query;

	Member member = null;
	
	//로그인 메소드
	public Member selectLogin(String userId, String userPw) {
		//아래 try 내용은 꼭 알기!
		try {
			conn = getConnection();
			query = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				
				member = new Member(id, pw, name, phone, gender, hobby);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return member; // member가 없으면 원래 값인 null로 반환됨!
	} // selectLogin()
	
	// 커넥션 연결메소드
	public Connection getConnection() {
		Connection connection = null;
			try {
				context = new InitialContext();
		    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		    	connection = dataSource.getConnection();
			}catch(Exception e){e.printStackTrace();}
			return connection;
		} // getconnecConnection()
		
	} // class

