package j0530;

public class C0530_04_StringBuffer {

	public static void main(String[] args) {
		// String vs 기본형

		int a = 0;
		a = a + 1; // 같은 공간에 업데이트됨

		String str = "abc";
		str = str + "1"; // 새로운 공간을 만들어 저장함
		
		// => StringBuffer => 새로운 공간이 만들어지는게 아니라, update됨!
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append(1);
		sb.append(1);
		System.out.println(sb);
		
		
		
	}

}
