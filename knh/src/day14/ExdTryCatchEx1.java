package day14;

public class ExdTryCatchEx1 {

	public static void main(String[] args) {
		// Try ~ catch 문을 이용한 예외처리
		int num1 = 1, num2 = 0;
		int res;
		try {
			res = num1/num2;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("잘못된 번지로 배열에 접근");
		}catch(ArithmeticException e) {
			//printStackTrace() : 예외가 발생된 정보를 콘솔에 출력하는 메소드
			e.printStackTrace();
			//getMessage() : 예외정보를 문자열로 간단히 알려줌
			System.out.println(e.getMessage());
			System.out.println("0으로 나눔");
		}catch(Exception e) {
			System.out.println("모든 예외처리");
		}
		System.out.println("프로그램 종료");
	}

}
