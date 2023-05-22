package j0518;

import java.util.Iterator;
import java.util.Scanner;

public class C0518_06_점수구간에따라등급 {

	public static void main(String[] args) {
		// 퀴즈: 국어 영어 수학점수를 입력받아, 평균이 90점 이상이면 a (97점 이상 + 93점 이하 -) 80점 b C D F 출력해라

		Scanner scan = new Scanner(System.in);

		System.out.println("국어점수를 입력하세요");
		int k = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int e = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int m = scan.nextInt();

		// 아래와 같이 받을 수 있음
//		int[] score = new int[3];
//		for (int i = 0; i < score.length; i++) {
//			System.out.println("점수를 입력하세요");
//			score[i] = scan.nextInt();
//		}
		
		double avg = (k + e + m) / 3.0;
		String result = "";

		if (avg >= 90) {
			result = "A";

			if (avg >= 97) {
				result += "+"; // 문자열 + 문자열 가능하므로 또 변수 설정안하고 result에 바로 += 쓸 수 있음!
			}
			if (avg <= 93) {
				result += "-";
			}

		} else if (avg >= 80) {
			result = "B";
			if (avg >= 87) {
				result += "+";
			}
			if (avg <= 83) {
				result += "-";
			}
			
		} else if (avg >= 70) {
			result = "C";
			if (avg >= 77) {
				result += "+";
			}
			if (avg <= 73) {
				result += "-";
			}
			
		} else if (avg >= 60) {
			result = "D";
			if (avg >= 67) {
				result += "+";
			}
			if (avg <= 63) {
				result += "-";
			}
			
		} else {
			result = "F";
		}

		System.out.printf("평균: %.2f, 성적: %s", avg, result);

	}

}
