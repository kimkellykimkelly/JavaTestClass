package j0526;

public class TestFile2_StringFormat {

	public static void main(String[] args) {
		// String.format

		String name = "홍길동";
		int kor = 100;
		int eng = 99;
		int math = 90;
		System.out.printf("%s, %d, %d, %d \r\n", name, kor, eng, math);
		// String.format: printf와 같은 형태인데, 차이점은 저장할 수 있음!
		// \r\n: 맨 뒤에서 띄어쓰라는 뜻. 윈도우일 경우 필요
		String data = String.format("%s, %d, %d, %d \r\n", name, kor, eng, math);
		System.out.println(data);
	}

}
