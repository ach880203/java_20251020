package Question3_interface;

public class Main {

	public static void main(String[] args) {

		
	 Printer pt = new inkjetPrinter();
	 pt.Print("오우 너무 어려웠습니다");
	 
	 
	 
	 pt = new LaserPrinter();
	 pt.Print("메세지 값을 입력해야 했군요...");
	 
	 System.out.println("테스트 페이지 출력");
	 
	 
	}

}
