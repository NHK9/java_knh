package day4;

public class ForGCDBreakEx1 {

	public static void main(String[] args) {
		// �������� �ִ������� break���� �̿��� �ۼ�
		// ������� ū������ ���ϱ� ������ ó������ ������� ����ϰ� ����
		
		
		int n1=12,n2=8,m;
		
		for(m=n1;m>=1;m--) {
			if(n1%m==0&&n2%m==0) {
				System.out.println(m);
				break;
			}
		}
		

	}

}
