package day8;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx1 {

	public static void main(String[] args) {
		//1~45사이의 중복되지 않은 6개의 로또 번호와 보너스번호 1개를 생성
		int count=0, bc=0;
		int min=1,max=45,size=6;
		int lotto[] = randomArray(min,max,size);
		int user[] = new int[6];
		int bonus = createBonus(min,max,lotto);
		
		//당첨번호 출력
		System.out.println("당첨번호: "+(Arrays.toString(lotto))+"보너스번호 : "+bonus);
		
		//사용자가 1~45사이의 숫자 6개를 중복되지않게 콘솔에서 입력(메소드x)
		Scanner scan = new Scanner(System.in);
		System.out.print("번호 6개 입력");
		for(int i=0;i<user.length;i++) {
			user[i] = scan.nextInt();
		}
		scan.close();
		
		//등수출력
		/*1등:당첨번호6개 일치
		 * 2등:당첨번호5,보너스1
		 * 3등: 당첨번호5
		 * 4등:당첨번호4개
		 * 5등:3개일치
		 * */
		for(int i=0;i<user.length;i++) {
			for(int n=0;n<user.length;n++) {
				if(lotto[n]==user[i]) {
					count++;
					break;
				}
			}
		}
		for(int n=0;n<user.length;n++) {
			if(user[n]==bonus) {
				bc++;
				break;
			}
		}
		
		if (count==6)System.out.println("1");
		else if (count==4)System.out.println("4");
		else if (count==3)System.out.println("5");
		else if (count==5) {
			if(bc==1) {
			System.out.println("2");
			}
			else System.out.println("3");
		}
		else System.out.println("none");
	}

	//중복판별기능
	public static boolean containsArray2(int arr[],int num, int n) {
		n = arr.length < n ? arr.length:n;//검사하려는 개수가 배열 길이보다 클경우 수정,아니면 그대로
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	//랜덤 번호생성 기능
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
}