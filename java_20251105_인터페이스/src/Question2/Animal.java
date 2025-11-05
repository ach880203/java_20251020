package Question2;

public abstract class Animal {

	private String name;
	private int age;

	//public void makeSound() {
	//	System.out.println("동물이 소리를 냅니다.");
	//} abstract를 사용하게 되면 정의를 내려서는 안된다. 그래서 avstract를 사용하기 위해 이 코드를 지우고 밑에 코드로 수정했다.
	public abstract void makeSound();

	
	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d살%n", name, age);
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;

	}
//	 
//	 public void makeSound() {
//		 System.out.printf("이름 : %s, 나이 : %d", name, age);
//	  
//	 }
//	 public Animal() {}

//	 public String toString() {
//		 return "동물이 소리를 냅니다";
//	 } 내가 한 코드
}
