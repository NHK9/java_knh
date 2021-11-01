package day4;

import java.util.Scanner;

public class ForBreakEx1 {

	public static void main(String[] args) {
		// 0을 입력할때까지 정수를 계속 입력받는 코드를 작성하세요
		//break문 이용
		
		Scanner scan = new Scanner(System.in);

		for(;;) {
			System.out.println("정수 입력");
			int n = scan.nextInt();
			if (n==0) {
				System.out.println("종료");
				scan.close();
				break;
			}
		}
	}

}
