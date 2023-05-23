
public class Student_0523 { // Student에서 접근제어자, get set 추가

	// 클래스 변수
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균"};
 	static int count=1000;
	
 	// 인스턴스 변수
 	private int stuNo;
 	private String name;
 	private int kor;
 	private int eng;
 	private int math;
 	private int total;
 	private double avg;
 	private int rank;
	
	// 
	{
		count++;
		stuNo = count;
	}
	
	// 기본 생성자
	public Student_0523(){}
	
	// 매개변수 생성자
	public Student_0523(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}

	// 읽어오기 get
	public String getName() {
		return name;
	}
	// 값 저장 set
	public void setName(String name) {
		this.name = name;
	}
	
	int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}

	int getMath(){
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}





}

