package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	
    private Context context = null;
    private DataSource dataSource = null;
    private Connection conn = null;
    private Board board = null;
    private PreparedStatement pstmt;
    private ResultSet rs;
	
    private int bno;
    private String id;
    private String btitle;
    private String bcontent;
    private Date bdate;
    private int bhit;
    private int bgroup;
    private int bstep;
    private int bindent;
    private String bfile;
	
    private String query;
    private int result; // 저장 잘됐으면 1, 안됐으면 2
	
    // 게시글 저장
    public int insertOne(String userId, String userBtitle, String userBcontent, String userBfile) {
    	
    	try {
    		 conn = getConnection();
		   	 query = "insert into board values("
		   	 		+ "board_seq.NEXTVAL, ?, ?, ?, sysdate, 0,"
		   	 		+ "board_seq.CURRVAL, 0, 0, ?)";
		   	 pstmt = conn.prepareStatement(query);
		   	 pstmt.setString(1, userId);
		   	 pstmt.setString(2, userBtitle);
		   	 pstmt.setString(3, userBcontent);
		   	 pstmt.setString(4, userBfile);
		   	 
		   	 result = pstmt.executeUpdate();		
    	}catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(rs!=null) rs.close();
	    		if(pstmt!=null) pstmt.close();
	    		if(conn!=null) conn.close();
	    	}catch(Exception e2){e2.printStackTrace();}
	    }
    	return result;
    } // insertOne()
    
    
    // 게시글 1개 가져오기
    public Board selectOne(int userBno) {
    	try {
    		 conn = getConnection();
		   	 query = "select * from board where bno=?";
		   	 pstmt = conn.prepareStatement(query);
		   	 pstmt.setInt(1, userBno);
		   	 rs = pstmt.executeQuery();
		   	 
		   	 while(rs.next()) {
		   		 bno = rs.getInt("bno");
		   		 id = rs.getString("id");
		   		 btitle = rs.getString("btitle");
		   		 bcontent = rs.getString("bcontent");
		   		 bdate = rs.getDate("bdate");
		   		 bhit = rs.getInt("bhit");
		   		 bgroup = rs.getInt("bgroup");
		   		 bstep = rs.getInt("bstep");
		   		 bindent = rs.getInt("bindent");
		   		 bfile = rs.getString("bfile");
		   		 
		   		 board = new Board(bno,id,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent,bfile);
		   	 } //while
    	}catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(rs!=null) rs.close();
	    		if(pstmt!=null) pstmt.close();
	    		if(conn!=null) conn.close();
	    	}catch(Exception e2){e2.printStackTrace();}
	    }
		return board;
    } // selectOne()
	

	//게시글 전체 가져오기
	public ArrayList<Board> selectAll() {
		ArrayList<Board> list = new ArrayList<>();
		try{
	    	 conn = getConnection();
	    	 query = "select * from board";
	    	 pstmt = conn.prepareStatement(query);
	    	 rs = pstmt.executeQuery();
	    	 
	    	 while(rs.next()) {
	    		 bno = rs.getInt("bno");
	    		 id = rs.getString("id");
	    		 btitle = rs.getString("btitle");
	    		 bcontent = rs.getString("bcontent");
	    		 bdate = rs.getDate("bdate");
	    		 bhit = rs.getInt("bhit");
	    		 bgroup = rs.getInt("bgroup");
	    		 bstep = rs.getInt("bstep");
	    		 bindent = rs.getInt("bindent");
	    		 bfile = rs.getString("bfile");
	    		 
	    		 list.add(new Board(bno,id,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent,bfile));
	    	 } //while
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(rs!=null) rs.close();
	    		if(pstmt!=null) pstmt.close();
	    		if(conn!=null) conn.close();
	    	}catch(Exception e2){e2.printStackTrace();}
	    }
		return list;
	} //selectAll()
	
	
	// 커넥션 연결메소드 - conn
		private Connection getConnection() {
			Connection connection = null;
			try {
				context = new InitialContext();
		    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		    	connection = dataSource.getConnection();
			}catch(Exception e){e.printStackTrace();}
			return connection;
		}//getConnection
	

}//class