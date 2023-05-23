package j0523;

public class Deck { // 번호 넣는 클래스

	// 완성품 카드 52개 생성 (배열 선언. 공간도 없는 상태)
	Card[] c = new Card[52]; // 4종류*13 = 52장 (조커제외)

	// 기본 생성자
	Deck() {
		// 4종류 카드마다 13장 있어야함
		// => kind = null, number = 0 이 들어감 (저장 공간만 생기는 것)
		for (int i = 0; i < 4; i++) { // 모양
			for (int j = 0; j < 13; j++) { // 숫자
				c[(13 * i) + j] = new Card(Card.kinds[i], j + 1); // 클래스명.변수명 => Card.kinds
			}
		} // for

//		// (13*i)+j 대신 아래와 같이 k를 넣어서 할 수 있음
//		int k = 0;
//		for (int i = 0; i < 4; i++) { // 모양
//			for (int j = 0; j < 13; j++) { // 숫자
//				c[k] = new Card(Card.kinds[i],j+1);
//				k++;
//			}
//		}// for
	} // Deck

	// 메서드
	// 카드 뽑기 => c[0] = Space,1
	Card pick(int index) { 
		// Card: 객체 타입이자, return 타입
		// Card c = new Card();
		return c[index];
	}
	
	// 카드 섞기 0-51
	void shuffle() {
		
		for (int i = 0; i < 1000; i++) {
			int random = (int)(Math.random()*51); // 자리수 0-51
			Card temp = null; // Card: 객체 타입
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
			
		} 
	} // shuffle
		

} // class
