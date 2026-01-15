package ex3;

interface Printable{
	void print();
}

class Perers{
	private String msg;
	public Perers(String msg) {this.msg = msg;}
	
	public Printable getPrinter() {

		/*
		 * class Printer implements Printable{ 
		 * 	   public void print() {
		 *     System.out.println(msg); 
		 *     } 
		 *   } 
		 * 위에 코드가 밑에로 바뀐다. 
		 * 이걸 익명 클래스라 한다. 
		 * 더욱 숨기는 용도로 사용한다. 
		 * 익명클래스!!
		 * 사용할 일은 잘 없단다..
		 */
		return new Printable() {
			
			@Override
			public void print() {
				System.out.println();
			}
		};
	}
}

public class L5_AnonymousClass {
	
	public static void main(String[] args) {
		
		Perers p1 = new Perers("이 문장를 출력하고 싶어!");
		Printable prn = p1.getPrinter();
		prn.print();
	}
	
}

