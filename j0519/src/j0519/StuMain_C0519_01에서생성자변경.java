package j0519;

import java.util.Iterator;
import java.util.Scanner;

public class StuMain_C0519_01에서생성자변경 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// C0519_01에서 case 1 부분만 생성자 사용해서 변경(class Student 참고) 
//		C0519_01 아직 덜했음 교수님꺼보고 채워야함
		Student[] s = new Student[10]; // 객체 배열 생성

		//
		int choice = 0; // 원하는 번호 입력하는 변수
		int count = 0; // 입력한 학생 수
		String searchName = ""; // 학생 이름 검색
		int chk = 0; // 학생 검색 시 이름 비교
		int rankCount = 0; // 등수 매기기

		// 생성자 생성 -> 아래 내용 추가(변수 만들어서 저장하기 위해)
		String name = "";
		int kor, eng, math = 0;
		
		//

		loop: while (true) {
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요");

			choice = scan.nextInt();

			switch (choice) {

			case 0: // 프로그램 종료
				if (choice == 0) {
					System.out.println("프로그램을 종료합니다");
					break loop;
				}
				break;

			case 1: // 성적입력

				for (int i = count; i < s.length; i++) {

					System.out.println((count + 1) + "번째 학생 이름을 입력하세요(0. 이전페이지로 이동)");

					// 아래 내용을 밑으로 내림
//					s[i] = new Student(); // 객체 선언 -> 저장할 공간이 생긴것! => for문 안에 썼지만 주소가 생겼기 때문에 이후에서는 객체 선언 없이 사용가능!

					name = scan.next();

					if (name.equals("0")) {
						System.out.println("이전 페이지로 이동합니다");
						break; // if가 아니라 for문을 빠져나오는 것! break는 항상 반복문을 빠져나옴(for, while, switch)!!!
					}

					System.out.println("국어 점수를 입력하세요");
					kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요");
					eng = scan.nextInt();
					System.out.println("수학 점수를 입력하세요");
					math = scan.nextInt();

					// 위를 변수로 저장하고, 아래 메소드 호출 필요없음
//					s[i].sum(); // 메소드만 부르면 자동으로 total, avg가 계산되어 저장되므로 따로 저장해주지 않아도 됨!!!
//					s[i].average();

					//위에 있던 내용(55~56번째 줄)을 아래와 같이 바꿈
					s[i] = new Student(name, kor, eng, math);
					
					System.out.println((count + 1) + "번째 학생 성적 입력이 완료되었습니다");
					count++;

				} // for
				break;

			case 2: // 성적출력

				// title 출력
				System.out.println("[학생 성적]");

				// 클래스 변수 사용법: 클래스변수명.변수명
				for (int i = 0; i < Student.title.length; i++) {
					// 위와 같이 쓰면 너무 기니까 아래와 같이 변수를 설정해서
					// String[] title = Student.title;
					System.out.print(Student.title[i] + "\t");
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------");

				// 이름국영수합계평균 출력
				for (int i = 0; i < count; i++) {
					System.out.print(s[i].name + "\t"); // s[i]가 아니라 s[i].name과 같이 하나하나 적어줘야함!
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f \t", s[i].avg);
					System.out.print(s[i].rank + "\n");
				}
				break;

			case 3: // 성적수정
				chk = 0; // 위치는 case3 바로 아래에 적어야함! 위치 다시 생각해보기!!!

				System.out.println("성적을 수정할 학생 이름을 입력하세요(0. 이전페이지로 이동)");
				searchName = scan.next();

				if (searchName.equals("0")) {
					System.out.println("이전 페이지로 이동합니다");
					System.out.println();
					break; // switch
				}

				for (int i = 0; i < count; i++) { // 입력한 학생 수만큼 반복해서 비교

					if (s[i].name.equals(searchName)) {
						System.out.printf("[%s 학생이 검색되었습니다] \n", searchName);
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("-------------------------------------");
						System.out.println("수정할 과목을 선택하세요");

						choice = scan.nextInt();

						switch (choice) {
						case 1:
							System.out.printf("이전 국어 점수: %d \n", s[i].kor);
							System.out.println("수정할 점수를 입력하세요");
							s[i].kor = scan.nextInt();

							s[i].sum();
							s[i].average();

							System.out.println("국어점수 수정완료");
							System.out.println();
							break;

						case 2:
							System.out.printf("이전 영어 점수: %d \n", s[i].eng);
							System.out.println("수정할 점수를 입력하세요");
							s[i].eng = scan.nextInt();

							s[i].sum();
							s[i].average();

							System.out.println("영어점수 수정완료");
							System.out.println();
							break;

						case 3:
							System.out.printf("이전 수학 점수: %d \n", s[i].math);
							System.out.println("수정할 점수를 입력하세요");
							s[i].math = scan.nextInt();

							s[i].sum();
							s[i].average();

							System.out.println("수학점수 수정완료");
							System.out.println();
							break;
						}
						chk = 1; // 해당 학생을 찾으면 1 => if안에 넣어야함!
					} // if
				} // for

				if (chk == 0) {
					System.out.println("해당 학생을 찾을 수 없습니다. 다시 입력하세요");
				}

				break;

			case 4: // 등수처리
				for (int i = 0; i < count; i++) {
					rankCount = 1;
					for (int j = 0; j < count; j++) {
						if (s[i].total < s[j].total) {
							rankCount++;
						}
					}
				}

				break;

			case 5: // 학생검색
				System.out.println("[학생 성적 검색]");
				System.out.println("");
				
				
				// case3에서 가져옴-> 메소드로 변경 예정
				if (searchName.equals("0")) {
					System.out.println("이전 페이지로 이동합니다");
					System.out.println();
					break; // switch
				}

				break;

			} // switch

		} // while

	} // main

} // class
