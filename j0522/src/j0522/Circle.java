package j0522;

public class Circle extends Shape { 
	
	// Shape class를 상속받아서 아래 내용이 자동으로 생성됨.

//	// 인스턴스 변수: 객체 선언 후 참조변수명.변수명
//	String color = "blue";
//
//	// 인스턴스 메소드: 객체 선언 후 참조변수명.메소드명
//	void draw() {
//		System.out.println("도형을 그린다");
//	}

	
	// 상속 안 받았을 경우, Shape class를 사용하려면 원래 아래와 같이 해야함.
//	Shape s = new Shape();
//	s.color = "white";
	

	
	// 다른 클래스 사용하려면 객체 선언 후 참조변수명.변수명
	Point center; // 참조변수만 선언. 참조변수를 받을 수 있는 주소변수만 존재. 공간도 만드려면 new를 써야함.
	
	int r; // 인스턴스변수: 객체선언 후 참조변수.
	
	// 생성자 - 클래스명과 일치, void 없음
	Circle(){
		this(new Point(0,0),100); // this(): 다른 생성자 호출
	}
	
	// 생성자
	Circle(Point center, int r){
		this.center = center; // this:인스턴스 변수 호출	
		this.r= r;
	}
	
	void draw() {
		System.out.println();
	}
	
	
	
}
