package day6;

public class ArraySortEx1 {

	public static void main(String[] args) {
		// 다음과 같은 배열이 있을때 정렬하는 코드 작성
		int num[]= {1,10,9,3,6,2,3,4};
		//버블 정렬: 옆에있는 값과 비교하여 정렬하는 방법
		for (int i=0; i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					int tmp = num[j];
					num[j]=num[j+1];
					num[j+1]=tmp;
				}
			}
		}
		for(int tmp:num) {
			System.out.println(tmp);
		}
	}

}
