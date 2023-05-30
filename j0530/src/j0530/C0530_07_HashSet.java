package j0530;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0530_07_HashSet {

	public static void main(String[] args) {
		// ArrayList vs HashSet

		// ArrayList 입출력
		ArrayList list = new ArrayList<>();
		list.add("abc");
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("abc");
		list.add("bbb"); 
		list.add("aaa");
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("----------------------");
		
		// HashSet 입출력 => 순서가 없어서 출력 시 for문 불가, iterator 사용해야함! / 중복 허용 x
		HashSet hs = new HashSet<>();
		hs.add("abc");
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("abc"); 
		hs.add("bbb");
		hs.add("aaa");
		
		Iterator it2 = hs.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		} // => 출력 시 입력한 순서가 아닌 무작위로, 중복 제거되어 출력
		
		
		
		
		
		
		
	}

}
