package j0515;

import java.util.Iterator;
import java.util.Scanner;

public class C0515_07_2차원배열에랜덤숫자넣고값입력시값변환 {

	public static void main(String[] args) {
		// 5,5배열 만드는데, 1-25까지 랜덤으로 섞어서 출력
		// + 내가 입력한 값에 x 표시 넣기
		
		Scanner scan = new Scanner(System.in);
		
		int random = 0, temp = 0;
		int input = 0; // 이전 class와 달라짐!!!

		// 배열 생성
		String[][] box = new String[5][5]; // => 나중에 x를 넣을거라 int -> string으로 바꿈

		int[] num = new int[25];

		// num에 {1~25} 넣기
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		} 

		// => num = {1~25} 무작위로 섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 25); // 25자리(0~24)
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		} 

		
		// box(2차원 배열)에 num값(1~25 무작위로 저장됨) 넣기
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = ""+num[5 * i + j]; //=>string으로 바껴서 "" 추가해줌
			}
		}
//	=>	box[0][0] = num[0] / box[0][1] = num[1] / box[0][2] = num[2] / box[0][3] = num[3] / ... 이런 식으로 넣는 것!


		// 무한반복 출력
		
		while(true) {
			
		// 상단번호 출력	
		System.out.print(" " +"|\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + "\t");
		}

		System.out.println();
		System.out.println("-------------------------------------------");

		// box 번호 출력
		for (int i = 0; i < box.length; i++) {
			System.out.print(i + "|\t");

			for (int j = 0; j < box[i].length; j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}

		// 박스 내 번호 입력 (이전 class에서 바뀐 부분: 여기부터 끝까지 + input의 형만 바뀜!) 
		
		System.out.println("1-25 중에 번호를 입력하세요>>");
		input = scan.nextInt(); 
		
		//번호 입력 시 x로 변경 (input 값과 박스 내 값 하나하나 비교)
		loop: for (int i = 0; i < box.length; i++) { 
			for (int j = 0; j < box[i].length; j++) {
				
				if (box[i][j].equals(input+"")) { 
					// => box는 string, input이 int이므로 이렇게 씀. input도 string으로 만들면 "" 필요없음?????????=> 아님. 질문하기!!!!
					box[i][j] = "x";
					break loop;
				}
			}
		}
		
		
		} //while
		
	}

}
