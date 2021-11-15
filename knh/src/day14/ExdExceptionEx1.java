package day14;

public class ExdExceptionEx1 {

	public static void main(String[] args) {
		// 예외1 : ArithmeticException 
		int num1 = 1, num2 = 0;
		//int res1 = num1/num2;
		//System.out.println(num1 + " / " + num2 + " = " + res1);
		double res2 = (double)num1/num2;
		System.out.println(num1 + " / "+num2 + " = "+res2);

		/* 예외2 : ArrayIndexOutOfBoundException */
		int [] arr = new int [3];
		//arr[3]=0;
		/* 예외3 : NullPointerException
		 * 참조변수(객체)가 null인 상태로 멤버변수/메소드를 호출할 때 발생 */
		String str = null;
		System.out.println(str.contains("Hello"));
	}

}
