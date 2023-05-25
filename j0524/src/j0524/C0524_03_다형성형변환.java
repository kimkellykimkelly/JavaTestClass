package j0524;

public class C0524_03_다형성형변환 {

	public static void main(String[] args) {
		// 다형성일때만 형변환 가능한것!!!
		
		// 객체선언
		Car c = new Car();
		Car cc = null;
		Ambulance a = new Ambulance();
		Ambulance aa = null;
		FireEngine f = new FireEngine();
		FireEngine ff = null;
		
		// 다형성
		Car c2 = new Ambulance();
		Car c3 = new FireEngine();
		
		//
		a.siren();
		f.water();
		//
//		c2.siren(); 부모에는 siren 주소가 없어서 불가능
//		c2.water(); 부모에는 water 주소가 없어서 불가능
		// 아래와 같이 하면 가능!
		aa = (Ambulance)c2;
		aa.siren();
		
		// 자손의 참조변수로 부모의 객체를 다루는 것은 안됨! 그러나 다형성일때만 가능!
		// 아래는 불가능. 다형성일때만 데이터를 넣었다가 뺐다가 가능함!!!
//		aa = (Ambulance)c; // 형 변환은 가능하지만, 이건 아래와 같은 뜻이므로 실행시키면 에러!
//		Ambulance aa = new Car();
//		aa.siren();
	
		// 다른 자손의 형변환 안됨! (구문 상 문제없지만, 실행시키면 에러!)
		aa = (Ambulance)c3;
	
	
	
	
	
	}

}
