package j0516;

public class Tv { // 클래스는 앞자리 대문자로 쓰는 걸 권장.
	// class에 정의하는 변수는 자동으로 default값이 들어감! (메소드 내 변수=지역변수는 기본값을 넣어주어야함!)
	String color; // -> default값: null
	boolean power; // -> default값: false
	int channel; // -> default값: 0
	int volume;
	// -> char default값: 빈 공백?

	// 메소드
	void power() {
		power = !power; // => 한번 누르면 on이 됨!
	}

	void channelUp() {
		if (channel >= 999) {
			channel = 1;
			return; // return을 만나면 밑으로 안가고 빠져나옴.
		}
		channel++; 
	} // => 마지막 채녈: 999번

	void channelDown() {
		if (channel <= 1) {
			channel = 999;
			return;
		}
		channel--;
	} // => 시작 채널: 1번

	void volumeUp() {
		if (volume >= 100) {
			volume = 100;
			System.out.println("볼륨은 100이상으로는 올라가지 않습니다");
			return;
		}
		volume++;
	}

	void volumeDown() {
		if (volume <= 1) {
			volume = 0;
			System.out.println("볼륨은 0이하로는 내려가지 않습니다");
			return;
		}
		volume--;
	}

}
