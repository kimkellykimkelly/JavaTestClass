package j0530;

import java.util.Scanner;

public class C0530_01_String_charAt {

	public static void main(String[] args) {
		// String. 책에 있으니 설명은 하겠지만 이걸 다 설명해야하나? 하시며 설명하심
		// 0526 복습 복습

//		String str = new String("abc"); // 생성자
//		//위는 내부적으로 사실 아래와 같이 써져있는 것임
//		char ch = 'a';
//		char ch2 = 'b';
//		char ch3 = 'c';
//		
//		String str2 = "abc"; // 예외
//		
//		// String은 class이므로 함수 사용 가능 -> 예: charAt(0)
//		System.out.println(str.charAt(0));
//		
//		// String에서 알아야할 것!!!: charAt(), length(), replace(a,b), String[] split, substring(a,b)
//		String str3 = "abcdef";
//		System.out.println(str3.substring(3,5)); // 3번째부터 5번째 전까지 자르라는 뜻 => de 출력
		// substring의 return값은 string!!!

		//////// 위 내용 응용하기///////////
		// 원하는 수 입력받아서 잘라오기
		Scanner scan = new Scanner(System.in);

		System.out.println("복권을 입력하세요(예: 1조1234567(뒷자리자리수는 꼭 7자리여야함))");
		String input = scan.next();

		// 1조와 1234567 분리해서 출력
		String output1 = input.substring(0, 2);
		String output2 = input.substring(2);
		System.out.println(output1);
		System.out.println(output2);

		// output2 숫자가 무엇인지 맞춰보세요?
		// 먼저 정수타입으로 변경 후 for문을 사용해서 0-9999999(랜덤)까지 비교
		int intoutput2 = Integer.parseInt(output2);

		// -i만 사용(다른 사람의 숫자 맞추기)
		int random = (int) Math.random() * 9000000 + 1000000; // 0-8999999 -> 1000000-9999999

//		for (int i = 1000000; i <= 9999999; i++) {
//			if (intoutput2 == i) {
//				System.out.println("입력한 숫자 : " + i);
//			}
//		}

		// -랜덤 숫자 사용
		for (int i = 1000000; i <= 9999999; i++) {
			if (random == intoutput2) {
				System.out.println("랜덤 숫자 : " + i);
			}
		}
		
		
		
	}

}
