package j0509;

public class C0509_11 {

	public static void main(String[] args) {
		
		// 소수점 4자리에서 반올림 출력하시오. (3자리까지 출력)
		// 1. 변수선언 2. 출력
//		double pi = 3.141592;
//		double result = Math.round(pi*1000)/1000.0; //Math.round: 소수점 첫째자리에서 반올림해줌.
//		System.out.println(result);

		
		// 소수점 2자리에서 반올림해서 출력 (1자리까지 출력)
		double pi = 3.7894;
		double result = Math.round(pi*10)/10.0; //Math.round: 소수점 첫째자리에서 반올림해줌.
		System.out.println(result);
		
		//
		
		
	}

}
