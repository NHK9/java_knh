package day9;

public class ClassAccessEx1 {

	public static void main(String[] args) {
		A a =new A();
		//a.num1 = 10;//접근제한자가 private, Class A에서만 사용가능
		a.setNum1(10);
		a.num2 = 20;//A클래스와 같은 패키지에 있기 때문에 사용가능
		a.num3 = 30;//아무 클래스나 다 사용가능
		
	}

}
//현재 파일명이 ClassAccessEx1이기 때문에 클래스 A에 public을 붙일 수 없다.
class A{
	private int num1;//private:해당 클래스내에서만 사용가능
	int num2;//default : 기본 :접근제한자를 생략한 경우, 같은 패키지 내에서 사용가능
	public int num3;//public : 어디서든 사용가능
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}