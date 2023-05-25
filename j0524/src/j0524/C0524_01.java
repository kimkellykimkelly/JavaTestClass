package j0524;

public class C0524_01 {

	public static void main(String[] args) {
		
//	Singleton ss = new Singleton(); 
//	Singleton이 private이라 쓸 수 없음

	//Singleton class 형태로 만드는 ss 객체 = 클래스명.메서드명	
	Singleton ss = Singleton.getInstance(); // 이렇게 객체생성됨
	
	// ss에 있는 num 변수 가져오기
//	System.out.println(Singleton.num); // num이 private이라 불가능
	System.out.println(Singleton.getNum()); 
	


	}
}
