package j0522;

public class Student { 

	// 클래스 변수
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균"};
 	static int count=1000;
	
 	// 인스턴스 변수
 	int stuNo;
	String name;
 	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	// 
	{
		count++;
		stuNo = count;
	}
	
	// 기본 생성자
	Student(){}
	
	// 매개변수 생성자
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
}
