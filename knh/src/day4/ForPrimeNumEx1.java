package day4;

import java.util.Scanner;

public class ForPrimeNumEx1 {

	public static void main(String[] args) {
		/* �Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 for������ �ۼ��ϼ���
		 * �Ҽ��� ����� 2���� ��*/
		
		Scanner scan = new Scanner(System.in);
		
		int n, m, g=0;
		
		System.out.println("���� �Է�");
		
		n = scan.nextInt();
		
		for (m=1;n>=m;m++) {
			if (n % m == 0) g++; //g=g+1
		}
		
		if (g == 2) System.out.println("�Ҽ�");
		else System.out.println("����� "+ g + "���� �Ҽ��� �ƴ�");
		
		switch(g) {
		case 2: System.out.println("�Ҽ�"); break;
		default:System.out.println("����� "+ g + "���� �Ҽ��� �ƴ�");
		break;
		}
		
		String str = g == 2 ? "�Ҽ�" :"����� "+ g + "���� �Ҽ��� �ƴ�";
		System.out.println(n+"��"+str);
		
		scan.close();

	}

}
