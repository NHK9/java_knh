package day14;

import java.util.Random;

public class ExbMathEx1 {

	public static void main(String[] args) {
		/* Math 클래스는 수학 관련 클래스
		 * Math 클래스에 있는 모든 메소드는 클래스 메소드로 되어있고, 2개의 상수가 있다.
		 * double abs(double a) : 절대 값
		 */
		System.out.println("-1의 절대값 : "+Math.abs(-1));
		/* double ceil(double a) : a를 소수점 자리에서 올림(소수점이 000아니면 올림)*/
		 System.out.println("3.1의 올림 : "+Math.ceil(3.1));
		 System.out.println("3.1의 올림 : "+Math.ceil(-3.1));
		/* double floor(double a) : a를 소수점 자리에서 내림*/
		 System.out.println("3.1의 내림 : "+Math.floor(3.1));
		 System.out.println("3.1의 내림 : "+Math.floor(-3.1));
		//int max(int a,int b):a,b중 큰수 알려줌
		 System.out.println("1과 5중큰수 "+Math.max(1,5));
		 System.out.println("1과 5중큰수 "+max(1,5));
	}
	public static int max(int a, int b) {
		return a>b? a:b;
	}
}
