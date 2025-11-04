package ex07_4_인터페이스.copy;

public class ElectricCar implements Car {
	
	@Override
	public void fillUp() {
		System.out.println("충전합니다.");
	}

	@Override
	public void move() {
		System.out.println("차를 움직합니다.");
	}
	
	public void stop() {
		System.out.println("----------------");
	}
}
