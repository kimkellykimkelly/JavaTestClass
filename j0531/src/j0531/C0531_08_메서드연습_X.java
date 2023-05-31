package j0531;

import java.util.List;

public class C0531_08_메서드연습_X {

	public static void main(String[] args) {
		// 메서드 연습
		
		DataClass_X d = new DataClass_X();
		
//		int num1 = 10;
//		int num2 = 5;
//		
//		int sum = d.numAdd(num1, num2);
//		System.out.println(sum*2);
//		
//		int kor = 100;
//		int eng = 100;
//		int math = 100;
//		
//		Student s = d.stuAdd(kor,eng,math);
//		System.out.println("합계"+s.getTotal());

		List<Student> list = d.stuList();

	
		for (int i = 0; i < list.size(); i++) {
		
			System.out.printf("학번: %d \t", list.get(i).getStuNo());
			System.out.printf("이름: %s \t", list.get(i).getName());
			System.out.println();
		}
		
		
		
	} // main

}
