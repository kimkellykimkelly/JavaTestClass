import java.util.Scanner;

public class Class0511_03 {
	public static void main(String[] args) {
		//
		
		
//		for (;;) {                          //이런식으로 조건식이 없으면 무한반복
//			System.out.println("프로그램 실행");
//		}
		
		
//		while(true) {                          //while에는 ()안에 true를 쓰면 무한반복된다
//			System.out.println("프로그램 실행");
//		}
		
//		do {
//			System.out.println("i의 값 : " + i);         //무조건 한번은 실행을 하고 다음줄로 넘어간다(다음줄이 오류가 나도!
//		} while(i<0);
		Scanner scan = new Scanner(System.in);
//		//무한반복
//		while(true) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if (num ==0);
//		}
		
//		//무한반복
//		for(;;) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if(num==0) {
//				System.out.println("프로그램을 종료하세요");
//				break;
//			}
//		}
//		
//---계산기 프로그램 만들기----------------------------------------------------------------------------
//		
//		int input = 0, num1 = 0, num2 = 0;
//		
//		while(true) {
//			System.out.println("[ 사칙연산 프로그램 ]");
//			System.out.println("1. 더하기");
//			System.out.println("2. 빼기");
//			System.out.println("3. 곱하기");
//			System.out.println("4. 나누기");
//			System.out.println("원하는 번호를 입력하세요>>");
////			int input = scan.nextInt();        //어떤 번호를 입력해도 무한반복 :
//			                                   //밖에도 int input, 안에도 int input이 있으면 오류가 난다
//			input = scan.nextInt();            //이런식으로 선언말고 입력받는 용도로 쓰면 오류가 안난다
//			
//			//조건문
//			switch(input) {
//			case 1 :
//				System.out.println("첫번째 숫자를 입력하세요");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("더하기 결과값" + (num1+num2));
//				break;                                          //switch문을 빠져나오는 break
//			case 2:
//				System.out.println("첫번째 숫자를 입력하세요");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("빼기 결과값 = " + (num1-num2));
//				break;
//			case 3:
//				System.out.println("첫번째 숫자를 입력하세요");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("곱하기 결과값 = " + (num1*num2));
//				break;
//			case 4:
//				System.out.println("첫번째 숫자를 입력하세요");
//				num1 = scan.nextInt();
//				System.out.println("두번째 숫자를 입력하세요.");
//				num2 = scan.nextInt();
//				System.out.println("나누기 결과값 = " + (num1/num2));
//				break;
//			}//switch
//			
//			
//		}//while
		
		
//---위의 코드를 간결하게 만들기--------------------------------------------------------------------------
		
		int input = 0, num1 = 0, num2 = 0;
		
		while(true) {
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0.종료");
			System.out.println("원하는 번호를 입력하세요>>");
//			int input = scan.nextInt();        //어떤 번호를 입력해도 무한반복 :
			                                   //밖에도 int input, 안에도 int input이 있으면 오류가 난다
			input = scan.nextInt();            //이런식으로 선언말고 입력받는 용도로 쓰면 오류가 안난다
			
			
//			if(input == 0) {                   //이게 있어야 0번을 누르면 종료가 된다.
//				break;
//			}
			if(input == 0)  {
				System.out.println("프로그램을 종료합니다."); break;             //이런식으로 한줄로 만들수도 있다.
			}
			
			
		//이 부분을 뽑아 내면 계속 반복적으로 쓰지 않아도 된다	
			System.out.println("첫번째 숫자를 입력하세요");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			num2 = scan.nextInt();
			
			
			//조건문 : 조건문이 짧아진다
			switch(input) {
			case 1 :
				System.out.println("더하기 결과값" + (num1+num2));
				break;                                          //switch문을 빠져나오는 break
			case 2:
				System.out.println("빼기 결과값 = " + (num1-num2));
				break;
			case 3:
				System.out.println("곱하기 결과값 = " + (num1*num2));
				break;
			case 4:
				System.out.println("나누기 결과값 = " + (num1/num2));
				break;
//			case 0:
//				break;       이렇게 해두면 뒤에 숫자를 입력하세요가 계속 나온다
			}//switch
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("프로그램을 종료합니다.");
	}
}

//h