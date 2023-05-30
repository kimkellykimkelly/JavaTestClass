package j0530;

import java.util.Scanner;

public class C0530_03_String_대소문자변환 {
	public static void main(String[] args) {

		// String_대소문자 => 메소드 있어서 굳이 할 필요없지만, 메소드 내부에서 이렇게 돌아감.
		
		Scanner scan = new Scanner(System.in);
		
		// 소문자를 대문자로 출력해라. a = 97, A = 65, Z = 96, 0=48
//		System.out.println("영문소문자를 입력해라");
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 문자: "+input);
//		System.out.println("대문자: "+(char)(input-32)); //char와 int 사칙연산 시 int가 되므로 형변환 필요!
		
		// 소문자를 입력하면 대문자로, 대문자를 입력하면 소문자로 출력하기 
//		System.out.println("영문을 입력해라");
//		char input = scan.next().charAt(0);
//		
//		System.out.println("입력한 문자: "+input);
//		
//		if (input >= 'A' && input <= 'Z') { // 대문자면 소문자로 출력
//			System.out.println("소문자로 변환: "+(char)(input+32));
//		} else if (input >= 'a' && input <= 'z') {
//			System.out.println("대문자로 변환: "+(char)(input-32));
//		}
		
		// 들어오는 모든 문자열을 변경하기 (예: aabbCCdd -> AABBccDD)
		System.out.println("영문을 입력해라");
		String input = scan.next();
		
		System.out.println("입력한 문자: "+input);
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') { // 대문자면 소문자로 출력
				System.out.print((char)(input.charAt(i)+32));
			} else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				System.out.print((char)(input.charAt(i)-32));
			}
		}
		
		// 대소문자 변환 메소드 toLowerCase toUpperCase 알기!!!!!!
		String str = "ABCDEF";
		System.out.println(str.toLowerCase());
		String str2 = "abcdef";
		System.out.println(str2.toUpperCase());
		
		
		
		
		
		
	}
}
