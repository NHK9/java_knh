package day6;

public class ArrayMultiDimensionEx2 {

	public static void main(String[] args) {
		// ������ 2�ܿ��� 9�� ��ü�� �迭�� �����Ͽ� ����ϴ� �ڵ� �ۼ�
		
		//0������ �����ϱ�����:���ϰԺ�������
		int [][] multipleTable = new int[10][10];
		for(int i=2;i<=9;i++) {
			for(int j =1; j<=9; j++) {
				multipleTable[i][j]=i*j;
				System.out.println(multipleTable[i][j]);
			}
		}
	}

}
