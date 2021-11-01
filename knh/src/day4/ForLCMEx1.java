package day4;

public class ForLCMEx1 {

	public static void main(String[] args) {
		// 두 정수의 최소 공배수를 구하는 코드를 for문으로 작성
		//a의배수:어떤 정수를 aㄹ 나누었을때 나머지가 0인수들
		//4의 배수:4,8,12,16...
		//6의 배수:6,12,18,24
		//반복횟수:i는 1부터 시작해서 num1*num2까지1씩증가
		//규칙성: i가 num1의배수이고 num2의 배수이면 i를 출력한뒤 종료
		//방법1=1부터 시작하므러 불필요한 반복횟수가 많아짐
		
		//int n1=36,n2=9,m;
		//for(m=1;m<=n1*n2;m++) {
			//if(m%n1==0 && m%n2==0) {
			//System.out.println(m);
			//break;}
		//}
		
		//방법2 :i는 num1부터 시작해서 num1*num2까지 num1씩 증가
		//규칙성: i가 num2의 배수이면 i를 출력하고 반복문 종료
		
		int n1=6,n2=4 ,m;
			for(m=n1;m<=n1*n2;m+=n1) {
				if (m%n1==0&&m%n2==0) {
					System.out.println(m);
					break;
				}
			}
	}

}