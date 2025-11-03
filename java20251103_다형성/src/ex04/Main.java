package ex04;

public class Main {

	public static void main(String[] args) {

		
		A a = new A(); 
		a.test();                //A
				
		a = new B();            //B
		a.test();
		
		a = new C();           //C
		a.test();
		
		
		
		System.out.println("---------------------------------");
		 a = new B();                     
		 //B b = new C(); 가능은 하자.
		// B b = new A(); 이거는 불가능 하다
		 
		 B b = (B)a;       // B
		 b.test();        
		
		System.out.println("-------------------------------------");
		
		a= new C();     
		C c = (C)a;       //C
		c.test();
		
		
		System.out.println("--------------------");
		
		A aa = null;
		
		C cc = new C();
		cc.test();
		aa = (A)cc;
		aa.test();
		C cc1 = (C)aa;
		cc1.test();
		aa = (B)cc;
		aa.test();
		
		
		
	}

}
