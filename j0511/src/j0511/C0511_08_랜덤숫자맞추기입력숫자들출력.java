package j0511;

import java.util.Scanner;

public class C0511_08_랜덤숫자맞추기입력숫자들출력 {

	public static void main(String[] args) {
		// 랜덤숫자맞추기
		// 10번 기회가 주어지고, 정답 확인 시 입력한 번호를 출력해라
		// 복습하면서 이 프로그램의 문제점 찾음 => apply 파일에서 보완해봄
	
		Scanner scan = new Scanner (System.in);
		
		int random = 0; 
		int count = 0; // 도전횟수
		int[] num = new int[10]; // 입력한 숫자 저장
		
		random = (int)(Math.random()*10)+1; // => 1~10
		System.out.println("랜덤숫자 : "+random);
		
		while (true) {
			// 몇 번 도전했는 지 확인 -> //10번 넘으면 탈출 
			if (count>9) { 
				System.out.println("10번 도전함. 프로그램 종료");
				break;
			}
			// 도전번호 입력
			System.out.println((count+1)+"번째 숫자를 입력하세요>>");
			num[count] = scan.nextInt();
			if (num[count] == random) {
				System.out.println("정답");
				break; // while 탈출
				// 이 프로그램의 문제점: 10번 전에 맞추면, count가 안돼서 입력한 숫자 출력이 안됨!
			} else {
				System.out.println("오답. 다시 도전하세요");
			}
			count++; //c => count = 10
		}
		
		// 입력한 숫자 출력
//		System.out.println("정답 : "+random);
//		for (int i = 0; i < count; i++) {
//			System.out.println("입력한 숫자 : "+num[i]);
//		}

		// 위 입력한 숫자 출력 시 "입력한 숫자: ~, ~, ~ " 와 같이 쭉 나오게 하기
		System.out.println("정답 : "+random);
		System.out.print("입력한 숫자 : ");
		
		for (int i = 0; i < count; i++) {
			if (i == 0) {
				System.out.print(num[i]);
			} else {
				System.out.print(","+num[i]);				
			}
		}

	}

}
