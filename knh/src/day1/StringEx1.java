package day1;

public class StringEx1 {

	public static void main(String[] args) {
		/* 문자열 String(Class)
		 * 
		 */
		String str1;
		String str2 = "Hello";
		System.out.println(str2);
		str1 = str2 + " world!";
		System.out.println(str1);
		
		int num2 = 0x11; //16진수 11
		System.out.println("num2 = " + num2);
		int num3 = 011; // 8진수 11
		System.out.println("num3 = " + num3);
		int num4 = 0b11; // 2진수 11
		System.out.println("num4 = " + num4);
	}

}
