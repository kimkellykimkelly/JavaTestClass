package c0525_01_02_ArrayList인터페이스;

import java.util.ArrayList;
import java.util.Iterator;

public class C0525_02_01apply {

	public static void main(String[] args) {
		// 퀴즈
		ArrayList<Card> list = new ArrayList<>();

		// 객체 선언
//		Card c1 = new Card(Card.kinds[0],1);
//		Card c2 = new Card(Card.kinds[0],2);
//		Card c3 = new Card(Card.kinds[0],3);

		// 배열에 넣기
//		list.add(c1); // => list.add(new Card(Card.kinds[0],1)); 
//		list.add(c2);
//		list.add(c3);

		// 퀴즈1 - "SPACE" 카드, 번호 1~13까지 넣고 출력하기
		// 넣기
		for (int i = 0; i < 13; i++) {
			list.add(new Card(Card.kinds[0], i + 1));
		}
		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number);
		} // 번호 A~K 넣고 출력하려면 list.get(i).number -> Card.numbers[list.get(i).number] 변경!!!

		System.out.println("-------------------------------");
		
		// 퀴즈2 - 카드 4개를 만들어서, kinds 4종류 넣어라
		for (int i = 0; i < 4; i++) {
			list.add(new Card(Card.kinds[i], 1));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number);
		}
		
		// 퀴즈3 - 카드 52장, 종류4개 숫자는 모두 1로 출력_for 1번만 쓰기
//		kinds[0] 13번, kinds[1] 13번, ... 나와야함 => 똑같은 수가 반복되므로 몫 필요!
		for (int i = 0; i < 52; i++) {
			list.add(new Card(Card.kinds[i/13],1)); 
		}
		
		// 퀴즈4 - 퀴즈3 + 숫자도 1~13 나오게 하기
//		숫자가 1~13, 1~13 반복되어야함 => 수가 1씩 커지고 이게 세트로 반복되므로 나머지 필요!
		for (int i = 0; i < 52; i++) {
			list.add(new Card(Card.kinds[i/13], i%13+1)); 
		}
		
		
		
		
		
	}

}
