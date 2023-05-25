package j0524_shopMall;

public class ShopMain {

	public static void main(String[] args) {
		// 쇼핑몰 프로그램_다형성 / ArrayList list

		System.out.println("[삼성 쇼핑몰]");
		System.out.println("1. QLED TV 70인치");
		System.out.println("2. 갤럭시 북");
		System.out.println("3. 홈 미니 블루투스 스피커");
		System.out.println("---------------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요");

		// 원래 먼저 id,pw 확인 후 맞으면 객체 선언해야함

		// 객체 선언과 동시에 id와 이름 들어가게 만들기
		Buyer b = new Buyer("hong", "홍길동", "길동스");
		System.out.println("이름: " + b.name);
		System.out.println("닉네임: " + b.nickName);

		///////////
		// tv 구매 후 잔액
		Tv t = new Tv();
		b.buy(t);
		System.out.println("잔액: " + b.money);

		// 컴퓨터 구매 후 잔액
		Computer c = new Computer();
		b.buy(c);
		System.out.println("잔액: " + b.money);

		// 스피커 구매
		b.buy(new Speaker());
		System.out.println("잔액: " + b.money);

		// Class Washer 그랑데 세탁기 120, 12, 10 만들어서 구매해보기
		b.buy(new Washer());
		System.out.println("잔액: " + b.money);
		
		System.out.println("------------------------------");
//		System.out.println("구매개수: " + b.count);
		// count 대신 list로 변경
		System.out.println("구매개수: " + b.list.size());
		
		// 구매목록 cart 출력하려면? 
//		System.out.print("구매목록:");
//		for (int i = 0; i < b.count; i++) {
//			if (i == 0) {
//				System.out.print(b.cart[i].productName);
//			} else {
//				System.out.print(","+b.cart[i].productName);				
//			}
//		} 
//		=> 위 내용(구매목록)을 Buyer class에서 메서드로 만들어서 호출함
		b.buyList();
		

	}
}
