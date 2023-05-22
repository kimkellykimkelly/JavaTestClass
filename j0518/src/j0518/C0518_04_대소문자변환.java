package j0518;

import java.util.Scanner;

public class C0518_04_대소문자변환 {

	public static void main(String[] args) {
		// 영문자를 입력받아 대문자와 소문자를 변환해서 출력해라
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영문자를 입력하세요(대소문자 변환됨)");
		// 문자열이 아닌 문자를 받을 때는 아래와 같이 받아야함!!!
		char ch = scan.next().charAt(0);
		
		// 대문자인지 소문자인지 비교
		// 대문자A:65~Z:96, 소문자a:97~
		if (ch<=96) { // => 대문자이면
			ch = (char)(ch+32); // 대문자->소문자
			// ch+숫자 => char와 int의 사칙연산이므로 더 큰 형이 int가 되어 int값이 출력됨. 해당 int값에 해당하는 문자를 출력하고 싶으면 (char)붙여서 강제형변환 필요!
		} else {
			ch = (char)(ch-32); // 소문자->대문자
		}
		
		System.out.println(ch);

		
		
	}

}
