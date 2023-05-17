
public class Student { // class

	// 클래스 변수 -> 공용으로 사용. 
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	// 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	void sum() {
		total = kor + eng + math;
	}

	void average() {
		avg = total / 3.0;
	}
} // class
