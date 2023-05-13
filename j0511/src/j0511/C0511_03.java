package j0511;

public class C0511_03 {

	public static void main(String[] args) {

		// break - while 사용 
//		int i = 0, sum = 0;
//
//		while (true) {
//			if (sum > 100) {
//				break; // while, for(반복문) 종료 시 break 사용
//			}
//			i++;
//			sum += i;
//
//		}
//
//		System.out.println("i의 결과값 : " + i);
//		System.out.println("sum의 결과값 : " + sum);

		
		// break - for 사용

		int i = 0, sum = 0;

		for (i = 0;; i++) { //조건없으므로 무한반복
			if (sum > 10) {
				break;
			}
			sum += i;
		}

		System.out.println("i의 결과값 : " + (i-1)); 
		// 위 while처럼 i 쓰고 싶으면, for()안에 있는 i++ 을 sum += i; 위에 쓰면 됨 
		System.out.println("sum의 결과값 : " + sum);

	}

}
