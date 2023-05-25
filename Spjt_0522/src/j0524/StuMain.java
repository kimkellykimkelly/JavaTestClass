package j0524;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// StuMain_0523에서 배열을 list로 변경, case 3 성적 수정 추가
public class StuMain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 성적처리프로그램

		// 배열 선언
//		Student[] s = new Student[10]; 
		// 배열을 list로 수정. <Student> 적어줌으로써(제너릭) 사용 시 형변환 필요없음!
		ArrayList<Student> list = new ArrayList<>();

		// 변수
		int choice = 0; // 번호 입력
//		int count = 0; // 학생 수 체크 => list로 바꿔서 삭제
		String searchName = "";
		int chk = 0; // 검색 시 없을 경우 사용

		// 변수 새로 설정
		String name = "";
		int kor = 0, eng = 0, math = 0;

		/////////////////////
		while (true) {

			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("5. 학생 검색");
			System.out.println("6. 등수 처리");
			System.out.println("7. 오름차순 정렬");
			System.out.println("8. 내림차순 정렬");
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
//				count = stuInput(count, list);
				stuInput(list); // count 삭제
				break;

			case 2: // 2. 성적 출력
				stuOutput(list); // count 삭제
				break;

			case 3: // 3. 성적 수정
				System.out.println("수정할 학생 이름을 입력하세요");
				searchName = scan.next();

				chk = 0; // 초기화
				for (int i = 0; i < list.size(); i++) { // count -> list.size()
					Student s = list.get(i); // 추가. 이 부분 추가하지 않고, 아래 s.를 list.get(i).~ 로 바로 쓸 수도 있음!
					if (s.getName().equals(searchName)) { // s[i] -> s
						System.out.println("[학생이 검색되었습니다]");
						System.out.println("수정할 과목을 선택하세요");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("--------------------------");
						System.out.println("번호를 입력하세요");
						choice = scan.nextInt();

						switch (choice) {
						// title[0] 학번-0,이름-1,국어2,영어3,수학4,합계5,평균6,등수7
						case 1: // 국어
							System.out.printf("[ 현재%s점수 : %d ]\n", Student.title[choice + 1], s.getKor());
							System.out.printf("변경할 %s점수를 입력하세요.>> \n", Student.title[choice + 1]);
							s.setKor(scan.nextInt()); // 국어점수저장
							break;

						case 2:// 영어
							System.out.printf("[ 현재%s점수 : %d ]\n", Student.title[choice + 1], s.getEng());
							System.out.printf("변경할 %s점수를 입력하세요.>> \n", Student.title[choice + 1]);
							s.setEng(scan.nextInt()); // 영어점수저장
							break;

						case 3: // 수학
							System.out.printf("[ 현재%s점수 : %d ]\n", Student.title[choice + 1], s.getMath());
							System.out.printf("변경할 %s점수를 입력하세요.>> \n", Student.title[choice + 1]);
							s.setMath(scan.nextInt()); // 수학점수저장
							break;
						} // switch

						// 아래는 case 1 2 3 공통 부분이므로 밑으로 뺌.
						
						s.setTotal(s.getKor() + s.getEng() + s.getMath());
						// 위는 아래와 같이 바로 쓸 수 있음
//						list.get(i).setTotal(s.getKor() + s.getEng() + s.getMath());
						s.setAvg(s.getTotal() / 3.0);
						
						System.out.printf("[ %s점수가 수정되었습니다. ]\n", Student.title[choice + 1]);
						System.out.println();
						
						chk = 1;
					} // if
				} // for

				if (chk == 0) {
					System.out.println("[찾는 학생이 없습니다]");
					System.out.println();
				}

			} // switch

		} // while

	} // main

	// 메소드 - 리턴타입 메소드명(매개변수){}
	
	// case1을 메소드로 만들기
	static void stuInput(ArrayList<Student> list) { // list로 바꿔서 int -> void로 변경

		String name = "";
		int kor = 0, eng = 0, math = 0;
		// 아래 내용 그대로 가져와서, 위와 같이 변수 선언만 해주면 됨!
		for (int i = list.size();; i++) { // list로 바꿔서 무한대니까 범위 삭제, count 삭제 => while로 바꾸는 게 더 좋음
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요(0. 이전페이지 이동)");
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
			list.add(new Student(name, kor, eng, math));

//			count++;  // count 삭제
		} // for
//		return count; // count 삭제 
	} // stuInput
	
	// case2를 메소드로 만들기
	static void stuOutput(ArrayList<Student> list) { // 변경

		// 제목
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s \n", Student.title[0], Student.title[1], Student.title[2],
				Student.title[3], Student.title[4], Student.title[5], Student.title[6], Student.title[7]);
		System.out.println("----------------------------------------------------------------------------");
		
		// "학번","이름","국어","영어","수학","합계","평균","등수"
		for (int i = 0; i < list.size(); i++) { // count -> list.size()
			Student s = list.get(i); // list로 변경해서 아래 s[i] -> s로 모두 변경. 이 부분 추가안하면 밑에 s.을 list.get(i).~로 쓰면 됨.
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n", // 학번 d 아닌가? 교수님은 s로 쓰심
					s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getEng(), s.getMath(), s.getTotal(),
					s.getAvg(), s.getRank());
		}

	} // stuOutput

} // class