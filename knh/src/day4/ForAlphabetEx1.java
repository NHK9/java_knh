package day4;

public class ForAlphabetEx1 {

	public static void main(String[] args) {
		/*문자에 숫자를 더하면??
		 * 문자와 숫자를 더하면 문자에 맞는 유니코드값에서 1을 더함
		 * 'a'는 코드값이 97,여기에 1더하면 값은 98
		 * 이 값을 문자로 벼환하면 해당 유니코드에 맞는 문자'b'가 됨*/
		char ch1 = 'a';
		int num = 1;
		char ch2 = (char)(ch1+1);//97+1=98(int)
		char ch3 = 'a'+1; //98(char)='b'
		char ch4 = (char)(ch1 + num);//97+1=98(int)
		System.out.println("ch2: "+ch2);
		System.out.println("ch3: "+ch3);
		System.out.println("ch4: "+ch4);

	}

}
