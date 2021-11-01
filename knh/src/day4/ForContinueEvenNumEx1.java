package day4;

public class ForContinueEvenNumEx1 {

	public static void main(String[] args) {
		// 1부터 10이하의 짝수를 출력하는 코드를 continue를 이용해작성
		//홀수이면 continue로 스킵
		int i;
		for(i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
				}
			System.out.println(i);
		}

	}

}
