package day14;

public class ExaStringSplitEx1 {

	public static void main(String[] args) {
		/* String [] split(String regex)
		 * - 문자열에서 구분자를 기준으로 배열을 만들어 주는 메소드
		 * - 매개변수는 문자열인데, 여기에 정규표현식을 넣을수있다
		 * - 정규표현식은 문자열에 패턴이 있는지 확인하는 식
		 * 
		 * String trim()
		 * - 문자열 첫글자가 오기전까지 공백을 제거, 마지막 글자 이후에 오는 공백을 제거*/
		String str = "Apple, Orange, Banana";
		String [] fruit = str.split(",");
		for(String tmp : fruit) {
			System.out.println(tmp.trim());
		}
		System.out.println(str);
		
		/* boolean endsWith(String suffix)
		 * - 문자열 끝부분이 suffix로 끝나는지 알려주는 메소드
		 * - suffix이면 true,아님 false*/
		String img1 = "flower.jpg";
		if(img1.endsWith(".jpg") || img1.endsWith(".bmp")){
			System.out.println(img1+"는 이미지");
		}else {
			System.out.println(img1+"는 이미지아님");
		}
		
		/* boolean startsWith(String prefix)
		 *  - 문자열 시작부분이 prefix로 시작하는지 알려주는 메소드
		 *   prefix로 시작하면 true,아니면 false
		 */
		String fileName[] =  new String[2];
		fileName[0]="ExaStringReplaceEx1.java";
		fileName[1]="ExaStringSplitEx1.java";
		for(String tmp:fileName) {
			if(tmp.startsWith("Exb")) {
				System.out.println(tmp + "는 첫번쨰 예제들");
			}else {
				System.out.println(tmp + "는 첫번쨰 예제들이아님");
			}
		}
		String strTrim = "\n\t\tabc\n\\nabc\n\n";
		System.out.println(strTrim);
		System.out.println("-----------");
		System.out.println(strTrim.trim());
	}

}
