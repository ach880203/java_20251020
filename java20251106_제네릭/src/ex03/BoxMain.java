package ex03;

public class BoxMain {

	public static void main(String[] args) {

		/*
		 * Box<String> sBox = new Box<>();
		 *  Box<Car> cBox = new Box<>(); 
		 *  Box<Toy> tBox = new Box<>();
		 */
		
		Box<Person> pBox = new Box<>();
		Box<Person> sBox = new Box<>();
		Box<Person> tBox = new Box<>();
		Box<Person> aBox = new Box<>();
		
		
	}
}

class Car {

}

class Toy {
}

class Person {

}
// 상속에 상속을 한 클래스도 참조가 가능해진다.
class Student extends Person{}
class AlbaStudent extends Student{}
class Teacher extends Person{}