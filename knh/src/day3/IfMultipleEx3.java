package day3;

import java.util.Scanner;

public class IfMultipleEx3 {

	public static void main(String[] args) {
		/* 정수를 입력받고 2의배수이면 2의배수라고 출력, 3이면 3, 6이면6, 2,3,6의 배수가 아니면 아니라고출력
		단, 6..12..는 6의배수라고 출력
		*/
		Scanner scan = new Scanner(System.in);
		/*System.out.println("정수를 입력하세요");
		int n1 = scan.nextInt();
		if (n1 % 2 == 0) {
			if (n1 % 6 == 0) System.out.println("6의배수");
			else System.out.println("2의배수");
		}
		else if (n1 % 3 == 0) System.out.println("3의배수");
		else System.out.println("2,3,6의 배수가 아닙니다");*/
		
		System.out.println("정수를 입력하세요");
		int n1 = scan.nextInt();
		if(n1 % 6 == 0) System.out.println("6");
		else if(n1 % 3 == 0) System.out.println("3");
		else if(n1 % 3 == 0) System.out.println("2");
		else System.out.println("2,3,6의 배수가 아닙니다");
		
		scan.close();

	}

}
