package j0516;

import java.util.Iterator;
import java.util.Scanner;

public class C0516_00_C0512_09마무리_성적수정 {

	public static void main(String[] args) {
		// [성적처리프로그램] (입력을 한번에 다 하지 않더라도, 나중에 다시 이어서 할 수 있게 만들기)
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램 종료

		Scanner scan = new Scanner(System.in);

		int input = 0; // 번호 선택 변수
		int count = 0; // 입력된 학생 수
		String modifyName = "";

		// 성적 입력 변수
		String[] name = new String[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };

//		int[] kor = new int[2];
//		int[] eng = new int[2];
//		int[] math = new int[2];
//		int[] total = new int[2];

		int[][] score = new int[10][4];
		double[] avg = new double[10];

		while (true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 출력하세요");

			input = scan.nextInt();

			if (input == 0) { // 01파일에서, 여기랑 위 while에서 출력 부분만 추가됨
				System.out.println("프로그램을 종료합니다");
				break; // while 문 탈출
			}

			switch (input) {

			case 1: // 1. 성적입력

				for (int i = count; i < name.length; i++) {
					// 입력하다가 나갔을 경우, 다음번에는 count번부터 시행하기위해 i=count가 됨.

					System.out.println((count + 1) + "번째 이름을 입력하세요(0.이전페이지 이동)");
					name[i] = scan.next();

					if (name[i].equals("0")) {
						System.out.println("이전페이지로 이동");
						System.out.println();
						break;
					}

					// 국영수합계
					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
						score[i][3] += score[i][j];
					}

//					System.out.println("국어점수를 입력하세요");
//					kor[i] = scan.nextInt();
//					System.out.println("영어점수를 입력하세요");
//					eng[i] = scan.nextInt();
//					System.out.println("수학점수를 입력하세요");
//					math[i] = scan.nextInt();
//
//					// 자동계산
//					total[i] = kor[i] + eng[i] + math[i];

					avg[i] = score[i][3] / 3.0;
					count++;

				} // for

				break; // switch

			case 2: // 2. 성적출력
//				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");

				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				System.out.println("---------------------------------------------");

				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], score[i][0], score[i][1], score[i][2],
							score[i][3], avg[i]);
				}
				break;

			case 3: // 성적수정
				System.out.println("수정할 학생 이름을 입력하세요"); // 중복되는 이름이 없다고 가정
				modifyName = scan.next();

				int chk = 0; // 찾을 학생이 없을 경우 0, 있으면 1
				for (int i = 0; i < count; i++) { // 입력한 학생 수만큼만 반복
					if (name[i].equals(modifyName)) { // 입력한 학생 모두 반복
						// => 찾는 학생 없을 경우로 else를 쓰면, else가 for안에 있으므로
						// + 해당 학생이 있는 i자리를 찾기 전까지 반복 시마다 찾는 학생 없음이 출력됨. 
						// => 따라서, else 사용 불가능 
						// => for 안에서 입력한 학생 모두 반복 후, for 밖에서 찾을 학생이 없을 경우에 해당하는 출력값을 써야함!!!
						
						System.out.println("[수정 과목 선택]");
						System.out.println("----------------------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("수정할 과목을 선택해주세요");
						input = scan.nextInt();
						chk = 1; // 찾는 학생이 있을 경우 1로 변경
						

//						switch (input) {  // case 1 2 3 모두 같은 형태라, 하나로 통일하고 다 생략
//						case 1: case 2: case 3: // score[i][0] = 국어
							System.out.println(title[input] + "점수 : " + score[i][input-1]);
							System.out.println("----------------------------------");
							System.out.println("변경할 "+title[input]+" 점수를 입력하세요");
							score[i][input-1] = scan.nextInt();
							
							score[i][3] = score[i][0] + score[i][1]+ score[i][2]; // 합계 수정
							avg[i] = score[i][3]/3.0; // 평균 수정
							
							System.out.println("[ 수정 완료!! ]");
							System.out.println();
							break;
							
//						case 2: // score[i][1] = 영어
//							System.out.println(title[input] + "점수 : " + score[i][input-1]);
//							System.out.println("----------------------------------");
//							System.out.println("변경할 "+title[input]+" 점수를 입력하세요");
//							score[i][input-1] = scan.nextInt();
//							
//							score[i][3] = score[i][0] + score[i][1]+ score[i][2]; // 합계 수정
//							avg[i] = score[i][3]/3.0; // 평균 수정
//							
//							System.out.println("[ 수정 완료!! ]");
//							System.out.println();
//							break;
//							
//						case 3: // score[i][2] = 수학
//							System.out.println(title[input] + "점수 : " + score[i][input-1]);
//							System.out.println("----------------------------------");
//							System.out.println("변경할 "+title[input]+" 점수를 입력하세요");
//							score[i][input-1] = scan.nextInt();
//							
//							score[i][3] = score[i][0] + score[i][1]+ score[i][2]; // 합계 수정
//							avg[i] = score[i][3]/3.0; // 평균 수정
//							
//							System.out.println("[ 수정 완료!! ]");
//							System.out.println();
//							break;
						
//						} // switch 
					} // if
				} // for

				// chk 학생이름이 없는 경우
				if (chk == 0) {
					System.out.println("[찾는 학생 없음!!]");
					System.out.println("찾는 학생이 없습니다. 다시 입력해주세요");
					System.out.println();
					
				}
				
				break; // switch_case3의 break

			} // switch

		} // while

	}

}
