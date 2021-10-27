package day1;

public class PrintEx1 {

	public static void main(String[] args) {
		//println 메소드 : 콘솔에 값을출력하고 마지막에 엔터를 쳐줌
		//print 메소드 : 콘솔에 값을 출력함
		System.out.println("Hello!!");
		System.out.println("Hello!!");
		System.out.print("Hello!?");
		System.out.print("Hello!?");
		System.out.println();//가능(엔터만침)
		//System.out.print();//에러(필요없으므로)
		//system.out.println();
		
		/*system.out.println(변수명);
		 * system.out.println("변수명 : " + 변수명);
		 * */
		int num1 = 10;
		System.out.println(num1);
		System.out.println("num1 : " + num1);
		
		int num2 = 20;
		char operator = '+';
		//계획:10+20=30
		//결과 : 73=1020
		//정수 + 문자 = 정수
		//10 + '+' = 10+43 = 53
		//정수 + 문자열 = 문자열
		System.out.println(num1 + operator + num2 + "=" + num1 + num2);
		//결과: 10+20=1020
		System.out.println(""+num1 + operator + num2 + "=" + (num1 + num2));

	}

}
