package j0509;

import java.util.Scanner;

public class Class0509_09 {

	public static void main(String[] args) {

		// 1개의 글자를 입력받아 숫자로 변환하시오.
		// "15784" 1문자를 숫자로 변환

		// 추출한 숫자 : 1
		// 홀수입니다.

		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");

		char input = scan.next().charAt(0); // charAt() 문자열에서 1개의 문자를 가져옴.
		int result = input - '0'; 
		// char 타입의 숫자는 '0'문자 0을 빼야 숫자값으로 변환됨. 그냥 0을 빼면 아스키코드로 변환되어 원하지 않는 값 나옴.
		String content = (result % 2 == 0) ? "짝수입니다." : "홀수입니다.";

		System.out.println("추출한 숫자 : " + result);
		System.out.println(content);

	}

}
