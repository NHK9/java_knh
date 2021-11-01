package day4;

public class ForInfiniteLoop {

	public static void main(String[] args) {
		/*무한루프:반복문이 종료되지 않은 상황
		 * 1.조건식 생략(for문만 해당,while문과 do while문은 아님)
		 *  -반복문밑에코드작성시에러
		 *  -무한 루프에 의해 실행될수 없으므로
		 * 2.조건식을잘못 설정,무조건 참이된경우
		 * 3. 증감식을 설정하지 않아서 같은 값으로 계속 반복하는 경우
		 *  =위의 경우 1,2는 반복문밑에 코드를 작성하면 에러가 뜨지만
		 *  반복문밑에 코드를 작성해도에러가 안뜸*/
		/*for(;;) {
			System.out.println("Hello");
		}
		System.out.println("df");*/
		
		//무한루프2
		int  i;
		/*for(i=1; i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println("에러");*/
		
		//무한루프3
		for(i=1;i !=5;) System.out.println("Hello");
		System.out.println("에러발생하지않음");

	}

}
