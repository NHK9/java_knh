package day5;

public class WhileContinueEx1 {

	public static void main(String[] args) {
		// 1~10사이 홀수 출력하는 콛 while문으로 작성
		
		//1번
		int n=1;
		while(n<=10) {
			if(n%2==0) {
				n++;
				continue;
			}
			System.out.println(n);
			n++;
		}
		System.out.println();
		
		//2번
		n=0;
		while (n<10) {
			n++;
			if(n%2==0) {
				continue;
			}
			System.out.println(n);
		}
		

	}

}
