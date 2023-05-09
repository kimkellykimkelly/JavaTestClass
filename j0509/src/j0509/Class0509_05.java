package j0509;

public class Class0509_05 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
//		int result = num2*num3+num1; //23
//		System.out.println(result);
		
		int result = ++num3; 
		System.out.println(result); // num3+1 = 6
		System.out.println(num3); // num3+1 = 6
		
		int result2 = num2++;
		System.out.println(result2); // num2
		System.out.println(num2); // num2+1
		
		// 이게 헷갈린다면, 수식 앞에 ++num3;, num2++; 로 따로 적으면 무조건 1 증가하는 것. 
		
	}

}
