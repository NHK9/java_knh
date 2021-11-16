package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExaArithmeticExceptioneEx1 {

	public static void main(String[] args) {
		// 두 정수와 산술연산자를 입력받아 산술연산 결과를 출력하는 코드 작성
		// 단, 메소드를 이용하고, 예외처리 하세요.
		arith();

	}
	public static void arith() {
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
			default: throw new Exception("잘못된 연산자입니다");
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
