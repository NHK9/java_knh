package day14;

import javax.naming.Name;

public class ExaStringEx3 {

	public static void main(String[] args) {
		/* 확장자를 포함한 파일명을 5개 배열에 저장하고, 저장된 파일에 이미지 파일이 있는지 확인하는 코드작성/*
		 * 
		 */
		/*String file [] = new String [5];
		file[0]="a.jpg";
		file[1]="b.bmp";
		file[2]="c.gif";
		file[3]="d.png";
		file[4]="e.exe";
		String search[] = {"jpg","bmp","gif","png"};
		
		System.out.println("이미지 파일은 "+image(file, search)+"개 입니다");*/
		String fileNames[]= {"a.jpg","b.bmp","c.gif","d.png","e.exe"};
		String imgSuffixString = "jpg, bmp, gif, png" ;
		String [] imgSuffixArray = imgSuffixString.split(", ");
		
		for(String fileName : fileNames) {
			boolean isImg =false;
			for(String imgSuffix : imgSuffixArray) {
				if(fileName.endsWith(imgSuffix)) {
					System.out.println(fileName+"은 이미지입니다");
					isImg =true;
					break;
				}
			}
			if(!isImg) System.out.println(fileName+"은 이미지가 아닙니다");
		}
		//메소드이용
		for(String fileName:fileNames) {
			if(checkSuffix(imgSuffixArray, fileName)) {
				System.out.println(fileName+"은 이미지");
			}else {
				System.out.println(fileName+"은 이미지가 아님");
			}
		}
		
	
	/*public static int image(String arr[], String arr2[]) {
		int count =0;
		for(String tmp:arr) {
			for(int n=0;n<arr.length-1;n++)
			if(tmp.contains(arr2[n])) {
				count++;
				break;
			}
		}
		return count;
	}*/
		}
/* 기능 : 확장자들과 파일명이 주어지면 , 해당 파일이 확장자에 맞는지 알려주는 메소드
 매개변수: 확장자들, 파일명 = String[]suffixArray, String fileName
 리턴타입: 확장자에 맞는 파일명인지 아닌지 = true/false = boolean
 메소드명: checkSuffix*/
	public static boolean checkSuffix(String [] suffixArray, String fileName) {
	for(String suffix : suffixArray) {
		if(fileName.endsWith(suffix)) {
			return true;
		}
	}
	return false;
	
	}
}