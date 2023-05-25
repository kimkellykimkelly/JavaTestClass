package c0525_04_인터페이스;

public class Scv extends GroundUnit {

	Scv() {
		super(60);
		hitPoint = MAX_HP;
	}

	//
	void repair(GroundUnit g) {
		while (g.hitPoint != g.MAX_HP) {
			g.hitPoint++;
		}
		System.out.println("수리가 완료되었습니다");
	}

}
