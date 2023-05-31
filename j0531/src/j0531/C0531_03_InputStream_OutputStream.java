package j0531;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class C0531_03_InputStream_OutputStream {

	public static void main(String[] args) {
		
		// 파일 읽기 쓰기: InputStream OutputStream

		Scanner scan = new Scanner(System.in);

		// InputStream: 파일 읽어오기 
		// 외부와 접속할때 try~catch 안하면 에러!
		InputStream is = null;
		try {
			is = new FileInputStream("c:/savedata/a.txt"); // 다형성
			
			int i = -1;
			while (true) { // 파일 내 데이터를 모두 읽도록 반복
				i = is.read(); // 1byte씩 읽음 => 한글은 읽어올수가 없음 => reader와 writer사용
				if (i==-1) break; // 더이상 읽어올 데이터가 없으면 반복문 탈출
				System.out.println("데이터: "+(char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		
		
		// OutputStream: 파일 저장하기
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:/savedata/a.txt");
			
//			System.out.println("원하는 글자를 입력하세요");
//			String str = scan.nextLine();
			String str = "글자를 입력합니다. 안녕하세요. \r\n 반갑습니다. 줄단락을 하였습니다. \r\n";
			// \r\n => 줄바꿈됨!
			byte[] bs = str.getBytes();
			os.write(bs);
			os.close();		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일을 저장했습니다");
		
		
		
		
		
		
	}

}
