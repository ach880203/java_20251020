package Question1;

public class Car extends Vehicle {
	
	private String type;
	
	public void ShowInfo() {
		super.showInfo();
		System.out.println("타입: " + type);
	}

	public Car() {}
   	public Car(String brand, int year, String type) {
   		super(brand, year);
   		this.type=type;
   	}
	
	
}
