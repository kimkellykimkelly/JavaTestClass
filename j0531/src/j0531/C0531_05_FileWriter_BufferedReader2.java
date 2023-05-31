package j0531;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C0531_05_FileWriter_BufferedReader2 {

	public static void main(String[] args) {
		
		// 파일 쓰기 - c.txt
		File f = new File("c:/savedata/c.txt");
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(f); // f대신 "c:/savedata/c.txt" 바로 넣어도 가능.
			String str = "파일쓰기를 시작합니다";
			fw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("파일을 저장합니다");
		
		
		// 파일 읽어오기
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("c:/savedata/b.txt"));
//			
//			while (true) {
//				String data = br.readLine(); // 1줄씩 읽기
//				if (data==null) break;
//				System.out.println(data);
//				}	
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				br.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		
		

	} // main

}
