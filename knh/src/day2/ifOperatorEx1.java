package day2;

public class ifOperatorEx1 {

	public static void main(String[] args) {
		//조건선택연산자로 A학점 확인
		int scr = 86;
		char isA = scr <= 100 && scr >= 90 ? 'Y' : 'N';
		
		System.out.println(scr+"점은 A?" + isA);
		
		//n1이 홀수인가로 물어보면 예아니오로
		int num1 = 1;
		String isOdd = num1 % 2 != 0 ? "yes" : "no";
		System.out.println(num1 + "은 홀수?" + isOdd);

	}

}
