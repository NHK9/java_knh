package day10;

public class Rect {
	private int x,y;
	
	
	public Rect(char ch, int n) {
		super();
		this.x = x;
		this.y = y;
	}

	public Rect() {}
	
	public static void print(int x,int y) {
		for(int i=1;i<=x;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i =1;i<=y-2;i++) {
			System.out.print("*");
			for(int j=1;j<=(x-2);j++) {
				System.out.print(" ");

			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=x;i++) {
			System.out.print("*");
		}
	}
}
