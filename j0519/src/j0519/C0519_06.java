package j0519;

public class C0519_06 {

	public static void main(String[] args) {
		//class Board 사용
		
		String no = "1";
		String title = "홈페이지 오픈";
		String date = "2023-05-19";
		String name = "홍길동";

		// 위 내용을 class Board의 save 메서드에 저장해서 saveBoard 배열에 넣기
		// => class Board의 save 메서드에 매개변수를 보내주면 됨
		// => 반대로 save 메서드를 통해 값을 받고 싶으면 return 해주면 됨
		
		// 이런 식으로 하는 이유: 보안 상의 이유!!!(이게 서버고, class Board가 DB인 셈)
	
		// 객체 선언
		Board b = new Board();
		// 메소드 호출
		String[] saveBoard = b.save(no, title, date, name);
		
		// 출력
		for (int i = 0; i < saveBoard.length; i++) {
			System.out.println(saveBoard[i]+" ");
		}
		System.out.println();
		
	} // main
	
	
	
} // class
