package j0511;

public class C0511_07 {

	public static void main(String[] args) {
		// int 배열
		
//		int[] n = new int[5];
//		n[0]=1;
//		n[1]=2;
//		n[2]=3;
//		n[3]=4;
//		n[4]=5;
//		
//		for (int i = 0; i < n.length; i++) {
//			System.out.println(n[i]);
//			
//		}
		
		
		// 배열 100개를 만들고 1-100까지 숫자 입력 후 출력
//		int[] n = new int[100];
//		for (int i = 0; i < n.length; i++) {
//			n[i] = i+1;
//			System.out.println(n[i]);
//		}
		
		
		// 배열 10개를 만들고, 랜덤숫자 1-10까지 숫자를 입력해서 출력
		int[] n = new int[10];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random()*10)+1;
			System.out.printf("%d ", n[i]);
		}
		
		
		
		
		
		
	}

}
