package day5;

public class PrintAlphabetEx1 {

	public static void main(String[] args) {
		// zyx...cba가 출력되도록 코드 작성
		
		//내풀이
		/*char ch = 'z';
		int n= 0;
		
		for(;n<26;n++) {
			System.out.println((char)(ch-n));
		}*/
		
		//강사님풀이
		char ch;
		for(ch='z';ch>='a';ch--) {
			System.out.println(ch);
		}
		System.out.println();
		int i=0;
		while(i<26) {
			System.out.println((char)('z'-i));
			i++;
		}

	}

}
