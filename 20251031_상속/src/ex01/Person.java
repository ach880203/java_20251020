package ex01;

import java.util.Objects;

public class Person {

	private String name;
	private int age;

	public Person() {
	}// <-- 디폴트 생성자

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "은 점심을 먹는다.");
	}

	@Override // @어노테이션이라 부른다. 어노테이션은 안전장치라고 볼 수 있다.
				// 오버라이드는 상위클래스가 가지고 있는 메소드를 재정릐의 하는 것이다.
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

//	public String toString() {
//		return "이름 : " + name + " 나이 : " +age;
//	}

}
