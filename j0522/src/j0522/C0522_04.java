package j0522;

import java.util.Scanner;

public class C0522_04 {

	public static void main(String[] args) {
		// C0522_03에서 매개변수 생성자 추가
		Scanner scan = new Scanner(System.in);

		// 객체 배열
		Data[] d = new Data[2];
		
		// 변수 선언
		int n1 = 0, n2 = 0;

		// 생성자 사용하니까 이렇게 간단해짐
		for (int i = 0; i < 2; i++) {

			System.out.println((2*i+1)+"번째 숫자를 입력하세요");
			n1 = scan.nextInt();

			System.out.println((2*i+2)+"번째 숫자를 입력하세요");
			n2 = scan.nextInt();

			// 객체 선언
//			d[i] = new Data(); // 기본 생성자
			d[i] = new Data(n1, n2); // 매개변수 받는 생성자

		}

	}

}
