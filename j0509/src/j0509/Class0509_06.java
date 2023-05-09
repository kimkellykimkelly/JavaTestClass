package j0509;

import java.util.Scanner;

public class Class0509_06 {

	public static void main(String[] args) {
		int num = 5;
		num = num + 1;
//		위는 num++; , ++num; 과 같음.
		System.out.println(num);

		// 삼항식
		String answer = (num > 1) ? "1보다 크다" : "1보다 작다";
		System.out.println(answer);

		// 1개의 정수형을 입력받아 10보다 큰수인지 출력하시오.

		// 1. 변수 선언
		int input = 0;

		// 2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();

		// 3. 확인 출력
		String answer2 = (input > 10) ? "10보다 큽니다" : (input == 10) ? "10입니다" : "10보다 작습니다";
		System.out.println(answer2);
		// => 보통 if문을 쓰기 때문에, 삼항식은 잘 쓰지 않음.

		// 정수를 입력받아 음수면 양수로, 양수면 음수로 변경하시오.
		System.out.println("음수는 양수로, 양수는 음수로 변경합니다. 숫자를 입력하시오.");
		input = scan.nextInt();

		int result2 = (input > 0) ? -input : -input;
		System.out.println("결과값 : " + result2);

	}

}
