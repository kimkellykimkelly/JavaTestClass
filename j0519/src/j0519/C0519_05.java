package j0519;

import java.util.Scanner;

public class C0519_05 {

	public static void main(String[] args) {

		// C0519_04 내용을 반대로 해보기

		String[] title = { "번호", "국어", "영어", "수학", "합계", "평균" };
		int[] arr = new int[6];

		// 합계, 평균 계산해서 출력

		input(arr, title); // => 메소드 호출하면 합계, 평균이 모두 계산되어 처리됨

		// 출력
		System.out.printf("번호: %d \n", arr[0]);
		System.out.printf("국어: %d, 영어: %d, 수학: %d \n", arr[1], arr[2], arr[3]);
		System.out.printf("합계: %d \n", arr[4]);
		System.out.printf("평균: %d \n", arr[5]);

	}

	// 입력받는 메소드

	static void input(int[] arr, String[] title) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println(title[i] + "를 입력하세요");
			arr[i] = scan.nextInt();
		}
		arr[4] = arr[1] + arr[2] + arr[3];
		arr[5] = arr[4] / 3;
	}

}
