package day4;

public class ForGCDEx2 {

	public static void main(String[] args) {
		/*�������� ���������, �ִ������� ���ϴ��ڵ� �ۼ�
		 * �ݺ�Ƚ��:i�� 1���� num1���� 1������
		 * ��Ģ��: i�� 8�� ����̰�,i�� 12�� ����̸� gcd�� i�� ����
		 * �ݺ��� ������ gcd ���*/

		int n1=12, n2=8, gcd=0, m;
		
		for ( m=1 ; m<=n1 ; m++ ) {
			if(n1 % m == 0 && n2 % m ==0) {
				gcd = m;
			}
		}
		System.out.println(gcd);
		
	}

}
