package day6;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortEx2 {

	public static void main(String[] args) {
		// 다음과 같은 배열이 있을때 정렬하는 코드 작성
		int num[]= {1,10,9,3,6,2,3,4};
		
		Arrays.sort(num);//오름차순
		Arrays.sort(num,0,5);//오름차순으로 0부터 5번지까지정렬
		
		for(int tmp:num) {
			System.out.println(tmp);
		}
	}

}
