package j0511;

import java.util.Scanner;

public class C0511_02_계산기 {

	public static void main(String[] args) {

		// while
//		int i = 10;
//		while (i < 0) {
//			System.out.println("i의 값 : " + i);
//		} 
//		System.out.println("프로그램을 종료합니다.");
		// => 한번도 실행안됨

		// do while
//		int i = 10;
//		do {
//			System.out.println("i의 값 : " + i);
//		} while (i < 0);
//	      } // => 한번은 실행됨

//

		// 무한반복 - for
		
		
//		for (;;) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if (num == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}
//		
//		// 무한반복 - while
		
//		while(true) {
//			System.out.println("프로그램 실행");
//		}			
//			
//		//
//		Scanner scan = new Scanner(System.in);
//		
//		while (true) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if (num == 0) {
//				// 프로그램을 종료
//				break; // 반복문은 break를 만나면 종료
//			}
//		}

		
		// 계산기 프로그램 만들기
		
		Scanner scan = new Scanner(System.in);
		int input = 0, num1 = 0, num2 = 0;

		while (true) {
			System.out.println("[사칙연산 프로그램]");
			System.out.println("1. 더하기");
			System.out.println("2. 뻬기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 입력하세요>>");

			input = scan.nextInt();

			if (input == 0) {
				break;
			}
			// if (input == 0) break; 위는 이렇게 쓸 수 있음

			// 숫자 입력
			System.out.println("첫번째 숫자를 입력하세요");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			num2 = scan.nextInt();

			// 조건문
			switch (input) {
			case 1:
				System.out.println("더하기 결과값 : " + (num1 + num2));
				break; // switch를 빠져나옴

			case 2:
				System.out.println(" 빼기 결과값 : " + (num1 - num2));
				break;

			case 3:
				System.out.println("곱하기 결과값 : " + (num1 * num2));
				break;

			case 4:
				System.out.println("나누기 결과값 : " + (num1 / num2));
				break;

			} // switch

		} // while

	}

}
