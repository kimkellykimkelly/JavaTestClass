package j0512;

import java.util.Scanner;

public class C0512_03_로또프로그램 {

	public static void main(String[] args) {
		// 로또 프로그램 (1~45 번호 중복되지 않게 6개 출력하기) (시험! 외우기)

		Scanner scan = new Scanner(System.in);

		// 변수 선언
		int random = 0; // 랜덤번호
		int temp = 0; // 임시저장변수(C0511_12 참고)
		int count = 0; // 당첨된번호개수
		
		// 1. 배열 생성
		int[] lotto = new int[45]; // 로또 번호(이중 앞 6개 숫자가 로또번호6개가 됨)
		int[] myNum = new int[6]; // 입력번호
		int[] lottoNum = new int[6]; // 당첨 번호(최대 6개임)

		// 2. 로또 번호 생성 1~45
		// lotto[i] = (int)(Math.random()*45)+1
		// 위와 같이 그냥 랜덤으로 생성하면 1~45 중 중복된 숫자가 나올 수 있으므로, 중복되지 않게 배열을 생성함!(로또는 숫자가 중복되면 안됨)
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 1,2,3,...45
		}
//		 => int[] lotto = {1,2,3,...45};


		// 3. 로또번호 섞기 (1000번)
		// lotto[0] 값을 temp에 일단 넣고, random으로 생성한 번호 값(0~44)에 해당하는 자리인 lotto[random] 값을 lotto[0]자리에 넣음. 
		// 그 후 lotto[random]에는 temp에 옮겨두었던 lotto[0]값을 넣음.
		// => 즉, lotto[0]과 lotto[random] 값을 바꿈
		// => 이걸 1000번 반복

		for (int i = 0; i < 1000; i++) {
			random = (int) (Math.random() * 45); // 0~44 랜덤번호 생성 (0~44 자리가 있으므로)
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
//		=> int[] lotto = {1,2,3,...45}; 가 1000번 섞여 무작위로 배열됨.

		
		// 4. 로또번호 입력, 저장
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 로또번호를 입력하세요");
			myNum[i] = scan.nextInt();
		}
		
		
		// 5. 로또번호 당첨개수 확인
		// lotto 배열에 있는 값과 myNum 배열에 있는 값을 하나하나 비교함
		
		for (int i = 0; i < 6; i++) { // lotto 배열
			for (int j = 0; j < myNum.length; j++) { // myNum 배열

				if (lotto[i] == myNum[j]) {
					lottoNum[count] = lotto[i]; // 당첨번호 넣기 (count대신 i를 넣으면 빈 공간이 생기므로, count를 넣어야 순서대로 들어감)
					count++; // 당첨개수 증가
					continue; // break도 가능! 
					// break와 continue의 차이는 break나 continue 뒤에 내용이 있을 경우 생기는데, 이 경우에는 뒤 내용이 없으므로 차이 없음.
				}
			}
		}

		// 6번 구조같음 => 나중에 메서드를 이용함.
		// 6-1. 로또 번호 출력 (6개만 필요하므로)
		System.out.print("로또번호 자동생성 6개 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

		System.out.println();

		// 6-2. 입력 번호 출력
		System.out.print("입력번호 6개 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(myNum[i] + " ");
		}

		System.out.println();

		// 6-3. 당첨 번호 출력
		System.out.print("당첨번호 : ");
		for (int i = 0; i < count; i++) {
			System.out.print(lottoNum[i] + " ");
		}
		
		System.out.println();
		
		// 6-4. 당첨 개수 출력
		System.out.println("당첨개수 : " + count);

	}

}
