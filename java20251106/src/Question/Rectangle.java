package Question;

public class Rectangle extends Shape{


public Rectangle(){}

public Rectangle(int X, int Y) {
	super(X , Y);
}

public void draw() {
	System.out.printf("사각형을 (%d,%d)에 그립니다.\n", getX(), getY());
 }
	
}
