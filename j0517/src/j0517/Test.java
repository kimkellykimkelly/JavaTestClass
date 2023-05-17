package j0517;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 객체 선언

	Test c = new Test();
	
	// 변수
	int num1 = 20;
	int num2 = 80;
	
	// 메서드 호출
	c.add(num1, num2);
	System.out.println(c.add(num1, num2));
	
	} // 메인

// 메소드 만들기
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

} // class
