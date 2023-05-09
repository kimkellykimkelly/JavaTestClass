package j0509;

import java.util.Scanner;
// Scanner 사용 시 import 필요!
public class Class0509_03 {

	public static void main(String[] args) {	
				
		double kor = 0; 
		int eng = 98;
		int math = 100;
		String name = "홍길동";
		double total = kor + eng + math;
		double avg = total/3.0;
		
		// 데이터 입력 Scanner - 화면에서 입력을 받음.
		// 객체 = Class(여기서는 Scanner)를 사용하려면 new를 써야함.
		// 스트링 참고
//		String str = new String("aaa"); //원래 이렇게 써야하는데, 예외로 아래와 같이 쓸 수 있음.
//		String str2 = "aaa";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		name = scan.nextLine(); // next -> 홍 길동의 경우 홍만 받음. 
		
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextDouble();
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		
		System.out.println("----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t%.1f\t%d\t%d\t%.1f\t%.2f \n", name,kor,eng,math,total,avg);
	
	}

}
