package j0526;

import java.util.Scanner;

public class C0526_12_13_Substring {

	public static void main(String[] args) {
		// substring으로 문자 잘라서 int로 바꾸기 - 많이 쓰임!!! 이거 하려고 퀴즈한것
		
		Scanner scan = new Scanner(System.in);

		// 퀴즈1. 1조~9조 입력했을 때 랜덤숫자를 맞추는 게임을 구현해라
		// 랜덤숫자
//		int random = (int) (Math.random() * 10); // 0~9

//		// 입력숫자: 1조와 같이 숫자가 아닌 형태로 받음
//		System.out.println("'1조~9조'와 같이 입력하세요");
//		String strNum = scan.next(); // 1조와 같이 입력
//		// 입력받은 1조는 문자열이므로, 1을 잘라서 숫자로 변환해 저장.
//		int myNum = Integer.parseInt(strNum.substring(0, 1));
//
//		if (myNum == random) {
//			System.out.println("당첨");
//		} else {
//			System.out.println("꽝");
//		}

		
		// 퀴즈 2.
		// String lotto2 = "1조12587";
		// 1-9조 00000-99999
		// 2개 입력받아 내가 몇 개 맞췄는지?


		
		// 랜덤숫자
		int random = (int) (Math.random() * 10); // 0~9조
		int random2 = (int) (Math.random() * 100000); // 0~99999
		String StrRandom = String.format("%05d", random2); // 0을 채우라는 뜻 => 00000,09999,...99999
		
		
		System.out.println("~조와 5자리 숫자를 입력하세요(예: 1조12587)");
		String strNum = scan.next(); // 1조12587
		
		int myNum = Integer.parseInt(strNum.substring(0, 1)); // 1조의 1 ///////////이게 이 class의 핵심!!!!!!!!!!!
		String StrmyNum2 = strNum.substring(2, 3); // 1조 뒤의 1
		
		
		// 조 비교
		System.out.println("[조 단위]");
		if (myNum == random) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
		
		// 조 뒤 비교
		System.out.println("[조 뒤에]");
		if (StrmyNum2.equals(StrRandom.substring(0, 1))) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}

		// 랜덤숫자
		System.out.println("[랜덤숫자 정답]");
		System.out.println(random);
		System.out.println(StrRandom);
		
	}

}
