package day5;

public class StarEx1 {

	public static void main(String[] args) {
		// 반복문을 이용하여 다음과 같이 출력되는 코드를 작성하세요.
		// ***** n=1 *=5
		// ***** n=2 *=5
		// ***** n=3 *=5
		// ***** n=4 *=5
		// ***** n=5 *=5
		// 반복횟수 :i는 1부터5까지 1씩증가
		// 규칙성 : *을 5번씩 출력후 엔터출력
		// 		반복횟수: m은 n부터 5까지 1씩증가
		//		규칙성 : *을 출력후 엔터출력
		
		int n,j;
		for(n=1;n<6;n++) {
			for(j=1;j<6;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
