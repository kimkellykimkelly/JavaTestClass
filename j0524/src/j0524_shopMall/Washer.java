package j0524_shopMall;

public class Washer extends Product {

	// Product 상속을 통해 아래 내용이 선언된 것! 
//	String productName;
//	int price;
//	int bonusPoint;
//	int sale;
	
	int size = 21;
	String color = "white";
	
	// 기본 생성자
	Washer(){
		productName = "그랑데 세탁기";
		price = 120;
		bonusPoint = 12;
		sale = 10;
	}
	
	
	
}
