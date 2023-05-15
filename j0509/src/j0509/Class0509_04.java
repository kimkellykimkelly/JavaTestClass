package j0509;

import java.util.Scanner;

public class Class0509_04 {

	public static void main(String[] args) {
		// 아이디, 패스워드, 이름을 입력받아 출력하시오.
		// 문자열, 정수형, 문자열
		// -------------------------
		// 아이디   패스워드   이름
		// -------------------------
		// abcd    1111    홍길동
		
		// 1. 변수 선언
		String id = "";
		int pw = 0; // 숫자 0을 넣고 싶은 경우, int가 아닌 string으로 바꿔줘야함!
		String name = "";
		
		// 2. Scanner - 입력클래스
        Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		id = scan.nextLine();
		System.out.println("패스워드를 입력하세요.");
		pw = scan.nextInt(); 
		// 숫자 0을 넣고 싶은 경우, scan.nextLine()으로 변경, 아래 scan.nextLine(); 필요없음.
		scan.nextLine(); 
		// nextInt()가 enter키를 뱉어내기 때문에 enter를 받을 수 있는 으로 사용!하기 때문에 위를 꼭 적어줘야함!!!
		System.out.println("이름을 입력하세요.");
		name = scan.nextLine();
		
		// scan.next()와 nextInt()는 띄어쓰기를 받지 않고, nextLine()만 받을 수 있음!
		
		
		// 3. 출력
		System.out.println("----------------------");
		System.out.println("아이디\t패스워드\t이름");
		System.out.println("----------------------");
		System.out.printf("%s\t%d\t%s \n", id,pw,name);
		
	}

}
