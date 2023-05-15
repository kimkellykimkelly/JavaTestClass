package j0512;

import java.util.Scanner;

public class C0512_01 {

	public static void main(String[] args) {
		// 성적입출력 프로그램 (0511_10 파일과 100% 똑같은 내용임)
		
		Scanner scan = new Scanner (System.in);
		
		// 변수 설정
		int input = 0;
		int count = 0; // 입력된 학생 수
		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		
		int[] total = new int[2];
		double[] avg = new double[2];
		
		
		while (true) {
			
			System.out.println("[성적입출력 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("원하는 번호를 입력하세요");
			
			input = scan.nextInt();
			
			switch (input) {
			
			case 1: // 입력
				for (int i = count; i < name.length; i++) { //입력완료한 사람 다음부터 입력 
					
					System.out.println((count+1)+"번째 이름을 입력하세요(0.이전페이지 이동)");
					name[i] = scan.next();
					
					if (name[i].equals("0")) {
						System.out.println("이전페이지로 이동합니다");
						break;
					}
					
					System.out.println("국어점수를 입력하세요");
					kor[i] = scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					eng[i] = scan.nextInt();
					System.out.println("수학점수를 입력하세요");
					math[i] = scan.nextInt();
					
					total[i] =  kor[i]+eng[i]+math[i];
					avg[i] =  total[i]/3.0;
					count++;
				}
				break;

			case 2: // 출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("-------------------------------------------------");
				
				for (int i = 0; i < count; i++) { //입력한 사람 수 만큼만 출력
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i],kor[i],eng[i],math[i],total[i],avg[i]);
				}
				break;
				
			
			} //switch
			
		} // while
		
			

	}

}
