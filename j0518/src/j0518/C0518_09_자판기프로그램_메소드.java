package j0518;

import java.util.Scanner;

public class C0518_09_자판기프로그램_메소드 {

	public static void main(String[] args) {
		// 자판기 프로그램
		// 1. 밀크커피 300원 2. 헤이즐럿커피 500원 3. 블랙커피 350원 4. 코코아 300원 5. 우유400원 6. 잔액충전

		Scanner scan = new Scanner(System.in);

		int myMoney = 1000; // 현재 내 돈 1000원
		int choice = 0;
		int temp = 0;

		loop: while (true) {
			System.out.println("[학교다방 자판기]");
			System.out.println("1. 밀크커피 300원");
			System.out.println("2. 헤이즐럿커피 500원");
			System.out.println("3. 블랙커피 350원");
			System.out.println("4. 코코아 300원");
			System.out.println("5. 우유 400원");
			System.out.println("6. 잔액충전");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------");
			System.out.printf("현재잔액: %,d \n", myMoney);
			System.out.println("원하는 번호를 입력하세요>>");

			choice = scan.nextInt();

			switch (choice) {
			case 0:
				System.out.println("[프로그램 종료]");
				System.out.println();
				break loop;

			case 1:
//				if (myMoney >= 300) {
//					System.out.println("밀크커피가 자동으로 나옵니다");
//					myMoney -= 300;
//				} else {
//					System.out.println("잔액이 부족합니다. 충전하세요");
//				}
				
				myMoney = order(myMoney,300,"밀크커피"); // 기본형 매개변수이므로 return을 해야 값이 바뀜!!!
				break;

			case 2:
//				if (myMoney >= 500) {
//					System.out.println("헤이즐럿커피가 자동으로 나옵니다");
//					myMoney -= 500;
//				} else {
//					System.out.println("잔액이 부족합니다. 충전하세요");
//				}
				
				myMoney = order(myMoney,500,"헤이즐럿커피");
				break;

			case 3:
//				if (myMoney >= 350) {
//					System.out.println("블랙커피가 자동으로 나옵니다");
//					myMoney -= 350;
//				} else {
//					System.out.println("잔액이 부족합니다. 충전하세요");
//				}
				myMoney = order(myMoney,350,"블랙커피");
				break;

			case 4:
//				if (myMoney >= 300) {
//					System.out.println("코코아가 자동으로 나옵니다");
//					myMoney -= 300;
//				} else {
//					System.out.println("잔액이 부족합니다. 충전하세요");
//				}
				myMoney = order(myMoney,300,"코코아");
				break;
				
			case 5:
//				if (myMoney >= 400) {
//					System.out.println("우유가 자동으로 나옵니다");
//					myMoney -= 400;
//				} else {
//					System.out.println("잔액이 부족합니다. 충전하세요");
//				}
				myMoney = order(myMoney,400,"우유");
				break;	
				
			case 6:
				System.out.println("잔액을 충전합니다. 충전금액을 입력하세요>>");
				temp = scan.nextInt();

				if (temp > 0) {
					System.out.println("결제수단: 1. 카드");
					choice = scan.nextInt();
					if (choice == 1) {
						myMoney += temp;
						System.out.println("카드결제가 완료되었습니다");
						System.out.printf("충전금액: %,d \n", temp);
						System.out.printf("현재잔액: %,d \n", myMoney);
					} else {
						System.out.println("시스템에 오류가 있습니다. 다시 실행해주세요");
						System.out.println();
					}
				}
				break;
			} // switch

		} // while

	} // main

	// 음료 제조 메소드 
	static int order(int myMoney, int price, String title) {
		if (myMoney >= price) {
			System.out.println(title+"가 자동으로 나옵니다");
			myMoney -= price;
		} else {
			System.out.println("잔액이 부족합니다. 충전하세요.");
		}
		return myMoney;
	}
	
}
