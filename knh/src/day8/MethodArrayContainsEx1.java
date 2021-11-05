package day8;

import java.util.Arrays;

public class MethodArrayContainsEx1 {

	public static void main(String[] args) {
		// 배열이 다음과 같이 주어지고, 정수가주어졌을대 정수가 배열에 있는 값인지
		// 아닌지 확인하는 메소드를 정의하고, 호출하여 확인하세요
		// 배열에 1~45사이의 랜덤한 수를 생성하여 저장하는 코드를 작성하세요,중복불가,메소드이용
		
		int [] lotto = {5,18,23,35,40,1};
		int num = 36;
		//System.out.println(isI(num,lotto));
		if(containsArray(lotto, num)) {
			System.out.println(num+"는 배열에 있다");
		}
		else {
			System.out.println(num+"는 없다");
		}
		if(containsArray2(lotto, num, 7)) {
			System.out.println(num+"는 배열에 있다");
		}
		else {
			System.out.println(num+"는 없다");
		}
		//int [] arr = new int[6];
		//int [] lotto3 = randomint(arr);
		//System.out.println(Arrays.toString(lotto3));
		
		int []lotto2 = randomArray(1,45,6);
		System.out.println(Arrays.toString(lotto2));

	}
	/*기능: 주어진 숫자가 주어진 배열속에 있는 값인지 아닌지 판별하여 알려줌
	 * 매개변수:정수,정수형배열 = int num,int arr[]
	 * 리턴타입:boolean
	 * 메소드명:isI */
	public static boolean isI(int num,int arr[]) {	
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	/*기능: 배열과 정수가 주어지면 정수가 배열에 있으면 true 없으면 false
	 * 매개변수: 정수,정수형배열=int num,int arr[]
	 * 리턴타입: boolean
	 * 메소드명:containsArray*/
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
	/*기능:1~45사이의 중복되지 않은 랜덤한 수를 생성하여 6개짜리 배열에 저장
	 * 매개변수:int[]arr
	 * 리턴타입:int[]arr
	 * 메소드명:randomint*/
	public static int[] randomint(int arr[]) {
		int min=1,max=45,count=0;
		do {
			int random = (int)(Math.random()*(max-min+1)+min);
			int i;
			for(i=0; i < count ; i++) {
				if(arr[i]==random) {
					break;
				}
			}
			if( i ==count) {
				arr[i]=random;
				count++;
			}
		}while(count != 6);
		return arr;
	}
	/*기능: 배열에 갯수가 주어지면 min~max사이의 랜덤한 정수를 중복되지않게 생성하여
	 * 		저장하는 메소드
	 * 매개변수:배열갯수,최소값,최대값=int min,max,size
	 * 리턴타입:랜덤한 수가 저장된 배열=int[]arr
	 * 메소드명:randomArray*/
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
}
