package j0522;

public class C0522_07 {

	// 인스턴스 변수 => 초기값 안 넣어줘도 됨!(자동으로 설정됨=>자동으로 초기화됨)
	int x;
	int y = x; 
	char ch;
	String str;

	public static void main(String[] args) {
		// 지역변수는 꼭! 초기화를 해줘야함!!! -> 안해주면 에러!!!(중요!!!)

//		int a;
		int a = 0; // => 변수선언하면서 데이터넣는 것을 초기화라고 함.
		int b = a; // int a; 만 하면, 정의해주지 않았기 때문에 에러! -> int a = 0; 과 같이 값을 설정해줘야함!

		// a b x y 출력
		System.out.println(a);
		System.out.println(b);

		// 객체 선언 후 참조변수명.변수명
		C0522_07 c = new C0522_07();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println("ch: "+c.ch); // => 빈 공백
		System.out.println("str: "+c.str); // => null(무한대)
	
		
	// => 이렇듯, 생성자도 초기화를 담당함!
	
	}

}
