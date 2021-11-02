package day5;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {
		/* a
		 * ab
		 * abc
		 * abcd
		 * ...
		 * abcd...xyz
		 * 가 출력되도록 코드 작성
		 */

		char ch,ch2;
		
		for(ch='a';ch<='z';ch++) {
			for(ch2= 'a';ch2<=ch;ch2++) {
				System.out.print(ch2);
			}
			System.out.println();
		}
		
	}

}
