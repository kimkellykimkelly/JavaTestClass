package j0509;

import java.util.Scanner;

public class Class0509_08 {

	public static void main(String[] args) {
		
		
		// 이항연산자
//		int num = 10;
//		double num2 = 10;
//		double num3 = num+num2; // 큰 타입으로 자동으로 변경되므로, 변수 선언할 때 큰 타입으로 써야함!
//		System.out.println();
			

//		char ch = 'A';
//		int num = ch+1;
//		System.out.println(num); // 66
//		System.out.println((char)num); // B
		
		
		// 대문자 입력시 소문자로 출력하시오.
		// 1. 변수 선언
//		char ch = ' ';
//		
//		// 2. 입력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("대문자를 입력하세요");
//		ch = scan.next().charAt(0); //문자열에 첫번째 문자를 가져옴.
//		char ch2 = (char)(ch+32);
//		
//		// 출력
//		System.out.println("입력한 대문자 : "+ch);
//		System.out.println("변환된 대문자 : "+ch2);
		
		
		//  소문자 입력시 대문자로 출력하시오.
		// 1. 변수 선언
		char ch3 = ' ';
		
		// 2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요");
		ch3 = scan.next().charAt(0);
		char ch4 = (char)(ch3-32);
		
		// 출력
		System.out.println("입력한 소문자 : "+ch3);
		System.out.println("변환한 소문자 : "+ch4);
		
		
		//
		
//		byte a = 10;
//		byte b = 20;
//		byte c = a+b; // byte+byte=int이므로 c 앞에 int로 바꿔줘야함
		
//		int d = 1000000;
//		int e = 2000000;
//		long f = (long)(d) * e; // int*int=int인데, 숫자가 커서 오버플로우 => long으로 먼저 변환해준 후 계산해야함! 

	}

}
