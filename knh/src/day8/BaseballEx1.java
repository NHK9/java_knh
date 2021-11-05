package day8;

import java.util.Scanner;

public class BaseballEx1 {

	public static void main(String[] args) {
		// 7일차 숫자 야구게임예제와 로또예제를 이용해 숫자야구게임 작성. 단, 메소드 이용
		//컴퓨터 생성 번호는 랜덤,중복되지 않게
		
		int []user=new int[3]; //유저입력수 저장
		int s,b; //변수
		int min = 1, max=9;// 랜덤 최대-최소값
		int count = 0;//숫자 중복확인할때만 쓸값
		//컴퓨터 랜덤숫자 설정
		int []com = randomArray(min,max,3);
		//유저 숫자입력/판별 반복
		sbCheck(com,user);
	}
	public static int[] randomArray(int min,int max, int size) {
		int arr[]=new int [size];
		for(int count=0;count<size;) {
			int random = (int)(Math.random()*(max-min+1)+min);
			//random과 배열을 비교하여 중복된 숫자가 없으면 
			if(!containsArray2(arr, random, count)) {
				arr[count++]=random;
			}
		}
		return arr;
	}
	public static boolean containsArray2(int arr[],int num, int n) {
		n = arr.length < n ? arr.length:n;//검사하려는 개수가 배열 길이보다 클경우 수정,아니면 그대로
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	} 
	/*기능:로또 번호와 사용자 번호를 이용하여 당첨 등수를 출력
	 * 매개변수:로또,사용자 번호, 보너스번호 int []lotto,int []user, int bonus
	 * 리턴타입:void
	 * 메소드명: rank*/
	public static void rank(int []com,int []user) {
		int count = check(com,user);
		String result = "";
		switch(count) {
		case 6: result = "1등 당첨";
			break;
		case 5:
			result = containsArray2(user, bonus, user.length)?
					"2등 당첨":"3등 당첨";
			break;
		case 4: result = "4등 당첨";
			break;
		case 3: result = "5등 당첨";
			break;
		default: result = "꽝";
		}
		System.out.println(result);
	}
	/*기능: 두 배열이 주어지면, 두 배열에서 일치하는 정수의갯수를 알려주는 메소드
	 * 매개변수: int[]arr1,int[]arr2
	 * 리턴타입: int
	 * 메소드명: check
	 * */
	public static int check(int[]arr1,int[]arr2) {
		int count=0;
		for(int tmp:arr2) {
			//배열 1에서 꺼낸 tmp가 2에 ㅇ있으면 count 1증가
			if(containsArray2(arr1, tmp,arr1.length)) {
				count++;
			}
		}
		return count;
	}
	public static void sbCheck(int com[],int user[]) {
		int s,b;
		Scanner scan=new Scanner(System.in);
		do {
			s=0;
			b=0;
			System.out.println("숫자입력");
			for(int i=0;i<user.length;i++) {
				user[i]=scan.nextInt();
			}
			for(int i=0;i<user.length;i++) {
				if(user[i]==com[i]) s++;
			}
			for(int i=0;i<com.length;i++) {
				for(int j=0;j<com.length;j++) {
					if(i==j) {
						continue;
					}
					if(com[i]==user[j]) b++;
				}
			}
			if(s!=0) System.out.print(s+"S ");
			if(b!=0) System.out.print(b+"B");
			if(s==0&&b==0) System.out.print("3O");
			System.out.println();
			
		}while(s!=3);	scan.close();	
	}
}
