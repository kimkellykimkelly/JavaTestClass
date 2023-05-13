package j0511;

import java.util.Scanner;

public class C0511_10_test2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input = 0;
		int count = 0;
		
		// 변수 선언
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];

		// 입력

		while (true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("------------------");
			System.out.println("원하는 숫자를 입력하세요");

			input = scan.nextInt();

			switch (input) {
			case 1: // 입력

				for (int i = count; i < name.length; i++) {
					
					System.out.println((count+1)+"번째 학생 이름 입력해(0.이전페이지로 이동)");
					name[i] = scan.next();
					
					if (name[i].equals("0")) {
						System.out.println("이전페이지로 이동");
						break;
					}
					
					System.out.println("국어점수 입력해");
					kor[i] = scan.nextInt();
					System.out.println("영어점수 입력해");
					eng[i] = scan.nextInt();
					System.out.println("수학점수 입력해");
					math[i] = scan.nextInt();
					
					total[i] = kor[i] + eng[i] + math[i];
					avg[i] = total[i] / 3.0;
					count++;
				}
				break;

			case 2: // 출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("--------------------------------------------");
				
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
				}

				break;
			}
		}



	}

}
