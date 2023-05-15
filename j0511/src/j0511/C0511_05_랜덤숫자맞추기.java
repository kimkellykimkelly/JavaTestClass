package j0511;

import java.util.Scanner;

public class C0511_05_랜덤숫자맞추기 {

	public static void main(String[] args) {

		// 숫자맞추기 프로그램(도전기회3번, 3번까지 못 맞추면 정답주고 나가기)

		// 1. 랜덤 숫자 생성 (1~100)
		// 2. 숫자맞추기 3번 반복
		// 0. 종료

		Scanner scan = new Scanner(System.in);
		int random = 0, input = 0, num = 0, count = 0;

		while (true) {
			System.out.println("[숫자맞추기 프로그램]");
			System.out.println("1. 랜덤숫자 생성");
			System.out.println("2. 숫자맞추기 게임");
			System.out.println("3. 종료");
			System.out.println("-----------------");
			System.out.println("원하는 숫자를 입력하세요");
			
			input = scan.nextInt();
			
			switch (input) {

			case 1:
				// 1~100 랜덤숫자 생성
				random = (int) Math.random() * 100 + 1;
				System.out.println("랜덤숫자 : " + random);
				System.out.println("랜덤숫자가 생성되었습니다");
				break;

			case 2:

				while (true) {
					// count
					if (count >= 3) {  //3번 도전하고는 정답을 주고 나가기
						System.out.println("3번 도전했습니다.");
						System.out.println("정답: " + random);
						break; // while 탈출 = case2 탈출 = switch 탈출 => 위 while문 반복
					}

					System.out.printf("1~100까지의 숫자를 입력하세요(%d번째 도전) \n", (count + 1));
					input = scan.nextInt();

					if (input == random) {
						System.out.println("정답입니다");
						System.out.println("_______________");
						break; // while 탈출 = case2 탈출 = switch 탈출 => 위 while문 반복
					} else {
						System.out.println("오답입니다");
						System.out.println("_______________");
					}
					
					count++;
				} // while
				break; // 없어도 됨!

			} // switch
		} // while

		
	
		
		
	}

}
