package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBaseballEx1 {

	public static void main(String[] args) {
		// ���ھ߱�����
		// ��ǻ�Ͱ� �������� 1���� 9���̿� �ߺ��������� 3���� ���� ����
		// ����ڴ� ��ǻ�Ͱ� ������ 3���� ���� ���ߴ� ����
		// ����ڰ� ó������ �Է��� �ߺ��������� 1~9������ �� ���� ��ǻ�Ͱ� ���� ����� ����
		// ��Ģ
		// S: ���ڰ��ְ�, ������ ��ġ�� �������
		// B: ���ڴ� ������ ��ġ�� �ȸ��� ���
		// 3O: �´� ���ڰ� �ϳ������°��
		// 3S: ���� ����
		// ��ǻ��:1 9 5
		// �����:1 2 3 == 1S
		//
		
		Scanner scan=new Scanner(System.in);
		int []com=new int[3];
		int []user=new int[3];
		int s,b;
		System.out.println("��ǻ�� ���� �Է�");
		for(int n=0;n<com.length;n++) {
			com[n]=scan.nextInt();
		}
		
		do {
			s=0;
			b=0;
			System.out.println("���� �Է�");
			for(int i=0;i<user.length;i++) {
				user[i]=scan.nextInt();
			}
			for(int i=0;i<user.length;i++) {
				if(user[i]==com[i]) s++;
			}
			//���� ���� ���
			for(int i=0;i<com.length;i++) {
				for(int j=0;j<com.length;j++) {
					if(i==j) {
						continue;
					}
					if(com[i]==user[j]) b++;
				}
			}
			if(s!=0) System.out.print(s+"S ");
			if(b!=0) System.out.print(b+"B");
			if(s==0&&b==0) System.out.print("3O");
			System.out.println();
			
		}while(s!=3);			
		System.out.println("����");
			scan.close();
	}
}