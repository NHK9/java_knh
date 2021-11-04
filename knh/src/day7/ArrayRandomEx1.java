package day7;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomEx1 {

	public static void main(String[] args) {
		// 1~9사이 랜덤한 수를 3개 생성하여 배열에 저장하고 출력하는 코드 작성
		
		int [] arr1=new int[3];
		Random r = new Random();
		
		for(int n=0;n<3;n++) {
			arr1[n]=r.nextInt(10);
		}
		System.out.println(Arrays.toString(arr1));
		
		int [] num=new int[3];
		int min=1,max=9;
		for(int i =0;i<3;i++) {
			int random = (int)(Math.random()*(max-min+1)-min);
			num[i]=random;
		}
		
	}
}