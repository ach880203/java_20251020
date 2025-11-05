package Question2_1;

public class Main {
	public static void main(String[] args) {

    Animal an1 = new Cat("나비", 2);
    an1.showInfo();
    an1.makeSound();
    
    Animal an2 = new Dog("초코", 5);
    an2.showInfo();
    an2.makeSound();

	}
}