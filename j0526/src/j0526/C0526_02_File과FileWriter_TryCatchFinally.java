package j0526;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
// 교수님 파일과 비교하기!!!!!!!!!!!
public class C0526_02_File과FileWriter_TryCatchFinally {

	public static void main(String[] args) {
		// 위에 throws Exception 적으면 -> 에러나도 난 몰라. 에러를 다른 데로 던짐

		// 예제 1
//		File file = new File("C:/data/test.txt"); // 파일 생성
//		
//		try {
//			// file.createNewFile(); // 파일을 생성해주세요
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
//
//		System.out.println("파일이 생성되었습니다");

		// 예제 2-1
//		FileWriter writer = null;
//		try {
//			writer = new FileWriter("C:/data/test.txt"); // 파일을 생성해서 글자 저장
//			String str = "글자를 저장합니다";
//			writer.write(str);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				writer.close();
//			} catch (Exception e2) {
//			}
//		}

		// 예제 2-2. main에 throws Exception 적고, 예제 2-1에서 try catch 모두 없애기.
		// 에러나면 그냥 멈춤.
//		FileWriter writer = null;
//		writer = new FileWriter("C:/data/test.txt"); // 파일을 생성해서 글자 저장
//		String str = "글자를 저장합니다";
//		writer.write(str);
//		writer.close();
//
//		System.out.println("글자 저장 완료");

		// 예제 3. 폴더 생성
//		File dir = new File("c:/bbb");
//		dir.mkdirs(); // 폴더 생성 메소드
//		
//		System.out.println("폴더를 생성합니다");
//		
//		File f= new File("c:/bbb/test.txt");
//		try {
//			f.createNewFile(); // 파일 생성 메소드
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("파일을 생성합니다");

		// 예제 4.
		FileWriter fw = null; // 위로 뽑아줌. 아래 메소드로 들어가면 지역변수이기 때문.
		String str = "";
		
		try {
			fw = new FileWriter("c:/bbb/test.txt");
			for (int i = 0; i < 10; i++) {
				str = str + "글자를 저장합니다 \r\n";
				fw.write(str); // 글자 저장하는 메소드
				fw.flush(); // 버퍼(임시저장소)에 있는 모든 것을 저장. 속도 빠르게 하기 위해 사용
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("글자가 저장되었습니다");
		
		
		
		
		
		
		
		
	} // main
} // class
