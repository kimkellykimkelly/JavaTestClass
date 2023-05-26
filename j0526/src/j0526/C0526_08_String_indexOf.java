package j0526;

import java.util.Iterator;
import java.util.Scanner;

public class C0526_08_String_indexOf {

	public static void main(String[] args) {
		// indexOf: 찾는 문자, 문자열 위치를 알려줌.
		
		Scanner scan = new Scanner(System.in);
		
		String str = "안녕하세요. 반갑습니다. 좋은 하루 되세요. 오늘은 불금요 완전 좋음요";
		
//		System.out.println("찾고자 하는 문자를 입력하세요");
//		String search = scan.next();
//		
//		int searchNum = str.indexOf(search); // 인덱스 번호
//		System.out.println("찾는 위치: "+searchNum);
		
		
		// 퀴즈: 요의 개수 찾기
		System.out.println("찾고자 하는 문자를 입력하세요");
		String search = scan.next();

		int count = 0; // 찾는 문자 개수
		int searchNum = -1; // 찾는 문자 위치
		while(true) {
			searchNum = str.indexOf(search,searchNum+1); // 찾는 위치 메소드. searchNum+1 위치부터 찾아라 라는 뜻
			if (searchNum != -1) { // 찾는 문자가 있으면
				System.out.println("찾는 문자 위치: "+ searchNum);
				count++;
			} else { // 찾는 문자가 없으면
				System.out.println("더 이상 찾는 문자가 없습니다.");
				break;
			}
	
		} // while
		
		System.out.println("총 찾은 문자 개수: "+count);
		System.out.println("프로그램을 종료합니다");
	
		
	
	
	} // main
	

}
