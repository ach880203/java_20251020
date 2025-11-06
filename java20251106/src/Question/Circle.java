package Question;

public class Circle extends Shape {

	
	
		
	
	
	public Circle(){}
	
	public Circle(int X, int Y) {
		super(X , Y);
	}

	public void draw() {
		System.out.printf("원을 (%d,%d)에 그립니다.\n", getX(), getY());
	 }
	
}
