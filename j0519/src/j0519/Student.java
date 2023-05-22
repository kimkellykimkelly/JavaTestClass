package j0519;

public class Student {

	// 나중에 DB에 넣기위해 이전처럼 배열을 만들지 않고 하나씩 적음
	
	// 생성자: 메소드의 일종
	// 생성자 특징: 생성자 이름=클래스명 이어야함+항상 return값이 없지만 void 생략.
	// + 모든 클래스는 적어도 생성자 1개를 가짐. 
	// (우리가 기입하지 않을 경우 자동으로 아래와 같이 기본 생성자(매개변수가 없는 생성자)가 생성됨.
	
//	Student () {
//		
//	}
	
	// 생성자
	Student(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k+e+m;
		avg = total/3.0;
	}
	

	// 클래스 변수
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	
	// 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	// 메소드 => 위와 같이 생성자만들면 아래 메소드도 필요없음!!!
	void sum() {
		total = kor + eng + math;
	}
	
	void average() {
		avg = total/3.0;
	}
		
	
	
	}
