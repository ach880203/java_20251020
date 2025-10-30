package ex12;

public class Car3 {

	 private String color;
	 private String geartype;
	 private int door;
	 
	 Car3(){
		 this.color = "white";
		 this.geartype = "auto";
	     this.door = 4;
	     }
	 
	 Car3(String color){
		 this.color = color;
		 this.geartype = "auto";
		 this.door = 4;
	 }
	 
	 Car3(String color, String gearType){
		 this.color = color;
		 this.geartype = gearType;
		 this.door = 4;
	 }
	 
	 Car3(String color,String gearType, int door){
		 this.color = color;
		 this.geartype = gearType;
		 this.door = door;
	 }
}
