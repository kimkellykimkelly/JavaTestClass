package c0525_06_07_TryCatchFinally;

public class C0525_06 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);

		// try catch => if else라고 생각하기. 에러가 있으면 catch를 돎.
		try { // 예외가 일어날 부분에 적용
			System.out.println(3);
			System.out.println(0 / 0); // 예외발생
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6); // try catch 했기 때문에 6까지 갈 수 있음. 안그러면 오류난 곳에 멈춰버림.

	}
}
