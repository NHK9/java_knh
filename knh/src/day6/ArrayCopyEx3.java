package day6;

public class ArrayCopyEx3 {

	public static void main(String[] args) {
		//�迭�� ����� �����ϱ� ���ؼ� (������ �����ص� ���纻�� �ٲ��� �ʱ� ���ؼ�)��
		//�迭�� ���� �����Ͽ� ��� ������ �ִ� ���� �ϳ��� �����ؾ��Ѵ�.
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
