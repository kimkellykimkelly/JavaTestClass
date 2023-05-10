package j0510;

import java.util.Scanner;

public class C0510_03 {
	public static void main(String[] args) {
		
		// 숫자 1,6,9만 입력받아, 1이면 1입니다. 6이면 6입니다. 9면 9입니다. 출력
		// if, else if, else 사용
		
//		int i = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1 또는 6 또는 9를 입력하세요");
//		i = scan.nextInt();
//		
//		if (i == 1) {
//			System.out.println("1입니다.");
//		} else if (i == 6) {
//			System.out.println("6입니다.");
//		} else {
//			System.out.println("9입니다.");
//		}
		
		
		// 입력한 문자(m, 또는 f. 대문자도 가능)로 입력받아, m이면 남자, f면 여자입니다, 그 외에는 다른 문자 입력  을 출력
		
		char c = ' ';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("영문자를 입력하시오(대문자도 가능)");
		
		c = scan.next().charAt(0); // 변수 선언 string으로 했을 경우, c=scan.next()
		
		if (c == 'm' || c == 'M') { 
			// 변수 선언 string으로 했을 경우, 
			// => 기본형이 아닌 객체이므로 == 사용 불가능. ==은 기본형 타입만 사용 가능!
			// => if(c.equals("m")||c.equals("M")) 으로 적어야함.
			System.out.println("남자입니다");
		} else if (c == 'f' || c == 'F') {
			System.out.println("여자입니다");
		} else {
			System.out.println("다른 문자를 입력하세요");
		}
		
		
	}//main

}//class
