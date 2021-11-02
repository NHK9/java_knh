package day5;

public class PrimeNumEx1 {

	public static void main(String[] args) {
		// 2부터 100이하의 모든 소수를 출력하는 예제
		// 소수판별예제참고
		
		int n=2,m=1,g=0;
		
		while(n<101) {
			m=1;
			g=0;
			while(m<=n) {
				if(n%m==0) {
					g++;
				}
				m++;
			}
			if(g==2) {
				System.out.println(n);
			}
			n++;
		}

	}

}
