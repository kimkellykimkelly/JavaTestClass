package c0525_05_인터페이스;

public class C0525_05 {
// 인터페이스 사용 이유
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new PlusB());
		// 인터페이스를 만들어서, 다형성 사용 => 위 new PlusB() 만 고쳐주면 됨!

	}

}
