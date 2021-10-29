package day3;

import java.util.Scanner;

public class IfMonthEx1 {

	public static void main(String[] args) {
		/* 월을 입력받아 월의 마지막 일을 출력하는 코드를 작성하세요 단, 2월은 28
		 * 31: 1 3 5 7 8 10 12
		 * 30: 4 6 9 11 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("월 입력");
		int m1 = scan.nextInt();
		if (m1 == 2)System.out.println("28");
		else if (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11) System.out.println("30");
		else if (12 < m1 || m1 < 1) System.out.println("none");
		else System.out.println("31");
		
		scan.close();		
	}

}
