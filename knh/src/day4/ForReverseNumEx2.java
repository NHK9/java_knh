package day4;

public class ForReverseNumEx2 {

	public static void main(String[] args) {
		/*정수를역순으로 출력하는코드를 for문으로 작성하세요
		 * 예)1234= 4321
		 * 반복문1 : 1의자리를 추출해서 쓰고,1234를 123으로만듬
		 * 반복문2 : 123에서 1의자리를 추출,12로 만듬
		 * 반복문 
		 * */
		int n=971654;

		for (;n!=0;) {
			System.out.print(n%10);
			n = n/10;//n=n/10를 증감식에 넣어도됨
		}

	}

}
