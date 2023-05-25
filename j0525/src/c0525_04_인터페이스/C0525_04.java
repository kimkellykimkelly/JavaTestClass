package c0525_04_인터페이스;

public class C0525_04 {

	public static void main(String[] args) {
		// 

		Tank t1 = new Tank();
		Tank t2 = new Tank();
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Scv s1 = new Scv();
		
		// 총 맞으면
		t1.hitPoint -= 10;
		t1.hitPoint -= 10; 
		System.out.println("현재 체력: "+t1.hitPoint); // => 150-20 = 130
		
		// 수리
		s1.repair(t1); 
		System.out.println("현재 체력: "+t1.hitPoint); // => 150
		
		//
		m2.hitPoint -= 10;
		m2.hitPoint -= 10; 
		System.out.println("현재 체력: "+t1.hitPoint); // => 150-20 = 130
		
		
		
	}

}
