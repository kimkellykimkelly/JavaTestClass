package j0522;

public class C0522_06_this {

	public static void main(String[] args) {
		// this() 있는 기본생성자 사용 & 매개변수생성자 사용 (Car class 참고)

		// 기본생성자 사용해서 변수 출력
		Car c = new Car(); // 객체 선언

		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);

		// 매개변수가 있는 생성자 사용해서, red auto 5 출력
		Car c2 = new Car("red", "auto", 5); // 객체 선언

		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);

		/////////////////
		// c3에 c2를 복사하고 싶을 때

//		// 참조변수 선언 
//		Car c3 = null;
//		// 복사 가능? => 복사가 되긴 되지만, 값을 나중에 바꾸면 같이 바껴버림.
//		c3 = c2;

		// 객체 선언 => 생성자를 이용한 인스턴스 복사. 참조변수로 객체를 받을 수 있음. 
		Car c3 = new Car(c2); // 복사되고, 서로 다른 주소이기 때문에 나중에 한 객체 내용 바꿔도 다른 객체에 영향을 주지 않음!
		// 우리가 위와 같이 쓰는 경우는 잘 없음. 

	}

}
