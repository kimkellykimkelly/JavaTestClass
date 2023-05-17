package j0517;

public class C0517_07_1 {

	public static void main(String[] args) {
		// Tv class 사용

		// 객체 선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();

		t1.channel = 7;
		System.out.println("t1 channel : " + t1.channel); //7

		t2.channel = 8;
		System.out.println("t1 channel : " + t2.channel);//8

		t2 = t1;
		System.out.println("t2 channel : " + t2.channel);//7

		t2.channel = 0;
		System.out.println("t1 channel : " + t1.channel); //0
		// => 기본형 변수가 아닌 참조형 변수는 데이터가 아니라 주소값을 저장하기 때문에,
		// t1도 0으로 바뀜!!!
		
	}

}
