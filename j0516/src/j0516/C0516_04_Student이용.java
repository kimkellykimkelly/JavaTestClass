package j0516;

public class C0516_04_Student이용 {

	public static void main(String[] args) {
		// Student class 이용

		Student s1 = new Student();
		// Student class에 있는 거 모든 선언되는 것! => class 이용하면 매우 간편해짐
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 100;
		s1.sum();
		s1.average();
		
		System.out.println(s1.total);
		System.out.println(s1.avg);
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.kor = 100;
		s2.eng = 100;
		s2.math = 100;
		s2.sum();
		s2.average();
		// => 나중에는 이것도 한번에 쓸 수 있음

	}

}
