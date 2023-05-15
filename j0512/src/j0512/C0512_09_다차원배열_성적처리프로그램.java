package j0512;

import java.util.Scanner;

public class C0512_09_다차원배열_성적처리프로그램 {

	public static void main(String[] args) {
		// 다차원배열 퀴즈: 이름, 평균도 추가로 입력하기
		// 이름국영수합계(자동) 2명
		
		Scanner scan = new Scanner (System.in);
		
		int[][] score = new int[2][4]; // =>2명
		String[] title = {"이름", "국어", "영어", "수학", "합계", "평균"};
		String[] name = new String[2];
		double[] avg = new double[2];
		 
		//점수 입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 학생");
			
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
		
			for (int j = 0; j < (score[i].length)-1; j++) {	// 합계 입력 안하기위해
				System.out.println(title[j+1]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();	
			}
			score[i][3] = score[i][0] + score[i][1] + score[i][2]; 
			avg[i] = score[i][3]/3.0;
			
		}
		

		//점수 출력
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s \t", title[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
		
			System.out.print(name[i]+"\t");
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			
			System.out.printf("%.2f \t", avg[i]);
			
			System.out.println();
		}
		
	}
}
