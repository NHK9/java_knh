package day5;

import java.util.Scanner;

public class DoWhileBreakEx1 {

	public static void main(String[] args) {
		// 0을 입력할때까지 정수를 입력받는 코드 작성
		
		Scanner scan= new Scanner(System.in);
		int n= 0;
		do {
			System.out.println("정수 입력");
			n=scan.nextInt();			
		}while(n!=0);
		scan.close();
		


	}

}
