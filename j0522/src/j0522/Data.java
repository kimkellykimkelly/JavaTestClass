package j0522;

public class Data {

//	// 기본 생성자: 
//	Data(){}
//
//	// 매개변수 생성자
//	Data(int n1, int n2) {
//		num1 = n1;
//		num2 = n2;
//		data1 = num1 + num2;
//		data2 = num1 - num2;
//		data3 = num1 * num2;
//		data4 = num1 / num2;
//	}

	// 변수
	int num1; // 입력받을 1번째 숫자
	int num2; // 입력받을 2번째 숫자
	int data1; // 두수 더하기
	int data2; // 두수 빼기
	int data3; // 두수 곱하기
	int data4; // 두수 나누기

	
	////////////////////////////
	// this(): 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
	// +다른 생성자 호출은 생성자의 첫 문장에서만 가능 (기본값 설정할때 사용. 별로 쓰이지 않음)

	// 매개변수 생성자 내용(메서드)에 1,1 값을 기본으로 세팅하고 싶을때 기본 생성자에 아래와 같이 써야함
//	Data(){
//		num1 = 1;
//		num2 = 1;
//		data1 = num1 + num2;
//		data2 = num1 - num2;
//		data3 = num1 * num2;
//		data4 = num1 / num2;
//	}
	// 이렇게 쓰기 귀찮으니까 아래와 같이 쓰는 게 this() 사용법!!!

	Data(){
		this(1,1); // 같은 클래스 내 다른 생성자 호출
	}

	// this: 인스턴스 자신을 가리키는 참조변수(중요!!!!) => 같은 변수명을 사용해야 가독성이 높아지므로 사용!!! 
	// + 인스턴스의 주소가 저장되어있음 / 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재

    // 생성자
	Data(int num1, int num2) { // num1,num2 -> 매개변수이자 지역변수. 
		this.num1 = num1; // this.num1 -> 이 클래스 내의 인스턴스 변수
		this.num2 = num1;
		data1 = num1 + num2;
		data2 = num1 - num2;
		data3 = num1 * num2;
		data4 = num1 / num2;
	}

} // class
