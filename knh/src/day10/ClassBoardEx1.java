package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ClassBoardEx1 {

	public static void main(String[] args) {
		/* 게시글을 관리하기 위한 Board 클래스를 생성하고, 객체를 생성하여 테스트*/
		ClassBoard1TEx [] boardList = new ClassBoard1TEx[10];
		//게시글 관리 프로그램
		int menu=0;
		int count=0;//현재까지 저장된 게시글 갯수
		int num=0;
		Scanner scan = new Scanner(System.in);
		do {
			/*메뉴출력
			 * 1. 게시글 등록
			 * 2. 게시글 조회
			 * 3. 게시글 수정
			 * 4. 게시글 삭제
			 * 5. 프로그램 종료
			 */
			//메뉴를 입력
			menu = printMenu(scan);
			String title, contents,writer,date;
			
			//입력받은 메뉴에 다른 기능 실행
			switch(menu) {
			case 1: 
				scan.nextLine();//위에서 입력한 엔터를 처리
				System.out.print("게시글 제목 : ");
				title = scan.nextLine();
				System.out.print("게시글 내용 : ");
				contents = scan.nextLine();
				System.out.print("게시글 작성자 : ");
				writer = scan.next();				
				System.out.print("게시글 작성일 : ");
				date = scan.next();
				//게시글을 생성한후, 입력받은 정보들로 초기화를 하고,
				//초기화된 게시글을 내가 원하는 배열의 번지에 저장
				boardList[count] = new ClassBoard1TEx(count+1, title, contents, date, writer);
				//저장된 게시글 하나 증가
				count++;
				break;
			case 2: 
				System.out.println("조회할 게시글 번호: ");
				num = scan.nextInt();
				if(num<=count) {
					//게시글 삭제여부를 확인해서 삭제된 게시글이면 삭제라고 출력,아님조회
					if(boardList[num-1]==null) {
						System.out.println("삭제된 게시글입니다.");
					}
					else {
						//조회수 증가
						boardList[num-1].updateViews();
						//게시글 조회
						boardList[num-1].print();	
					}
				}
				break;
			case 3: 
				System.out.println("수정할 게시글 번호: ");
				num = scan.nextInt();
				if(boardList[num-1]==null) {
					System.out.println("삭제된 게시물은 수정할 수 없습니다");
				}
				else {
					scan.nextLine();//위에서 입력한 엔터를 처리
					System.out.print("게시글 제목 : ");
					title = scan.nextLine();
					System.out.print("게시글 내용 : ");
					contents = scan.nextLine();
					if(num<=count) {
						boardList[num-1].modify(title, contents);
					}
				}
				break;
				//해당 게시글을 삭제하면 삭제된 위치에 null을 넣어 삭제처리
			case 4: 
				System.out.println("삭제할 게시글 번호: ");
				if(num<=count) {
					num = scan.nextInt();
					boardList[num-1] = null;
				}
				break;
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