package j0522;

public class C0522_10 {

	public static void main(String[] args) {
		// 스트링포맷, 초기화블록

//		String str = String.format("%04d", 1); // 4자리를 만들어서 앞자리를 0으로 채우기/ 04에서 0을 빼면 그냥 앞이 공백으로 채워짐
//		System.out.println(str);

//		String str2 = String.format("%,10d", 1000000); // ,추가하기
//		System.out.println(str2);

//		String str3 = "2023"+String.format("%04d, 1); //2023 101 1001

		Student s1 = new Student();
		System.out.println(s1.stuNo);

		Student s2 = new Student();
		System.out.println(s2.stuNo);
		
		Student s6 = new Student("홍길동", 100,100,100);
		System.out.println(s6.stuNo); // => 1003이 나와버림.
		

	}

}
