package day4;

public class ContinueEx1 {

	public static void main(String[] args) {
		// continue가 if문과 같이 나와야하는 이유를 보여주는 예제
		
		for(int i=1;i<=5;i++) {
			continue;
			//System.out.println("Hello"); 에러발생 컨티뉴때문에 실행x
		}

	}

}
