package j0512;

import java.util.Scanner;

public class C0512_08 {

	public static void main(String[] args) {
		// 다차원배열 퀴즈: 합계를 자동으로 출력하려면?
		// 국영수합계(자동) 5명
		
		Scanner scan = new Scanner (System.in);
		
		int[][] score = new int[5][4];
		String[] title = {"국어", "영어", "수학", "합계"};
		
		//점수 입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 학생");
			for (int j = 0; j < (score[i].length)-1; j++) {	// 합계 입력 안하기위해
				System.out.println(title[j]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();	
			}
			score[i][3] = score[i][0] + score[i][1] + score[i][2]; // 이게 퀴즈!!!
		}
		
		
		//점수 출력
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s \t", title[i]);
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
