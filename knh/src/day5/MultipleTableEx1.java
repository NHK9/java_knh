package day5;

public class MultipleTableEx1 {

	public static void main(String[] args) {
		// 2단에서 9단까지 구구단을 출력하는 코드를 작성하세요
		
		int n=2,m=1;
		//for(n=2;n<10;n++) {
			//for(m=1;m<10;m++) {
				//System.out.print(n*m+" ");
			//}
			//System.out.println();
		//}
		
		while(n<10) {
			m=1;
			while(m<10) {
				System.out.print(n*m+" ");
				m++;
			}
			System.out.println();
			n++;
		}

	}

}
