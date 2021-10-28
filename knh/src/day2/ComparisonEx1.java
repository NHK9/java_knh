package day2;

public class ComparisonEx1 {

	public static void main(String[] args) {
		//성인 판별 예제
		int age = 20;
		boolean isA = age >= 20;
		
		System.out.println(isA);
		
		//num1이 짝수이면 true
		int num1 = 1;
		boolean isEven = num1 % 2 == 0;
		boolean isodd = num1 % 2 != 0;
		System.out.println(isEven);
		System.out.println(isodd);
	}

}
