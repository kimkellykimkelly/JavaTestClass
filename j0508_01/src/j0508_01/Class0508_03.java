package j0508_01;

public class Class0508_03 {
	
	static int num; //전역변수 - Class영역에서도 변수선언 가능. 기본값이 0
	
	public static void main(String[] args) {
		int num; //지역변수. 전역변수와 다르게 값을 지정해줘야함!
		num = 10;
		System.out.println("main메소드 num 호출 : "+num); // 값 지정안해주면 에러!
		sub();
	}
	
	static void sub() {
//		System.out.println(num);
		System.out.println("sub메소드 num 호출 : "+num);
		
	}
}
