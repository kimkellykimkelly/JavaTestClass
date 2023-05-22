package j0522;

public class Student {

	// 클래스 변수
	static int count = 1000;

	// 인스턴스 변수
	int stuNo; // 20231011001 / String.format 사용하려면 string으로 받아야함(C0522_10 참고)
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	// 인스턴스 초기화블럭
	{
		++count;
     // String str = "2023" + String.format("%04d, 1); //2023 101 1001 (C0522_10 참고)
		stuNo = count; // 1001, 1002, 1002, ...
	}
	// 초기화블록 내용을 기본생성자 안에 넣어도 똑같은 결과 나오는데, 이렇게 쓰는 이유?
	// => 생성자에 중복으로 쓰는 걸 뽑아서 초기화블록에 한번만 씀!
	// => 교수님 한번도 써본적없음! 오라클에 있기 때문
	
	// 기본 생성자
	Student() {
	}

	// 매개변수 생성자
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.avg/3.0;
	}
}
