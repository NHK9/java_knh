package day6;

import java.util.Arrays;

public class ArrayForEx1 {

	public static void main(String[] args) {
		// ���� for�� : for(�ڷ��� ������:�迭or����Ʈ){���๮;}
		// �迭�� ���� �����Ҷ� �����������
		// �迭�� ���� 0�������� �������������� ���������� Ȯ���Ҷ� ���
		// �迭���� ���� ���� ������ ����
		
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
