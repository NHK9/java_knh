package day5;

public class StarEx4 {

	public static void main(String[] args) {
		/* 다음과같이 출력되도록 코드를 작성
		 *     *     공백4 별1
		 *    ***    공백3 별3
		 *   *****   공백2 별5
		 *  *******  공백1 별7
		 * ********* 공백0 별9
		 */
		//방법2
		int num=5, i, j;
		for(i=1;i<=num;i++) {
			for(j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법1
		i=1;
		while(i<=num) {
			j=1;
			while(j<=num-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
