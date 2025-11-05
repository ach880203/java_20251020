package Question;

public class Car extends Vehicle {

	private String type;

	public void ShowInfo() {
		super.showInfo();
		System.out.printf("타입: %s%n", type);
	}
	
	Car() {
	}

	Car(String brand, int year, String type) {
		super(brand, year);
		this.type = type;
	}
}
