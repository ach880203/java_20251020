package EX1;

import javax.naming.ldap.PagedResultsResponseControl;

interface Printable{
	void print();
}

class Perers{
	private String msg;
	public Perers(String msg) {this.msg = msg;}
	
	public Printable getPrinter() {
		return new Printer();//interface가 구현한 구현체만 들어 올 수 있다.
	}
	
	private class Printer implements Printable{
		public void print() {
			System.out.println(msg);
		}
	}
}

public class L3_MemberInner2 {
	
	public static void main(String[] args) {
		
		Perers p1 = new Perers("이문장를 출력하고 싶어!");
		Printable prn = p1.getPrinter();
		prn.print();
	}
	
}

