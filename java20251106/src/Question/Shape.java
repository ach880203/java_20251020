package Question;

public class Shape {

	private int X;
	private int Y;

	
	 public Shape() {}
	  public Shape(int X, int Y) {
		 this.X = X;
		 this.Y = Y;
	 }
	  
	  public int getX() {return X;}
	  public int getY() {return Y;}
	 
	 public void draw() {
		 System.out.printf("도형을 (%d,%d)에 그립니다.\n", X, Y);
	 }
}
