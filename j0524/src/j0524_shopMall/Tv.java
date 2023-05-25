package j0524_shopMall;

public class Tv extends Product {

	// Product 상속을 통해 아래 내용이 선언된 것! 
//	String productName;
//	int price;
//	int bonusPoint;
//	int sale;
	
	int inch = 70;
	String color = "black";
	
	// 기본 생성자
	Tv(){
		productName = "QLED";
		price = 150;
		bonusPoint = 15;
		sale = 10;
	}

	// 구매제품이 바로 나오게 하기
	// 오버라이드
//	public String toString() {
//		return "구매: "+productName;
//	}
	
	
	
	
}
