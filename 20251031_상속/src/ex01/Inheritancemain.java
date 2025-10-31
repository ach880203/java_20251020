package ex01;

public class Inheritancemain {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 25, "천호중학교");
		
		Student s2 = new Student();
		s1.study();
		s1.eat();

		System.out.println(s1);

		Teacher t1 = new Teacher("삼장법사", 50, "수학");
		t1.teach();
		t1.eat();

		Programmer p1 = new Programmer("손오공", 30, "자바");
		p1.code();
		p1.eat();

		/*
		 * 부모 -> 자식, 상위 -> 하위, 슈퍼 -> 서브 이렇게 자식 클래스들은 부모 클래스의 정보를 가져다 사용할 수 있다. 그러나 부모
		 * 클래스는 자식 클래스의 정보를 사용 할 수 없다. 자식 클래스가 조재하기 위해선 부모 클래스가 먼저 존재 해야 한다.
		 */

	}

}
