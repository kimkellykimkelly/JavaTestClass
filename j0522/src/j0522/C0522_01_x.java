package j0522;

import java.util.Scanner;

public class C0522_01_x {
	public static void main(String[] args) {

		// 두수를 입력받아, 더하기 빼기 곱하기 나누기
		// 생성자 활용. 예전 방식부터 업데이트하면서 설명해주심

		Scanner scan = new Scanner(System.in);

		// 예전 방식 (기본 변수 사용)
		System.out.println("1번째 숫자를 입력하세요");
		int num1 = scan.nextInt();

		System.out.println("2번째 숫자를 입력하세요");
		int num2 = scan.nextInt();

		int data1 = num1 + num2;
		System.out.println(data1);
		int data2 = num1 - num2;
		System.out.println(data2);
		int data3 = num1 * num2;
		System.out.println(data3);
		int data4 = num1 / num2;
		System.out.println(data4);

		// 다른 수를 입력받으려면 위 내용을 똑같이 또 써야함.
		System.out.println("3번째 숫자를 입력하세요");
		int num3 = scan.nextInt();

		System.out.println("4번째 숫자를 입력하세요");
		int num4 = scan.nextInt();

		int data5 = num3 + num4;
		System.out.println(data5);
		int data6 = num3 - num4;
		System.out.println(data6);
		int data7 = num3 * num4;
		System.out.println(data7);
		int data8 = num3 / num4;
		System.out.println(data8);


		
	} // main
} // class
