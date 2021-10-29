package day3;
import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		/* 0~100점사이 점수를 입력받아 입력받은 점수의 학점을 출력하는 코드 작성
		 * 90이상 100이하:A
		 * 80이상 90미만:B
		 * 70이상 80미만:C
		 * 60이상 70미만:D
		 * 0이상 60미만:F
		 * 잘못된점수 :NONE
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력");
		int scr = scan.nextInt();

		switch(scr / 10) {
		case 10:
			switch(scr) {
			case 100:System.out.println("A");
				break;
			default:System.out.println("none");
			}
			break;
		case 9:System.out.println("A");
			break;
		case 8:System.out.println("B");
			break;
		case 7:System.out.println("C");
			break;
		case 6:System.out.println("D");
			break;
		case 5,4,3,2,1:System.out.println("F");
			break;
		case 0:
			switch(scr) {
			case 0,1,2,3,4,5,6,7,8,9:System.out.println("F"); break;
			default: System.out.println("none");
			}
			break;
		default:System.out.println("none");
		}
		
		scan.close();

	}				

}
