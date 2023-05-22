package j0519;

public class C0519_03 {

	public static void main(String[] args) {
		// 메소드 만들기

		int a = 10, b = 5;

		System.out.println("[두 수의 합]");
//		int total = a+b;


		int total = total(a,b);	
		System.out.printf("%d + %d = %d \n", a, b, total);
		
		
	} // main

	static int total(int a, int b) {
		int total = a + b;
		return total;
	}

}
