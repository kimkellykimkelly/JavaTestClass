package j0515;

public class C0515_04 {

	public static void main(String[] args) {
		// 2차원 배열
		// [4][3] 배열 저장 및 출력
		
		int box[][] = new int[4][3];
		
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = 3*i + (j+1); // =>1~12 순서대로 넣기
			}

		}
		
		// 출력
		
		System.out.println();
		System.out.println("---------------------------");
		
		// 값 출력
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				System.out.print(box[i][j]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
	}

}
