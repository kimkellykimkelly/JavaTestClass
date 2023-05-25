package c0525_06_07_TryCatchFinally;

import java.util.Scanner;

public class C0525_07 {
	public static void main(String[] args) {
		
		// try catch -> 외부와 연결 시 사용! (파일, 프린트 등)
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("숫자를 입력하세요");
			int num1 = scan.nextInt();
			System.out.println("숫자를 입력하세요");
			int num2 = scan.nextInt();
			
			// try catch -> 오류있을 경우 실행이 멈추는데, try catch 사용하면 프로그램이 멈추지 않음! (서버는 절대 멈추면 안됨!) 
			try {
				System.out.println("나누기: "+(num1/num2));
			} catch (Exception e) { // Exception e가 최고 조상.
				System.out.println("프로그램에 오류가 있어 다시 실행합니다"); // 오류가 있는 경우 실행
				e.printStackTrace(); // 오류 구문, 오류 위치 알려줌.
			} // else if 처럼 catch 여러번 쓸 수 있지만 잘 안씀.
			
		} // while
		
		
	}
}
