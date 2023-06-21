package com.java.www;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/r1")
public class RequestPage1 extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		request.setAttribute("id", "admin");
		request.setAttribute("pw", "1234");
		
		//response.sendRedirect("j0621_01.jsp"); // 사용 불가능
		RequestDispatcher rd = request.getRequestDispatcher("j0621_01_EL태그.jsp");
		rd.forward(request, response);
		
	}	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet");
		doAction(request,response);
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost");
		doAction(request,response);

	}

} // class





