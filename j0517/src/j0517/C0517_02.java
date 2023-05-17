package j0517;

import java.util.Iterator;
import java.util.Scanner;

public class C0517_02 { // 클래스 내에 있는 건 인스턴스 변수, 클래스 변수(static이 붙음)

	public static void main(String[] args) { // (메소드(메인도 포함) 내에 있는 건 지역변수)
		// 메소드

		int num1 = 10;
		int num2 = 5;
		
		// 객체 선언: 클래스명 참조변수명 = new 클래스명();
		C0517_02 c = new C0517_02();
		
		// 두 수를 입력받아 더하기 결과값을 출력해라
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자를 입력하세요");
//		num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요");
//		num2 = scan.nextInt();
//	
//		int result = c.add(num1,num2);
//		System.out.println("더하기 결과값:"+result);
		
//		위를 for문으로 하기
		int[] num = new int[2];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}
		
		// 더하기 빼기 곱하기 나누기 메소드 호출
		int result1 = c.add(num[0], num[1]);
		int result2 = c.sub(num[0], num[1]);
		int result3 = c.multi(num[0], num[1]);
		int result4 = c.div(num[0], num[1]);
		System.out.println("더하기 결과값:"+result1);
		System.out.println("뻬기 결과값:"+result2);
		System.out.println("곱하기 결과값:"+result3);
		System.out.println("나누기 결과값:"+result4);
	
	} // main
	// 
	// 더하기 메소드 (메소드 내에 있는 건 지역변수)
	int add(int num1, int num2) { 
		// return값이 int여야함(int 아래에 있는 byte, short, char 도 가능), return값이 없을 경우 void를 쓰거나 생략가능!
		// 반환값이 있는 메서드는 모든 경우에 return문이 있어야함(if~return 있으면 else~return도 있어야함!)
		int result1 = num1 + num2;
		return result1;
	}

	// 빼기 메소드
	int sub(int num1, int num2) {
		int result2 = num1 - num2;
		return result2;
	}
	
	// 곱하기 메소드
	int multi(int num1, int num2) {
		int result3 = num1*num2;
		return result3;
	}
	
	// 나누기 메소드
	int div(int num1, int num2) {
		int result4 = num1/num2;
		return result4;
	}
	
	
	
	
	
	

}
