package day6;

public class ArrayMultiDimensionEx1 {

	public static void main(String[] args) {
		// 한 학년의 성적을 관리하기 위한 이차원 배열을 선언 및 생성
		// 한학년은 최대 10반, 한 반에 최대 30명까지 배치
		int [][] score=new int[10][30];
		//1반 30번의 성적에 80입력
		score[0][29]=80;
		//고등학교 모든 학년 학생 성적을 관리할 배열 선언
		int[][][] highscore = new int[3][10][30];
	}

}
