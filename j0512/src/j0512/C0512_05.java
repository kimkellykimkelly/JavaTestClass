package j0512;

import java.util.Scanner;

public class C0512_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 10진수를 2진수로 변경하는 프로그램(많이 쓰이진 않지만 구조 보기에 좋은 예시!)
		String[] binary = { "0000", "0001", "0010", "0011", "0100", 
				            "0101", "0110", "0111", "1000", "1001" }; 
		// 순서대로 2진수 binary[0] = 십진수 0, 2진수 binary[1] = 십진수 1, binary[2] = 2, binary[3] = 3, ...

		// 10진수 1025 = binary[1] binary[0] binary[2] binary[5]
		// binary[1] = 0001 
		// binary[0] =0000
		// binary[2] = 0010
		// binary[5] = 0100
		
		// 1개씩 번호 입력하는 방법
		int[] num = new int[4];
		for (int i = 0; i < num.length; i++) {
			System.out.println("번호를 입력하세요");
			num[i] = scan.nextInt();
		}

		// 입력한 10진코드 출력
		System.out.println("입력한 10진코드 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		
		System.out.println();
		
		// 2진코드로 출력
		System.out.println("2진코드 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(binary[num[i]]+ " "); // binary[num[i]] 내용 중요!
		}
		
		System.out.println();
	
		// -> int로 받으면 0125는 표시할 수 없고, 하나하나 짜를 수 없음 => string으로 받아야함!

	}

}
