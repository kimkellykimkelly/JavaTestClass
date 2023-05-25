package j0524;

public class Shopping_매개변수의다형성 {

	public static void main(String[] args) {
		// 매개변수의 다형성
		System.out.println("[쇼핑몰 프로그램]");
		System.out.println("1. Stv");
		System.out.println("2. Computer");
		System.out.println("3. Audio");
		System.out.println("-------------------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요");
		
		// Stv 구매
		Buyer b = new Buyer(); // Buyer class 사용 위해 객체 선언
		Stv s = new Stv(); // Buyer class의 buy 메서드 사용위해 Stv s 객체 선언
		b.buy(s); // => b.buy(new Stv()); 윗 줄 없이 이렇게도 가능
		
		System.out.println("잔액: " +b.money);
		System.out.println("보너스포인트: "+b.bonusPoint);

		// Stv 한 대 더 구매
		b.buy(s);
		
		System.out.println("잔액: " +b.money);
		System.out.println("보너스포인트: "+b.bonusPoint);
		
		// Computer 2대 구매
		b.buy(new Computer());
		b.buy(new Computer());
		
		System.out.println("잔액: " +b.money);
		System.out.println("보너스포인트: "+b.bonusPoint);
	
		
		
	}

}
