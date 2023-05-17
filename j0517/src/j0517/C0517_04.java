package j0517;

import java.util.Iterator;
import java.util.Scanner;

public class C0517_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		// 3개의 숫자를 입력받아 가장 큰수를 출력하시오	
		// 3개의 숫자를 입력받아 가장 작은 수를 출력하시오
		int num1 = 0, num2 = 0, num3 = 0;
		C0517_04 c = new C0517_04();

		while (true) {
			System.out.println("1번째 수를 입력하세요");
			num1 = scan.nextInt();
			System.out.println("2번째 수를 입력하세요");
			num2 = scan.nextInt();
			System.out.println("3번째 수를 입력하세요");
			num3 = scan.nextInt();

//			int result = c.max(num1, num2, num3);
//			int result2 = c.min(num1, num2, num3);
//			System.out.println("3개의 수의 최대값: "+result);
//			System.out.println("3개의 수의 최소값:"+result2);

			// 최대값최소값 두 메서드를 하나의 메서드로 만들 경우
			int result = c.max(1, num1, num2, num3);
			int result2 = c.max(2, num1, num2, num3);
			System.out.println("3개의 수의 최대값: "+result);
			System.out.println("3개의 수의 최소값:"+result2);

		} // while

	} // main

	// 최대값 numMax 메소드
	// 방법 1
//	int max(int a, int b, int c) {
//		if (a > b && a > c) {
//			return a;
//		} else if (b > a && b > c) {
//			return b;
//		} else {
//			return c;
//		}
//	}

	// 방법 2
//	if(num1>num2) {
//		if (num1 > num3) {
//			max = num1;
//		} else {
//			max = num3;
//		}
//	} else {
//		if (num2 > num3) {
//			max = num2;
//		} else {
//			max = num3;
//		}
//	}

	// 방법 3 : 삼항식
//	max = (num1>num2)?((num2>num3)?num2:num3):((num2>num3)?num2:num3);

	// 방법 4: Math.Max() =>2개 비교하는 것 밖에 없어서 3개 비교 시 아래와 같이 2번 적어야함!
//	max = Math.max(Math.max(num1,num2),num3);

//	int max(int a, int b, int c) {
//		int result = Math.max(Math.max(a, b), c);
//		return result;
//	}
//
//	// 최소값 찾기 메서드
//	int min(int a, int b, int c) {
//		int result2 = Math.min(Math.min(a,b),c);
//		return result2;
//	}

	// 위 두 메서드를 하나로 합치기
	int max(int check, int a, int b, int c) {
		int result = 0;
		if (check == 1) {
			// 최대값 구하기
			result = Math.max(Math.max(a, b), c);
		} else {
			result = Math.min(Math.min(a, b), c);
		}
		return result;
	}

}
// class
