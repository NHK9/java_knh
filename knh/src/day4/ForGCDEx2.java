package day4;

public class ForGCDEx2 {

	public static void main(String[] args) {
		/*두정수의 공약수들을, 최대공약수를 구하는코드 작성
		 * 반복횟수:i는 1부터 num1까지 1씩증가
		 * 규칙성: i가 8의 약수이고,i가 12의 약수이면 gcd에 i를 저장
		 * 반복문 종료후 gcd 출력*/

		int n1=12, n2=8, gcd=0, m;
		
		for ( m=1 ; m<=n1 ; m++ ) {
			if(n1 % m == 0 && n2 % m ==0) {
				gcd = m;
			}
		}
		System.out.println(gcd);
		
	}

}
