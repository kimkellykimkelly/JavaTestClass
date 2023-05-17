package j0511;
import java.util.Scanner;

public class C0511_08_apply {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 랜덤숫자맞추기
		// 10번 기회가 주어지고, 정답 확인 시 입력한 번호를 출력해라
		// C0511_08 내용 	보완함!

		int random = 0;
		int count = 0; // 도전횟수
		int[] num = new int[10]; // 입력한 숫자 저장해서 마지막에 보여주기

		random = (int) (Math.random() * 10) + 1; // => 1~10
		System.out.println("랜덤숫자 : " + random);

		//입력 - 반복
		while (true) {

			count++; // => 도전횟수
			
			if (count >= 10) {
				System.out.println("기회열번끝");
				break;
			}

			System.out.println(count + "번째 숫자를 입력하세요");
			num[count - 1] = scan.nextInt();

			if (random == num[count - 1]) {
				System.out.println("정답입니다. 프로그램을 종료합니다");
				break;
			} else {
				System.out.println("오답입니다. 다시 도전하세요");
			}

		} //while

		// 출력
		System.out.println("정답: " + random);
		
		System.out.print("입력한 숫자 : ");
		
		for (int i = 0; i < count; i++) { // 도전횟수만큼 출력
			if (i == 0) {
				System.out.print(num[i]);
			} else {
				System.out.print(","+num[i]);
			}
	
		} // for
		
	}

}
