package day6;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		// ������ ���� num2�� �����ϰ�, num2�� num1�� ���� �����ϼ���
		// �Ϲ� ������ =�� �̿��� ���� ������ �������� �ٲ�� ���纻���� �ȹٲ�
		
		int num2,num1=10;
		num2=num1;
		System.out.println("num1 : "+num1+", num2 : "+num2);
		num1=20;
		System.out.println("num1 : "+num1+", num2 : "+num2);
		
		//���������� =�� �̿��� �����ϸ� ���� ����Ǵ°� �ƴ� �ּ� ��������
		//���� �ٲ�� ���� �ٲ��
		int arr1[]= {1,2,3};
		int arr2[]= arr1;
		arr1[0]=10;
		System.out.print("arr1 : ");
		for(int tmp:arr1) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.print("arr2 : ");
		for(int tmp:arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		//�迭�� ����� �����ϱ� ���ؼ� (������ �����ص� ���纻�� �ٲ��� �ʱ� ���ؼ�)��
		//�迭�� ���� �����Ͽ� ��� ������ �ִ� ���� �ϳ��� �����ؾ��Ѵ�.
	}

}
