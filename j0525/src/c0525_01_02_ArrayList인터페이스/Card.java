package c0525_01_02_ArrayList인터페이스;

public class Card {

	static String[] kinds = {"SPACE","HEART","DIAMOND","CLOVER"};
	static String[] numbers = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	String kind;
	int number;
	
	// 생성자
	Card(){
		this(kinds[0], 1); //SPACE, 1
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	
	
	
	
}
