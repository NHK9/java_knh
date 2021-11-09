package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ClassBoardEx2 {

	public static void main(String[] args) {
		ClassBoard1TEx [] boardList = new ClassBoard1TEx[10];
		//게시글 관리 프로그램
		int menu=0;
		Scanner scan = new Scanner(System.in);
		BoardManager bm = new BoardManager(scan);
		do {
			//메뉴를 입력
			menu = printMenu(scan);			
			//입력받은 메뉴에 다른 기능 실행
			switch(menu) {
			case 1: bm.insertBoard();break;
			case 2: bm.displayBoard();break;
			case 3: bm.modifyBoard();break;
			case 4: bm.deleteBoard();break;
			case 5: break;
			default:System.out.println("메뉴를 잘못 선택했습니다");
			}
		}while(menu!=5);
		System.out.println("프로그램 종료");
	}
	/* 기능: 메뉴를 출력하고 ,메뉴를 선택해서 선택된 메뉴번호를 알려주는 메소드
	 * 매개변수:Scanner
	 * 리턴타입:int=메뉴번호
	 * 메소드명:printMenu
	 */
	public static int printMenu(Scanner scan) {
		System.out.println("[메뉴]");
		System.out.println("1. 게시글등록");
		System.out.println("2. 게시글조회");
		System.out.println("3. 게시글수정");
		System.out.println("4. 게시글삭제");
		System.out.println("5. 프로그램종료");
		System.out.print("메뉴를 선택하세요");
		int menu = scan.nextInt();
		return menu;
	}
}