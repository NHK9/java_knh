package day4;

public class BreakEx1 {

	public static void main(String[] args) {
		/*�ݺ������� break ���� if���� ���� ����ϴ��� �����ִ� ����*/
		
		for(;;) {
			System.out.println("Hello");
			//break�� if�� ���� ���Ա� ������ �ǹ̰� ������
			break;
			}
		//1���� 5���� break���� �̿��Ͽ� �߷��ϴ� ����
		int n;
		for(n=1;;n++) {
			System.out.println(n);
			if (n>4) break;
		}

	}

}
