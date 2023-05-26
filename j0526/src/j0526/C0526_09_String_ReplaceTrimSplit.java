package j0526;

import java.util.Arrays;
import java.util.Scanner;

public class C0526_09_String_ReplaceTrimSplit {

	public static void main(String[] args) {
		// replace: 글자 대체 / trim: 앞쪽뒤쪽 공백 제거

		Scanner scan = new Scanner(System.in);
		
		String str = "    aaa aaa aaa    ";
		String str2 = "bbb,bbb,bbb,bbb";

		System.out.println("현재 str: " + str);
		System.out.println("-----------------------------");

		String result = str.trim(); // 앞쪽뒤쪽 공백 제거
		System.out.println("공백제거된 str: " + result);

		String result2 = str2.replace("bbb", "abc");
		System.out.println("문자변경된 str2 : " + result2);

		String result3 = str2.replace(",", " ");
		System.out.println(",를 공백으로 변경된 str2: " + result3);
		
		// str 앞뒤 공백, 사이공백을 모두 제거해서 출력 => replace만 사용해도 됨!
		String result4 = str.trim();
		String result5 = result4.replace(" ", "");
		System.out.println("앞뒤공백과 사이공백 모두 제거된 str"+result5);
		
		// split: 자르기
		String[] result6 = str2.split(","); // => ,를 기준으로 잘라서 배열에 넣음
		System.out.println(Arrays.toString(result6)); // 배열을 문자열로 변경
		System.out.println(result6[0]);
		
		

	} // main

}
