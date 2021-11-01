package day4;

public class ForEx1 {

	public static void main(String[] args) {
		/*for문 사용시 조심해야하는 상황
		 * 1부터 5까지 출력하는예제에서 발생한 실수*/
		
		int i;
		//의도: 1부터 5까지 출력하기
		//결과: 6
		//원인: for문 뒤에 ; 이와서 for문의 실행문이 없는경우
		for(i=1;i<=5;i++); {
			System.out.println(i+"");
		}
		System.out.println();
		// 결과: 출력 자체가 안됨
		// 원인: 조건식을 잘못설정하여 1번도 실행 안된 경우
		for(i=1;i>=5;i++) {
			System.out.println(i+"");
		}
		System.out.println();
		/* 원인: 조건식을 잘못설정하여 무수히 많이 실행 된 경우,무한루프는아님
		for(i=1;i<=5;i--) {
			System.out.println(i+"");

	}*/
		//int로 표현할수있는 가장 큰 수
		System.out.println("int 최대값:"+Integer.MAX_VALUE);
		//int로 표현할수있는 가장 작은 수
		System.out.println("int 최소값:"+Integer.MAX_VALUE);
		int maxNum = Integer.MAX_VALUE +1; //오버플로우
		int minNum = Integer.MIN_VALUE -1;//언더플로우
		System.out.println("int 최대값+1:"+maxNum);
		System.out.println("int 최소값-1:"+minNum);
}
}