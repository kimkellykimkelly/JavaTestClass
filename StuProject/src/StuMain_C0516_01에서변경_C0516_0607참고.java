import java.util.Scanner;

public class StuMain_C0516_01에서변경_C0516_0607참고 {

	static Scanner scan = new Scanner(System.in);
	// static붙여서 class에 써야, 메인 메소드 안에서도 쓸 수 있음!

	public static void main(String[] args) {
		// Student class 사용

		Student[] s = new Student[10]; // 저장공간이 만들어진 건 아님

		// [성적처리프로그램]
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생검색
		// 0. 프로그램 종료

		int choice = 0; // 선택 // => return값 안받아도됨
		int count = 0; // 성적 입력한 학생 수 // => return값 받아야함
		String searchName = ""; // 학생 성적 수정 시, 학생 검색시 검색할 이름
		int chk = 0; // 학생 존재 유무 체크

		while (true) {
			// 화면 출력
			choice = stuScreen();

			switch(choice) {
			case 1: //성적입력
				//성적입력 메소드호출 - 클래스명.메소드명() / 메소드명()
			    count = stuInput(count,s);  //입력된 학생수
				break;

			case 2: //성적출력
				//한줄
				break;
			case 3: //성적수정
				//한줄
				break;
			case 4: //등수처리
				//한줄
				break;
			case 5: //학생검색
				//한줄
				break;
			case 0:

				break;

			} // switch

		} // while

	} // main

	static int stuScreen() {
		System.out.println("[학생성적처리 프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생검색");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------------------");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		return choice;
	} // stuScreen

	// 1. 성적입력 메소드
	static int stuInput(int count, Student[] s) {
		for (int i = count; i < s.length; i++) {
			// 객체선언
			s[i] = new Student();
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요.(0.이전페이지 이동)");
			s[i].name = scan.next();
			if (s[i].name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.");
				System.out.println();
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			s[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			s[i].math = scan.nextInt();
			s[i].sum(); // 합계
			s[i].average(); // 평균

			System.out.println((count + 1) + "번째 학생성적 등록이 완료되었습니다.");
			System.out.println();
			// 학생수 1증가
			count++;

		} // for

		return count;
	}// stuInput

}// class
