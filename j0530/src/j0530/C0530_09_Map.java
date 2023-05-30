package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class C0530_09_Map {

	public static void main(String[] args) {

		// Map 반환 메소드 불러오기_ColClass 사용
		ColClass c = new ColClass();

		Map<String, Object> map = new HashMap<>();
		map = c.execute();

		// 위 내용이 어려워서 차근차근 다시 설명해주심

		// 1) int 반환 메소드 불러오기_ColClass2 사용 => 쉬워서 생략
		
		// 2) List 반환 메소드 불러오기_ColClass3 사용
		ColClass3 c3 = new ColClass3();

		ArrayList<Student> list = new ArrayList<>();
		list = c3.execute3();

		// 3) Map 반환 메소드 불러오기_ColClass 사용 => 위 내용!


	} // main

} // class
