package j0512;

import java.util.Scanner;

public class C0512_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// 2차원 배열		
		int[][] score = new int[5][3]; // 국영수 5명
		String[] title = {"국어", "영어", "수학"};
		
		
		// 점수 입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 : "); // 몇번째 학생인지 추가해줌. 
			for (int j = 0; j < score[i].length; j++) {
				System.out.println(title[j]+"점수를 입력하세요"); // 이걸 위해 String[] title 정의함.
				score[i][j] = scan.nextInt();
			}
		}

		// 출력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
