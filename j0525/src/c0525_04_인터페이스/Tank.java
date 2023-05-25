package c0525_04_인터페이스;

public class Tank extends GroundUnit implements Repairable {

	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
}
