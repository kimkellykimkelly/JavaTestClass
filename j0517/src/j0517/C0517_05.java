package j0517;

import java.util.Scanner;

public class C0517_05 {

	public static void main(String[] args) {
		// 퀴즈: 3개의 수를 입력받아, 평균 60점 이상이면 합격/불합격 출력하시오
		// average() 함수만들기 return은 string으로

		Scanner scan = new Scanner(System.in);
		
		// 객체 선언
		C0517_05 c = new C0517_05();
		
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}
		String result = c.average(num[0], num[1], num[2]);
		System.out.println("합격여부"+result);
		
		
		
	} // main

//	String average(int a, int b, int c) {
//		double avg = (a+b+c)/3.0;    
//		if (avg>=60) {
//			return "합격";
//		} else {
//			return "불합격";
//		}
//	}

	// 교수님 답
	String average(int a, int b, int c) {
		String result = "";    
		if ((a+b+c)/3.0>=60) {
			result = "합격";
		} else {
			result = "불합격";
		} return result;
	}

}// class
