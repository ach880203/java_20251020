package homwork1;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("홍길동", 20, 171, 81, "20111","영문");
		st1.showStudentInfo();

		
		Student st2 = new Student("고길동", 21, 183, 72, "201102","건축");
		st2.showStudentInfo();
		
		
		Student st3 = new Student("박길동", 22, 175, 65, "201103","컴공");
		st3.showStudentInfo();
		
	}

}
