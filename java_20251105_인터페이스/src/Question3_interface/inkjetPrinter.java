package Question3_interface;

public class inkjetPrinter implements Printer{

	@Override
	public void Print(String message) {
	  System.out.println("잉그젯 프린터 출력 : " + message);}

}
