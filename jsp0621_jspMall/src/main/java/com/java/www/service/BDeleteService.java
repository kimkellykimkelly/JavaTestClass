package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BDeleteService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bno = Integer.parseInt(request.getParameter("bno")); // 파라미터 값
		BoardDao bdao = new BoardDao(); // 객체 선언
		int result = bdao.deleteOne(bno); // 메소드호출 후 객체 받음
		
		request.setAttribute("result", result); // request에 추가
	}

}
