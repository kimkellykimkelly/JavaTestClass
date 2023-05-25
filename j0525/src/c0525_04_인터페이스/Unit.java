package c0525_04_인터페이스;

public class Unit {

	int hitPoint; // 현재 체력
	final int MAX_HP; // 체력의 최대값 100
	
	Unit(){
		MAX_HP = 10;}

	Unit(int hp){
		MAX_HP = hp;
	}
}
