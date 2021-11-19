package day18;

import java.util.*;

public class ExfBoardTEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//게시글 리스트 생성
		List<ExfBoard> list = new ArrayList<ExfBoard>();
		String [] strMenu = {
				"1. 게시글 등록",
				"2. 게시글 확인",
				"3. 게시글 수정",
				"4. 게시글 삭제",
				"5. 프로그램 종료"
		};
		//프로그램 시작
		while(true) {
			//메뉴 출력
			printMenu(strMenu);
			try {
				//메뉴 입력
				int ch = scan.nextInt();
				bar();
				//메뉴에 따른 기능 실행
				if(ch == 1) {
					register(scan,list);
				}else if(ch == 2) {
					display(list);
				}else if(ch == 3) {
					modify(scan,list);
				}else if(ch == 4) {
					delete(scan,list);
				}else if(ch == 5) {
					System.out.println("프로그램 종료");
					break;
				}else System.out.println("잘못된 메뉴입니다!!!");
			}catch(InputMismatchException e) {
				System.out.println("잘못 입력했습니다");
				scan.nextLine();
			}catch(Exception e) {
				e.printStackTrace();
				break;
			}
		}
		//프로그램 종료

	}
	
	public static void printMenu(String [] strMenu) {
		System.out.println("===메뉴===");
		for(String tmp:strMenu) {
			System.out.println(tmp);
		}
		bar();
		System.out.println("메뉴선택: ");
	}
	public static void bar() {
		System.out.println("====================");
	}
	public static void register(Scanner scan, List<ExfBoard> list) {
		//게시글 작성 : 제목 , 내용 ,작성자
		System.out.println("===게시글 등록===");
		System.out.println("제목 : ");
		scan.nextLine();
		String title=scan.nextLine();
		System.out.println("내용 : ");
		String contents=scan.nextLine();
		System.out.println("작성자 : ");
		String writer=scan.nextLine();
		//입력한 정보를 이용하여 게시글 생성
		ExfBoard brd = new ExfBoard(title, contents, writer);
		//생성된 게시글을 리스트에 추가
		list.add(brd);
		System.out.println("===게시글이 등록되었습니다===");
	}
	public static void display(List<ExfBoard> list) {
		for(ExfBoard tmp : list) {
			System.out.println("==========");
			System.out.println(tmp);
			System.out.println("==========");
		}
	}
	public static void modify(Scanner scan, List<ExfBoard> list) {
		//수정할 게시글 정보를 입력
		System.out.println("게시글을 수정합니다");
		System.out.println("번호 : ");
		int num = scan.nextInt();
		System.out.println("제목 : ");
		scan.nextLine();
		String title=scan.nextLine();
		System.out.println("내용 : ");
		String contents=scan.nextLine();
		//리스트에서 수정할 게시글 정보를 가져옴
		ExfBoard tmp = new ExfBoard();
		tmp.setNum(num);
		int index = list.indexOf(tmp);
		//수정할 게시글이 있으면 게시글을 수정 후 안내문구 출력
		if(index>=0) {
			list.get(index).modify(title, contents);
			System.out.println("게시글이 수정되었습니다");
		//없으면 없다고 안내문구 출력
		}else System.out.println("게시글이 없습니다.");
	}
	public static void delete(Scanner scan,List<ExfBoard> list) {
		//게시글 번호 입력
		System.out.println("게시글을 삭제합니다");
		System.out.println("번호 : ");
		int num = scan.nextInt();
		//리스트에 해당 게시글 있는지 확인
		ExfBoard tmp = new ExfBoard();
		tmp.setNum(num);
		int index = list.indexOf(tmp);
		//리스트에 게시글이 있으면 삭제 후 삭제되었습니다 라고 안내
		if(index>=0) {
			list.remove(index);
			System.out.println("게시글이 삭제되었습니다");
		}
		//리스트에 게시글이 없으면 해당 게시글이 없습니다라고 안내
		else System.out.println("없는 게시글 입니다.");
	}
}
