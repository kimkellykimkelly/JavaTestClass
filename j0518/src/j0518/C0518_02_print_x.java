package j0518;

public class C0518_02_print_x {

	public static void main(String[] args) {
		// print, println, printf (복습필요없음)

		int a = 10;
		int b = 100;
		System.out.println("a:" + a + ", b:" + b);

		int num = 1, num2 = 2, num3 = 3;
		System.out.println("num = " + num + ", num2 = " + num2 + ", num3 = " + num3);
		System.out.printf("num = %d, num2 = %d, num3 = %d", num, num2, num3);

		System.out.println();
		
		System.out.println(10/3.0); //3.3333
		System.out.printf("%.2f",10/3.0);
	}

}
