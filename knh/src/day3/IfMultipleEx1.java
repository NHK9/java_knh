package day3;

import java.util.Scanner;

public class IfMultipleEx1 {

	public static void main(String[] args) {
		// 정수를 입력받고, 입력받은 정수가 2의배수이면 2의 배수라고 출력, 아니면 아니라고 출력하는 코드 작성
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n1 = scan.nextInt();
		if (n1 % 2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		scan.close();
		

	}

}
