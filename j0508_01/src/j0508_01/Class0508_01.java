package j0508_01;
//
public class Class0508_01 {
	
	public static void main(String[] args) {
		
//		타입 지정과 변수 선언 동시에.
		boolean temp = true;
		boolean temp2 = false;
//		타입 지정 후, 변수 선언.
		boolean temp3;
		temp3 = true;

		char ch1 = ' '; // '' 공백없이 사용할 수 없음. 문자형 타입
		char ch2 = 'a'; // ''만 사용가능
		char ch3 = 'A';
		char ch4 = 't';
//		char ch5 = " "; ""불가능
		
		byte num1 = 1;
//		byte num3 = 256; 127까지 숫자표현 가능
		short num2 = 10;
//		short num4 = 32768; 327까지 숫자표현 가능

		int num5 = 21;
//		int num6 = 2147483648; 2147483647까지 숫자표현 가능
		long num7 = 21;
		long num8 = 2147483648L; // L이 없으면 오류
		// float: F,f 안쓰면 오류. 실수형 8자리까지 정밀도 표현 가능
//		(뒷 자리 더 써도 오류는 안나지만, 랜덤으로 나옴.
		float num9 = 9.87654321f; 
		float num10 = 987.654321f;
		// 실수형 16자리까지 정밀도 표현 가능
		double num11 = 1.123456789012345;
		
		// 문자열 - class일때 대문자 표현
		String str1 = new String("abc");
		// 객체의 경우 원래 위와 같이 써야하지만, string만 아래와 같이 쓸 수 있음!
		String str2 = "abc"; // 기본형 타입으로 선언 가능(예외)
		
		char str3 = ' ';
		String str4 = ""; // String은 공백도 넣을 수 있음!

		// 변수
		int score = 100;
		score = score + 200; //score 300이라는 값이 들어감.
		
		// 상수
		final int SCO = 100;
//		SCO = 200; 상수는 값을 변경할 수 없으므로 에러.
	}



}
