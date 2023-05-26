package j0526;

import java.util.Scanner;

public class C0526_06_07_String_ContainsEndswith {

	public static void main(String[] args) {
		// String 중요!!!!!!!!!
		
		int sum = 0;
		String str = "";
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			str += i; // string은 덮어쓰는 게 아니라, 새로운 공간 만듦. string buffer 쓰면 덮어쓸 수 있지만 잘 안씀.
		}
		
		// String 메서드: charAt, concat( + 하는 것보다 조금 빠르지만 + 를 보통 씀), contains, endswith, equalsignorecase(대소문자 구분없이), index of
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자하는 문자를 입력하세요");
		String search = scan.next();
		
		// contains - 문자열 내 문자가 있는지 확인
		String str1 = "홍길동 홍길순 홍길자 이순신 강감찬 유관순 김구 김유신";
//		if (str1.contains(search)) {
//			System.out.println(search+"라는 글자가 있습니다");
//		} else {
//			System.out.println(search+"라는 글자가 없습니다");
//		}
		
		
		// endswith (끝나는 글자 찾기. 파일 확장자 찾을 때 유용). 
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp"; // => dram: 폴더 / jsp: 파일명
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp"; // => foundry 폴더에 있는 process-technology
		
		if (str2.endsWith(search)) {
			System.out.println(search+"로 끝남");
		} else {
			System.out.println(search+"로 끝나지않음");
		}
		
		
		
		

	} // main

} 
