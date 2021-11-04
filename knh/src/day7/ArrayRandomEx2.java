package day7;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		// 1~9사이의 랜덤한 수 3개를 배열에 저장하여 출력하는 코드를 작성
		// 단, 중복되지 않게
		
		int [] num=new int[3];
		int min = 1, max=3
				;
		int count = 0;
		do {
			// 랜덤한 수 생성
			int random = (int)(Math.random()*(max-min+1)+min);
			// 배열에 중복된 값이 있는지 확인하는 반복문
			int i;
			for(i=0; i < count ; i++) {
				//중복된 수가 있으면 반복문을 중단
				if(num[i]==random) {
					break;
				}
			}
			//반복문 종료후 i값이 count와 같다는 건 중복된 수가 없어서
			//break문이 실행 안된 경우
			if( i ==count) {
				num[i]=random;
				count++;
			}
		}while(count != 3);
		System.out.println(Arrays.toString(num));
	}

}
