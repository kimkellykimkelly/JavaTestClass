package j0510;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {

//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열 입력해라");
//		str = scan.next();
//		
//		if (str.equalsIgnoreCase("c")) { // 대소문자 관계없음
//			// str은 == 불가능. str.equals("c") 로 써야함.
//			// 기본형 8개(boolean, char, byte, short, int, long, float, 등) 만 == 사용가능.
//			System.out.println("c맞음");
//		} else {
//			System.out.println("c아님");

		// if. 90점 이상이면 A, 아니면 B
//		int score = 0;
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력해라");
//		score = scan.nextInt();
//
//		if (score >= 90) {
//			System.out.println("A");
//		} else {
//			System.out.println("B");
//		}

		// 중첩 if문
		// 90점 이상이면 A, 80점 이상 B, 70점 이상 C, 60 D, 나머지 F
		// 97점 이상 A+, 93이하 A-, 97점이상 B+, 87점이하 B-, ...

		int score = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해라");
		score = scan.nextInt();

		if (score >= 90) {
			System.out.print("A"); // pirntln쓰면 줄바꿔서 +-출력되므로 print 사용!
			if (score >= 97) {
				System.out.println("+");
			} else if (score <= 93) {
				System.out.println("-");
			}
		} else if (score >= 80) {
			System.out.print("B");
			if (score >= 87) {
				System.out.println("+");
			} else if (score <= 83) {
				System.out.println("-");
			}
		} else if (score >= 70) {
			System.out.print("C");
			if (score >= 78) {
				System.out.println("+");
			} else if (score <= 73) {
				System.out.println("-");
			}
		} else if (score >= 60) {
			System.out.print("D");
			if (score >= 67) {
				System.out.println("+");
			} else if (score <= 63) {
				System.out.println("-");
			}
		} else {
			System.out.println("F");
		}

	}

}
