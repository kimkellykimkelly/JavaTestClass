package j0511;

public class C0511_11 {

	public static void main(String[] args) {
		// 배열과 객체는 복사 시, 변수처럼 데이터의 값을 그냥 넣으면 안됨.
		// 주소값을 저장하므로 하나하나 복사해야함! = 배열복사 (중요) 

		// 변수
		int num = 5;
		int num2 = num;
		num2 = 10; // => num = 5로, num 값 변경되지 않음.

		int[] input = new int[3];
		input[0] = 5;

		// 배열
		
		int[] input2 = input;
		System.out.println(input2[0]); // =>5
		input2[0] = 20;
		System.out.println(input2[0]); // =>20
		System.out.println(input[0]); // =>5가 아닌 20이 들어감. input 값도 변경되어버림.
	}

}
