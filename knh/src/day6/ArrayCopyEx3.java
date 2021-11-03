package day6;

public class ArrayCopyEx3 {

	public static void main(String[] args) {
		//배열을 제대로 복사하기 위해서 (원본을 수정해도 복사본이 바뀌지 않기 위해서)는
		//배열을 새로 생성하여 모든 번지에 있는 값을 하나씩 복사해야한다.
		int arr1[]= {1,2,3};
		int arr2[] = new int [arr1.length];
		System.arraycopy(arr1, 1, arr2, 0, arr1.length-1);
		arr1[0]=10;
		
		for(int tmp : arr1) {
			System.out.print(tmp);
		}
		System.out.println();
		
		for(int tmp : arr2) {
			System.out.print(tmp);
		}
		System.out.println();
	}

}
