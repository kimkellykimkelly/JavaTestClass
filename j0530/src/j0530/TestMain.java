package j0530;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TestFile class 사용 - 파일 저장, 읽어오기
		
		TestFile t = new TestFile();
		
		// 파일 저장
//		t.fileSave(); 
		// fileSave() 메소드에서 try catch 안써서 에러!
		// => 여기도 throws Exception 써주면 에러 없어지지만, 이런식으로 프로그램 짜면 다운됨.
		
	
		// 파일 읽어오기
//		t.fileRead();
		
		ArrayList<Student> list = new ArrayList<>();
		list = t.fileRead();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
		
		

	}

}
