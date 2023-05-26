package j0526;

public class Person {

	long id; // 주민번호 13자리 8801011111111. int 불가능
	
	//생성자
	Person(){}
	
	Person(long id){
		this.id = id;
	}
	
	// 생성자를 이용해 copy하기!
	Person(Person p){
		this.id = p.id;
	}
	
	//equals: 
	@Override
	public boolean equals(Object obj) {
//		Person p = (Person) obj; 라고 정의해주면 아래 (Person) obj를 p라고 쓰면 됨
		boolean chk = false;
		if (id==((Person)obj).id) {
			chk = true;
		} 
		return chk;
	}
	
	//toString: 주소값을 데이터로 나오게 함 (잘 안쓰임)
	@Override
	public String toString() {
		String str = "주민번호: "+id;
		return str;
	}
	
	
} // class
