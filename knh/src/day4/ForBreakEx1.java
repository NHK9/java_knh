package day4;

import java.util.Scanner;

public class ForBreakEx1 {

	public static void main(String[] args) {
		// 0�� �Է��Ҷ����� ������ ��� �Է¹޴� �ڵ带 �ۼ��ϼ���
		//break�� �̿�
		
		Scanner scan = new Scanner(System.in);

		for(;;) {
			System.out.println("���� �Է�");
			int n = scan.nextInt();
			if (n==0) {
				System.out.println("����");
				scan.close();
				break;
			}
		}
	}

}
