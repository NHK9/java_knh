package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExbListTEx2 {

	public static void main(String[] args) {
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		Scanner scan = new Scanner(System.in);
		
		program(scan,stdList);
		
		scan.close();
	}
	/* 학생정보 관리프로그램
	 * 메뉴
	 * 1. 학생정보 추가
	 * 2. 전체 학생 정보 출력
	 * 3. 종료*/
	public static void program(Scanner scan,ArrayList<ExbStudent> stdList) {
		int menu;
		for(;;) {
			System.out.println("메뉴\n1.학생정보추가\n2.전체 학생 정보 출력\n3.종료");
			menu = scan.nextInt();
			switch(menu) {
			case 1: input(scan,stdList); break;
			case 2: print(stdList); break;
			case 3: System.out.println("프로그램 종료");return;
			default: System.out.println("잘못된 입력");
			}
		}
	}
	/* 기능 : 학생 정보를 입력받아 리스트에 저장만 한다.
	 * 매개변수: Scanner, ArrayList
	 * 리턴타입: void*/
	public static void input(Scanner scan,ArrayList<ExbStudent> stdList) {
		/* 학생 정보를 입력받고, 계속할지 물어봐서 y라고 물어보면 계속, 아니면 종료*/
		char next = 'y';
		while(next=='y' || next == 'Y') {
			System.out.println("학년 :");
			int grade = scan.nextInt();
			System.out.println("학반 :");
			int classNum = scan.nextInt();
			System.out.println("번호 :");
			int num =scan.nextInt();
			System.out.println("이름 :");
			/* nextLine을 이용하는 경우 앞에서 Scanner를 통해 입력받은 값 중 엔터가
			 * 사라지지 않는 상황이면 실제 사용하려는 코드 앞에 하나 더 붙여야한다 */
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("성적을 입력하세요 :");
			System.out.println("국어 :");
			int kor =scan.nextInt();
			System.out.println("영어 :");
			int eng =scan.nextInt();
			System.out.println("수학 :");
			int math =scan.nextInt();
			System.out.println("학생 정보를 더 입력하겠습니까? ");
			next = scan.next().charAt(0);
			ExbStudent std = new ExbStudent(kor, eng, math, grade, classNum, num, name);
			stdList.add(std);
		}
	}
	
	/* 기능: 학생 정보가 저장된 리스트를 출력
	 * 매개변수: ArrayList
	 * 리턴타입: void
	 * */
	public static void print(ArrayList<ExbStudent> stdList) {
		System.out.println(stdList);
	}
	
	/*기능: 스캐너를 이용하여 학생정보와 성적을 입력받아 입력받은 학생정보를 알려줌
	 * 매개변수: 스캐너
	 * 리턴타입: 입력받은 학생정보= ExbStudent
	 * 메소드명:inputStudent*/
	public static ExbStudent inputStudent (Scanner scan){
			System.out.println("학년 :");
			int grade = scan.nextInt();
			System.out.println("학반 :");
			int classNum = scan.nextInt();
			System.out.println("번호 :");
			int num =scan.nextInt();
			System.out.println("이름 :");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("성적을 입력하세요 :");
			System.out.println("국어 :");
			int kor =scan.nextInt();
			System.out.println("영어 :");
			int eng =scan.nextInt();
			System.out.println("수학 :");
			int math =scan.nextInt();
			ExbStudent std = new ExbStudent(kor, eng, math, grade, classNum, num, name);
			return std;
	} 
	
	/*기능: 스캐너를 이용하여 학생정보와 성적을 입력받아 입력받은학생정보를 주어진 리스트에 넣어주는 메소드
	 * 매개변수:스캐너,리스트= Scanner scan, ArrayList<ExbStudent> stdList
	 * 리턴타입:void
	 * 메소드명:inputStudent*/
	public static void inputStudent (Scanner scan, ArrayList<ExbStudent> stdList){
		ExbStudent std = inputStudent(scan);
		stdList.add(std);
	}
}