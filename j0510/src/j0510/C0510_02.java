package j0510;

import java.util.Scanner;

public class C0510_02 {

	public static void main(String[] args) {
		// 조건문 - if, switch
		// switch가 if보다 속도 더 빠르지만, if를 90% 사용
		// switch는 크다 작다 불가능.

//		int num = 8;

//		(num>1) ? "":""; //삼항식

		// 1. if문만 존재
//		int num = 0;
//		if (num == 0) {
//			System.out.println("0임");
//		}

		// 2. if else
//		if (num==8) {
//			System.out.println("8임");			
//		}else {
//			System.out.println("8아님");
//		}

		// 3. if,else if else,

		// 입력한 숫자가 양수 음수 0 인지?
//		int num = 0;
//		
//		if (num>0) {
//			System.out.println("양수");
//		}else if (num==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("음수");
//		}

		
		// 입력한 숫자가 2의 배수이면 2의 배수입니다. 2의 배수가 아닙니다. 출력
		// 1. 변수선언 2. scan 후 변수입력 받음 3. 비교 4. 출력
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//
//		int i = scan.nextInt();
//
//		if (i % 2 == 0) {
//			System.out.println("2의 배수입니다.");
//		} else {
//			System.out.println("2의 배수가 아닙니다.");
//		}

		// 점수를 입력받아 60점 이상이면 합격, 60미만이면 불합격 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int score = scan.nextInt();
		
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}

}
