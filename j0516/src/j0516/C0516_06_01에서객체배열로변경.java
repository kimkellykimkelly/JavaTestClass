package j0516;

import java.util.Scanner;

public class C0516_06_01에서객체배열로변경 { 
	// 객체도 배열을 쓸 수 있음!
	// C0516_01_case 1: 성적입력 부분만 객체 배열로 바꿈 => 중요!!!
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice = 0; // 선택
		int count = 0; // 성적 입력한 학생 수
		String searchName = ""; // 학생 성적 수정 시, 학생 검색시 검색할 이름
		int chk = 0; // 학생 존재 유무 체크

		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		
		// 객체 배열
		
		Student[] s = new Student[10]; // 참조변수배열 10개 생성 (=> 10명)
		// => 배열로 선언했기 때문에, 여전히 삭제는 안됨!
		
		while(true) {
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

			case 1: // 1. 성적입력

				for (int i = count; i < s.length; i++) {
					s[i] = new Student(); // 객체 선언
					// 이름
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요>>(0. 이전페이지 이동)");
					s[i].name = scan.next();

					if (s[i].name.equals("0")) { // 이전페이지로 이동
						System.out.println("이전페이지로 이동합니다");
						System.out.println();
						break; // if 안에 써야함!!!!!!!!!!!!!!!!!!!!!!!!
					}

					// 국어 영어 수학
//					for (int j = 0; j < score[i].length - 1; j++) { // score에서 합계 빼고 입력받음
//						System.out.println(title[j + 1] + "점수를 입력하세요");
//						score[i][j] = scan.nextInt();
//					}
					System.out.println("국어점수를 입력하세요");
					s[i].kor = scan.nextInt();
					System.out.println("국어점수를 입력하세요");
					s[i].eng = scan.nextInt();
					System.out.println("국어점수를 입력하세요");
					s[i].math = scan.nextInt();
					
					// 합계 평균
//					score[i][3] = score[i][0] + score[i][1] + score[i][2];
//					avg[i] = score[i][3] / 3.0;
					s[i].sum();
					s[i].average();

					System.out.println((count + 1) + "번째 학생 성적이 등록되었습니다");
					System.out.println();

					count++; // 입력한 학생 수

				} // for
				break;
			
			
			
			
			} // switch
			
		} // while
			
	}

}
