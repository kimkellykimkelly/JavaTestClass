package j0511;

import java.util.Scanner;

public class C0511_04_continue {

	public static void main(String[] args) {

		// continue
		
//		for (int i = 0; i <= 10; i++) {
//
////			if (i==5) {
////				continue;
////			} // 5는 건너뛰기. break는 5에서 멈춤.
//
//			if (i % 2 == 1) {
//				continue;
//			} // 짝수만 출력
//
//			System.out.println(i);

		
//		} // for

		// 구구단 5단만 빼고 출력

//		for (int i = 2; i < 10; i++) {
//			if (i == 5) {
//				continue;
//			}
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d \n", i, j, i * j);
//			}
//			System.out.println();
//		}

		// 구구단 짝수단만 출력

//		for (int i = 2; i < 10; i++) {
//			if (i%2 == 1) { // i%2!=0 도 가능
//				continue;
//			}
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d \n", i, j, i * j);
//			}
//			System.out.println();
//		}

		// 구구단 모든 단, 짝수 곱하는 것만 출력하기

//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				if (j%2 == 1) { // i%2!=0 도 가능
//					continue;
//				}
//				System.out.printf("%d * %d = %d \n", i, j, i * j);
//			}
//			System.out.println();
//		}

		// 5단까지 곱하기 5까지만 출력
//		for (int i = 2; i < 10; i++) {
//			if (i == 6) {
//				break;
//			}
//			for (int j = 1; j < 10; j++) {
//				if (j == 6) {
//					break;
//				}
//				System.out.printf("%d * %d = %d \n", i, j, i * j);
//			}
//			System.out.println();
//		}

		// loop 사용
//		loop: for (int i = 2; i < 10; i++) {
//			
//			for (int j = 1; j < 10; j++) {
//				if (j == 6) { 
//					break loop;
//				}
//				System.out.printf("%d * %d = %d \n", i, j, i * j);
//			}
//			System.out.println();
//		} 
		// => 그냥 break만 있으면 모든 단 곱하기 5까지 출력되지만, 
		// loop설정 후 loop break하면 2단에서 곱하기 5까지만 출력되고 끝남!

		//

		Scanner scan = new Scanner(System.in);
		int input = 0, n1 = 0, n2 = 0, sum = 0;

		loop: while (true) {
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("0. 종료");
			System.out.println(" ---------- ");
			System.out.println("원하는번호를 입력하세요");

			input = scan.nextInt();

			if (input == 0) {
				System.out.println("프로그램 종료합니다");
				break; //while 탈출
			}

			// 조건문(1 입력했을 때 값 2개받아 결과값 출력하기 + *나갈 수 있게 하기*)
			switch (input) {

			case 1:
				while (true) {
					System.out.println("첫번째 숫자를 입력하세요(-1.이전페이지, -2.종료)");
					n1 = scan.nextInt();
					
					//*
					if (n1 == -1) {
						break; // 바로 위 while 종료 -> case1, switch 종료 -> 맨 위 while페이지로 이동
					}
					if (n1 == -2) {
						break loop;
					}
					//*
					
					System.out.println("두번째 숫자를 입력하세요");
					n2 = scan.nextInt();
					System.out.printf("%d+%d=%d \n", n1, n2, (n1 + n2));
				} // while
			
			} // switch

		} // while

	}

}
