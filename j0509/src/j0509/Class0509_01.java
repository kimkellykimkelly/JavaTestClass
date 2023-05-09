package j0509;

public class Class0509_01 {

	public static void main(String[] args) {
//		변수 - 8가지
//		논리형 - boolean
//		문자형 - char
//		정수형 - byte, short, int(기본), long
//		실수형 - float, double(기본)
//		문자열 - String

		char ch = 'a'; // A: 65, a: 97, 0: 48
		int num = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		
//		위와 같이 하나하나 지정하기 귀찮음
//		-> 배열 사용. 배열은 타입이 같아야 함. 타입이 다를 경우?
//		-> 객체 사용.
		
		System.out.printf("더하기 결과값 : %d \n", num+num2);
		System.out.printf("나누기 결과값 : %f \n", num/(double)num2);
		
		System.out.print("더하기 결과값 : " + (num+num2)+"\n");
		
		System.out.println(num+num2);
		System.out.println(num-num2);
		System.out.println(num*num2);
		System.out.println(num/(double)num2); // int형이므로 소수점 안나옴 -> 형변환 필요
		System.out.println(10/3.0); //f없으므로 double.
		
//		아래와 같이 변수를 지정하지 않으면 계속 값을 변경해줘야하므로, 변수 지정하는 것.
		System.out.println(7+5);
		System.out.println(7-5);
		System.out.println(7*5);
		System.out.println(7/5);	
	}
}
