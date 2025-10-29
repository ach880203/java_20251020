package ex07;

public class 클래스확인문제 {

	public static void main(String[] args) {

		Member m1 = new Member("홍길동", "hong", "ad9988", 160);
		System.out.println(m1.getName());
		System.out.println(m1.getId());
		System.out.println(m1.getPassword());
		System.out.println(m1.getAge());

		Member m2 = new Member("김유신", "kim", "k41234", 380);
		System.out.println(m2.getName());
		System.out.println(m2.getId());
		System.out.println(m2.getPassword());
		System.out.println(m2.getAge());

		Member m3 = new Member("궁예", "gung", "g41234", 580);
		System.out.println(m3.getName());
		System.out.println(m3.getId());
		System.out.println(m3.getPassword());
		System.out.println(m3.getAge());
	}

}

class Member {
	private String name;
	private String id;
	private int age;
	private String pass;

	public Member(String name, String id, String pass, int age) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return pass;
	}

	public void getPassword(String pass) {
		this.pass = pass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
