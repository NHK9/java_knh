package day7;

public class MethodGCDEx1 {

	public static void main(String[] args) {
		// 최대공약수를 구하는 메소드를 정의하고, 호출하여 최대공약수 출력하는 코드작ㄱ성
		// 최소 공배수를 구하는 메소드를 정의하고, 호출하여 ''
	int result = lcm2(3,2);
	System.out.println(result);
	result = lcm1(num1,num2);
	System.out.println(result);
	result = lcm2(num1,num2);
	System.out.println(result);
	}
	/* 기능: 두수의 최대 공약수를 알려줌
	 * 매개변수:int num1,int num2
	 * 리턴타입: 두 정수의 최대공약수 = 정수 = int
	 * 메소드명: gcd
	 * */
	public static int gcd(int num1, int num2) {
		int gcd=0;
		for ( int i=1 ; i<=num1 ; i++ ) {
			if(num1 % i == 0 && num2 % i ==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	/*기능: 두수의 최소 공배수 알려주기
	 * 매개변수: int num1,int num2
	 * 리턴타입:두정수의 최소공배수=정수=int
	 * 메소드명:lcm2
	 * */
	public static int lcm2(int num1, int num2) {
		int m;
		for(m=num1;m<=num1*num2;m+=num1) {
			if (m%num1==0&&m%num2==0) {
				break;
			}
		}
		return m;
	}
	/**/
	public static int lcm1(int num1, int num2) {
		int m;
		for(m=num1;m<=num1*num2;m+=num1) {
			if(m%num2==0) {
				return m;
			}
		}
	}
	
}
