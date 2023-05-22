package j0519;

public class C0519_08 {

	public static void main(String[] args) {
		// 생성자 - Student class 사용

		// 객체 선언
//		Student s = new Student();
//
//		s.name = "홍길동";
//		s.kor = 100;
//		s.eng = 100;
//		s.math = 100;
//
//		s.sum();
//		s.average();
//
//		//
//		Student s2 = new Student();
//
//		s2.name = "유관순";
//		s2.kor = 90;
//		s2.eng = 90;
//		s2.math = 90;
//
//		s2.sum();
//		s2.average();
//
//		//
//		Student s3 = new Student();
//
//		s3.name = "이순신";
//		s3.kor = 80;
//		s3.eng = 80;
//		s3.math = 80;
//
//		s3.sum();
//		s3.average();

		// 생성자를 만들었을 경우, 위와 같이 하나하나 적지 않고 아래와 같이 적으면 됨!
		// + 메소드도 필요없음!!!
		Student s = new Student("홍길동", 100, 100, 100);
		Student s2 = new Student("유관순", 90, 90, 90);
		Student s3 = new Student("이순신", 80, 80, 80);

	}

}
