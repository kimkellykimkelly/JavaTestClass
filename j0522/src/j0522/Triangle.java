package j0522;
//
public class Triangle extends Shape {

	// 삼각형 - 점이 3개 필요 => 배열로 받음
	
	// 인스턴스변수
	Point[] p; 
	
	// 생성자1 (위 아래 생성자 중 한개만 사용하면 됨!)
	Triangle(Point[] p){
		this.p = p;
	}
	
	// 생성자2
	Triangle(Point p1, Point p2, Point p3){
//		point[] p = {p1, p2, p3};
		p = new Point[] {p1, p2, p3};
	}
	
	
	
	
}
