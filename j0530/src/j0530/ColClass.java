package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass {
	
	// 원래 리턴값은 1개인데, 여러개를 리턴하고 싶을때 Map 사용!!!

	    //list,nowPage,startRow,endRow 다양한 형태의 값을 보내서, 리턴값 여러개 출력
		Map<String, Object> execute(){
			
			Map<String, Object> map = new HashMap<>();
			
			//
			ArrayList<Student> list = new ArrayList<>();
			list.add(new Student(1,"홍길동",100,100,99));
			list.add(new Student(2,"유관순",99,98,99));
			list.add(new Student(3,"이순신",90,91,90));
			list.add(new Student(4,"4이순신",90,91,90));
			list.add(new Student(5,"5이순신",90,91,90));
			list.add(new Student(6,"6이순신",90,91,90));
			list.add(new Student(7,"7이순신",90,91,90));
			list.add(new Student(8,"8이순신",90,91,90));
			list.add(new Student(9,"9이순신",90,91,90));
			list.add(new Student(10,"10이순신",90,91,90));
			
			int nowPage = 3;
			int startRow = 21;
			int endRow = 30;
			
			map.put("list", list); // list / 10개 데이터가 들어가있음
			map.put("nowPage", nowPage); // int
			map.put("startRow", startRow); // int
			map.put("endRow", startRow); // int
			 
			return map;
			
		} 
		
		
		
		
		
	}

