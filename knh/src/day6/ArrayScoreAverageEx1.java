package day6;

import java.util.Scanner;

public class ArrayScoreAverageEx1 {

	public static void main(String[] args) {
		// �迭�� �̿��Ͽ� 5���� �л��� ������� �Է¹޾�
		//��� ���ϴ� �ڵ� �ۼ� ��, ������ �迭������,������ ����
		
		Scanner scan=new Scanner(System.in);
		
		int n,sum=0,arr[];
		arr=new int[5];
		
		for(n=0;n<5;n++) {
			System.out.println("���� �Է�");
			arr[n]=scan.nextInt();
			sum+=arr[n];
		}
		System.out.println((double)sum/n);
		scan.close();
		

	}

}
