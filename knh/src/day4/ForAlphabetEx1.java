package day4;

public class ForAlphabetEx1 {

	public static void main(String[] args) {
		/*���ڿ� ���ڸ� ���ϸ�??
		 * ���ڿ� ���ڸ� ���ϸ� ���ڿ� �´� �����ڵ尪���� 1�� ����
		 * 'a'�� �ڵ尪�� 97,���⿡ 1���ϸ� ���� 98
		 * �� ���� ���ڷ� ��ȯ�ϸ� �ش� �����ڵ忡 �´� ����'b'�� ��*/
		char ch1 = 'a';
		int num = 1;
		char ch2 = (char)(ch1+1);//97+1=98(int)
		char ch3 = 'a'+1; //98(char)='b'
		char ch4 = (char)(ch1 + num);//97+1=98(int)
		System.out.println("ch2: "+ch2);
		System.out.println("ch3: "+ch3);
		System.out.println("ch4: "+ch4);

	}

}
