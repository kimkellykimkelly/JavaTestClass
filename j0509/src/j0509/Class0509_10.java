package j0509;

import java.util.Scanner;

public class Class0509_10 {

	public static void main(String[] args) {
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0; 
		//=> 1000으로 나누면 int이므로 int/int=int가 되어 소수점이 모두 날아가버림. 
		//=> 1000.0또는 1000d로 적어줘야함!
//		System.out.println(result);

		// 564.124586 소수점 3자리 절사 => 2자리까지 존재
//		double num = 564.124586;
//		double result = (int)(num*100)/100.0;
//		System.out.println(result);
		
		
		// 실수 소수점 7자리까지 입력받아, 소수점 4자리까지만 출력하시오.
		
		// 1. 변수 선언
		double d = 0;
		
		// 2. 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("실수 소수점 7자리를 입력하세요.");
		
		d = scan.nextDouble();
		double result = (int)(d*10000)/10000.0;
		
		// 3. 출력
		System.out.println(result);	
		
	}

}
