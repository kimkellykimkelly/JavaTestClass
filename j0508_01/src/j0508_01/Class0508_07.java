package j0508_01;

public class Class0508_07 {

	public static void main(String[] args) {
		// printf, println, print
		// println: print + \n
		// \n 단락. \t tab키
		System.out.println(10 / 3); // 3
		System.out.println(10 / 3.0); // 3.3333~5. 마지막 5는 허수.

		System.out.printf("%.2f \n", 10 / 3.0); // 실수형. 소수점 둘째자리까지 표현
		System.out.printf("%9d \n", 1000); // 정수형
		System.out.printf("%x \n", 16); // 16진수
		System.out.printf("%o \n", 9); // 8진수

		// 아래 3가지만 기억하기!
		// %d: 10진 정수 형식으로 출력
		// %f: float 형식으로 출력
		// %s: 문자열로 출력

		System.out.printf("당신의 나이 : %d세, 생년 : %d년 \n", 25, 1996);
		// 위 방법을 더 많이 사용함!
		System.out.println("당신의 나이 : " + 25 + "세, 생년 : " + 1996 + "년");

	}

}
