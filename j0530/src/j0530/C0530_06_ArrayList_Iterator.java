package j0530;

import java.util.ArrayList;
import java.util.Iterator;

public class C0530_06_ArrayList_Iterator {

	public static void main(String[] args) {
		// ArrayList
		
		ArrayList list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// for문으로 전체 삭제하기
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		} // => 이렇게하면 앞으로 당겨져서 전체 삭제가 안되므로, 아래와 같이 뒤에서부터 for문 돌려야함!

		for (int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// ArrayList의 단점을 보완한게 LinkedList!

		///////////
		// Iterator: Collection을 읽어오는 객체 (구버전: Enumeration. 우리가 쓰진 않지만 예전에 만들어진 버전은 아직도 이걸 사용함)
		// Collection 출력법 -> 사실 위와 같이 for문을 사용해서 출력하는게 아니라, 아래와 같이 Iterator를 사용해야함!
		Iterator it = list.iterator();
		
		while (it.hasNext()) { // 데이터가 있는지 확인
			System.out.println(it.next()); // 1개의 데이터를 가져옴
		} // 이걸 2번 쓴다고 해서 2번 출력되지 않음. 2번 출력하려면 객체 선언 또 해야함 => 잘 쓰지 않음! 하지만 set은 순서없어서 써야함
	
		
		
		
		
	}

}
