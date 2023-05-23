package j0523;

//import java.util.Date;
//import java.util.Iterator;
//import java.util.Scanner; // java.util 패키지 - 클래스 Scanner

import java.util.*; 
// java.util에 있는 모든 클래스(첫글자가 대문자!!!) 가져오기
// 클래스만 *로 표현할 수 있음!!!

public class C0523_03_오버라이딩super {

	public static void main(String[] args) {
		
//		Date today = new Date();
		
		
		// toString()
		// Object: 모든 클래스의 최고 조상/ 조상으로 두고, 상속받기 편하기 때문에 범용적이라 중요!!!

		Card c = new Card("Space", 1);
		System.out.println(c); 
		// => 원래 주소값만 나오는데, toString()을 쓰면 값이 나옴!		
		 
		Card c2 = null; // => 불가능! c2에는 Card 객체 형태만 넣을 수 있음!
		Deck d1 = new Deck();

		// c2 = d1; // 타입이 다르기에 넣을 수 없음
		c2 = c; // 같은 타입이라 넣을 수 있음
		
		Object o = null;
		o = d1; // 조상과 자손이라는 관계가 맺어져서 가능함
		
	} // main
		
	    // 오버로딩: 메서드명 같고, 매개변수의 수나 타입이 다름 => 다른 메서드가 됨!
		// 오버라이딩: 상속받은 메서드를 재정의한 것(원래 메서드에 내용 추가) 
	    // => (상속 잘 안쓰므로 이것도 잘 안쓰임)
	
	// super. : 부모의 변수 가져올 때 사용. (상속 관련이므로 많이 안 쓰임.)
	// super(); : 부모의 생성자 가져올 때 사용. 
	// + 기본 생성자없고 매개변수 생성자만 있을 경우 super()안에 매개변수 넣어줘야하므로 
	// + 매개변수 생성자 만들경우 그냥 기본 생성자도 만드는 습관 들이기!


}
