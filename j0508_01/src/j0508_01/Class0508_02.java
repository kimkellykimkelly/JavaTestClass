package j0508_01;

public class Class0508_02 {
	
	public static void main(String[] args) {
		boolean power = true;
		char ch = 'A';	// 컴퓨터는 65라는 숫자로 인식.
		char ch2 = 65;
		char ch3 = '\u0041';
		char tab = '\t';
		byte b = 127;
		short s = 32767;
		int i = 100;
		int oct = 0100; //8진수
		int hex = 0x100; //16진수
		
		long l = 10000000000L;
		float f = 3.14f;
		double d = 3.14;
		float f2 = 100f;
		
		System.out.println(power);
		System.out.println(ch); // A
		System.out.println(ch2); // A
		System.out.println(ch3); // A
		System.out.println(""+tab+ch2);
		
		System.out.println(f2); // 소수점이 자동으로 붙음
		
	} // main
} // class
