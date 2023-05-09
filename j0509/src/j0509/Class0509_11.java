package j0509;

import java.util.Scanner;

public class Class0509_11 {

	public static void main(String[] args) {
		
		// 소수점 4자리에서 반올림 출력하시오. (3자리까지 출력)
		// 1. 변수선언 2. 출력
//		double pi = 3.141592;
//		double result = Math.round(pi*1000)/1000.0; //Math.round: 소수점 첫째자리에서 반올림해줌.
//		System.out.println(result);

		// 소수점 2자리에서 반올림해서 출력 (1자리까지 출력)
//		double pi = 3.7894;
//		double result = Math.round(pi*10)/10.0; //Math.round: 소수점 첫째자리에서 반올림해줌.
//		System.out.println(result);
		
		// 소수점 5자리를 입력받아 3자리에서 반올림해서 출력 (2자리까지 출력)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 5자리 실수를 입력하세요.");
//		
//		double d = scan.nextDouble();
//		double result = Math.round(d*100)/100.0;
//		
//		System.out.println(result);
		
		// 반올림: round(), 올림: ceil(), 버림: floor()
		
		// 실수를 입력받아 소수점 4자리에서 올림해서 출력 (3자리까지 출력)
		Scanner scan = new Scanner(System.in);
		System.out.println("소수점 4자리 실수를 입력하세요.");
		
		double d = scan.nextDouble();
		double result = Math.ceil(d*1000)/1000.0;
		
		System.out.println(result);
		
	}

}
