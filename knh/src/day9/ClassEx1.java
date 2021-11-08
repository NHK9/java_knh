package day9;

public class ClassEx1 {

	public static void main(String[] args) {
		Car car1 = new Car(4,"현대","소형");
		car1.brand="Kia";
		System.out.println("Brand : "+car1.brand);
		car1.turnOn();
		//객체 멤버 변수는 값을 공유하지 않음
		Car car2=new Car(6,"기아","suv");
		System.out.println("Brand :"+car2.brand);
		Car car3 = car1;
		System.out.println("Brand : "+car3.brand);
		car3.type = "대형";
		System.out.println("차종 : "+car1.type);
		System.out.println(car1.count+"인승");
		// 생성자를 제공하지 않은 Scanner 클래스
		//Scanner scan = new Scanner();
	}

}

class Car{
	//자동차와 관련된 정보들 = 멤버 변수
	String brand;//기아,현대 등(회사)
	String type;//소형차,suv,대형 등(차종)
	int count; // 최대 탑승 인원
	int power; // 시동
	int speed; //속력
	//자동차와 관련된 기능들 = 멤버 메소드
	//시동 켜는 기능
	void turnOn() {
		System.out.println("켰습니다");
	}
	//시동 끄는 기능
	void turnOff() {
		System.out.println("껐습니다");
	}

	//Car(){}//생성자가 하나도 없으면 자동으로 빈 생성자가 생성됨
	/*Car(){
		count=1;
		brand="";
		type="소형";
	}*/
	Car(int count1, String brand1, String type1){
		count=count1;
		brand=brand1;
		type=type1;
	}
}