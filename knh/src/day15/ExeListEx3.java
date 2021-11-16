package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeListEx3 {

	public static void main(String[] args) {
		/* 오늘의 할일을 5개 입력받아 출력하는 코드를 작성하세요*/
		
		Scanner scan =  new Scanner(System.in);
		ArrayList<String> todolist1 = new ArrayList<String>();
		
		System.out.println("할일을 5개 입력하세요");
		for(int i = 0;i<5;i++) {
			//String tmp = scan.nextLine();
			//todolist1.add(tmp);
			todolist1.add(scan.nextLine());
		}
		System.out.println(todolist1);
		
		scan.close();
	}

}
