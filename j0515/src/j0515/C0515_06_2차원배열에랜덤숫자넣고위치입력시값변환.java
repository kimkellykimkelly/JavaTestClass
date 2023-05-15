package j0515;

import java.util.Scanner;

public class C0515_06_2차원배열에랜덤숫자넣고위치입력시값변환 {

	public static void main(String[] args) {
		// 5,5배열 만드는데, 1-25까지 랜덤으로 섞어서 출력
		// + 반복, 내가 입력한 위치에 x 표시 넣기
		
		Scanner scan = new Scanner(System.in);
		
		int random = 0, temp = 0;
		String input = ""; // 좌표를 한번에 입력해서 따로 떼기 위해 string으로 저장함!!!(int는 따로 뗄 수가 없음)

		// 배열 생성
		String[][] box = new String[5][5]; // => 나중에 x를 넣을거라 int -> string으로 바꿈

		int[] num = new int[25];

		// num에 {1~25} 넣기
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		} 

		// => num = {1~25} 무작위로 섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 25); // 25자리(0~24)
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		} 

		
		// box(2차원 배열)에 num값(1~25 무작위로 저장됨) 넣기
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = ""+num[5 * i + j]; //=>string으로 바껴서 "" 추가해줌
			}
		}
//	=>	box[0][0] = num[0] / box[0][1] = num[1] / box[0][2] = num[2] / box[0][3] = num[3] / ... 이런 식으로 넣는 것!


		// 무한반복 출력
		
		while(true) {
			
		// 상단번호 출력	
		System.out.print(" " +"|\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println("-------------------------------------------");

		// box 번호 출력
		for (int i = 0; i < box.length; i++) {
			System.out.print(i + "|\t");

			for (int j = 0; j < box[i].length; j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}

		// 좌표 입력
		System.out.println("좌표를 입력하세요>>");
		input = scan.next(); // => 예를 들어 i=4, j=2 자리 수를 넣기 위해 42 넣으면
		
		// x표시 넣기 - char를 int형으로 변환 (문자형 숫자를 정수형으로 변환하기 위해 int로 정의하고 '0'을 빼줌)
		int no1 = input.charAt(0) - '0'; // => 첫째자리: 4 
		int no2 = input.charAt(1) - '0'; // => 둘째자리: 2
		
		// 위와 같이 하기 싫으면, 아래와 같이 입력값을 따로 받아야함!
//		System.out.println("x좌표를 입력하세요(0~4)>>");
//		int no1 = scan.nextInt();
//		System.out.println("y좌표를 입력하세요(0~4)>>");
//		int no2 =  scan.nextInt();
				
		box[no1][no2] = "x";
		
		} //while
		
	
	}

}
