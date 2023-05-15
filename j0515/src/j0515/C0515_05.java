package j0515;

import java.util.Iterator;

public class C0515_05 {

	public static void main(String[] args) {
		// 5,4 배열 1~20 까지 숫자 입력 후 출력하시오
		// -> 위 배열에서 모두 i=4일때만 1111 넣고, 나머지는 모두 0으로 넣기
		// -> 값을 먼저 섞은 후, 2차원 배열에 넣기
		
		int temp = 0, random = 0;
		
		int arr[][] = new int[5][4];
		
		int[] num = new int[20];
		for (int i = 0; i < num.length; i++) {
			if (i<16) {
				num[i] = 0;
			} else {
				num[i] = 1;
			}
		} // => num = {0 16개, 1 4개}
		
		
		// num (1차원) 배열 섞기
		for (int i = 0; i < 100; i++) {
			random = (int)(Math.random() * 20); // 0~19 자리
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = 4 * i + (j + 1); // 1-20
//				arr[i][j] = 4 * i + j; // 0-19
				arr[i][j] = num[4 * i + j]; // num을 먼저 섞은 후 넣어줌
				
//				if (i!=4) {
//					arr[i][j] = 0;
//				}
//				else {
//					arr[i][j] = 1;
//				}
			}
		}

		// 출력
		// 상단 번호 출력
		System.out.print("  " + "\t");
		for (int i = 0; i < 4; i++) {
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println("--------------------------------------");

		// arr 번호 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "|\t");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");

	}

}
