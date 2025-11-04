package ex07_4_인터페이스.copy;

public interface Car {

	public void move();

	public void fillUp();
	
	default void stop() {
		System.out.println("----------------");
	}

	
}
