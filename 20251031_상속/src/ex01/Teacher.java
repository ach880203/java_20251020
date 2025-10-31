package ex01;

public class Teacher extends Person{

	private String name;
	private int age;
	private String subject;
	
	 public Teacher() {}
	 public Teacher(String name, int age, String subject) {
			super(name, age);//부모클래스인 Person에서 super를 이용하여 가지고 온다.
			this.subject = subject;
	
	
}
	 
	  public void teach() {
		  System.out.println(subject + "를 가르칩니다.");
	  }
	 }
