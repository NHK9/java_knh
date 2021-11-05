package day8;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTEx1 {

	public static void main(String[] args) {
		// 1~45사이 중복되지않은 6개의 로ㅗㄸ번호와 1개의보너스번호 출력
		int min=1,max=15;
		int []lotto = randomArray(min,max,6);
		int bonus = createBonus(min,max,lotto);
		
		//번호출력
		System.out.println("당첨번호 : " + Arrays.toString(lotto));
		System.out.println("보너스번호 : "+bonus);

		//입력받기
		Scanner scan = new Scanner(System.in);
		int []user=new int[6];
		System.out.print("번호 6개 입력");
		for(int i=0;i<user.length;i++) {
			user[i] = scan.nextInt();
		}
		scan.close();
		
		//등수출력
		rank(lotto,bonus,user);
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
	
	public static boolean containsArray(int arr[],int num) {
		for(int tmp:arr) {
			if(tmp==num) {
				return true;
			}
		}
		return false;
	}
	
	/*기능:배열 arr와 정수num가 주어지면 배열에서 0번지부터 n중에 num이
	 * 있는지 없는 지알려줌
	 * 매개변수: 배열,정수,확인할갯수 = int[]arr,int num,int n
	 * 리턴타입: boolean
	 * 메소드명: containsArray2
	 * */
	public static boolean containsArray2(int arr[],int num, int n) {
		n = arr.length < n ? arr.length:n;//검사하려는 개수가 배열 길이보다 클경우 수정,아니면 그대로
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	} 
	/* 기능:min,max,배열이 주어지면 min~max사이의 랜덤한 수를 생성
	 * 배열에 있는지 없는지 확인한 후 없으면 해당수를 알려주는 메소드
	 * 매개변수 : min,max,int[]arr
	 * 리턴타입 : 배열에 없는 min~max사이의 랜덤한 수 = int
	 * */
	public static int createBonus(int min, int max, int []arr) {
		int bonus = 0;
		while(true) {
			bonus=(int)(Math.random()*(max-min+1)+min);
			//
			if(containsArray2(arr,bonus,arr.length)) {
				continue;
			}
			//
			break;
		}
		return  bonus;
	}
	/*기능: 두 배열이 주어지면, 두 배열에서 일치하는 정수의갯수를 알려주는 메소드
	 * 매개변수: int[]arr1,int[]arr2
	 * 리턴타입: int
	 * 메소드명: check
	 * */
	public static int check(int[]arr1,int[]arr2) {
		int count=0;
		for(int tmp:arr1) {
			//배열 1에서 꺼낸 tmp가 2에 ㅇ있으면 count 1증가
			if(containsArray2(arr2, tmp,arr2.length)) {
				count++;
			}
		}
		return count;
	}
	/*기능:로또 번호와 사용자 번호를 이용하여 당첨 등수를 출력
	 * 매개변수:로또,사용자 번호, 보너스번호 int []lotto,int []user, int bonus
	 * 리턴타입:void
	 * 메소드명: rank
	 */
	public static void rank(int []lotto,int bonus,int []user) {
		int count = check(lotto,user);
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
}
