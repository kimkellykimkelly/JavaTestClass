package j0522;

public class C0522_09 {

	public static void main(String[] args) {
		//

		Product p1 = new Product();
		System.out.println(p1.count); //=>1
		System.out.println(p1.serialNo); //=>1
		// int count = 0;
		// int serialNo = 0;
		// 초기화블럭: count = 1, serialNo = 1;
		// 생성자

		Product p2 = new Product();
		System.out.println(p2.count); //=>2
		System.out.println(p2.serialNo); //=>2

		// int count = 1; (클래식변수로, 같은 변수를 쓰므로 그대로 1임!)
		// int serialNo = 0;
		// 초기화블럭: count = 2, serialNo = 2;
		// 생성자
		
		//
		System.out.println(p1.count); //=>2 => 클래스변수는 공통으로 쓰이기 때문에 Product.count 로 쓰기!

	}

}
