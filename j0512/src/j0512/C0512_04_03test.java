package j0512;

import java.util.Scanner;

public class C0512_04_03test {

	public static void main(String[] args) {

//		로또 번호 생성 프로그램
		Scanner scan = new Scanner(System.in);

		// 변수 선언
		int random = 0, temp = 0, count = 0;

//		1. 배열 생성
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] lottoNum = new int[45];

//		2. 로또 번호 생성 1~45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

//		3. 로또 번호 섞기 (1000번)
		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45);
			lotto[0] = temp;
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

//		4. 로또 번호 입력
		for (int i = 0; i < lottoNum.length; i++) {
			System.out.println((i + 1) + "번째 로또번호를 입력하세요");
			myNum[i] = scan.nextInt();
		}

//		5. 로또 번호 개수 확인
		for (int i = 0; i < 6; i++) { // lotto
			for (int j = 0; j < myNum.length; j++) { // myNum

				if (lotto[i] == myNum[j]) {
					lotto[i] = lottoNum[count];
					count++;
					continue;
				}
			}
		}

//		6. 출력
//		6-1. 로또 번호 출력
		System.out.println("로또번호 자동생성 6개 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

//		6-2. 입력 번호 출력
		System.out.println("입력번호 6개 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNum[i] + " ");
		}
		System.out.println();
		
//		6-3. 당첨 번호 출력
		System.out.println("당첨번호 : ");
		for (int i = 0; i < count; i++) {
			System.out.print(lottoNum[i] + " ");
		}
		System.out.println();
		
//		6-4. 당첨 개수 출력
		System.out.println("당첨개수 :" + count);
	}

}
