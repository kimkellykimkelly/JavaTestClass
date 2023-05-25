package j0524;

public class C0524_02_다형성 {

	public static void main(String[] args) {
//		// 다형성 : 여러가지 형태를 가질 수 있는 능력
//		하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것
//		조상타입의 참조변수로, 자손타입의 객체를 다룰 수 있는 것 (중요!!!!!!)

		//////////////////
		// 객체 선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel); // => 1
		c.caption();
		
		// 다형성
		Tv t = new CaptionTv(); // 조상과 자손 위치 바뀌면 안됨!!!
		t.channelUp(); 
		System.out.println(t.channel); // => 1. (인스턴스 변수라 초기화되므로, 1임) 
//		t.caption(); // 공간은 있지만, t에는 메소드가 없어서 사용 불가능!
	
		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println(t2.channel); // => 1
		
		// 추가 내용 (자)
		CaptionTv c2 = null; // 주소값만 넣을 수 있는 형태
		
		t2 = c; // 가능 -> 부모에 자식을 넣음
		c2 = (CaptionTv)t2; // 불가능 -> 자식을 부모에 넣음 => 강제형변환을 해주면 가능.
		
		
		
	} 

}
