package day4;

public class ForGCDEx1 {

	public static void main(String[] args) {
		/*�������� �ִ������� ���ϴ��ڵ� �ۼ�
		 * �ݺ�Ƚ��: i num�� 1����1���� 1������
		 * ��Ģ��: i�� 8�� ����̰�,i�� 12�� ����̸� 
		 * */

		int n1=12, n2=8, m;
		
		//�μ��� ����� ���
		for(m=1;m<=n1 && m<=n2 ;m++) {
			if (n1 % m == 0) {
				if (n2 % m == 0) System.out.print(m+" ");
			}
			
		}
		
		for ( m=1 ; m<=n1 ; m++ ) {
			if(n1 % m == 0 && n2 % m ==0) {
				System.out.print(m+" ");
			}
		}
		
		
		

		}
		
		
	}

