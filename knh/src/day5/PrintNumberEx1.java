package day5;

public class PrintNumberEx1 {

	public static void main(String[] args) {
		/* 다음과 같이 출력하도록 코드 작성
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * */
		
		int n;
		for(n=1;n<8;n+=3) {
			System.out.println(n + " "+(n+1) + " "+(n+2));
		}

	}

}
