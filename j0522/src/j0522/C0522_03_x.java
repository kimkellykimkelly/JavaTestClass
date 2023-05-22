package j0522;

import java.util.Scanner;

public class C0522_03_x {

	public static void main(String[] args) {
		// C0522_02에서 기본 생성자, 객체 선언(Data class 사용/배열 없어지고 객체 배열로 만듦)하는 걸로 변경
		
		Scanner scan = new Scanner(System.in);
		
//		// 객체 선언
//		Data d = new Data();
//		
//		System.out.println("1번째 숫자를 입력하세요");
//		d.num1 = scan.nextInt();
//
//		System.out.println("2번째 숫자를 입력하세요");
//		d.num2 = scan.nextInt();
//
//		d.data1 = d.num1 + d.num2;
//		System.out.println(d.data1);
//		d.data2 = d.num1 - d.num2;
//		System.out.println(d.data2);
//		d.data3 = d.num1 * d.num2;
//		System.out.println(d.data3);
//		d.data4 = d.num1 / d.num2;
//		System.out.println(d.data4);

		
		// 위를 for문으로 돌리기

		// 객체 배열
		Data[] d = new Data[2];
		
		for (int i = 0; i < 2; i++) {
			// 객체 선언
			d[i] = new Data(); // (오류떴다면 생성자 추가해서 오류뜬것)
			
			System.out.println((2*i+1)+"번째 숫자를 입력하세요");
			d[i].num1 = scan.nextInt();
	
			System.out.println((2*i+2)+"번째 숫자를 입력하세요");
			d[i].num2 = scan.nextInt();
	
			d[i].data1 = d[i].num1 + d[i].num2;
			System.out.println(d[i].data1);
			d[i].data2 = d[i].num1 - d[i].num2;
			System.out.println(d[i].data2);
			d[i].data3 = d[i].num1 * d[i].num2;
			System.out.println(d[i].data3);
			d[i].data4 = d[i].num1 / d[i].num2;
			System.out.println(d[i].data4);
			
		}
		
		

	}

}
