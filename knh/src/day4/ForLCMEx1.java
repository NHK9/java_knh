package day4;

public class ForLCMEx1 {

	public static void main(String[] args) {
		// �� ������ �ּ� ������� ���ϴ� �ڵ带 for������ �ۼ�
		//a�ǹ��:� ������ a�� ���������� �������� 0�μ���
		//4�� ���:4,8,12,16...
		//6�� ���:6,12,18,24
		//�ݺ�Ƚ��:i�� 1���� �����ؼ� num1*num2����1������
		//��Ģ��: i�� num1�ǹ���̰� num2�� ����̸� i�� ����ѵ� ����
		//���1=1���� �����ϹǷ� ���ʿ��� �ݺ�Ƚ���� ������
		
		//int n1=36,n2=9,m;
		//for(m=1;m<=n1*n2;m++) {
			//if(m%n1==0 && m%n2==0) {
			//System.out.println(m);
			//break;}
		//}
		
		//���2 :i�� num1���� �����ؼ� num1*num2���� num1�� ����
		//��Ģ��: i�� num2�� ����̸� i�� ����ϰ� �ݺ��� ����
		
		int n1=6,n2=4 ,m;
			for(m=n1;m<=n1*n2;m+=n1) {
				if (m%n1==0&&m%n2==0) {
					System.out.println(m);
					break;
				}
			}
	}

}