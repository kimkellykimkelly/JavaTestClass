package j0524;

public class Singleton {
	
	private static int num;
	
	// 같은 클래스 내에서만 s 사용 가능
	private static Singleton s = new Singleton();
	
	// 기본 생성자
	private Singleton() {
		num = 10;
	}
	
	// getInstance 메소드. 리던타입:Singleton클래스
	static Singleton getInstance() {
		if (s==null) {
			s = new Singleton(); // 혹시 s가 비었으면 객체선언을 다시해라
		}
		return s;
	}
	// 위는 인스턴스 메서드라 객체선언해야 사용할 수 있는데 객체가 private이기 때문에 아예 사용할 수 없음.
	// => static으로 바꾸면 사용가능!

	//getter setter
	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Singleton.num = num;
	}

	
	
}
