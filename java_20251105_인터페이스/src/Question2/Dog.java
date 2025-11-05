package Question2;

public class Dog extends Animal {

//	Dog(){}
	public Dog(String name, int age) {
		super(name, age);
	}

//	public String toString() {
//		return "멍멍";
// 내가 한 코드

	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}
}
