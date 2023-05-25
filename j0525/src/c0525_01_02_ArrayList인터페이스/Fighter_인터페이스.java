package c0525_01_02_ArrayList인터페이스;

public class Fighter_인터페이스 implements Fightable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	// 인터페이스
	// 일종의 추상클래스. 추상클래스보다 추상화 정도 높음 => 상속받아서 구현해야만 사용 가능!
	
	// 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용.
	// 사용 목적 : 꼭 구현할 메서드 제공, 표준화 가능
	// 인터페이스 쓰는 이유: 관계가 없는 것들을 관계를 맺어주는 게 핵심! / 파일의 종속성을 없앰!
	
	// 사용법: class 대신 interface 사용 / 추상메서드(public abstract)와 상수(public static final)만을 멤버로 가짐.
	
	// 클래스처럼 상속 가능하고, 클래스와 다르게 여러 개 상속 받을 수 있음. 상속 시 extends가 아닌 implements!
	// Object클래스와 같은 최고 조상 없음 => equals 등 사용 불가능
	
	// 다형성 가능:
	// 인터페이스 타입의 변수로 인터페이스를 구현한 클래스의 인스턴스를 참조 가능. 
	// 메서드의 매개변수 타입, 리턴타입으로 지정 가능. 

	
	
	
	
	
	
	
	
	
	
	
}
