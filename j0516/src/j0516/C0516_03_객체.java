package j0516;

public class C0516_03_객체 {
	
	String name = "";
	int kor = 0;
	int total = 0;

	public static void main(String[] args) {
		// Student class 이용

		Student s1 = new Student(); // 객체 선언
		// 객체를 생성하다 = 인스턴스를 생성하세요

		// 객체는 여러 개. 클래스는 하나.

        // 클래스 안에 변수, 메서드(우리가 이제까지 사용한 것은 메인 메서드 등) 있음
		
		///////////////////////////
		
		// Tv class 이용
		
//		Tv t;
//		t = new Tv();
		Tv t = new Tv(); // 객체 t 선언 (변수 선언처럼, 객체를 선언해야 쓸 수 있음!) 
		// t: 참조형 변수(기본형 변수 8개 빼고 모두 참조형 변수.)는 위와 같이 해야 사용할 수 있음
		t.color = "white";
		System.out.println("t.color");
		
		Tv t2 = new Tv();
		t2.color = "red";
		System.out.println("t2.color");
		

}
