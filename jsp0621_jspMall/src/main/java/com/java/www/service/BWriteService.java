package com.java.www.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BWriteService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath = "c:/upload";
		int size = 10*1024*1024;
		
		try {
			MultipartRequest multi = 
					new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
			
			String id = multi.getParameter("id");
			String btilte = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String bfile = multi.getFilesystemName("bfile");
			
			System.out.println("service id : "+id);
			
			BoardDao bdao = new BoardDao(); // 객체 선언
			int result = bdao.insertOne(id,btilte,bcontent,bfile); // 메소드호출 후 객체 받음
			
			request.setAttribute("result", result); // request에 추가
				
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
