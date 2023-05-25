package c0525_03_추상클래스;

public class DvdPlayer extends Player{

	// 오버라이딩 꼭 해야함! => 안하면 에러.
	// => 상속으로 하면 되지 왜 추상클래스 사용? -> 각 클래스마다 같은 메서드를 다른 내용으로 구현한다면, 무조건 오버라이딩 해야하므로 추상클래스 사용.
	// + 잘 안쓰이고 보통은 상속 사용하지만, library에서 가끔 사용.
	
	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}

}
