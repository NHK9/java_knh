package day2;

public class assignmentEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 10, num2 = 20;
		num1 = num2; //num2에 있는 20을 num1에 저장(덮어쓰기), num1은 20이 됨
		System.out.println("num1 =" + num1 + ",num2 = " + num2);
		
		num1 = 10;
		num2 = 20;
		
		num2 = num1;//num1의 값10이 num2에 저장됨,num2는 10이됨
		System.out.println("num1 =" + num1 + ",num2 = " + num2);
		
		num1 = num1 + num2; //num1의 10과 num2의 10을 더해 num1에 20이 되어 저장
		System.out.println("num1 =" + num1 + ",num2 = " + num2);
		
		//num1 + num2 = num1;// '='을 기준으로 왼쪽엔 연산자가 올 수 없다 변수 1개만 와야 한다
		//num1 + 1 = num1;// 상수도 = 왼쪽에 올 수 없다 변수명을 숫자로 시작할 수 없기도 함
		
}

}
