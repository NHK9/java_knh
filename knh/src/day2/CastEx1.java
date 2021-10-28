package day2;

public class CastEx1 {

	public static void main(String[] args) {
		//자동자료형변환이 일어남. 0이 0.0이되  n1에저장
		//정수를 실수에 저장할경우 변환됨
		//크기가 작은 정수를 크기가 큰 정수에 저장해도 변환됨
		//문자를 큰 정수나 실수에 저장하는 경우
		double num1 = 0;
		byte num2 = 1;
		int num3 = num2;
		char ch = 'a';
		int num4 = ch;
		int num5 = (int)0.0;//자동안되면 명시
		//float num6 = 1.23;//1.23은 더블이기 때문에 에러
}

}
