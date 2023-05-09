package j0509;

import java.util.Scanner;

public class Class0509_07 {

	public static void main(String[] args) {
		
		// 숫자를 입력받아 짝수인지 홀수인지 출력하시오
		
		// 1. 변수 선언
		int input = 0;
		
		// 2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		// 3. 확인 출력
		String result = (input%2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(result);

	}
}
