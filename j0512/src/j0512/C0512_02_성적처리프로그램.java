package j0512;

import java.util.Scanner;

public class C0512_02_성적처리프로그램 {

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
				
				// 성적 입력 변수
				String[] name = new String[2];
				int[] kor = new int[2];
				int[] eng = new int[2];
				int[] math = new int[2];
				int[] total = new int[2];
				double[] avg = new double[2];

				
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
							
							System.out.println((count+1)+"번째 이름을 입력하세요(0.이전페이지 이동)");
							name[i] = scan.next();
							
							if (name[i].equals("0")) {
								System.out.println("이전페이지로 이동");
								System.out.println();
								break;
							}
							
							System.out.println("국어점수를 입력하세요");
							kor[i] = scan.nextInt();
							System.out.println("영어점수를 입력하세요");
							eng[i] = scan.nextInt();
							System.out.println("수학점수를 입력하세요");
							math[i] = scan.nextInt();
							
							// 자동계산
							total[i] = kor[i] + eng[i] + math[i];
							avg[i] = total[i] / 3.0;
							count++;
							
						} //for
					
						break; // switch

					case 2: // 2. 성적출력
						System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
						System.out.println("---------------------------------------------");

						for (int i = 0; i < count; i++) {
							System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
						}
						break;
					} // switch

				} // while

	}

}
