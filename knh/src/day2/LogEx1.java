package day2;

public class LogEx1 {

	public static void main(String[] args) {
		//&&연산자 예제
		int score = 95;
		//100점이하, 90점이상이 A학점일 때
		boolean isA = score <=100 && 90 <= score;
		System.out.println(isA);
		
		//||연산자 예제. 면허증=lic,신분증=reg
		boolean lic = true, reg = false;
		//둘중 하나라도 있을 경우 가능하다고 할 때
		boolean isP = lic || reg;
		System.out.println("시험 " + isP);
		
		//||연산자 예제. 면허증=lic,신분증=reg
		boolean lic2 = true, reg2 = false;
		//둘중 하나라도 없을 경우 가능하다고 할 때
		boolean isP2 = !lic2 || !reg2;
		System.out.println("시험2 " + isP2);
		
		//!연산자 예제, 남녀 구분
		//isM이 트루이면 남,거짓일때 여
		boolean isM = true;
		System.out.println("여자?" + !isM);
		//isA = score && score; // &&연산자 양옆에 조건식이 아니기 때문
	}

}
