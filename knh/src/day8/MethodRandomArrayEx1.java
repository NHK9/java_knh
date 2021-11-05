package day8;

import java.util.Arrays;

public class MethodRandomArrayEx1 {

	public static void main(String[] args) {
		// 1에서 45사이의 랜덤한 수를 6개 생성하여 배열에 저장하고,출력하는 코드를 메소드 생성후 호출
		//System.out.println(Arrays.toString(randomArr1()));
		//System.out.println(Arrays.toString(randomArr2(1,45,6)));
		int size=6,min=1,max=45;
		int arr1[]=new int[size];
		randomArray1(min,max,arr1);
		System.out.println(Arrays.toString(arr1));
		int arr2[]=randomArray2(min,max,size);
		System.out.println(Arrays.toString(arr2));
	}
	/* 기능 1~45사이 랜덤한 수 6개를 배열을 생성해 저장
	 * 매개변수 없음
	 * 리턴타입 정수형배열 int[]
	 * 메소드명 randomArr
	 */
	
	public static int[] randomArr1(){
		int [] arr=new int[6];
		int min=1,max=45;
		for(int i =0;i<arr.length;i++) {
			int random = (int)(Math.random()*(max-min+1)+min);
			arr[i]=random;
		}
		return arr;
	}
	
	/* 기능 x~y사이 랜덤한 수 z개를 배열을 생성해 저장
	 * 매개변수 int min,max,len
	 * 리턴타입 정수형배열 int[]
	 * 메소드명 randomArr2
	 */
	public static int[] randomArr2(int min,int max,int len){
		int [] arr=new int[len];
		for(int i =0;i<arr.length;i++) {
			int random = (int)(Math.random()*(max-min+1)+min);
			arr[i]=random;
		}
		return arr;
	}
	/*기능:배열이 주어지면 주어진 배열에 min에서 max사이의 랜덤한 수를 생성하여 저장하는 메소드
	 * 매개변수: 배열,정수범위 = int min,max,int arr[]
	 * 리턴타입: void
	 * 메소드명: randomArray1
	 * */
	public static void randomArray1(int min,int max,int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*(max-min+1)+min);
		}
	}
	
	/*기능:배열의 크기가 주어지면 주어진 배열의 크기만큼 min에서 max사이의 랜덤한 수를 생성하여
	 * 저장한 후 만들어진 배열을 알려주는 메소드
	 * 매개변수: 크기, 정수범위 = int min,max,size
	 * 리턴타입: 정수형배열 int[]
	 * 메소드명: randomArray2
	 * */
	public static int[] randomArray2(int min,int max,int size) {
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*(max-min+1)+min);
		}
		return arr;
	}
}
