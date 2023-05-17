package j0515;

import java.util.Scanner;

public class C0515_08_07test2 {

	public static void main(String[] args) {
		// 5,5배열 만드는데, 1-25까지 랜덤으로 섞어서 출력
		// + 내가 입력한 값에 x 표시 넣기

		Scanner scan = new Scanner(System.in);

		int random = 0, temp = 0, input = 0;

		// 배열 생성
		String[][] box = new String[5][5];

		// num = {1~25} 무작위로 섞어서 배열
		int[] num = new int[25];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1; // 1~25
		}

		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random()) * 25; // 0~24 (자리수)
			num[0] = temp;
			num[0] = num[random];
			num[random] = temp;
		}

		// 박스에 num값(1~25) 넣기
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = num[5 * i + j]+"";
			}
		}

		// 반복 출력
		while(true) {
		// 박스 위 제목 출력
		System.out.print(" " + "|\t");
		for (int i = 0; i < box.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------");

		// 박스 출력
		for (int i = 0; i < box.length; i++) {
			System.out.print(i + "|\t");
			for (int j = 0; j < box[i].length; j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}

		// 박스 내 값 중 하나 입력
		System.out.println("1~25 중 하나를 입력하세요");
		input = scan.nextInt();

		// 입력한 값에 x표시하기
		loop: for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {

				if (box[i][j].equals(input+"")) {
					box[i][j] = "x";
					break loop;
				}

			}

		}
		
		
		} //while
	}

}
