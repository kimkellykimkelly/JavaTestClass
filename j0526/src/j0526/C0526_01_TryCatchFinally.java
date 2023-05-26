package j0526;

public class C0526_01_TryCatchFinally {

	public static void main(String[] args) {
		// try catch finally
		
		Exception e1 = new Exception("고의로 예외 발생"); // 예외 클래스 객체 만듦
		
		System.out.println("[프로그램 시작]");
		
		try {
			System.out.println("파일 복사를 시작합니다");
			System.out.println("파일 복사 시작");
//			throw e1; // 예외 발생.
//			System.out.println("파일을 종료합니다");
			
		} catch (Exception e) {
			e.printStackTrace(); // 에러 코드 보여줌
		} finally {
			System.out.println("파일을 종료합니다");			
		}
		
		System.out.println("[프로그램 종료]");

	}

}
