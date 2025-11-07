package homwork1;

public class Student extends Human{
	
	private String number;
	private String major;
	

	  public Student(){
		  super();
	  }
	  public Student(String name, int age, int weight, int height, String number, String major){
		  super(name, age, weight, height);
		  this.number = number;
		  this.major = major;
	  }
	  public void showStudentInfo() {
		  super.showInfo();
		  System.out.printf("학번 : %s, 전공 : %s\n",number, major);
	  }
}
