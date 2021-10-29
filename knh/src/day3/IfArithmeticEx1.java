package day3;

import java.util.Scanner;

public class IfArithmeticEx1 {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자중 하나를 입력하여 입력한 연산자가 +이면
		 * 두 정수의 합을 출력하는 코드를 작성하세요.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 산술연산자를 입력하세요");
		int n1 = scan.nextInt();
		char a1 = scan.next().charAt(0);
		int n2 = scan.nextInt();
		if(a1 == '+') {
			System.out.println(""+n1 + a1 + n2 + "=" + ( n1 + n2 ));
		}
		else if (a1 == '-') System.out.println(n1 - n2);
		else if (a1 == '*') System.out.println(n1 * n2);
		else if (a1 == '/') System.out.println((double)n1 / n2);
		else if (a1 == '%') System.out.println(n1 % n2);
		else System.out.println("산술 연산자가 아닙니다");
		scan.close();
	}

}
