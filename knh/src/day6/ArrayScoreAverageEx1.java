package day6;

import java.util.Scanner;

public class ArrayScoreAverageEx1 {

	public static void main(String[] args) {
		// 배열을 이용하여 5명의 학생의 국어성적을 입력받아
		//평균 구하는 코드 작성 단, 성적은 배열에저장,성적은 정수
		
		Scanner scan=new Scanner(System.in);
		
		int n,sum=0,arr[];
		arr=new int[5];
		
		for(n=0;n<5;n++) {
			System.out.println("점수 입력");
			arr[n]=scan.nextInt();
			sum+=arr[n];
		}
		System.out.println((double)sum/n);
		scan.close();
		

	}

}
