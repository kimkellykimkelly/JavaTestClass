package j0522;

public class Product {

	static int count = 0; // 클래스변수 - 객체선언없이 클래스명.변수명
	int serialNo; // 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	
	// 인스턴스 초기화블럭 // => 아래 내용을 기본생성자 안에 넣어도 똑같은 결과 나오는데, 이렇게 쓰는 이유? => C0522_10, Student 보기!!!
	{
		++count;
		serialNo = count;
	}
	
	// 기본생성자
	Product(){} 
	
}
