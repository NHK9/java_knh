package day12;

public class ExaTestEx2 {

	public static void main(String[] args) {
		/* 사각형과 타원을 여러개 저장할 수 있는 배열을 만들어보세요 
		 * 사각형과 타원을 합쳐서 최대 10개까지 저장하는 배열*/
		int n=0;
		ExaShape list [] = new ExaShape [10];
		//타원 1개와 사각형 2개를 생성하여 배열에 저장
		//클래스 형변환, 자식=부모로 클래스 형변환, 자동 형변환
		list[n]=new ExaEllipse(0,0,10,10); n+=1;
		list[n]=new ExaRect(10,10,20,20); n+=1;
		list[n]=new ExaRect(10,20,20,30); n+=1;
		list[n]=new ExaShape(10,20,20,30); n+=1;
		//배열에 저장된 도형들을 그려보세요
		/*for(int i=0;i<n;i++) {
			list[i].print();
		}*/
		for(int i=0;i<list.length;i++) {
			// 도형이잇으면 출력,없으면 안함
			// 도형이 없는게 null인 이유
			//  -배열은 생성되면 타입에맞는 초기값으로 초기화를 한다
			//  - 참조변수는 null로 초기화되므로
			if(list[i]!=null) {
				list[i].print();
			}
		}
		/*저장된 도형이 타원이면 testE()를 ,사각형이면 testR()을 호출하는 코드를
		 * 반복문을 이용해 작성*/
		for(ExaShape tmp:list) {
			if(tmp!=null) {
				if(tmp instanceof ExaEllipse) {
					//도형 tmp를 타원으로 형변환 시킨후 testE()호출
					((ExaEllipse)tmp).testE();
				}
				else if(tmp instanceof ExaRect){
					//((ExaRect)tmp).testR();
					ExaRect r = (ExaRect)tmp;
					r.testR();
				}
			}
		}
		for(ExaShape tmp: list) {
			if(tmp==null) {
				continue;
			}
			print(tmp);
		}
	}
	/* 기능: 매개변수가 사각형이면 사각형이라고 출력하고, 매개변수가 원이면 원이라고 출력하고,
	 * 		매개변수가 도형이면 도형이라고 출력하는 코드
	 * 매개변수:사각형,타원,도형=
	 * 리턴타입:void
	 */
	public static void print(ExaShape shape) {
			if(shape instanceof ExaEllipse) {
				System.out.println("타원");
				return;
			}
			else if(shape instanceof ExaRect) {
				System.out.println("사각형");
				return;
			}
			else System.out.println("도형"); return;
	}
}