package j0516;

import java.util.Iterator;
import java.util.Scanner;

public class C0516_07_01에서메소드로변경 {
	
	//  C0516_01_맨 아래 클래스 메서드만 바꿈
    
	// 클래스변수: 클래스명.변수명 -> 같은 클래스 내에서는 클래스명 생략가능 
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" }; 
	// -> class로 꺼냄 (이렇게 쓰는 경우는 별로 없음. 대부분 99.9% 객체 선언해서 씀! static은 공용으로 쓰기 때문에 하나만 수정해도 다 바뀌어버림)
	// static 안 쓸 경우, main 메서드 안에 아래와 같이 객체 선언 해주고 써야함
	// => C0516_07_01에서메소드로변경 c = new C0516_07_01에서메소드로변경(); 하고,
	// 아래 title을 모두 c.title로 바꿔줘야함!
	
	public static void main(String[] args) {
		// [성적처리프로그램] (0519 금요일 시험!!! 외우기) 
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생검색
		// 0. 프로그램 종료

		// 이름 국어 영어 수학 합계 평균 - 10명

		Scanner scan = new Scanner(System.in);

		int choice = 0; // 선택
		int count = 0; // 성적 입력한 학생 수
		String searchName = ""; // 학생 성적 수정 시, 학생 검색시 검색할 이름
		int chk = 0; // 학생 존재 유무 체크

		// 아래 4줄을 C0516_06에서 객체 배열로 선언함!!!
		
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];

		// 무한반복
		loop: while (true) {
			// 화면출력부분
			
			// 사용하는 방법: 클래스명.메소드명
//			C0516_01_성적처리프로그램_메소드.screen();
			screen();
			
			choice = scan.nextInt();
			

			switch (choice) {

			case 0: // 0. 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break loop;

			case 1: // 1. 성적입력

				for (int i = count; i < name.length; i++) {
					// 이름
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요>>(0. 이전페이지 이동)");
					name[i] = scan.next();

					if (name[i].equals("0")) { // 이전페이지로 이동
						System.out.println("이전페이지로 이동합니다");
						System.out.println();
						break; // if 안에 써야함!!!!!!!!!!!!!!!!!!!!!!!!
					}

					// 국어 영어 수학
					for (int j = 0; j < score[i].length - 1; j++) { // score에서 합계 빼고 입력받음
						System.out.println(title[j + 1] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}
					// 합계 평균
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = score[i][3] / 3.0;

					System.out.println((count + 1) + "번째 학생 성적이 등록되었습니다");
					System.out.println();

					count++; // 입력한 학생 수

				} // for
				break;

			case 2: // 2. 성적출력
				// 타이틀
				System.out.println("[학생성적]");
				
				titleScreen();
				
				// 이름 국영수합계 평균
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%2.f \t", avg[i]); // 평균
					System.out.printf("%d \n", rank[i]); // 등수
				}
				break;

			case 3: // 성적 수정 - 학생 이름으로 검색
				System.out.println("수정할 학생의 이름을 입력하세요");
				searchName = scan.next();

				chk = 0;
				for (int i = 0; i < count; i++) { // 입력한 학생 수만큼 반복해서 비교
					if (name[i].equals(searchName)) {
						System.out.println("[수정할 학생을 찾았습니다]");
						System.out.println("수정할 과목을 선택하세요");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("--------------------------------");
						System.out.println("수정할 과목 번호를 입력하세요");

						choice = scan.nextInt();

						// 수정할 과목 이전점수 표시: 국어 score[i][0], 영어 score[i][1], 수학 score[i][2]
						System.out.printf("[현재 %s 점수] : %d \n", title[choice], score[i][choice - 1]);
						System.out.println("--------------------------------");
						// 수정할 점수 입력
						System.out.println("수정할 점수를 입력하세요>>");
						score[i][choice - 1] = scan.nextInt();

						// 합계 평균 수정
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;

						System.out.println("점수가 수정되었습니다");
						System.out.println();
						chk = 1;
					} // if
				} // for

				// 찾는 학생이 없을 때
				if (chk == 0) {
					System.out.println("입력한 학생이 없습니다. 다시 입력하세요");
					System.out.println();
				}

				break;

			case 4: // 4. 등수처리 - 한명씩 각각 비교 // (=> 오라클이 더 편리하고 빠름!)

				for (int i = 0; i < count; i++) { // 입력한 학생 수만큼만 반복
					int rankCount = 1; // 1등에서 시작
					for (int j = 0; j < count; j++) { // 입력한 학생 수만큼만 반복
						// 모든 학생 성적합계 비교
						if (score[i][3] < score[j][3]) {
							rankCount++; // => 자기 점수보다 높은 점수를 만나면 등수1 증가
						}
						// 등수 입력
						rank[i] = rankCount;
					}
				}

				break;

			case 5: // 5. 학생검색 (=> 오라클에서 like와 같은 역할)
				System.out.println("[학생 검색]");
				System.out.println("검색할 학생의 이름을 입력하세요>>");
				searchName = scan.next();

				chk = 0;

				// 2. 출력 부분과 똑같음

				titleScreen();
				
				for (int i = 0; i < count; i++) { // 입력한 학생 수만큼 반복해서 모두 찾음
					if (name[i].contains(searchName)) { // 홍 검색하면 -> 홍길동, 홍길순, 홍길자 모두 검색됨

						// 이름 국영수합계 평균
						System.out.print(name[i] + "\t");

						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%2.f \t", avg[i]); // 평균
						System.out.printf("%d \n", rank[i]); // 등수

						chk = 1;
					} // if
				} // for

				// 검색할 이름이 없는 경우
				if (chk == 0) {
					System.out.println("찾는 학생이 없습니다. 다시 입력하세요");
				}
				System.out.println();

				break;

			} // switch

		} // while

	} // main
	
	// 클래스 메서드
		static void screen() {
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요");
		}
		
		static void titleScreen() {
			for (int i = 0; i < title.length; i++) {
				System.out.print(title[i] + "\t");
			}
			System.out.println();
			System.out.println("--------------------------------------------------");
		}
		
}


