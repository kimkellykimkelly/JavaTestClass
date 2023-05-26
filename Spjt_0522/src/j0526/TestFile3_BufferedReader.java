package j0526;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFile3_BufferedReader {
	public static void main(String[] args) {
		// 데이터 읽기 - 다음주 화요일 수업 시간에 다시 할것.
		// BufferedReader: 라인 단위로 읽어오기. FileReader는 바이트 단위로 읽어옴.
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/data/student.txt"));
			while (true) {
				String data = br.readLine();
				if (data==null) break;
				System.out.println(data); // 1001,홍길동,83,100,90
				String[] dataArr = data.split(",");
				
				int stuNo = Integer.parseInt(dataArr[0]);
				String name = dataArr[1]; // 이후 변수도 다 해야하는데 시간없어서 패스
				
			} // while
			
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
