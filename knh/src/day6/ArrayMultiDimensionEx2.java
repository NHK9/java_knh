package day6;

public class ArrayMultiDimensionEx2 {

	public static void main(String[] args) {
		// 구구단 2단에서 9단 전체를 배열에 저장하여 출력하는 코드 작성
		
		//0번지를 사용안하기위함:편하게보기위해
		int [][] multipleTable = new int[10][10];
		for(int i=2;i<=9;i++) {
			for(int j =1; j<=9; j++) {
				multipleTable[i][j]=i*j;
				System.out.println(multipleTable[i][j]);
			}
		}
	}

}
