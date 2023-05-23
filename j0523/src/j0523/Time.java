package j0523;

public class Time {

	//인스턴스 변수: 객체 선언 후 참조변수명.변수명
	private int hour;
	private int minute;
	private int second;
	// => 이렇게 변수에 직접 접근하지 못하도록 막고,
	// +  get,set 메서드로 변수값을 읽고 저장하도록 설정함!
	// => get, set 사용이유!!!!!! => 데이터 보완
	
	// 기본 생성자
	Time(){}
	
	// 매개변수 생성자
	Time(int hour, int minute, int second){
		this.hour = hour; // this: 인스턴스 변수 가리킴.
		this.minute = minute;
		this.second = second;
	}
	
	// hour의 변수값을 읽어오는 메소드(get)
	public int getHour() {
		return hour;
	}
	
	// hour의 변수값을 저장하는 메소드(set)
	public void setHour(int hour) {
		if (hour<0||hour>23) { // 23까지 들어감
			System.out.println("데이터가 잘못 입력되었습니다");
			return;
		}
		this.hour = hour;
	}
}
