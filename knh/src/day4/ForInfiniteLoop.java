package day4;

public class ForInfiniteLoop {

	public static void main(String[] args) {
		/*���ѷ���:�ݺ����� ������� ���� ��Ȳ
		 * 1.���ǽ� ����(for���� �ش�,while���� do while���� �ƴ�)
		 *  -�ݺ����ؿ��ڵ��ۼ��ÿ���
		 *  -���� ������ ���� ����ɼ� �����Ƿ�
		 * 2.���ǽ����߸� ����,������ ���̵Ȱ��
		 * 3. �������� �������� �ʾƼ� ���� ������ ��� �ݺ��ϴ� ���
		 *  =���� ��� 1,2�� �ݺ����ؿ� �ڵ带 �ۼ��ϸ� ������ ������
		 *  �ݺ����ؿ� �ڵ带 �ۼ��ص������� �ȶ�*/
		/*for(;;) {
			System.out.println("Hello");
		}
		System.out.println("df");*/
		
		//���ѷ���2
		int  i;
		/*for(i=1; i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println("����");*/
		
		//���ѷ���3
		for(i=1;i !=5;) System.out.println("Hello");
		System.out.println("�����߻���������");

	}

}
