package j0518;

import java.util.Scanner;

public class C0518_05_if_x {

	public static void main(String[] args) {
		// 숫자를 입력받아 양수(0 포함)인지 음수인지 출력

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int n = scan.nextInt();

		if (n >= 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}

		// 국어, 영어, 수학 점수를 입력받아 평균 60을 넘으면 합격, 불합격을 출력해라
		
		System.out.println("국어점수를 입력하세요");
		int k = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int e = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int m = scan.nextInt();
		
		double avg = (k+e+m)/3.0; // 위에 적으면 안됨! 프로그래밍은 순서대로 적어야함!
		String result = "";
		
		if (avg>=60) {
			result = "합격";
		}  else {
			result = "불합격";
		}
		
		System.out.printf("평균 점수: %.2f, 합격 여부: %s" ,avg, result);
		
	}

}
