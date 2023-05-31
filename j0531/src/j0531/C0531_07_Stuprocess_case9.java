package j0531;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C0531_07_Stuprocess_case9 {

	public static void main(String[] args) {
		// student.txt 파일 쓰기

//		String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98\r\n3,이순신,67,56,45\r\n";
		
		String data = "";
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍길동",100,100,99));
		list.add(new Student(2,"유관순",99,99,98));
		list.add(new Student(3,"이순신",67,56,45));
		
		// 파일 저장
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			data += String.format("%d,%s,%d,%d,%d\r\n", 
					s.getStuNo(), s.getName().trim(), s.getKor(), s.getEng(), s.getMath());
		} // .trim() => 공백제거
		
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		

	} // main

}
