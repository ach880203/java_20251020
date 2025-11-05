package Question2;

public class Main {
	public static void main(String[] args) {

//	Animal a = new Animal("초코", 3);
//	a.makeSound();
//	System.out.println(a);
//	
//	Animal a1 = new Dog("초코", 3);
//		a1.makeSound();
//	System.out.println(a1.toString());
//	
//	Animal a2 = new Cat("루비", 6);
//		a2.makeSound();
//	System.out.println(a2.toString());
// 내가 한 코드

		//Animal a = new Animal("초코", 3);
		//a.showInfo();
		//a.makeSound();
		// Animal 이라는 동물은 없기 때문에 객체로 생성하게 되면 이상해진다. 그럴때 abstract를 사용하여 차상화를 시켜 객체 생성을 막을 수 있다.
		// 그래서 Animal에 abstract를 사용하게 되면 Animal 클래스는 추상화가 되고 객체로 생성할 수 없게 된다.
		

		Animal a1 = new Dog("멍멍이", 5);
		a1.showInfo();
		a1.makeSound();

		Animal a2 = new Cat("나비", 6);
		a2.showInfo();
		a2.makeSound();

	}
}