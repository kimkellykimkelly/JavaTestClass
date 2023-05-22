package j0522;

public class Car {

	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);
		// this() => 기본값을 설정해줌!
		// 위와 같이 this() 사용안하면 아래와 같이 다 적어줘야함!
		// + 지역변수와 인스턴스변수가 같을때만 this를 붙임. 여기서는 똑같은 변수가 없으므로 this없이 쓸 수 있음
//		color = "white";
//		gearType = "auto";
//		door = 4;
	} 

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	////////////
	// 객체를 복사하고 싶을 때 (참조변수로 객체를 받을 수 있음)

	Car(Car c){
		this(c.color, c.gearType, c.door); // 위 매개변수 생성자 호출/또는 아래와 같이 하나하나 적음
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
	}
	
	
	
	
}
