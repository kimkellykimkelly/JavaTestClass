package j0531;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C0531_06_Stuprocess_case8 {

	public static void main(String[] args) {
		
		int stuNo = 0;
		String name = "";
		int kor=0, eng=0, math =0;
		
		List<Student> list = new ArrayList<>();
		
		// BufferedReader 이용해서 student.txt 파일 읽어와서 출력하기
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
			
			String data = "";
			while (true) {
				data = br.readLine(); //data = "1,홍길동,100,100,99"
				if (data == null) break;
				String[] dataArr = data.split(","); // 쉼표를 기준으로 잘라라
				// => 1,홍길동,100,100,99 (모두 String 형태)
				System.out.println(data);
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
		
		
		// 
		
		
		
		
		
		

	}

}
