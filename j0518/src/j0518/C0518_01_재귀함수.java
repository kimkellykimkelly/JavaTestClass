package j0518;

import java.util.Iterator;
import java.util.Scanner;

public class C0518_01_재귀함수 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 1-10 까지 합
//		int sum1 = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum1 += i;
//		}
//		System.out.println(sum1);
//
//		// 1-100 까지 합
//		int sum2 = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum2 += i;
//		}
//		System.out.println(sum2);
//
//		// 1-1000 까지 합
//		int sum3 = 0;
//		for (int i = 1; i <= 1000; i++) {
//			sum3 += i;
//		}
//		System.out.println(sum3);
//
//		// 5! = 5*4*3*2*1
//		int result = 1;
//		for (int i = 5; i > 0; i--) {
//			result *= i;
//		}
//		System.out.println(result);
		
		
		// 숫자를 입력받아 해당되는 팩토리얼을 구현해라
		System.out.println("숫자를 입력하세요");
		
		int input = scan.nextInt();
		int result = 1; 
				
		for (int i = input; i > 0 ; i--) {
			result *= i;
		}
		System.out.printf("%,d",result); // 소수점 표시		
		
	}

}
