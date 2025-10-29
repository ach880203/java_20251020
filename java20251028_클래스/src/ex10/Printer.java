package ex10;


public class Printer {

	public static void main(String[] args) {

	//Printersol pt = new Printersol();

		/* MAth.radom(); --- 정적메소드
		
		
		
		
		pt.println(10);
		pt.println(true);
		pt.println(5.7);
		pt.println("홍길동");
		pt.println(10, 20);*/
		
		Printersol.println(10);
		Printersol.println(true);
		Printersol.println(5.7);
		Printersol.println("홍길동");
		Printersol.println(10, 20);
		
		
		Printersol p = new Printersol();
		
		p.println(1000);
		
		
		
		
		
		
	}}


  /*
   *static void func(){}: 키워드가 붙어 있는 메소드는 객체 생성하지 않고 접근 가능
   *void func(){}:static없는 메소드는 반드시 객체 생성하여 접근
   *
   *static 유무 차이점.
   *유 : 
   */
   