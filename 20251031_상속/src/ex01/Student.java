package ex01;

public class Student {
	// 멤버 변수는 외부 노출 시키지 않는다.-> 정보은닉
	private String name;
	private int age;
	private String school;

	Student() {
	}// <-- 디폴트 생성자

	Student(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public void study() {
		System.out.println(school + "에서 공부 중입니다.");
	}
	
	//여기서 추가할 것은 게터 세터!!

}
