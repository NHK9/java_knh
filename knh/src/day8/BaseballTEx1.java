package day8;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballTEx1 {

	public static void main(String[] args) {
		// 
		Scanner scan=new Scanner(System.in);
		int []com=new int[3];
		int []user=new int[3]; //유저입력수 저장
		int strike,ball; //변수
		int min = 1, max=9;// 랜덤 최대-최소값
		com = randomArray(min, max, 3);
		System.out.println(Arrays.toString(com));
		
		do {
			System.out.println("숫자입력");
			inputArray(user,scan);
			
			//스트라이크 개수판별
			strike=getStrike(com,user);
			
			//볼갯수 판별
			ball=getBall(com,user);
			
			//결과 판별
			printResult(strike,ball);
			
		}while(strike!=3);			
		System.out.println("종료");
		scan.close();
	}
	public static boolean containsArray1(int arr[],int num, int n) {
		n = arr.length < n ? arr.length:n;//검사하려는 개수가 배열 길이보다 클경우 수정,아니면 그대로
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	} 
	public static int[] randomArray(int min,int max, int size) {
		int arr[]=new int [size];
		for(int count=0;count<size;) {
			int random = (int)(Math.random()*(max-min+1)+min);
			//random과 배열을 비교하여 중복된 숫자가 없으면 
			if(!containsArray1(arr, random, count)) {
				arr[count++]=random;
			}
		}
		return arr;
	}
	/*기능: 두 배열이 주어지면 스트라이크 갯수 알려주는 메소드
	 * 매개변수: 두 배열 = int com[],int user[]
	 * 리턴타입: int 스트라이크 갯수
	 * 메소드명:getStrike*/
	public static int getStrike(int []com, int []user) {
		int count = 0;
		for(int i=0;i<com.length;i++) {
			if(user[i]==com[i]) count++;
		}
		return count;
	}
	/*기능: 두 배열이 주어지면 볼 갯수 알려주는 메소드
	 * 매개변수: 두 배열 = int com[],int user[]
	 * 리턴타입: int 볼 갯수
	 * 메소드명:getBall*/
	public static int getBall(int []com, int []user) {
		//count=ball+strike
		int count = 0;
		for(int tmp:com) {
			if(containsArray1(user, tmp, user.length)) count++;
		}
		return count-getStrike(com, user);
	}
	/*기능:스트라이크와 볼 갯수가 주어지면 결과를 콘솔에 출력
	 * 매개변수:
	 * 리턴타입;void
	 * 메소드명:printResult
	 */
	public static void printResult(int strike, int ball){
		if(strike!=0) System.out.print(strike+"S ");
		if(ball!=0) System.out.print(ball+"B");
		if(strike==0&&ball==0) System.out.print("3O");
		System.out.println();
	}
	/*기능: 스캐너와 배열이 주어지면 스캐너를 통해 주어진 배열의 크기만큼 정수를 입력하는 메소드
	 * 매개변수:배열
	 * 리턴타입;void
	 * 메소드명;inputArray
	 */
	public static void inputArray(int []arr,Scanner scan) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		//scan.close(); // 스캔은 열은후 닫은뒤 다시열면 에러발생
	}
}
