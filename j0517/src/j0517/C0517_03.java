package j0517;

import java.util.Scanner;

public class C0517_03 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 더하기 합계를 구하시오

		Scanner scan = new Scanner(System.in);
		
		// 숫자 3개 입력
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}
		
		// 메소드 호출
		C0517_03 c = new C0517_03(); // 객체 선언
		int result = c.add(num[0], num[1], num[2]);
		System.out.println("더하기 결과값: "+result);
		

	} // main

	// 더하기 메소드
	int add(int n1, int n2, int n3) {
		int result = n1+n2+n3;
		return result;
	}
	

	
} // class
