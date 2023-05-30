package j0530;

import java.util.ArrayList;

public class ColClass3 {

	// List 반환 메소드 만들기

	ArrayList<Student> execute3() {
	
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
		
		return list;
	}
	
} // class
