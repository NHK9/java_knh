package day4;

public class ForContinueEvenNumEx1 {

	public static void main(String[] args) {
		// 1���� 10������ ¦���� ����ϴ� �ڵ带 continue�� �̿����ۼ�
		//Ȧ���̸� continue�� ��ŵ
		int i;
		for(i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
				}
			System.out.println(i);
		}

	}

}
