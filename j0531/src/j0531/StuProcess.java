package j0531;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {

	Scanner scan = new Scanner(System.in);

	int stuNo;
	String name;
	int kor, eng, math;

	// 메소드: 리턴타입 메소드명

	// case1 메소드_1. 학생 입력
	// 여러 형태를 저장해서 반환할 것이므로 Map 사용
	Map<String, Object> stuInput(List<Student> list, int stuCount) { // 매개변수 선언해야함(지역변수이므로)

		while (true) { // 입력 반복위해 while 추가

			System.out.println("[학생성적 입력]");

			System.out.println(stuCount + "번째 학생 이름을 입력하세요(0.이전페이지로 이동)");
			name = scan.next();

			if (name.equals("0")) {
				System.out.println("[이전페이지로 이동]");
				break; // return list -> while 추가해서 break로 변경!
				// while(true)는 항상 break가 있어야함!
			}

			System.out.println("국어 점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			math = scan.nextInt();

			list.add(new Student(stuCount, name, kor, eng, math));
			stuCount++; // stuCount도 return해줘야 main class에 적용됨! => Map 사용!

		} // while

		System.out.println();

		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("stuCount", stuCount);

		return map;

	} // case1 메소드 끝

	// case2 메소드_2. 학생 출력

	List<Student> stuOputput(List<Student> list) {
		System.out.println("[학생 성적 출력 화면]");

		String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("------------------------------------------------");

		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.printf("%d \t %s \t %d \t %d \t %d \t %d \t %.2f \t %d \n", s.getStuNo(), s.getName(),
					s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}

		System.out.println();
		return list;

	} // case2 메소드 끝

	// case8 메소드_8. 파일에서 가져오기
	List<Student> stuRead() {
		List<Student> list = new ArrayList<>();

		// class C0531_06에서 가져옴
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));

			String data = "";
			while (true) {
				data = br.readLine(); // data = "1,홍길동,100,100,99"
				if (data == null)
					break;
				String[] dataArr = data.split(","); // 쉼표를 기준으로 잘라라
				// => 1,홍길동,100,100,99 (모두 String 형태)
//				System.out.println(data);
				stuNo = Integer.parseInt(dataArr[0]); // String -> int 형변환
				name = dataArr[1];
				kor = Integer.parseInt(dataArr[2]);
				eng = Integer.parseInt(dataArr[3]);
				math = Integer.parseInt(dataArr[4]);

				list.add(new Student(stuNo, name, kor, eng, math));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return list;
	} // case8 메소드 끝

	// case9 메소드_9. 파일 저장하기
	void stuSave(List<Student> list) {

		// class C0531_07에서 가져옴
		String data = "";

		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			data += String.format("%d,%s,%d,%d,%d\r\n", 
					s.getStuNo(), s.getName().trim(), s.getKor(), s.getEng(), s.getMath());
		} // .trim() => 공백제거

		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/savedata/student.txt");
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	} // case9 메소드 끝

}
