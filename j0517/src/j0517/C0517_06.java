package j0517;

public class C0517_06 {

	public static void main(String[] args) {
		// 아주 중요함!!!
		
		Data d = new Data(); // 객체 선언
		d.x = 10; // 참조변수명.변수명
		System.out.println("d.x : " + d.x);

		System.out.println("--------------");
		change(d.x); 
		System.out.println("change d.x :" + d.x); 
		// 결과값은 1000이 아니라 10임. 중요!!!!(기본형 변수라서)
		// (참조형 변수일 경우에는 1000임)
	}

	static void change(int x) { // void는 return 형태 없음.
		x = 1000;
		System.out.println("x:" + x);
		// void 대신 반환형태를 적고, return = ~ 값이 있으면 반환됨.
	}

}
