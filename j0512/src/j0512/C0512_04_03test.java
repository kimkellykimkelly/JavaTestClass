package j0512;

import java.util.Scanner;

public class C0512_04_03test {

	public static void main(String[] args) {

//		로또 번호 생성 프로그램
		Scanner scan = new Scanner(System.in);

		// 변수 선언
		int random = 0; // 랜덤번호
		int temp = 0; // 임시저장변수(C0511_12 참고)
		int count = 0; // 당첨번호개수

//		1. 배열 생성
		int[] lotto = new int[45]; // 로또 번호
		int[] myNum = new int[6]; // 입력번호
		int[] lottoNum = new int[6]; // 당첨 번호

//		2. 로또 번호 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 1,2,3,...45
		}

//		3. 로또 번호 섞기 (1000번)
		for (int i = 0; i < 1000; i++) {
			random = (int)(Math.random()*45); //0~44자리
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
			
			
		}

//		4. 로또 번호 입력

//		5. 로또 번호 개수 확인

//		6. 로또 번호 출력
//		7. 입력 번호 출력
//		8. 당첨 번호 출력
//		9. 당첨 개수 출력

	}

}
