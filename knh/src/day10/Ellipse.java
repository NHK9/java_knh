package day10;

public class Ellipse {
	private int left,top,right,bottom;

	public Ellipse(int left, int up, int right, int bottom) {
		super();
		this.left = left;
		this.top = up;
		this.right = right;
		this.bottom = bottom;
	}
	
	//타원정보출력
	public void print() {
		System.out.println("---타원---");
		System.out.println("좌상점 :"+left+","+top);
		System.out.println("우하점 :"+right+","+bottom);
		System.out.println("가로 : "+(right-left));
		System.out.println("세로 : "+(bottom-top));
	}
	
	public void move(int x, int y) {
		int width = right - left;
		int height = bottom - top;
		left = x; top = y;
		right = x+width; bottom = y+height;
	}
	public void resize(int width, int height) {
		right = left+width; bottom = top+height;
	}
}
