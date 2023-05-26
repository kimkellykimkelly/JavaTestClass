package j0526;

public class C0526_11_Substring {

	public static void main(String[] args) {
		// substring
		
		String str1 = "https://semiconductor.samsung.com/kr"; 
		String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp"; 
		String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp"; 
																								
		String test = "abcdefghijklmn";
		String lotto = "1조198756";

		String result1 = lotto.substring(2); // 2번 위치부터 끝까지 잘라온다는 뜻
		System.out.println("lotto: " + result1);
		String result2 = lotto.substring(3, 6); // 3번 위치부터 6번 앞까지(즉 3~5자리) 잘라온다는 뜻
		System.out.println("lotto: " + result2);
		
		// str1이용해서 str2에서 dram/ddr.jsp 자르기
		String result3 = str2.substring(str1.length()); // 자바는 뒤에서 읽어오는 - 기능 없음(자바 스크립트는 있음)
		System.out.println(result3);
		
		
		
		
		
		
		
		
		
		
		

	}

}
