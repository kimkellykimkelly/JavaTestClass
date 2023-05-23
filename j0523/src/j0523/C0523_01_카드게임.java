package j0523;

import java.util.Iterator;

public class C0523_01_카드게임 {

	public static void main(String[] args) {
		// 

		// 객체 선언
		Deck d = new Deck(); // => c만 존재
		
		// 출력
//		for (int i = 0; i < 52; i++) {
//				System.out.printf("%s %d \n", d.c[i].kind, d.c[i].number);
//		}
		
		// 카드뽑기 메소드 = d.pick(번호)
		System.out.printf("%s, %d \n", d.pick(0).kind, d.pick(0).number);
		
		// 카드섞기
		d.shuffle();

		// 출력
		for (int i = 0; i < 52; i++) {
				System.out.printf("%s %s \n", d.c[i].kind, Card.numbers[d.c[i].number]);
		}
	
		// toString()을 쓰면 위 출력값을 아래와 같이 써도 값이 나옴!!!
		for (int i = 0; i < 52; i++) {
			System.out.printf("%s \n", d.c[i]);
	}
		
		
	} // main

} // class
