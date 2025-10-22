package test;

import java.awt.datatransfer.SystemFlavorMap;

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Person P = new Person();
		
	    P.name = "안창현";
	    P.age =37;		
	    
	    System.out.println(P.name);
	    System.out.println(P.age);
	    
	    
	    Media M = new Media();
	    
	    M.name1 ="무한도전";
	    M.CH = 11;
	    
	    System.out.println(M.name1);
	    System.out.println(M.CH + "번");

        
	    Room R = new Room();
	    
	    R.name2 = "컴퓨터실";
	    R.num1 = 802;
	    
	    System.out.println(R.name2);
	    System.out.println(R.num1 + "호");
	}

}



class Person{
	
	String name;
	int age;	


void funcA() {
	
}

void funcB() {
	
}

void funcC() {
	
}
}

class Media{
	String name1;
	int CH;
}

class Room{
    String name2;
    int num1;
	
}