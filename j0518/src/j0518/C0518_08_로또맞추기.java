package j0518;

import java.util.Iterator;
import java.util.Scanner;

public class C0518_08_로또맞추기 {

	public static void main(String[] args) {
		// 로또맞추기

		Scanner scan = new Scanner(System.in);

		// 변수
		int random = 0, temp = 0, count = 0;

		// 배열 생성
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] myLotto = new int[6]; // 당첨 번호

		// 1-45번까지 숫자를 lotto에 넣기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		// lotto 안 숫자 섞기
		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45); // 0~44
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 당첨 번호 6개 입력
		for (int i = 0; i < myLotto.length; i++) {
			myLotto[i] = lotto[i];
		}

		// 숫자 6개 입력
		for (int i = 0; i < myNum.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요");
			myNum[i] = scan.nextInt();
		}

		// 로또번호와 내가 입력한 번호 비교해서, 맞췄을 경우 myLotto에 넣기
		for (int i = 0; i < 6; i++) { // 로또 번호 6개
			for (int j = 0; j < myNum.length; j++) { // 내가 입력한 수
				if (lotto[i] == myNum[j]) {
					myLotto[count] = lotto[i];
					count++;
					break; // j for문만 탈출
				}
			}
		}

		// 당첨번호 6개 출력
		System.out.print("당첨번호 6개: ");
		for (int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + "\t");
		}
		
		System.out.println();

		// 입력번호 6개 출력
		System.out.print("입력번호 6개: ");
		for (int i = 0; i < myNum.length; i++) {
			System.out.print(myNum[i] + "\t");
		}
		
		System.out.println();
		
		// 내가 맞춘 번호 출력
		System.out.print("내가 맞춘 번호: ");
		for (int i = 0; i < count; i++) {
			System.out.print(myLotto[i] + "\t");
		}
		
		System.out.println();
		
		
		// 당첨번호 개수 출력
		System.out.println("당첨번호 개수: "+count);

	}

}
