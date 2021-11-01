package day4;

public class ForGCDEx1 {

	public static void main(String[] args) {
		/*두정수의 최대공약수를 구하는코드 작성
		 * 반복횟수: i num는 1부터1까지 1씩증가
		 * 규칙성: i가 8의 약수이고,i가 12의 약수이면 
		 * */

		int n1=12, n2=8, m;
		
		//두수의 공약수 출력
		for(m=1;m<=n1 && m<=n2 ;m++) {
			if (n1 % m == 0) {
				if (n2 % m == 0) System.out.print(m+" ");
			}
			
		}
		
		for ( m=1 ; m<=n1 ; m++ ) {
			if(n1 % m == 0 && n2 % m ==0) {
				System.out.print(m+" ");
			}
		}
		
		
		

		}
		
		
	}

