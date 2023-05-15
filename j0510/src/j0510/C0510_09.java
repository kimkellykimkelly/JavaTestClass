package j0510;

import java.util.Scanner;

public class C0510_09 {

	public static void main(String[] args) {
		
		// 10개의 숫자를 입력받아 합계를 출력하시오.
		
		// 1) for문 사용
//		int n = 0;
//		int sum = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i+"번째 숫자를 입력하시오");
//			n = scan.nextInt();
//			sum += n;
//		}
//		System.out.println("합계 : "+sum);
		
		// 2) while문 사용
		int n = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (i < 10) {
			System.out.println((i+1)+"번째 숫자를 입력하시오");
			n = scan.nextInt();
			sum += n;
			
			i++;
		}
		System.out.println("합계 : "+sum);
		
		
	}

}
