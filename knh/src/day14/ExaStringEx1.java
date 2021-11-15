package day14;

public class ExaStringEx1 {

	public static void main(String[] args) {
		/* 5명의 이름을 배열에 저장하고, 성이 홍시인 사람을 검색하는 코드를 작성*/
		
		String name[]= new String[5];
		name[0] = "홍길동1";
		name[1] = "홍길동2";
		name[2] = "최길동";
		name[3] = "홍길동3";
		name[4] = "김길동";
		//startswith
		for(String tmp:name) {
			if(tmp.startsWith("홍")) {
				System.out.println(tmp);
			}
		}
		//index of
		for(String tmp:name) {
			if(tmp.indexOf("홍")==0) {
				System.out.println(tmp);
			}
		}
		System.out.println();
	}

}
