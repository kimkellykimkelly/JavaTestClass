package j0517;

import java.util.Arrays;
import java.util.Scanner;

public class C0517_08 {

	public static void main(String[] args) {
		// 퀴즈: 3개의 숫자를 입력받아 작은수부터 순차적으로 출력해라
		// calculate() 메소드 만들어서 사용
//		=> Arrays.sort(arr); 쓰면 되지만, 메소드를 만들어서 해보기!

		Scanner scan = new Scanner(System.in);

		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}

		calculate(num);
		
		
	} // main

	static void calculate(int[] num) {
		//최대값
		int max = Math.max(Math.max(num[0], num[1]),num[2]);
		//최소값
		int min = Math.min(Math.min(num[0], num[1]),num[2]);
		// 중간값
		int middle = (num[0]+num[1]+num[2])-max-min;
		
		num[0] = min;
		num[1] = middle;
		num[2] = max;
		
		}
		
		
		
		
		
		
		
		



} // class
