package j0530;

import java.util.ArrayList;
import java.util.List;

public class C0530_05_Collection_ArrayList {

	public static void main(String[] args) {
		// Wrapper 클래스: 기본형을 클래스로 정의한 것! 기본형 값도 객체로 다뤄져야 할 때가 있음
		// collection: List 80% / Set 거의 안 쓰임 / Map 20%

		// List: 순서 O , 데이터 중복 허용 O => 읽을 때 for문 사용 가능
		// Set: 순서 X , 데이터 중복 허용 X => 순서가 없기 때문에 iterator를 사용해서 읽어야함!
		// Map: 순서 X , 데이터 중복 허용 (Key X, Value O) / 값 넣을 때 put 사용! 
		// 기능은 많지만 대부분 add, get만 쓰이고, 나머지는 오라클에서 수행.

		// list: 객체들의 집합, 데이터 이동 및 읽기, 저장용도로 사용
		List list = new ArrayList();
		// 다형성: 부모의 참조변수로 자손의 객체를 다루는 것
		list.add("abc"); // 0
		list.add("abc"); // 1 (순서 있음, 중복 허용)
		list.add("bbb"); // 2
		list.add("aaa"); // 3
		list.add("ccc"); // 4
		list.add(3); // 5 (Integer)

		System.out.println(list.get(5));

		for (int i = 0; i < list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}

		//
//		ArrayList list2 = new ArrayList();
//		list2.add(new Student(1, "홍길동", 100, 100, 99)); // 객체를 넣어야함!
//		list2.add(new Student(2, "유관순", 90, 90, 99));
//		list2.add(new Student(3, "이순신", 80, 80, 87));
//
//		// 번호 출력
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(((Student) list2.get(i)).getStuNo()); 
//			// 변수가 모두 private이므로 바로 출력할 수 없고 getter로 가져와야함!
//		}
//
//		// 이름 출력
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(((Student) list2.get(i)).getName());
//		}
//
//		// total 출력
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(((Student) list2.get(i)).getTotal());
//		}
//		
//		// 한 줄로 출력하기
//		for (int i = 0; i < list2.size(); i++) {
//			Student student = (Student) list2.get(i);
//			System.out.printf("%d %s %d %d %d %d %.2f \n", student.getStuNo(), student.getName(), 
//					student.getKor(), student.getEng(), student.getMath(), student.getTotal(), student.getAvg());
//		}

		// 형 변환 안하려면 Generics 사용-> 특정 클래스만 입력 가능
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student(1, "홍길동", 100, 100, 99)); // 가로 안은 객체!
		list2.add(new Student(2, "유관순", 90, 90, 99));
		list2.add(new Student(3, "이순신", 80, 80, 87));

		// 번호 출력
		for (int i = 0; i < list2.size(); i++) {
			System.out.println((list2.get(i)).getStuNo());
		}

		
	}

}
