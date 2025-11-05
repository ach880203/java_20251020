package Question3_interface;

public class LaserPrinter implements Printer{

	@Override
	public void Print(String message) {
		System.out.println("레이저 프린터 출력 : " + message);
		
	}

}

