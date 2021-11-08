package day9;

public class MethodArithmeticEx1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자가 주어졌을 때 연산 결과를 출력하는 코드를작성
		 * 단, 메소드를 이용하고, 연산자는 무조건 산술연산자만 입력한다고 가정
		 */
		System.out.println(ex(1, 2, '/'));
		System.out.println(arithmetic(1, '/', 2));
	}
	/*기능:두 정수와 산술연산자가 주어졌을때 결과를 알려주는 메소드
	 * 매개변수:두정수,산술연산자=int num1,num2, char 
	 * 리턴타입: double
	 * 메소드명:ex
	 */
	public static double ex(int num1, int num2, char a) {
		switch (a) {
		case '+': return num1+num2;
		case '-': return num1-num2;
		case '*': return num1*num2; 
		case '/': return (double)num1/num2;
		case '%': return num1%num2;
		default: return 0;
		}
	}
	/*기능:두 정수와 산술연산자가 주어졌을때 결과를 알려주는 메소드
	 * 매개변수:두정수,산술연산자=int num1, char op, int num2
	 * 리턴타입:산술연산결과=실수=double
	 * 메소드명:arithmetic
	 */
	public static double arithmetic(int num1, char op, int num2) {
		switch(op) {
		case '+': return num1+num2;
		case '-': return num1-num2;
		case '*': return num1*num2; 
		case '/': return (double)num1/num2;
		case '%': return num1%num2;
		default: return 0;
		}
	}
}