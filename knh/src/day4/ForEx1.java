package day4;

public class ForEx1 {

	public static void main(String[] args) {
		/*for�� ���� �����ؾ��ϴ� ��Ȳ
		 * 1���� 5���� ����ϴ¿������� �߻��� �Ǽ�*/
		
		int i;
		//�ǵ�: 1���� 5���� ����ϱ�
		//���: 6
		//����: for�� �ڿ� ; �̿ͼ� for���� ���๮�� ���°��
		for(i=1;i<=5;i++); {
			System.out.println(i+"");
		}
		System.out.println();
		// ���: ��� ��ü�� �ȵ�
		// ����: ���ǽ��� �߸������Ͽ� 1���� ���� �ȵ� ���
		for(i=1;i>=5;i++) {
			System.out.println(i+"");
		}
		System.out.println();
		/* ����: ���ǽ��� �߸������Ͽ� ������ ���� ���� �� ���,���ѷ����¾ƴ�
		for(i=1;i<=5;i--) {
			System.out.println(i+"");

	}*/
		//int�� ǥ���Ҽ��ִ� ���� ū ��
		System.out.println("int �ִ밪:"+Integer.MAX_VALUE);
		//int�� ǥ���Ҽ��ִ� ���� ���� ��
		System.out.println("int �ּҰ�:"+Integer.MAX_VALUE);
		int maxNum = Integer.MAX_VALUE +1; //�����÷ο�
		int minNum = Integer.MIN_VALUE -1;//����÷ο�
		System.out.println("int �ִ밪+1:"+maxNum);
		System.out.println("int �ּҰ�-1:"+minNum);
}
}