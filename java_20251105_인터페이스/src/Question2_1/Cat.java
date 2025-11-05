package Question2_1;

public class Cat implements Animal{
	
	
	private String name;
	private int age;
	
	public Cat(String name, int age) {
	this.age = age;
	this.name = name;
	}
	
	@Override
	public void makeSound() {
		System.out.println("야옹");
	}

	
	public void showInfo() {
		System.out.printf("이름 : %S , 나이 : %d살%n" , name, age);
	}
	
	
	
	
	
	
}



