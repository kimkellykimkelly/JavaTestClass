package j0522;

public class Point {
	
	//인스턴스 변수
	int x;
	int y;
	
	//생성자: 클래스명과 일치하고 void없음
	Point(){
		this(0,0); // 다른 생성자 호출
	}
	
	// 매개변수 생성자
	Point(int x, int y){
		this.x = x; // this 인스턴스 변수 / x: 지역변수-메소드 내
		this.y = y;
	}
}
