package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExdTryCatchEx2 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 입력받은 산술 연산자에 맞는 결과를
		 * 출력하는 코드를 작성하세요. 단, 예외처리를 이용
		 */
		/*Scanner scan = new Scanner(System.in);
		System.out.println(" 정수 두개 입력");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.println(" 산술 연산자 입력");
		char ch=scan.next().charAt(0);
		
		switch(ch) {
		case '+' :System.out.println(n1+n2); break;
		case '-' : System.out.println(n1-n2); break;
		case '*' :System.out.println(n1*n2); break;
		case '/' : try {
			System.out.println((double)n1/n2); break;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눔");
		}
		case '%' :System.out.println(n1%n2); break;
		}
				
		scan.close();*/
		
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		char op;
		double res = 0.0;
		
		System.out.println("두 정수와 산술 연산자를 입력하세요 (예 : 1 + 2): " );
		try {
			num1 = scan.nextInt();
			op = scan.next().charAt(0);
			num2 = scan.nextInt();
			
			switch(op) {
			case '+': res = num1+num2;         break;
			case '-': res = num1-num2;         break;
			case '*': res = num1*num2;         break;
			case '/': res = (double)num1/num2; break;
			case '%': res = num1%num2;         break;
			}
			System.out.println(""+num1+op+num2+"="+res);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 불가");
		}catch(InputMismatchException e) {
			System.out.println("입력을 잘못했다");
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		
		scan.close();

	}

}
