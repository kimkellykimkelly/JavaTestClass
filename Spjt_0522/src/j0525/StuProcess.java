package j0525;

import java.util.ArrayList;
import java.util.Scanner;

public class StuProcess { 

	Scanner scan = new Scanner(System.in);
	String name = "";
	int kor = 0, eng = 0, math = 0;
	
	// 학생입력메소드
	void stuInput(ArrayList<Student> list) { // 지역변수이지만 참조변수이므로 여기서 수정하면 다 수정됨
		
		while(true) { // 학생 수 count 없어져서 while로 변경
			System.out.println("학생이름을 입력하세요>>(0. 이전페이지 이동)");
			name = scan.next();
			
			if (name.equals("0")) {
				System.out.println("[이전페이지로 이동합니다]");
				System.out.println();
				break; // while, switch 탈출
			}
			
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
		
			//학생성적입력 메소드
			
			list.add(new Student(name, kor, eng, math));
			// 현재 입력한 위치: list.size()-1 => 현재 1개 입력했다면 0번째에 있으므로 -1!
			System.out.printf("학번: %d, 이름: %s", list.get(list.size()-1).getStuNo(),name);
			System.out.println("(이)가 입력되었습니다");
			System.out.println();
		
		}// while
		
	} // stuInput
}
