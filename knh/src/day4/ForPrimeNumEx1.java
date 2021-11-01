package day4;

import java.util.Scanner;

public class ForPrimeNumEx1 {

	public static void main(String[] args) {
		/* 입력받은 정수가 소수인지 아닌지 판별하는 코드를 for문으로 작성하세요
		 * 소수는 약수가 2개인 수*/
		
		Scanner scan = new Scanner(System.in);
		
		int n, m, g=0;
		
		System.out.println("정수 입력");
		
		n = scan.nextInt();
		
		for (m=1;n>=m;m++) {
			if (n % m == 0) g++; //g=g+1
		}
		
		if (g == 2) System.out.println("소수");
		else System.out.println("약수가 "+ g + "개로 소수가 아님");
		
		switch(g) {
		case 2: System.out.println("소수"); break;
		default:System.out.println("약수가 "+ g + "개로 소수가 아님");
		break;
		}
		
		String str = g == 2 ? "소수" :"약수가 "+ g + "개로 소수가 아님";
		System.out.println(n+"는"+str);
		
		scan.close();

	}

}
