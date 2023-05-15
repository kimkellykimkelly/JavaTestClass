package j0515;

import java.util.Iterator;
import java.util.Scanner;

public class C0515_08_07test {

	public static void main(String[] args) {
		// 5*5 배열을 만들어서 해당 번호 입력 시 x 표시하는 프로그램 만들기 (C0515_07 똑같음)

		Scanner scan = new Scanner(System.in);
		
		int random = 0, temp = 0;
		String input = "";
		
		// 배열 생성 - 박스, num
		String[][] box = new String[5][5];
		
		int[] num = new int[25];
		
		// num에 1~25 넣기
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		// num 1~25 순서 무작위로 섞기
		for (int i = 0; i < 100; i++) {
			random = (int)(Math.random()*25); // 0~24
			num[0] = temp;
			num[0] = num[random];
			temp = num[random];
		}
		
		// 박스에 숫자 넣기
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = ""+num[5*i+j];
			}
		}
		
		
		// 출력 반복
		while(true) {
		// 타이틀		
		System.out.print(" "+"|\t");
		for (int i = 0; i < box.length; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		// 박스 번호 출력
		for (int i = 0; i < box.length; i++) {
			System.out.print(i+"|\t");
			for (int j = 0; j < box[i].length; j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//박스 내 번호 입력
		System.out.println("1~25 중 번호를 입력하세요");
		input = scan.next(); // string
		
		//번호 입력 시 x로 변경 (input 값과 박스 내 값 하나하나 비교)
		loop: for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				if (box[i][j].equals(input)) { // input은 string
					box[i][j] = "x";
					break loop;
				}
			}
		}
		
	    } // while
		
	}

}
