package j0526;

public class C0526_04_JavaLangPackage {

	public static void main(String[] args) {
		// Java Lang Package
		// equals() / hashCode() / toString() 중요! 알기!!!

		Person p1 = new Person(8801011111111L);
		Person p2 = new Person(8801021111111L);
		Person p3 = new Person(8801011111111L); // p1과 같음
		
		
		// 생성자를 이용한 copy! 개체 자체를 복사 => 공간분리, 깊은복사
		Person p4 = new Person(p1);
		System.out.println(p4.id);
		
		// 위와 다르게 아래는 주소 복사이기 때문에 하나를 바꾸면 다른 것도 같이 바껴버림.  => 주소복사, 얕은복사
		Person p5 = p3; 
		
		
		// toString 안할 경우 아래와 같이 적어야하지만, toString
		System.out.println(p1.id); 
		//toString 쓰면 아래와 같이 바로 쓸 수 있음
		System.out.println(p1); // p1.id
		
		//
		if (p1.equals(p3)) { 
			// p1==p3 사용 시, p1과 p3는 데이터 값은 같지만 주소값이 다르므로 아래 결과는 다르다고 나옴.
			// p1.equals(p3) 써도 다르다고 나옴. -> Person class에서 equals 재정의 하면 같다고 나옴!
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		
		
	} // main

}
