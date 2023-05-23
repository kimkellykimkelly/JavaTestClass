package j0523;

public class Card {

	static String[] kinds = { "Space", "Heart", "Diamond", "Clover" };
	static String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	// 자리수 맞춰주려고 0이 필요없지만 그냥 넣음

	String kind; // 무늬: 4가지 - Space, Heart, Diamond, Clover
	int number; // 숫자 - 1~10, 11(J),12(Q),13(K)

	// 기본 생성자
	Card() {
	}

	// kind만 만드는 생성자 (C0523_02를 위해 만듦)
	Card(String kind) {
		this.kind = kind; // this: 인스턴스 변수를 가르킴
	}

	// 매개변수 생성자
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		String str = kind + "," + number;
		return str;
	}

}
