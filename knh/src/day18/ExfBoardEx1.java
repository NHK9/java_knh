package day18;

import java.text.SimpleDateFormat;
import java.util.*;

public class ExfBoardEx1 {

	public static void main(String[] args) {
		/* 게시글을 관리하는 프로그램을 만드세요.게시글번호,제목,작성자,조회수,내용,작성일 등
		 * 배열x, 리스트
		 * 기능
		 * 1. 게시글 등록
		 * 2. 게시글 확인(전체)
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 프로그램 종료*/
		Scanner scan = new Scanner(System.in);
		ArrayList<Board> list= new ArrayList<Board>();
		int count=1;
		
		program(scan,list,count);
	}
	public static void program(Scanner scan,ArrayList<Board>list, int count) {
		while(true) {
			//메뉴출력,입력
		System.out.println("메뉴\n1.게시글 등록\n2.게시글 확인\n3.게시글 수정\n4.게시글삭제\n5.프로그램 종료");
			try {
				int menu = scan.nextInt();
				switch(menu) {
					//게시글등록
					case 1:input(scan,list,count); count++; break;
					//게시글확인
					case 2:print(scan,list); break;
					//게시글수정
					case 3:edit(scan,list); break;
					//게시글삭제
					case 4:delete(scan,list); break;
					//종료
					case 5: System.out.println("시스템 종료"); scan.close(); return;
				}
			}catch(InputMismatchException e) {
				System.out.println("잘못 입력했습니다");
				scan.nextLine(); // 메뉴에서 입력한 값이 입력 버퍼에 남아 계속 예외가 발생하므로 없애줌
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void input(Scanner scan,ArrayList<Board> list,int count) {
		System.out.println("===게시글 등록===");
		System.out.println("제목 : ");
		scan.nextLine();
		String title=scan.nextLine();
		System.out.println("내용 : ");
		String contents=scan.nextLine();
		System.out.println("작성자 : ");
		String writer=scan.nextLine();
		Date date1 = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 hh시mm분");
		String str = format.format(date1); 
		String date=str;
		Board brd = new Board (count,0,title,contents,date,writer);
		list.add(brd);
	}
	public static void print(Scanner scan,ArrayList<Board> list) {
		System.out.println("조회할 게시글 번호 입력");
		int num = scan.nextInt();
		Board view = new Board (num,0,null,null,null,null);
		int find = list.indexOf(view);
		if(find<0) System.out.println("일치하는 번호의 게시글이 없습니다");
		else {
			list.get(find).setView(list.get(find).getView()+1);
			System.out.println(list.get(find));
			}
	}
	public static void delete(Scanner scan,ArrayList<Board> list) {
		System.out.println("삭제할 게시글 번호 입력");
		int num = scan.nextInt();
		Board del = new Board(num,0,null,null,null,null);
		
		if(list.remove(del)) System.out.println("삭제되었습니다.");
		
		else System.out.println("일치하는 번호의 게시글이 없습니다.");
	}
	public static void edit(Scanner scan, ArrayList<Board> list) {
		System.out.println("수정할 게시글 번호 입력");
		int num = scan.nextInt();
		Board edit = new Board(num,0,null,null,null,null);
		int find=list.indexOf(edit);
		if(find<0) System.out.println("일치하는 번호의 게시글이 없습니다");
		else {
		System.out.println("수정할 제목: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("수정할 내용: ");
		String contents = scan.nextLine();
		
		list.get(find).setTitle(title);
		list.get(find).setContents(contents);
		
		System.out.println("수정되었습니다");
		}
	}
}
class Board{
	private int num,view;
	private String title,contents,date,writer;
	
	public Board(int num,  int view,String title, String contents, String date, String writer) {
		this.num = num;
		this.view = view;
		this.title = title;
		this.contents = contents;
		this.date = date;
		this.writer = writer;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (num != other.num)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Board [num=" + num + ", view=" + view + ", title=" + title + ", contents=" + contents + ", date=" + date
				+ ", writer=" + writer + "]\n";
	}
	
	
	
}