package j0511;

import java.util.Scanner; 

public class C0511_05_apply {

		public static void main(String[] args) {
		
			// 숫자맞추기 프로그램(C0511_05_개인적으로 응용해봄)
			// 마지막 도전 시에도 못 맞췄을 경우, "더 큰,작은 수를 입력하세요" 안나오게 하려면 어떻게???(개인적으로 해보다가 생긴 질문)

			// 1. 랜덤 숫자 생성 (1~100)
			// 2. 숫자맞추기 3번 반복
			// 0. 종료

			Scanner scan = new Scanner(System.in);

			int input = 0, random = 0, count = 0;

			while (true) {
				System.out.println("[숫자맞추기 프로그램]");
				System.out.println("1. 랜덤숫자 생성");
				System.out.println("2. 숫자맞추기 게임");
				System.out.println("3. 종료");
				System.out.println("-----------------");
				System.out.println("원하는 숫자를 입력하세요");

				input = scan.nextInt();

				if (input == 3) {
					System.out.println("시스템을 종료합니다");
					break;
				}

				switch (input) {

				case 1:
					random = (int) (Math.random() * 100) + 1;
					System.out.println("랜덤숫자를 생성합니다");
					break;

				case 2:
					System.out.println("기회는 3번이고, 3번 모두 틀릴 경우 정답을 공개하고 프로그램을 종료합니다");

					while (true) { 
						
						if (count >= 3) {
							System.out.println("아쉽네요. 3번이 지났습니다. 정답은:"+random+"입니다");
							break; // 위 while 탈출 -> switch 탈출, 맨 위 while페이지로 이동)
						}
						
						System.out.println((count+1)+"번째 기회입니다. 1~100 중 숫자를 입력하세요");
						input = scan.nextInt();
						
						
						if (input == random) {
							System.out.println("입력한 값:"+input);
							System.out.println("정답:"+random);
							System.out.println("정답입니다! 처음 화면으로 이동합니다");
							break; //위 while 탈출 -> switch 탈출, 맨 위 while로 이동.
						}
						
						if (input < random) {
							System.out.println("입력한 값:"+input);
							System.out.println("더 큰 수를 입력하세요");
						} else {
							System.out.println("더 작은 수를 입력하세요");
						}
					
						count++; // count = 입력한 횟수. count=2 -> 3이되면 반복 끝

					} // while

					break;

				default:
					System.out.println("잘못 입력했습니다. 번호 1,2,3 중 입력하세요");
					break;
				} // switch
				
				
			} // while

		}

	}
