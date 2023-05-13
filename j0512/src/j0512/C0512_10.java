package j0512;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class C0512_10 {

	public static void main(String[] args) {

		//Integer: 객체형. (일단 이런게 있다 정도만 알기)
		Integer[] arr = { 1, 11, 23, 45, 2, 3, 9, 5 }; 
		
		// 정렬은 DB에서 작업하므로, 여기서 별로 사용하지 않음
//		Arrays.sort(arr); // 오름차순정렬
//		Arrays.sort(arr,Collections.reverseOrder()); //내림차순정렬

		
		// 단순 for문. arr가 배열일때만 사용 가능!
		for (int i:arr) {
			System.out.println(i + " "); // => 정렬되어 출력됨!
		}

		// 정식 for문
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}

	}

}
