import java.util.Iterator;
import java.util.Scanner;

public class StuMain_0523 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 성적처리프로그램

		// 배열 선언
		Student_0523[] s = new Student_0523[10]; 
		
		//변수
		int choice = 0; // 번호 입력
		int count = 0; // 학생 수 체크
		String searchName = "";
		
		// 변수 새로 설정
		String name = "";
		int kor = 0, eng = 0, math = 0;
		
		
		///////////////////// 
		while (true) {
			
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------------");

			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			// 0. 프로그램 종료
			if (choice == 0) {
				System.out.println("[프로그램을 종료합니다]");
				System.out.println();
				break; // while 탈출
			}
			
			switch (choice) {
			
			case 1: // 1. 성적입력
				count = stuInput(count, s);
				break;
				
			case 2: // 2. 성적 출력
				
				stuOutput(count, s);
				
//				// 제목
//				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s \n", 
//						Student_0523.title[0], Student_0523.title[1],Student_0523.title[2],Student_0523.title[3],
//						Student_0523.title[4], Student_0523.title[5], Student_0523.title[6], Student_0523.title[7]);
//				System.out.println("----------------------------------------------------------------------------");
//				// "학번","이름","국어","영어","수학","합계","평균","등수"
//				for (int i = 0; i < count; i++) {
//					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
//							s[i].getStuNo(), s[i].getName(), s[i].getKor(), s[i].getEng(),
//							s[i].getEng(), s[i].getMath(), s[i].getTotal(), s[i].getAvg(), s[i].getRank());
//				}
				
				break;

			case 3: // 3. 성적 수정
				System.out.println("수정할 학생 이름을 입력하세요");
				searchName = scan.next();
				
				for (int i = 0; i < count; i++) {
					if (s[i].getName().equals(searchName)) {
						System.out.println("[학생이 검색되었습니다]");
						System.out.println("수정할 과목을 선택하세요");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("--------------------------");
						System.out.println("번호를 입력하세요");
						choice = scan.nextInt();
						
						
						
					}
				}
			
		} // switch

	} // while

} // main
	
	// 메소드 - 리턴타입 메소드명(매개변수){}
	// case1을 메소드로 만들기
	static int stuInput(int count, Student_0523[] s) { // int count는 기본형이므로 return 필요, s는 참조변수이므로 불필요!!!
		
		String name = "";
		int kor = 0, eng = 0, math = 0;
		// 아래 내용 그대로 가져와서, 위와 같이 변수 선언만 해주면 됨!
		for (int i = count; i < s.length; i++) {
			System.out.println((i+1)+"번째 학생 이름을 입력하세요(0. 이전페이지 이동)");
			name = scan.next();
			
			if (name.equals("0")) {
				System.out.println("[이전페이지로 이동합니다]");
				System.out.println();
				break;
			}
			
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			
			// 객체 선언 + 매개변수 생성자 호출 
			s[i] = new Student_0523(name,kor,eng,math);
					
			count++;
		} // for

		return count;
	} // stuInput
	
	
	// case2를 메소드로 만들기
	static void stuOutput(int count, Student_0523[] s) {
		
		// 제목
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s \n", 
				Student_0523.title[0], Student_0523.title[1],Student_0523.title[2],Student_0523.title[3],
				Student_0523.title[4], Student_0523.title[5], Student_0523.title[6], Student_0523.title[7]);
		System.out.println("----------------------------------------------------------------------------");
		// "학번","이름","국어","영어","수학","합계","평균","등수"
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n", // 학번 d 아닌가? 교수님은 s로 쓰심
					s[i].getStuNo(), s[i].getName(), s[i].getKor(), s[i].getEng(),
					s[i].getEng(), s[i].getMath(), s[i].getTotal(), s[i].getAvg(), s[i].getRank());
		}
		
	} // stuOutput
	
	
	
	
	
	

} // class