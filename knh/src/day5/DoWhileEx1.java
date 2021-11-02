package day5;

public class DoWhileEx1 {

	public static void main(String[] args) {
		// do while문을 이용한 hello5번 출력예제
		int n=1;
		do {
			System.out.println("hello");
			n++;
		}while(n<6);
		
		//정수의 초기값이 10부터시작해서 1씩증가해서 5보다 작거나같은
		//정수를 출력하는 예제
		//for문,while문은 초기값이 잘못되어서 한번도 실행하지않음
		//dowhile문은 그냥 코드 작성시 한번은 실행되서 원치않은 결과발생
		System.out.println("for문 이용");
		for(n=10;n<-5;n++) {
			System.out.println(n);
		}
		System.out.println("dowhile문 이용");
		n=10;
		do {
			System.out.println(n);
			n++;
		}while(n<=5);

	}

}
