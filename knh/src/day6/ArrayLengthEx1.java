package day6;

public class ArrayLengthEx1 {

	public static void main(String[] args) {
		// 배열 길이 확인, 보통 반복문 조건식에 쓴다
		int [] arr= new int[5];
		System.out.println(arr.length);
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
