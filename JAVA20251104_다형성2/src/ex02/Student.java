package ex02;

public class Student extends Person{

	private String schoolname;
	
	public void showStudentInfo() {
		    super.showInfo();
			System.out.printf("학교 : %s\n", schoolname);
	}
	
	public Student(){
		super();
	}

	public Student(String name, int age, String schoolname){
		super(name, age);
		this.schoolname = schoolname;
	}
}
