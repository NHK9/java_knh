package day3;

import java.util.Scanner;

public class SwitchArithmeticEx1 {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력받아 산술 연산자에 맞는 결과를 출력하는 코드를 작성하세요
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수와 산술연산자를 입력하시오");
		int n1 = scan.nextInt();
		char c1 = scan.next().charAt(0);
		int n2 = scan.nextInt();
		
		switch (c1) {
			case '+': System.out.println(n1 + n2);
				break;
			case '-': System.out.println(n1 - n2);
				break;
			case '*': System.out.println(n1 * n2);
				break;
			case '/': System.out.println((double)n1 / n2);
				break;
			case '%': System.out.println(n1 % n2);
				break;
			default: System.out.println("none");
		}
		scan.close();

	}

}
