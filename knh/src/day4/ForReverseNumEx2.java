package day4;

public class ForReverseNumEx2 {

	public static void main(String[] args) {
		/*�������������� ����ϴ��ڵ带 for������ �ۼ��ϼ���
		 * ��)1234= 4321
		 * �ݺ���1 : 1���ڸ��� �����ؼ� ����,1234�� 123���θ���
		 * �ݺ���2 : 123���� 1���ڸ��� ����,12�� ����
		 * �ݺ��� 
		 * */
		int n=971654;

		for (;n!=0;) {
			System.out.print(n%10);
			n = n/10;//n=n/10�� �����Ŀ� �־��
		}

	}

}
