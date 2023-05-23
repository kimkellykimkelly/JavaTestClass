package j0523;

public class C0523_02_01을쉽게 {

	public static void main(String[] args) {
		// deck 클래스 있으니까 어려워서 쉬운 버전
		// + 이번엔 card - deck - main 안거치고, card - main 으로 만들기

		Card[] c = new Card[52]; // 배열 선언

		// 일단 스페이스 모양만 값 넣기 // => 이게 Deck클래스에 있는 내용을 일단 쉽게 한것
		for (int i = 0; i < 13; i++) {
			c[i] = new Card(); // 객체 선언
			c[i].kind = "Space";
			c[i].number = i + 1;
		}

		// 위 출력
		for (int i = 0; i < 13; i++) {
			System.out.printf("%s %d \n", c[i].kind, c[i].number);
		}

		// 52장에 모두 값 넣기
		for (int i = 0; i < 52; i++) {
			c[i] = new Card(); // 객체 선언
			c[i].kind = c[i].kinds[i / 13]; // 0 13번, 1 13번, ...
			c[i].number = (i % 13) + 1; // 1~13,1~13 4번 반복
		}
		// -> 이걸 deck에 적으면, deck d = new deck(); 하면,
		// c[0]=space,1 / c[1] ,,, c[51] 되는 것!
		// + 입출력시 변수 적을 때 c[i]앞에 d를 추가하면 됨!!!

		
		

	} // main

}
