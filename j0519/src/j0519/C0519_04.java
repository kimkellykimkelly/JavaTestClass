package j0519;

import java.util.Scanner;

public class C0519_04 {

	public static void main(String[] args) {
		// 번호 국 영 수 점수를 입력받아, calculate() 합계 평균을 구해서 return
		//  
		String[] title = {"번호","국어","영어","수학","합계","평균"};
		int[] arr = new int[6];
	
		Scanner scan = new Scanner(System.in);
		
		// 입력
		for (int i = 0; i < 4; i++) { // 합계 평균 안받을거니까 4번만 반복
			System.out.println(title[i]+"를 입력하세요");			
			arr[i] = scan.nextInt();
		}
		
		calculate(arr); // 받을 값이 합계, 평균 두 개이므로 arr 전체를 적음 
		// 메서드로 받을 값이 여러 개인 경우 => 배열을 만듦!!!!!!!!!!!!!!!!
		
		// 출력
		System.out.printf("번호: %d \n", arr[0]);
		System.out.printf("국어: %d, 영어: %d, 수학: %d \n", arr[1],arr[2],arr[3]);
		System.out.printf("합계: %d \n", arr[4]);
		System.out.printf("평균: %d \n", arr[5]);
		
		
	} // main

	static void calculate(int[] arr) { // 참조형 변수는 return 안해도 되니까 void
		arr[4] = arr[1] + arr[2] + arr[3];
		arr[5] = arr[4] / 3;
	}

} // class
