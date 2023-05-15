package j0515;

import java.util.Scanner;

public class C0515_03_보물찾기_로또비슷 {

	public static void main(String[] args) {
		
		// 퀴즈: 10개 중 2개의 보물 찾기 프로그램을 구성해라.(꽝 - 0 8개, 1억보물 - 1, 10억 보물 - 2)
		// box배열 10개
		// arr배열 10개
		// 섞기 temp, random
		// scan -> input
		// while - 무한반복
		// 화면출력 - arr 출력, 번호 출력
		
		Scanner scan = new Scanner(System.in);
		
		// 변수 생성
		int temp = 0, random = 0, input = 0;
		
		// box, arr배열
		int[] box = {0,0,0,0,0,0,0,0,1,2};
		String[] arr = new String[10]; // 당첨, 꽝
		
		
		// arr에 ?넣기
		for (int i = 0; i < 10; i++) {
			arr[i] = "?";
		}
		
		// box 안 숫자 100번 섞기
		for (int i = 0; i < 100; i++) {
			random = (int)(Math.random()*10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}
		
		// while 반복
		while(true) {
			System.out.println("[보물찾기 프로그램]");
			
			for (int i = 0; i < 10; i++) {
				System.out.print((i+1)+"\t");
			}
			
			System.out.println();
			System.out.println("--------------------------------------------");
			
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i]+"\t");
			}
			
			System.out.println();
			System.out.println();
			
			// 번호 입력
			System.out.println("번호를 입력하세요>>");
			input = scan.nextInt();
			
			// 보물인지 아닌지 비교
			if (box[input-1] == 1) {
				arr[input-1] = "1억 보물";
			} else if (box[input-1] == 2) { // 이전 class와 여기만 다름!
                arr[input-1] = "10억 보물";
			} else {
				arr[input-1] = "꽝";
			}
				
		} // while
		
		
		
	}

}
