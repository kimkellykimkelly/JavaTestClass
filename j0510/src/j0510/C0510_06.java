package j0510;

import java.util.Scanner;

public class C0510_06 {

	public static void main(String[] args) {
		// 1. 변수 선언 num1, num2, op
		// 2. scan 입력 3번 입력
		// 3. 비교(switch)
		// 4. 결과값 출력 - 더하기 결과값 : 4 과 같이 출력

		int num1 = 0;
		int num2 = 0;
		char op = ' ';

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("숫자를 입력하세요"); // 위와 똑같으므로 반복문으로 사용하는 게 좋음!
		num2 = scan.nextInt();
		System.out.println("연산자(+ - * / 중 하나)를 입력하세요");
		op = scan.next().charAt(0);

		// 1) result 변수 없이 하기
//		switch (op) {
//		case '+':
//			System.out.println("더하기 결과값 : " + (num1 + num2));
//			break;
//		case '-':
//			System.out.println("빼기 결과값 : " + (num1 - num2));
//			break;
//		case '*':
//			System.out.println("곱하기 결과값 : " + (num1 * num2));
//			break;
//		case '/':
//			System.out.println("나누기 결과값 : " + (num1 / num2));
//			break;
//		}

		// 2) result 변수 있이 하기
		int result = 0;
		
		switch (op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		}
		
		System.out.println("결과값 : " +result);
		
		// break 없으면 멈추지않고, 아래도 실행함. => 실 사용 예시) 권한을 주는 경우, 일부러 break없이 씀.
		// 중첩 switch 문도 있지만, 잘 쓰지 않음 => if 사용.

	}

}
