package day16;

import java.util.*;

public class ExbListEx1 {

	public static void main(String[] args) {
		/* 그린고등학생 국어, 영어, 수학 성적을 관리하려한다.
		 * 관리하기 위한 리스트를 만들어 보세요*/
		ArrayList<Score> list = new ArrayList<Score>();
		Score scr = new Score ("1",2,3,4);
		list.add(scr);
		System.out.println(list);
		scr = new Score("2",3,4,5);
		list.add(scr);
		System.out.println(list);
	}
}
class Score{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
	}
	
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
}