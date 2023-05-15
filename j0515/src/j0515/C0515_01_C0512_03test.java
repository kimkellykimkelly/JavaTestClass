package j0515;

import java.util.Iterator;
import java.util.Scanner;

public class C0515_01_C0512_03test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int random = 0, temp = 0, count = 0;
        // C0512_03_로또프로그램 복습. 내용 똑같음.
		
		// 배열
		int[] arr = new int[45]; // 로또번호 1~45
		int[] myNum = new int[6]; // 내가 입력한 로또번호
		int[] arrNum = new int[6]; // 내가 맞춘 번호

		// 로또번호 1-45
		for (int i = 0; i < 45; i++) {
			arr[i] = i + 1;
		}

		// 로또번호섞기
		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45); // 0~44 => 45자리
			arr[0] = temp;
			arr[0] = arr[random];
			arr[random] = temp;
		}

		// 번호입력 - 6개
		for (int i = 0; i < myNum.length; i++) {
			System.out.println((i + 1) + "번째 번호를 입력하세요");
			myNum[i] = scan.nextInt();
		}

		// 당첨번호 확인, 맞춘 개수
		for (int i = 0; i < 6; i++) { // arr
			for (int j = 0; j < myNum.length; j++) { // myNum
				if (arr[i] == myNum[j]) {
					arrNum[count] = arr[i];
					count++;
					continue;
				}
			}
		}
		
		// 로또번호 출력
		System.out.println("로또번호출력");
		for (int i = 0; i < 6; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println();

		// 입력번호 출력
		System.out.println("입력번호출력");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNum[i] + "\t");
		}

		System.out.println();

		// 맞춘번호 출력
		System.out.println("맞춘번호출력");
		for (int i = 0; i < count; i++) {
			System.out.print(arrNum[i] + "\t");
		}

		System.out.println();
		
		// 맞춘 개수 출력
		System.out.println(count);

	}

}
