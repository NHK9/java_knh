package day3;

public class ForEvenEx1 {

	public static void main(String[] args) {
		/*1부터 10까지 짝수들만 출력하는 코드를 for문을 이용하여 작성하세요 */
		System.out.print("1번 방법");
		int n;
		for(n = 1 ; n < 11 ; n++) {
			if( n % 2 == 0) System.out.print(n);
		}
		System.out.print("2번 방법");
		for(n=2;n<11;n=n+2)
			System.out.print(n);
		System.out.print("3번 방법");
		for(n=1;n<=5;n++)
			System.out.print(2*n);
	}
}
