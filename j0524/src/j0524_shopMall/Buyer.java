package j0524_shopMall;
// 다형성 / ArrayList list
import java.util.ArrayList; 
// => ArrayList 치고 ctrl shift m 누르면 import됨!

public class Buyer {

	String id;
	String pw;
	String name;
	String nickName;

	int money = 10000;
	int bonusPoint = 0;
	// 구매목록 담기 위해 cart 배열 10개 생성 + count 추가
    // int count = 0; // 구매 횟수
    // Product[] cart = new Product[10];
	
	// => 위 배열을 아래와 같이 Collection으로 변경하면,
	// 개수 제한 없음 + 값 삭제 가능 + 중간 값 삭제해도 공간이 비어있지 않고 채워짐!
	
	// 객체 추가: cart[i] = p; => list.add(p) //=> 여기서 p는 Object o = new Product();
	// 호출. 읽기: cart[0] => list.get(0)  
	// 총 개수: cart.length => list.size
    
	ArrayList list = new ArrayList(); // import 필요
    // 타입이 Object이므로 형 변환 해줘야하는데,
    // 아래와 같이 <Product>를 추가하면 형 변환 안해도 됨! + Product 관련된 것만 들어올 수 있음
	// => 특정 타입만 들어올 수 있게 하는 것: 제너릭!
//    ArrayList<Product> list = new ArrayList();

   
	// 기본 생성자
	Buyer() {
	}

	// 매개변수 생성자(id와 이름,닉네임 나오게 만들기)
	Buyer(String id, String name, String nickName) {
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}

	// Tv
//	void buy(Tv t) {
//		money -= t.price; // tv의 가격을 빼고 다시 money에 넣음.
//		bonusPoint += t.bonusPoint; // 현재 보너스에 추가해서 다시 보너스에 넣음.
//		System.out.println("구매한 제품:" + t.productName);
//		// 구매한 제품 이름 나오게 하기. 위와 같이 적던지
//		// 또는 Tv class에서 오버라이드하면 아래와 같이 쓸 수 있음
////	    System.out.println(t);
//	}
//
//	// Computer
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//		System.out.println("구매한 제품:" + c.productName);
//	}
//
//	// Speaker
//	void buy(Speaker s) {
//		money -= s.price;
//		bonusPoint += s.bonusPoint;
//		System.out.println("구매한 제품:" + s.productName);
//	}
//
//	// Washer
//	void buy(Washer w) {
//		money -= w.price;
//		bonusPoint += w.bonusPoint;
//		System.out.println("구매한 제품: " + w.productName);
//	}

	// 다형성!!!!!!!!
	// 아래와 같이 부모의 참조변수로 자식을 받으면, 위와 같이 제품마다 쓸 필요없음!
	void buy(Product p) { // Product p = new Tv();  		
		// 구매 시 잔액 조건 추가
		if (money < p.price) {
			System.out.println("보유 금액이 부족해서 상품을 구매할 수 없습니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("구매한 제품: " + p.productName);
		// count 추가함
//		cart[count] = p;
//		count++;
		// count를 아래와 같이 변경!
		list.add(p); // list에 데이터 추가
	}

	// 구매목록 메서드
//	void buyList() {
//		System.out.print("구매목록:");
//		for (int i = 0; i < count; i++) { 
//			if (i == 0) {
//				System.out.print(cart[i].productName);
//			} else {
//				System.out.print("," + cart[i].productName);
//			}
//		}
//	}
	
	// 위 구매목록 메서드를 cart[]배열대신 ArrayList list 사용해서 아래와 같이 변경
	void buyList() {
		System.out.print("구매목록:");
		for (int i = 0; i < list.size(); i++) {
			Product p = (Product) list.get(i); 
			// 타입이 Object 이므로 형 변환 해줘야함!
			// 위에서 ArrayList<Product>해주면 형 변환((Product)) 안해도 됨!
			// 윗 줄을 안쓰고 아래에서 p 대신 (Product) list.get(i).~ 바로 쓸 수 있음 (또는 list.get(i).~)
			if (i == 0) {
				System.out.print(p.productName);
			} else {
				System.out.print("," + p.productName);
			}
		} // for
	} // buyList()

	
}
