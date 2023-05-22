package j0518;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.border.MatteBorder;

public class C0518_07_숫자맞추기 {

	public static void main(String[] args) {
		// 1-100까지 랜덤 숫자를 생성해서 숫자를 맞추는 프로그램 구현. (횟수 10번 가능/내가 입력한 수와 정답 출력)
		// (교수님이 내주신 문제: random으로 생성된 수 1개가 정답 / 내가 푼 문제: 중복되지 않는 10개 숫자가 정답)
		Scanner scan = new Scanner(System.in);

		// 변수
		int random, temp;

		// 배열 생성
		int[] box = new int[100]; 
		int[] input = new int[10]; // 내가 입력한 값

		// box에 1~100 값 넣기
		for (int i = 0; i < box.length; i++) {
			box[i] = i + 1;
		}

		// box 값 100번 섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 100); // 0~99
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		} // => 1~100 모두 섞임

		// 숫자 맞추기 프로그램(기회 10번)
		System.out.println("숫자 맞추기 게임(총 기회 10번)");
		System.out.println("------------------------------");

		for (int i = 0; i < 10; i++) {
			// 숫자 입력
			System.out.println("1~100 중 숫자 하나를 입력하세요");
			System.out.println((i + 1) + "번째 기회입니다");

			input[i] = scan.nextInt();

			if (input[i] == box[i]) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("틀렸습니다. 다시 입력하세요. " + (9 - i) + "번 기회 남음 ");
			}
			System.out.println();
		}

		// 정답과 내가 입력한 수 출력

		System.out.print("정답:       ");
		for (int i = 0; i < 10; i++) {
			System.out.print(box[i] + "\t");
		}
		
		System.out.println();
		
		System.out.print("내가 입력한 수:");
		for (int i = 0; i < 10; i++) {
			System.out.print(input[i] + "\t");
		}

	}

}
