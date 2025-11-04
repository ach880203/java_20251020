package ex02;

public class Person {

	/*
	 *  1.Person 클래스를 만들고 private접근 범위 name, age필드를 가진다.
	 *  2.showInfo()메서드에서 이름과 나이를 출력한다.
	 *  3.Student 클래스를 Person을 상속받아 schoolName 필드를 추가하고,
	 *  4. showStudentInfo()메서드에서 학교 이름까지 출력한다.
	 */
	private String name;
	private int age;
	
	public void showInfo() {
		System.out.printf("이름: %s, 나이:%d\n", name, age);
	}
	
	/*
	 * %s : 문자열
	 * %d : 정수
	 * %f : 실수
	 * %.2f : 소수점 두 자리까지 출력
	 */
	public Person(){}
	
	public Person(String name, int age){
		this. name = name;
		this.age = age;
	}
	
	
	
}
