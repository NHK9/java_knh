package day4;

public class ForGCDBreakEx1 {

	public static void main(String[] args) {
		// 두정수의 최대공약수를 break문을 이용해 작성
		// 공약수를 큰수부터 구하기 시작해 처음구한 공약수를 출력하고 종료
		
		
		int n1=12,n2=8,m;
		
		for(m=n1;m>=1;m--) {
			if(n1%m==0&&n2%m==0) {
				System.out.println(m);
				break;
			}
		}
		

	}

}
