package day3;
import java.util.Scanner;

public class SwitchMonthEx1 {

	public static void main(String[] args) {
		/*월의 마지막일을 출력하는 코드를 스위치문으로 작성
		 *  31: 1 3 5 7 8 10 12
		 *  30: 4 6 9 11
		 *  28: 2
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월 입력");
		int mon = scan.nextInt();
		switch (mon) {
		case 2: System.out.println("28");
			break;
		case 4,6,9,11: System.out.println("30");
			break;
		case 1,3,5,7,8,10,12: System.out.println("31");
			break;
		default: System.out.println("none");
		}
		
		scan.close();

	}

}
