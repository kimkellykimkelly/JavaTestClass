package j0511;

public class C0511_01_구구단 {

	public static void main(String[] args) {
		
		// 구구단을 출력하시오
		
//		for (int i = 2; i < 10; i++) {
//			System.out.printf("[ %d 단 ] \n", i);
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d*%d = %d \n", i,j, i*j );
//			}
//			System.out.println();
//		}

		// 구구단 출력 - 같은 단은 세로로, 다음 단을 오른쪽으로 출력 
		for (int i = 2; i < 10; i++) {
			System.out.printf("[ %d 단 ] \t", i);
		}
		
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d*%d = %d \t", j,i, i*j );
			}
			System.out.println();
		}
				
	}

}