package day6;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortEx2 {

	public static void main(String[] args) {
		// ������ ���� �迭�� ������ �����ϴ� �ڵ� �ۼ�
		int num[]= {1,10,9,3,6,2,3,4};
		
		//Arrays.sort(num);//��������
		Arrays.sort(num,0,5);//������������ 0���� 5������������
		
		for(int tmp:num) {
			System.out.println(tmp);
		}
	}

}
