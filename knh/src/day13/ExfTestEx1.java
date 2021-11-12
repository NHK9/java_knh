package day13;

public class ExfTestEx1 {

	public static void main(String[] args) {
		/* 타원 , 사각형을 같이 관리할 수 있는 배열을 만들고ㅡ
		 * 타원 1개 , 사각형 2개를 만들어 저장한후, 그리는 코드 작성
		 */
		ExfShape [] list=new ExfShape[5];
		list[0] = new ExfEllipse(0,0,10,10);
		list[1] = new ExfRect(0,0,15,15);
		list[2] = new ExfRect(0,0,20,20);
		for(ExfShape tmp:list) {
			if(tmp!=null)
				tmp.draw();
		}
	}

}
/*ExfShape 을 상속받아 ExfRect,ExfEllipse 클래스를 만드세요*/