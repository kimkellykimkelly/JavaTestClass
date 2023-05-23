package j0523;

public class C0523_05_gettersetter {
	// getter setter 설명: Time class 보기!!!
	public static void main(String[] args) {
		// 12시 50분 52초를 입력하고 12시를 출력해라
		
	// 객체 선언	
	 Time t = new Time(12,50,52);
	// 인스턴스 메소드 사용: 참조변수명.메소드명
	 System.out.println(t.getHour());
	
	// 데이터 변경해보기
	 t.setHour(25); // 데이터 변경안됨
	 
	 System.out.println(t.getHour()); // 그대로 12
		
	 t.setHour(22);
	 
	 System.out.println(t.getHour()); // 22로 바뀜
		
	} // main

} // class
