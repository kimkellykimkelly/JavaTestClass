package j0510;

import java.util.Scanner;

public class C0510_07 {

	public static void main(String[] args) {

		// 랜덤숫자: 0 < Math.random() <= 1

//		double random = 0;
//		random = Math.random();
//		System.out.println(random);

//		int random = 0;
//		
//		random = (int)(Math.random()*10); // 0~9 정수
//		random = (int)(Math.random()*10)+1; // 1~10 정수
//		random = (int)(Math.random()*45)+1; // 1~45 정수
//		random = (int)(Math.random()*45); // 0~45 정수
//		random = (int)(Math.random()*3)+1; // 1~3 정수
//		
//		System.out.println(random);

		
		// 숫자를 입력받아(1,2,3), 랜덤 값과 같은 값일 경우 당첨, 그렇지 않으면 꽝

		int random = (int)(Math.random()*10) +1; // => 1~10 정수
		int i = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		i = scan.nextInt();

		if (i == random) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
		
		System.out.println();
		System.out.println("랜덤숫자 :" +random);
		System.out.println("입력숫자 :" +i);

	}

}
