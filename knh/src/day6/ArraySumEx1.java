package day6;

public class ArraySumEx1 {

	public static void main(String[] args) {
		// 2부터  10사이의 짝수들을 배열에 저장하고, 
		//배열에 저장된 값의 합을 출력하는 코드를 작성.
		
		/*int sum=0,a=0,n,arr[];
		arr=new int[5];
		
		for(n=2;n<11;n++) {
			if(n%2==0) {
				arr[a]=n;
				sum+=arr[a];
				a++;
			}
		}
		System.out.println(sum);*/
		
		/*int []arr = new int[5];
		arr[0]=2;
		arr[1]=4;
		arr[2]=6;
		arr[3]=8;
		arr[4]=10;
		
		int sum=0;
		sum+=arr[0];
		sum+=arr[1];
		sum+=arr[2];
		sum+=arr[3];
		sum+=arr[4];
		System.out.println(sum);*/
		
		int arr2[] = new int[5];
		int i,sum;
		for(i=0;i<5;i++) {
			arr2[i] = 2*i+2;
		}
		for(i=0,sum=0;i<5;i++) {
			sum+=arr2[i];
		}
		System.out.println(sum);

	}

}
