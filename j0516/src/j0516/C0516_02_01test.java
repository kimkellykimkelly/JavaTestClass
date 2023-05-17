package j0516;

import java.util.Scanner;

public class C0516_02_01test {

	public static void main(String[] args) {
		// [성적처리프로그램] (입력을 한번에 다 하지 않더라도, 나중에 다시 이어서 할 수 있게 만들기)
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램 종료

		// 이름 국어 영어 수학 합계 평균 - 10명

		Scanner scan = new Scanner(System.in);

		int choice = 0;
		int count = 0;
		String searchName = ""; // 성적 수정 시 검색할 이름

		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];

		// 무한반복
		loop: while (true) {
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 0: // 0. 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break loop;

			case 1: // 1. 성적입력

				for (int i = count; i < name.length; i++) {
					// 이름
					System.out.println((count + 1) + "번째 학생 이름을 입력하세요>>(0.이전페이지로 이동)");
					name[i] = scan.next();

					if (name[i].equals("0")) { // 이전페이지로 이동
						System.out.println("이전페이지로 이동합니다");
						System.out.println();
						break;
					}
					// 국 영 수
					for (int j = 0; j < score[i].length - 1; j++) { // score에서 합계 빼고 입력받음
						System.out.println(title[j + 1] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
					}
					// 합계 평균
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = score[i][3] / 3.0;

					System.out.println((count + 1) + "번째 학생 입력이 완료되었습니다");
					System.out.println();

					count++;
					;
				} // for
				break;

			case 2: // 2. 성적출력
				// 타이틀
				System.out.println("[학생성적]");
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				// 이름 국영수합계 평균
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f /n", avg[i]);
				}
				break;

			case 3: // 성적 수정 - 학생 이름으로 검색
				System.out.println("수정할 학생의 이름을 입력하세요");
				searchName = scan.next();

				int chk = 0;
				for (int i = 0; i < count; i++) { // 반복해서 이름 하나하나 찾음
					if (name[i].equals(searchName)) {
						System.out.println("[수정할 학생을 찾았습니다]");
						System.out.println("수정할 과목을 선택하세요");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("--------------------------------");
						System.out.println("수정할 과목 번호를 입력하세요");
						
						choice = scan.nextInt();
						
						// 수정할 과목 이전 점수 표시
						System.out.printf("[현재 %s 점수] : %d", title[choice], score[i][choice-1]);
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

				// 찾는 학생 없는 경우
				if (chk == 0) {
					System.out.println("입력한 학생이 없습니다. 다시 입력하세요");
					System.out.println();
				}
				
				
				break;

			case 4: // 4. 등수처리 - 한명씩 각각 비교

				for (int i = 0; i < count; i++) {
					int rankCount = 1;
					for (int j = 0; j < count; j++) {
						if (score[i][3] < score[j][3]) {
							rankCount++;
						}
						rank[i] = rankCount;
					}
				} // for

				break;

			} // switch

		} // while

	}

}
