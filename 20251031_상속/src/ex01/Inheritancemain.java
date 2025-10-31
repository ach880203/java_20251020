package ex01;

public class Inheritancemain {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 25, "천호중학교");
		s1.study();

		Teacher t1 = new Teacher("삼장법사",50,"수학");
		t1.teach();
		
		Programmer p1 = new Programmer("손오공",30,"자바");
		p1.code();
	}
}
