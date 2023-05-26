package j0526;

import java.io.FileWriter;
import java.util.Iterator;

public class C0526_03_FileWriter_Throws사용 {

	public static void main(String[] args) throws Exception {
		// 파일 저장 시스템 -> 잘 안쓰임. 오라클로 사용함.
		
		FileWriter fw = null; // 문자를 저장할 수 있는 객체 생성
		fw = new FileWriter("c://data/str.txt");
		
		String[] name = {"홍길동","유관순","이순신","강감찬","김구"};
		String str = "";
		for (int i = 0; i < 5; i++) {
			str = str + (1001+i)+","+name[i]+",100,100,99 \r\n";
		}
		fw.write(str);
		fw.flush();
		fw.close();
		
		System.out.println("파일이 저장되었습니다");
		

		
	} // main

}
