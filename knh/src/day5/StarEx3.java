package day5;

public class StarEx3 {

	public static void main(String[] args) {
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 위 처럼 출력되게 코드작성*/ 
		
		//내 풀이법
		/*int n=1,m,g;
		
		while(n<6) {
			m=0;
			g=5;
			while(m!=(5-n)) {
				System.out.print(" ");
				m++;
				g--;
				}
			while(g>0) {
				System.out.print("*");
				m--;
				g--;
			}
			System.out.println();
			n++;
			}*/
		
		//강사님 풀이
		int num=5, i, j;
		for(i=1;i<=num;i++) {
			for(j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
