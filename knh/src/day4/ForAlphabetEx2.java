package day4;

public class ForAlphabetEx2 {

	public static void main(String[] args) {
		/*'a'���� 'z'���� �߷��ϴ� �ڵ带 for������ �ۼ�
		 * abcdefghijk...xyz����
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
