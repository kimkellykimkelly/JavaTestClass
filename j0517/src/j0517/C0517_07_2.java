package j0517;

public class C0517_07_2 {

	public static void main(String[] args) {
		// return없이 값 두개이상 반환하는 방법 
		// (반환값 한개밖에 안되는 메소드 보완법!!!)

		int[] num = new int[2];

		int a = 10;
		int b = 5;

		// 메서드에 static 있으면, 객체 선언없이 사용 가능
		calculate(num, a, b);

		System.out.println("합계 :"+num[0]); // 15
		System.out.println("평균 :"+num[1]); // 7
		
	}

//	static void calculate(int[] num, int a, int b) {
//		// 두 수의 합, 평균
//		int total = a + b;
//		int avg = (a + b) / 2;
//		return total, avg; 
//		//=> return은 한 개만 가능함. 두개 반환 불가능
		
		
		static void calculate(int[] num, int a, int b) {
			// 두 수의 합, 평균
			num[0] = a + b;
			num[1] = (a + b) / 2;
			
	}

}
