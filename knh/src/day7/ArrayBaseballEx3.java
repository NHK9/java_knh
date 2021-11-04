package day7;

import java.util.Scanner;

public class ArrayBaseballEx3 {

	public static void main(String[] args) {
		// 
		
		Scanner scan=new Scanner(System.in);
		int []com=new int[3]; //컴터랜덤수 저장
		int []user=new int[3]; //유저입력수 저장
		int s,b; //변수
		int min = 1, max=9;// 랜덤 최대-최소값
		int count = 0;//숫자 중복확인할때만 쓸값
		do {
			// 랜덤한 수 생성
			int random = (int)(Math.random()*(max-min+1)+min);
			// 배열에 중복된 값이 있는지 확인하는 반복문
			int i;
			for(i=0; i < count ; i++) {
				//중복된 수가 있으면 반복문을 중단
				if(com[i]==random) {
					break;
				}
			}
			//반복문 종료후 i값이 count와 같다는 건 중복된 수가 없어서
			//break문이 실행 안된 경우
			if( i ==count) {
				com[i]=random;
				count++;
			}
		}while(count != 3);
		
		do {
			s=0;
			b=0;
			System.out.println("숫자입력");
			for(int i=0;i<user.length;i++) {
				user[i]=scan.nextInt();
			}
			for(int i=0;i<user.length;i++) {
				if(user[i]==com[i]) s++;
			}

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
