package j0530;

import java.util.Iterator;
import java.util.Scanner;

public class C0530_02_String_url {

	public static void main(String[] args) {
		// 0526 복습
		// String url
		
		String str = "ht";
		String str2 = "http";

		String domain = "https://forum.nexon.com";
		String url = "https://forum.nexon.com/asgard";

		String[] files = {"fifamobile", "asgard", "GodzillaDf", "csonlime"}; 
		String input = url.substring(domain.length()+1);
		System.out.println("파일명: " + input);

		// "files 배열 1에 있습니다" 출력하기
		for (int i = 0; i < files.length; i++) {
			if (files[i].equals(input)) {
				System.out.println("files 배열"+i+"에 있습니다");
				break;
			}
		}

		/////////////
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 페이지를 호출하시오.");
		input = scan.next();
		
		// switch 사용
//		switch (input) {
//		case "fifamobile": 
//			System.out.println("fifamobile 페이지를 열어줍니다.");
//			break;
//		case "asgard":
//			System.out.println("asgard 페이지를 열어줍니다.");
//			break;
//		case "GodzillaDF":
//			System.out.println("GodzillaDF 페이지를 열어줍니다.");
//			break;
//		case "csonline":
//			System.out.println("csonline 페이지를 열어줍니다.");
//			break;
//		}
		
		// 대소문자 구분없이 입력해도 출력되게 하기
		for (int i = 0; i < files.length; i++) {
			if (input.equalsIgnoreCase(files[i])) {
				System.out.println(files[i]+"페이지를 호출합니다.");
			}
		}
		

		
	}

}
