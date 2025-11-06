package Question1_1;

public class Circle implements Shape {

	
	
	private int X;
	private int Y;
	
	
	
	public Circle(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	
	
	@Override
	public void draw() {
		System.out.printf("원을 (%d, %d)에 그립니다.%n", X, Y);
	}
	
	

	
}
	
	
	
	
	
//	public Circle(){}
//	
//	public Circle(int X, int Y) {
//		super(X , Y);
//	}
//
//	public void draw() {
//		Shape.draw;
//		 System.out.println("도형을 (X, Y)에 그립니다.");
//	 }
//	
//}
