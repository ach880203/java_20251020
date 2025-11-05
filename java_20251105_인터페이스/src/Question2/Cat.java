package Question2;

public class Cat extends Animal {

//	Cat(){}
	Cat(String name, int age) {
		super(name, age);
	}

//	
//	public String toString() {
//		return "야옹";}
	// 내가 한 코드
	@Override
	public void makeSound() {
		System.out.println("야옹");
	}
}
