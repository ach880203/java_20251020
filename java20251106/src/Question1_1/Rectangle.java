package Question1_1;

public class Rectangle implements Shape{

	private int X;
	private int Y;
	
	
	
	public Rectangle(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	
	
	@Override
	public void draw() {
		System.out.printf("사각형을 (%d, %d)에 그립니다.", X, Y);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//public Rectangle(){}
//	
//	public Rectangle(int X, int Y) {
//		super(X , Y);
//	}
//
//	public void draw() {
//		 System.out.println("도형을 (X, Y)에 그립니다.");
//	 }
	
}
