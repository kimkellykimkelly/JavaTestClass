package j0530;

import java.util.HashMap;
import java.util.Iterator;

public class C0530_08_HashMap {

	public static void main(String[] args) {
		
	// HashMap: key 중복불가능 value 중복가능 => 사용: 아이디, 패스워드!!!!!!!!!!

		HashMap map = new HashMap<>();
		
		// HashMap 값 입력: put
		map.put("id","aaa");
		map.put("id","aaa"); // key 값 중복 불가능
		map.put("no","1");
		map.put("lastNo","100");
		map.put("id","bbb"); // 
		
		// HashMap 값_1개 출력: get 안에 key 값을 넣어야함!!!
		System.out.println(map.get("id"));
		
		System.out.println("---------------");
		
		// HashMap 값_모두 출력 (사실 모두 출력은 잘 안씀)
		Iterator it = map.entrySet().iterator(); // HashMap에는 iterator()가 없어서 entrySet() 필요.
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
