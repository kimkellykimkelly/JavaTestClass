package j0525;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain { 
	// 성적처리프로그램 - case 1: // 1. 학생성적입력만 진행. (그 전 내용에서 조금 수정됨)
	// ArrayList사용 / StuProcess class 새로 만들어서 메소드 입력

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>(); // 10명 배열을 대신해서 적용
		Scanner scan = new Scanner(System.in);
		int choice = 0; // 선택변수
		
		StuProcess stuProcess = new StuProcess(); // 메소드 호출하려면 객체 선언 필요

		
		// 최종에는 아래 두줄 필요없고, StuProcess에만 있으면 됨!
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
		
		// 프로그램 진행 - 무한반복
		while(true) {
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요>>");
			
			choice = scan.nextInt();
			
			if (choice == 0) {
				System.out.println("[프로그램을 종료합니다]");
				System.out.println();
				break; // while 탈출
			}
			
			switch (choice) {
			case 1: // 1. 학생성적입력
				
				stuProcess.stuInput(list);
				// 아래 내용을 위와 같이 stuProcess 클래스로 보내고, stuInput() 메소드 호출
//				while(true) { // 학생 수 count 없어져서 while로 변경
//					System.out.println("학생이름을 입력하세요>>(0. 이전페이지 이동)");
//					name = scan.next();
//					
//					if (name.equals("0")) {
//						System.out.println("[이전페이지로 이동합니다]");
//						System.out.println();
//						break; // while, switch 탈출
//					}
//					
//					System.out.println("국어점수를 입력하세요");
//					kor = scan.nextInt();
//					System.out.println("영어점수를 입력하세요");
//					eng = scan.nextInt();
//					System.out.println("수학점수를 입력하세요");
//					math = scan.nextInt();
//				
//					//학생성적입력 메소드
//					
//					list.add(new Student(name, kor, eng, math));
//					// 현재 입력한 위치: list.size()-1 => 현재 1개 입력했다면 0번째에 있으므로 -1!
//					System.out.printf("학번: %d, 이름: %s", list.get(list.size()-1).getStuNo(),name);
//					System.out.println("(이)가 입력되었습니다");
//					System.out.println();
//				
//				}// while
				
				break;

			
			}
			
		}// while
		

	} // main

} // class
