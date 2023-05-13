package j0511;

import java.util.Scanner;

public class C0511_09 {

	public static void main(String[] args) {
		// 성적처리프로그램
		// 1. 이름 2. 국어 3. 영어 4. 수학 넣으면 합계, 평균 자동으로 들어갈 수 있도록 하기

		Scanner scan = new Scanner(System.in);

//		String name = "";
//		int kor = 0, eng = 0, math = 0, total = 0;
//		double avg = 0;
//		
//		System.out.println("이름을 입력하세요");
//		name = scan.next();
//		System.out.println("국어점수를 입력하세요");
//		kor = scan.nextInt();
//		System.out.println("영어점수를 입력하세요");
//		eng = scan.nextInt();
//		System.out.println("수학점수를 입력하세요");
//		math = scan.nextInt();
//		
//		// 자동계산
//		total = kor+eng+math;
//		avg = total/3.0;
//		
//		//출력
//		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
//		System.out.println("---------------------------------------------");
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name,kor,eng,math,total,avg);

		// 위 내용을 여러 명 출력하고 싶으면 for문을 돌리면 되는데, 변수 때문에 배열을 사용해야함!

		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];

		for (int i = 0; i < name.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math[i] = scan.nextInt();
			
			// 자동계산
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
			
		}

		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);

		}

		
		// => (단점) 다 입력하기 전까지는 나갈 수가 없음 => 단점 보완은 다음 class 보기.
		
	}

}
