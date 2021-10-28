package day2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		/*콘솔에서 두 정수를 입력받아 입력받은 정수들의 합과 나눈 결과를 구하는 코드를 작성하기*/
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 두개 입력하세요.");
		int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = n1 + n2;
		double n4 = n1 / (double)n2;  
		System.out.println("입력된 정수는 " + n1 +", " + n2 + "입니다. 합은 " + n3 + ", 나눈 값은" + n4);
		scan.close();
}

}
