package day4;

public class ForAlphabetEx2 {

	public static void main(String[] args) {
		/*'a'부터 'z'까지 추력하는 코드를 for문으로 작성
		 * abcdefghijk...xyz까지
		 */
		
		char c = 'a';
		int n=0;
		
		for (;n<26;n++) {
			System.out.print((char)(c+n));
		}
		
		System.out.println();
		
		for(;c<='z'; c+=1) {
			System.out.print(c);
		}


	}

}
