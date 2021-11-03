package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBaseballEx1 {

	public static void main(String[] args) {
		// 숫자야구게임
		// 컴퓨터가 랜덤으로 1에서 9사이에 중복되지않은 3개의 수를 선택
		// 사용자는 컴퓨터가 선택한 3개의 수를 맞추는 게임
		// 사용자가 처음으로 입력한 중복되지않은 1~9사이의 세 수를 컴퓨터가 만든 수라고 가정
		// 규칙
		// S: 숫자가있고, 숫자의 위치가 맞은경우
		// B: 숫자는 있지만 위치가 안맞은 경우
		// 3O: 맞는 숫자가 하나도없는경우
		// 3S: 게임 종료
		// 컴퓨터:1 9 5
		// 사용자:1 2 3 == 1S
		//
		
		Scanner scan=new Scanner(System.in);
		int []com=new int[3];
		int []user=new int[3];
		int s,b;
		System.out.println("컴퓨터 숫자 입력");
		for(int n=0;n<com.length;n++) {
			com[n]=scan.nextInt();
		}
		
		do {
			s=0;
			b=0;
			System.out.println("숫자 입력");
			for(int i=0;i<user.length;i++) {
				user[i]=scan.nextInt();
			}
			for(int i=0;i<user.length;i++) {
				if(user[i]==com[i]) s++;
			}
			//볼의 갯수 출력
			for(int i=0;i<com.length;i++) {
				for(int j=0;j<com.length;j++) {
					if(i==j) {
						continue;
					}
					if(com[i]==user[j]) b++;
				}
			}
			if(s!=0) System.out.print(s+"S ");
			if(b!=0) System.out.print(b+"B");
			if(s==0&&b==0) System.out.print("3O");
			System.out.println();
			
		}while(s!=3);			
		System.out.println("종료");
			scan.close();
	}
}