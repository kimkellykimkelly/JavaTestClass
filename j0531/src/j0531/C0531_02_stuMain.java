package j0531;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C0531_02_stuMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// 객체선언
		StuProcess sp = new StuProcess();
		List<Student> list = new ArrayList<>(); // List: 인터페이스. ArrayList가 List를 상속받아 사용.

		int choice = 0;
		int stuCount = list.size()+1; // 학번

//		list.add(new Student(1, "홍길동", 100, 100, 100));
//		list.add(new Student(2, "유관순", 90, 100, 100));

		while (true) {
			System.out.println("[학생 성적 입력]");

			System.out.println("1. 학생 입력");
			System.out.println("2. 학생 출력");
			System.out.println("8. 파일에서 가져오기");
			System.out.println("9. 파일 저장하기");

			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 입력하세요>>");
			choice = scan.nextInt();

			switch (choice) {

			case 1: // 1. 학생 입력
				// 메소드호출 후 데이터 전달받음
				Map<String, Object> map = sp.stuInput(list, stuCount);
				list = (List<Student>) map.get("list"); // map은 object이므로 형 변환 필요!
				stuCount = (int) map.get("stuCount"); // map은 object이므로 형 변환 필요!
				break;

			case 2: // 2. 학생 출력

				list = sp.stuOputput(list);
				break;

			case 8: // 8. 파일에서 가져오기

				list = sp.stuRead();
				System.out.println("[파일 읽어오기 완료]");
				System.out.println();
				break;
				
			case 9: // 9. 파일 저장하기

				sp.stuSave(list);
				System.out.println("[학생 성적 저장 완료]");
				System.out.println();
				break;


			} // switch

		} // while

	} // main

} // class
