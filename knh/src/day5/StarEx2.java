package day5;

public class StarEx2 {

	public static void main(String[] args) {
		// 다음과 같이 출력되도록 반복문 이용 코드작성'
		// *
		// **
		// ***
		// ****
		// *****
		int n=1,m=1;
		
		while(n<6) {
			m=1;
			while(m<=n) {
				System.out.print("*");
				m++;
			}
			System.out.println();
			n++;
		}
		

	}

}
