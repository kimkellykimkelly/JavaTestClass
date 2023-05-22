package j0522;

public class C0522_05_x {

	public static void main(String[] args) {
		// 객체 배열 사용 이유: 여러 변수를 한번에 선언하기 위해 
		// 생성자 사용 이유: 객체 선언과 동시에 변수를 바로 넣으려고

		Data d1 = new Data();
		// int num1, num2, data1, data2, data3, data4
		
		Data d2 = new Data();
		// int num1, num2, data1, data2, data3, data4
		
		Data d3 = new Data();
		// int num1, num2, data1, data2, data3, data4
		
		// 위와 같이 안하면 아래와 같이 계속 써야함. 근데 위와 같이 하는 것도 귀찮으므로 객체 배열을 만듦.
		int num1 = 0;
		int num2 = 0;
		int data1 = 0;
		int data2 = 0;
		int data3 = 0;
		int data4 = 0;
		
		int num3 = 0;
		int num4 = 0;
		int data5 = 0;
		int data6 = 0;
		int data7 = 0;
		int data8 = 0;
	
		// 매개변수 받는 생성자 사용
		Data d4 = new Data(1,2);
		
		// 배열 선언
		Data[] d = new Data[5]; 
		// 객체 선언
		d[0] = d1; // = d[0] = new Data(); (객체 선언)
		d[1] = d2;
		d[2] = d3;
		

	}

}
