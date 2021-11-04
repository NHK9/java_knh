package day7;

public class MethodPrimeNumEx1 {

	public static void main(String[] args) {
		// 주어진 정수가 소수인지 아닌지 판별하는 메소드를 만들고 출력하여 확인
		int num = 4;
		if(isP(num)) {
			System.out.println(num+"는 소수");
		}else System.out.println(num+"는 소수가 아님");
	}

	/* 기능: 정수가 소수인지 아닌지 판별하여 참,거짓으로 알려줌
	 * 매개변수: num
	 * 리턴타입: 참/거짓 = boolean
	 * 메소드명: isP
	 * */
	public static boolean isP(int num) {
		int c=0,j;
		if(num<=0) return false;//메소드에선 리턴조건충족시 그대로 종료
		for(j=1;j<=num;j++) {
			if(num%j==0) {
				c++;
			}
		}
		if(c==2) return true; 
		//아래 리턴을 else 처리해도 되고 안해도됨
		return false;
	}

}
