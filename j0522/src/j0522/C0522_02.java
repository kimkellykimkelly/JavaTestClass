package j0522;

import java.util.Scanner;

public class C0522_02 {

	public static void main(String[] args) {
		// C0522_01 내용을 배열로 변경 -> for문 사용 가능!
		int[] num = new int[4];
		int[] data = new int[8];

		Scanner scan = new Scanner(System.in);

		// for문 사용
//		for (int i = 0; i < 2; i++) {
//			System.out.println((i + 1) + "번째 숫자를 입력하세요");
//			num[i] = scan.nextInt();
//		}
//
//		// for문 사용 불가
//		data[0] = num[0] + num[1];
//		System.out.println(data[0]);
//		data[1] = num[0] - num[1];
//		System.out.println(data[1]);
//		data[2] = num[0] * num[1];
//		System.out.println(data[2]);
//		data[3] = num[0] / num[1];
//		System.out.println(data[3]);
//
//		// 다른 수를 입력받으려면 위 내용을 똑같이 또 써야함.
//		// for문 사용
//		for (int i = 2; i < 4; i++) {
//			System.out.println((i - 1) + "번째 숫자를 입력하세요");
//			num[i] = scan.nextInt();
//		}
//
//		// for문 사용 불가
//		data[4] = num[2] + num[3];
//		System.out.println(data[4]);
//		data[5] = num[2] - num[3];
//		System.out.println(data[5]);
//		data[6] = num[2] * num[3];
//		System.out.println(data[6]);
//		data[7] = num[2] / num[3];
//		System.out.println(data[7]);

		/////////////////////////////

		// 위 2개를 반복문으로 바꾸기
		for (int i = 0; i < 2; i++) {

			for (int j = (2 * i) + 0; j < (2 * i) + 2; j++) { // 0,1 / 2,3
				System.out.println((j + 1) + "번째 숫자를 입력하세요"); // 1,2 / 3,4
				num[j] = scan.nextInt();
			}

			data[4 * i] = num[2 * i] + num[2 * i + 1];
			System.out.println(data[4 * i]);
			data[4 * i + 1] = num[2 * i] - num[2 * i + 1];
			System.out.println(data[4 * i + 1]);
			data[4 * i + 2] = num[2 * i] * num[2 * i + 1];
			System.out.println(data[4 * i + 2]);
			data[4 * i + 3] = num[2 * i] / num[2 * i + 1];
			System.out.println(data[4 * i + 3]);

		}

	}

}
