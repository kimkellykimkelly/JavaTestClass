package j0523;

public class C0523_04_제어자 {

	public static void main(String[] args) {
		// 제어자 - 그 중 접근제어자 중요!!!
		// 접근 제어자: public/protected/default/private (4개 외우기!!!!!!!!!)
		// 그 외: static/final/abstract/native/transient/synchronized/volatile/strictfp
		
		// 접근제어자 - 변수,메소드에는 4가지 모두 사용 가능/ class에는 public과 default만 사용 가능
		
		// final: 잘 안쓰임
		int num = 5;
		num = 10;
		final int number = 1; // 상수는 가독성을 위해 대문자 NUMBER로 쓰기!
//		number = 5; // final은 상수이므로 에러. 
		
//		접근 제어자 (중요!!!!!!!!!) 아무것도 안 붙어있으면 default
//		private: 같은 클래스 내에서만
//		default: 같은 패키지 내에서만
//		protected: 같은 패키지 내에서, 다른 패키지의 자손 클래스에서
//		public: 모두 접근 가능
		

		
		////////////
		
	

	}

}
