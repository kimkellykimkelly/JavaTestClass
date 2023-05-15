package j0510;

import java.util.Scanner;

public class C0510_08 {

	public static void main(String[] args) {
		// 반복문 - for / while (do while)
		// for: 몇부터 몇까지 범위가 딱 정해져있을때 사용 / while: 랜덤으로 증가하거나 반복될 때 사용

		// 1~10합: 55 / 1~100합: 5050 / 1~1000합: 500500 / ...

//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.println(i+":"+sum);
//		}

		// 마지막 결과만 실행하고 싶으면 for 밖에서 sysout 하면 됨. 이때, i 또한 for 밖에서 변수 선언해줘야힘.

//		int i = 0;
//		int sum = 0;
//		for (i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(i+":"+sum); 
		// => 위와 같이 하면 최종 i는 11이 되므로, i=0; i<10으로 하던지 출력 시 i-1로 해야함.

		// 숫자 3번 반복해서 입력받아, 합을 출력하시오.
		// 1. 변수 선언 n, sum
		// 2. scan 선언
		// 3. 반복문 (숫자 입력 넣어줌, sum 변수에 더하기 해줌)
		// 4. sum 출력

//		int n = 0;
//		int sum = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요");
//			n = scan.nextInt();
//			sum += n;
//		}
//		System.out.println("합계 :"+sum);

		// 중첩 for 문
		// 구구단
//		for (int i = 2; i <= 9; i++) {
//			System.out.printf("[  %d 단  ] \n" , i);
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d \n", i, j, i * j);
//			}
//			System.out.println();
//		}

		// 0부터 9까지 출력
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}

		// 00 01 02 03 ... 09 10 11 .... 99 하단으로 내려가게 출력
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.printf("%d%d \n", i,j); // 가로로 출력하고 싶으면 \n 빼면됨
//			}
//		}
//		
//		System.out.println();

		// 00 01 02 03 ... 09
		// 10 11 ....
		// .. 99 출력
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.printf("%d%d ", i, j);
//			}
//			System.out.println();
//		}

		// i--, i-=1, i=i-1 모두 같음
//		for (int i = 10; i > 0; i--) { // 2씩 감소시키고 싶으면: i=i-2
//			System.out.println(i);
//		}

		// 아래 for문을 while로 바꾸기
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}

		// while => if와 호환 가능하므로 쓰고 싶은 거 쓰기
//		int i = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}

		// 랜덤숫자 1-100까지의 랜덤숫자 1개를 출력하시오
//		int random = 0;
//		random = (int) (Math.random() * 100) + 1;
//		System.out.println(random);
//
//		// 숫자 맞추기 프로그램 10번 반복
//
//		Scanner scan = new Scanner(System.in);
//
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i+"번째 숫자입력해");
//			int input = scan.nextInt();
//
//			if (input == random) {
//				System.out.println("정답");
//				break; //없으면 정답이여도 계속 10번 돌아감
//			} else if (input > random) {
//				System.out.println("오답. 입력한 숫자보다 작은 수임");
//			} else {
//				System.out.println("오답. 입력한 숫자보다 큰 수임");
//			}
//
//			i++;
//		}

	}

}
