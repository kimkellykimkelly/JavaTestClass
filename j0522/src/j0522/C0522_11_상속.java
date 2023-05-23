package j0522;

public class C0522_11_상속 {

	public static void main(String[] args) {

		// 클래스 사용하는 방법 2가지 (1. 상속 / 2. 포함)

		// 1. 상속
		// => 잘 안쓰임. 객체 배열로 대체. 개념만 알기.
		// + 추상클래스, 인터페이스, 다형성(중요) 사용 시 알아야함!!!

		// 상속: 부모 자식 손자 끼리 관계가 있지만, 자식1 자식2와는 아무 관계가 없음!!!
		// + 부모가 바뀌면 자식, 손자 바뀌지만,/ 손자 바뀌면 자식, 부모 안바뀜

		// 2. 포함 = 객체 선언
		// 이제까지 우리가 한게 포함임.

		//////////////////

		// 해당 예제는 복잡하니까 모두 이해할 필요는 없고, 
		// + 객체 선언과 매개변수 넣는 방법 알기!!!

		// 원 만들기
		// 객체 선언
		Circle c1 = new Circle(); // => (0,0)이 원점이고 r=100인 원이 기본으로 생성됨.

		Point center = new Point(150, 150);
		Circle c2 = new Circle(center, 50);
		// 위 두 줄은 아래와 같음
		// Circle c2 = new Circle(new Point(150,150),50);
		// c2 변수 => x=150, y=150, r=50

		// 삼각형
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };
		Triangle t1 = new Triangle(p); // 생성자 1 사용
		Triangle t2 = new Triangle(p[0], p[1], p[2]); // 생성자 2 사용

	}

}
