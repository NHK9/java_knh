package day3;
import java.util.Scanner;

public class ScoreEx2 {

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
		if (90 <= scr && scr <= 100) System.out.println("A");
		else if (80<= scr && scr < 90) System.out.println("B");
		else if (70<= scr && scr < 80) System.out.println("C");
		else if (60<= scr && scr < 70) System.out.println("D");
		else if (0 <= scr && scr < 60) System.out.println("F");
		else System.out.println("none");
		
		scan.close();

	}

}
