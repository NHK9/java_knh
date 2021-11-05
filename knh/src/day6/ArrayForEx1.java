package day6;

import java.util.Arrays;

public class ArrayForEx1 {

	public static void main(String[] args) {
		// 향상된 for문 : for(자료형 변수명:배열or리스트){실행문;}
		// 배열의 값을 수정할땐 사용하지않음
		// 배열의 값을 0번지부터 마지막번지까지 순차적으로 확인할때 사용
		// 배열에서 꺼낸 값을 변수명에 저장
		
		int arr2[] = new int[5];
		int i,sum;
		for(i=0;i<5;i++) {
			arr2[i] = 2*i+2;
		}
		sum=0;
		for(int tmp : arr2) {
			sum+=tmp;
		}
		System.out.println(sum);

	}

}
