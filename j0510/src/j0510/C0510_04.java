package j0510;

import java.util.Scanner;

public class C0510_04 {

	public static void main(String[] args) {

		// switch

//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		input = scan.nextInt();

//		if (input == 1) {
//			System.out.println("1임");
//		} else if (input == 6) {
//			System.out.println("6임");
//		} else {
//			System.out.println("9임");
//		}

		// switch()
//		switch (input) {
//		
//		case 1: // 크다 작다 비교 불가능. 딱 정해진 값
//			System.out.println("1임");
//			break;
//		case 6:
//			System.out.println("6임");
//			break;
//		case 9:
//			System.out.println("9임");
//			break;
//		default:
//			System.out.println("원하는 숫자가 아님");
//		}

		// m,f를 입력받아 m이면 남자 f 면 여자라고 출력

		char c = ' ';

		Scanner scan = new Scanner(System.in);
		System.out.println("m또는 f를 입력하시오(대문자도 가능)");

		c = scan.next().charAt(0);

		switch (c) {

		case 'm': 
		case 'M':
			System.out.println("남자입니다");
			break;
		
		case 'f': 
		case 'F':
			System.out.println("여자입니다");
			break;
		
		default:
			System.out.println("원하는 값이 아님");
		}

	}

}
