package day4;

public class BreakEx1 {

	public static void main(String[] args) {
		/*반복문에서 break 문이 if문과 같이 써야하는질 보여주는 예제*/
		
		for(;;) {
			System.out.println("Hello");
			//break가 if문 없이 나왔기 때문에 의미가 없어짐
			break;
			}
		//1부터 5까지 break문을 이용하여 추력하는 예제
		int n;
		for(n=1;;n++) {
			System.out.println(n);
			if (n>4) break;
		}

	}

}
