package ex01;

public class Programmer extends Person {

	private String name;
	private int age;
	private String language;

	public Programmer() {
	}

	public Programmer(String name, int age, String language) {
		super(name, age);
		this.language = language;

	}

	public void code() {
		System.out.println(language + "를 가르칩니다.");
	}
}
