package day18;

import java.text.SimpleDateFormat;
import java.util.Date;
//게시글 클래스
//클래스 멤버 변수를 이용하여 게시글 번호를 관리
public class ExfBoard {
	//필요한정보= 멤버변수
	private String title, contents, writer;
	private Date date;
	private int num, view;
	private static int count =0;//만들어진 게시글 수
	
	//필요한 기능 = 메소드
	/* 기능: 주어진 게시글 제목,내용으로 수정하는 메소드
	 * 매개변수: 제목,내용 = String title, contents
	 * 리턴타입: void
	 * 메소드명: modify*/
	public void modify(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
	
	//초기화 = 생성자
	public ExfBoard(String title, String contents, String writer) {
		super();
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = new Date();
		count++;
		this.num = count;
	}
	//게시글 등록할 때 사용되는 게시글이 아닌, 임시로 쓸 게시글이 필요한 경우
	//사용하려고 만든 기본 생성자
	public ExfBoard() {}
	
	//getter, setter
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date);
	}

	public void setDate(Date date) {
		this.date = date;
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

	//편하게 출력 toString
	@Override
	public String toString() {
		return "ExfBoard [title=" + title + ", contents=" + contents + ", writer=" + writer + ", date=" + getDate()
				+ ", num=" + num + ", view=" + view + "]\n";
	}

	//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			return false;
		}
		ExfBoard other = (ExfBoard) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}