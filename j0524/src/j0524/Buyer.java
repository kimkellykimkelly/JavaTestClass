package j0524;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;
	
	Product[] cart = new Product[10];
	
//	void buy(Stv s) {
//		money -= s.price; // 150
//		bonusPoint += s.bonusPoint;
//	}
//	// 오버로딩 가능
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
	
	// => 위를 Product p로 받음 (다형성)!!!!
//	Product p = new Stv();
//	Product p = new Computer();
//	Product p = new Audio();
	
	int count = 0; // cart때문에 추가
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[count] = p;
		count++;
	}
	
//	=> Product만 상속받으면 새로운 제품이 생겨도 위 하나로 가능!!!
	
}
