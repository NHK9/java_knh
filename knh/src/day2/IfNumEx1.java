package day2;

public class IfNumEx1 {

	public static void main(String[] args) {
		/* num가 0보다 크면 양수라고 출력하고
		 * num가 0이면 0이라고 출력
		 * num가 0보다 작으면 음수라고 출력하는 코드를 작성하세요
		 */
		int num = 0;
		if (0 < num) System.out.println("양수");
		else if (0 == num) System.out.println("0");
		else System.out.println("음수");

	}

}
