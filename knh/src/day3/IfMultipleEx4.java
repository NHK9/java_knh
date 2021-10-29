package day3;

import java.util.Scanner;

public class IfMultipleEx4 {

	public static void main(String[] args) {
		/**/
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n1 = scan.nextInt();
		if(n1 % 2 == 0) 
			if (n1 % 3 == 0) System.out.println("6");
			else System.out.println("2");
		else if (n1 % 3 == 0) System.out.println("3");
		else System.out.println("2,3,6 x");
			
		//int n1 = scan.nextInt();
		//if(n1 % 6 == 0) System.out.println("6");
		//else if(n1 % 3 == 0) System.out.println("3");
		//else if(n1 % 2 == 0) System.out.println("2");
		//else System.out.println("2,3,6의 배수가 아닙니다");
		
		scan.close();

	}

}
