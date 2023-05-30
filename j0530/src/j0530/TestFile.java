package j0530;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TestFile {
// 오늘 배운거 응용! 내일 수업시간에 할건데 미리 해봄. 중요함!!!!!!!!!!!
	// 복습하기 뭔말인지 모르겠다

	// 파일 저장하기 메소드
	void fileSave() throws Exception {

		// 파일저장은 무조건 try catch 사용해야함!
		// 사용하기 싫으면 fileSave() 옆에 throws Exception 적으면 되지만, 에러 발생 시 프로그램 종료되버림.
		FileWriter fw = null;
		fw = new FileWriter("c:/data/student.txt");

		String data = "1,홍길동,100,100,99 \r\n";
		data += "2,유관순,90,90,99 \r\n"; // 데이터 추가
		data += "3,이순신,80,90,99 \r\n"; // 데이터 추가

		fw.write(data);
		fw.flush();
		fw.close();

		System.out.println("파일이 저장되었습니다");

	}

	// 파일 읽기 메소드
	ArrayList<Student> fileRead() throws Exception { // list로 변경해서 반환값 void에서 변경

		ArrayList<Student> list = new ArrayList<>();
		
		// 2바이트씩 읽음
		// FileReader fr = new FileReader("c:/data/student.txt");

		// 한줄씩 읽음
		BufferedReader br = null; // 한줄씩 읽음
		br = new BufferedReader(new FileReader("c:/data/student.txt"));


		while (true) {
			String data = br.readLine(); // student.txt 파일에서 1줄을 읽어오기

			if (data == null)
				break; // 더 이상 읽어올 데이터가 없으면 종료

			System.out.println(data);

			// 읽어온 1줄을 ,로 분리 후 배열에 넣음
			String[] dataArr = data.split(","); // => 1,홍길동,100,100,99

			// 오늘 ColClass 에서 했던 아래 내용을 추가할 건데,
			// + 직접 입력하지 않고 파일 내용을 읽어와서 list에 넣을 것임
//			ArrayList<Student> list = new ArrayList<>();
//			list.add(new Student(1,"홍길동",100,100,99));
//			list.add(new Student(2,"유관순",99,98,99));
//			list.add(new Student(3,"이순신",90,91,90));

			// 데이터 입력 시 값 사이 공백있을 경우를 대비해 trim 추가!
			// +(string은 공백도 받으므로 안해줘도 되지만, int의 경우 안하면 에러!)
			int stuNo = Integer.parseInt(dataArr[0].trim());
			String name = dataArr[1];
			int kor = Integer.parseInt(dataArr[2].trim());
			int eng = Integer.parseInt(dataArr[3].trim());
			int math = Integer.parseInt(dataArr[4].trim());

//			ArrayList<Student> list = new ArrayList<>(); // 지역변수가 되지 않게 위로 뺌
			list.add(new Student(stuNo, name, kor, eng, math));
		} // while

			br.close(); // close 안해주면 열려있어서 ~ 할 수 없습니다 나옴

			return list;


	} // fileRead()

}
