import java.util.Iterator;
import java.util.Scanner;

public class StuMain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 성적처리프로그램

		// 배열 선언
		Student[] s = new Student[10]; 
		
		//변수
		int choice = 0; // 번호 입력
		int count = 0; // 학생 수 체크
		
		// 변수 새로 설정
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
		
		///////////////////// 
		while (true) {
			
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------------");

			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			// 0. 프로그램 종료
			if (choice == 0) {
				System.out.println("[프로그램을 종료합니다]");
				System.out.println();
				break; // while 탈출
			}
			
			switch (choice) {
			
			case 1: // 1. 성적입력
				
				count = stuInput(count, s);
				// 아래 내용을 메소드로 만들고 위와 같이 호출. 메소드 생성 시 간편하게 하려고 static 붙임.
				
//				for (int i = count; i < s.length; i++) {
//					System.out.println((i+1)+"번째 학생 이름을 입력하세요(0. 이전페이지 이동)");
//					name = scan.next();
//					
//					if (name.equals("0")) {
//						System.out.println("[이전페이지로 이동합니다]");
//						System.out.println();
//						break;
//					}
//					
//					System.out.println("국어점수를 입력하세요");
//					kor = scan.nextInt();
//					System.out.println("영어점수를 입력하세요");
//					eng = scan.nextInt();
//					System.out.println("수학점수를 입력하세요");
//					math = scan.nextInt();
//					
//					// 객체 선언 + 매개변수 생성자 호출 
//					s[i] = new Student(name,kor,eng,math);
//							
//					count++;
//				} // for
				
				break;
				
			case 2:
				
				break;

			
		} // switch

	} // while

} // main
	
	// 메소드 - 리턴타입 메소드명(매개변수){}
	// case1을 메소드로 만들기
	static int stuInput(int count, Student[] s) { // int count는 기본형이므로 return 필요, s는 참조변수이므로 불필요!!!
		
		String name = "";
		int kor = 0, eng = 0, math = 0;
		// 아래 내용 그대로 가져와서, 위와 같이 변수 선언만 해주면 됨!
		for (int i = count; i < s.length; i++) {
			System.out.println((i+1)+"번째 학생 이름을 입력하세요(0. 이전페이지 이동)");
			name = scan.next();
			
			if (name.equals("0")) {
				System.out.println("[이전페이지로 이동합니다]");
				System.out.println();
				break;
			}
			
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			
			// 객체 선언 + 매개변수 생성자 호출 
			s[i] = new Student(name,kor,eng,math);
					
			count++;
		} // for

		return count;
	}
	
	
	
	
	//
	
	

} // class