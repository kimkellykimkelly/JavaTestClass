package c0525_01_02_ArrayList인터페이스;

import java.util.ArrayList;
import java.util.Iterator;

public class C0525_01_배열vsArrayList { // 배열 vs ArrayList(추가, 읽기, 제거)

	public static void main(String[] args) {

		// 객체 선언
		Card c1 = new Card(Card.kinds[0], 1);
		Card c2 = new Card(Card.kinds[1], 2);
		Card c3 = new Card(Card.kinds[2], 3);
		Card c4 = new Card(Card.kinds[3], 4);

		// 배열 vs ArrayList
		// 배열 쓸 경우
		Card[] c = new Card[3];
		c[0] = c1;
		c[1] = c2;
		c[2] = c3;

		// ArrayList 제너릭 안 할 경우
//		ArrayList list = new ArrayList();

		// ArrayList 제너릭
		ArrayList<Card> list = new ArrayList<>();

//		// ArrayList 추가: list.add(매개변수). 매개변수의 type: Object!
		list.add(c1); // 0 => Object o = new Object(Card.kinds[1],1)
		list.add(c2); // 1
		list.add(c3); // 2
		list.add(c4); // 3
//		
//		// ArrayList 읽기: list.get(). 
//		list.get(0);
//		System.out.println(c1);
//		System.out.println(list.get(0));
//		// 같은 주소값이 나옴. c[0] = c1 = list.get(0) 
//		
//		Card card = (Card)list.get(0); // Object를 Card에 넣으려니 형변환을 해줘야함!
//		System.out.println(card.kind+","+card.number);

		// ArrayList 제너릭
//		ArrayList<Card> list = new ArrayList<>();
		System.out.println(list.get(0).kind + "," + list.get(0).number);

		// ArrayList 읽기 _ for 사용
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + "," + list.get(0).number);
		}

		System.out.println("개수: " + list.size());
		System.out.println("-------------------------");

		// ArrayList 제거: list.remove()
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number);
		}

		System.out.println("-------------------------");

		// 퀴즈: list안에 kind - heart 삭제
		// 삭제
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).kind.equals("HEART")) {
				list.remove(i);
			}
		}
		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number);
		}
		
		System.out.println("-------------------------");
		
		// 퀴즈: list안에 number - 4 삭제
		// 삭제
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).number == 4) {
				list.remove(i);
			}
		}
		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).kind + "," + list.get(i).number);
		}

	}

}
