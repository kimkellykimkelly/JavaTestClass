package j0515;

import java.util.Scanner;

public class C0515_02 {

	public static void main(String[] args) {
		// 10개의 상자(0~9) 중 3개의 보물 찾기 게임
		// 0 7개, 1 3개 만들어서,, 1 선택하면 보물당첨!

		Scanner scan = new Scanner(System.in);

		// 변수 생성
		int temp = 0, random = 0, input = 0;

		// box, arr 10개 배열 만들기
//		int[] box = {0,0,0,0,0,0,0,1,1,1}; 와 같이 바로 값을 넣을 수도 있지만, 수가 클 경우 아래와 같이 for문 사용.  
		int[] box = new int[10]; // 10자리
		String[] arr = new String[10]; // 당첨 꽝

		// box에 0-7개, 1-3개 넣기
		for (int i = 0; i < box.length; i++) {
			if (i < 7) {
				box[i] = 0;
			} else {
				box[i] = 1;
			}
		} 

		// 100번 섞기 => box 안 0,1(총10개)을 무작위로 섞음.
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}

		
		// arr 10자리에 모두 "?" 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "?";
		}
		
		while(true) {
		
		// 화면 출력
		System.out.println("[보물찾기 프로그램]");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf((i+1) + "\t");
		} // => 1~10 출력

		System.out.println();

		System.out.println("---------------------------------------------------------------------------------");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf(arr[i] + "\t");
		} // => ? 10번 출력

		System.out.println();
		System.out.println();
		
		// 번호 입력
		System.out.println("번호를 입력해주세요>>");
		input = scan.nextInt();
		
		// 입력된 번호가 보물인지 아닌지 비교
		if (box[input-1] == 1) {
			arr[input-1] = "보물";
		} else {
			arr[input-1] = "꽝";			
		}
		
	} // while
		
	}

}
