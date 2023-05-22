package j0518;

import java.util.Scanner;

public class C0518_03_scanner {

	public static void main(String[] args) {
		// Scanner - 입력받을 때 사용(자바 이후에는 사용할 일이 없음)

		Scanner scan = new Scanner(System.in);
		
//		// 숫자
//		int num = scan.nextInt();
//		double d = scan.nextDouble();
//		
//		// 문자열 nextLine(); => 개행 문자(Enter)까지의 한 줄을 입력받음. 즉, 공백을 포함한 한 줄의 문자열을 반환. 
//		String str = scan.next(); => 공백을 기준으로 한 단어(문자열)를 입력받음.
		
		// 숫자 2개를 입력받아(1,10) 1부터 10까지의 합을 구해라
	
		System.out.println("첫번째 숫자를 입력하세요");
		int n1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int n2 = scan.nextInt();
		
		int temp = 0;
		
		if (n1>n2) { // => n1과 n2를 바꿈
			temp = n1; // n1 = temp 로 적으면 n1에 0을 넣는 것!!!!!!!!!
			n1 = n2;
			n2 = temp;
		} // => n1=n2, n2=n1이 되어, n1은 작은 수, n2는 큰수가 됨!
	
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
