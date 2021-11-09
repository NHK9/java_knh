package day10;

import java.lang.Math;
import java.util.Random;

public class ClassStaticEx1 {

	public static void main(String[] args) {
		
		//에러발생, 객체를 생성하지않고,클래스를 통해 객체변수를 호출했기 때문
		//이때 클래스변수 num2는 생성되고,객체변수 num1은 생성되지않음
		Test1 t;
		Test1.print2();
		//System.out.println("객체변수 num1 :"+Test1.num1);
		System.out.println("클래스변수 num2 :"+Test1.num2);
		Test1 t1= new Test1();
		Test1 t2 = new Test1();
		t1.num1=20;
		t1.num2=40;
		System.out.println("t1객체변수 num1 :"+t1.num1);
		System.out.println("t1클래스변수 num2 :"+t1.num2);
		System.out.println("t2객체변수 num1 :"+t2.num1);
		System.out.println("t2클래스변수 num2 :"+t2.num2);
		System.out.println(Math.E);
		System.out.println(Math.PI);
		//0~1사이의 랜덤한 실수를 알려주는 클래스 메소드
		System.out.println(Math.random());
		Random r = new Random();
		//0~10미만의 랜덤한 정수를 알려주는 객체 메소드
		System.out.println(r.nextInt(10));
	}

}
class Test1{
	public int num1=1; //객체변수
	public static int num2=2;//클래스 변수
	public void print1() {   //객체 메소드
		System.out.println("num1 : "+num1);//1번 가능
		System.out.println("num1 : "+num2);//2번 가능
		method1();//3번가능
		method2();//4번가능
		System.out.println("객체 메소드");
	}
	public static void print2() {   //클래스 메소드
		//System.out.println("num1 : "+num1);//5번 불가능
		System.out.println("num1 : "+num2);//6번 가능
		//method1();//7번불가능
		method2();//8번가능
		System.out.println("클래스 메소드");
	}
	public void method1() {} //객체 메소드
	public static void method2() {} //클래스 메소드
}