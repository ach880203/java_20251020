package homwork1;

public class Human {

	
	   private String name;
	   private int age;
	   private int height;
	   private int weight;
	   
	
	   public void showInfo() {
		   System.out.printf("이름 : %s, 나이 : %d, 키: %d, 몸무게 : %d\n", name, age, height, weight);
	   }
	   
	   
	   Human(){}
	   Human(String name, int age, int height, int weight){
		   this.name = name;
		   this.age = age;
		   this.height = height;
		   this.weight = weight;
		   
	   }
}
