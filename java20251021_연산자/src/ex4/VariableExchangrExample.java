package ex4;

public class VariableExchangrExample {

	public static void main(String[] args) {

		
		int num1 = 10;
		
		int num2 = 20;
		
		//before
		System.out.println("num1: " + num1 + ", num2 : " + num2);
		

		
		//Excahange

		int temp = num1;
		num1 = num2;
		num2 = temp;
		 
		//파이썬은 (num1, num2 = num2, num1); 이 가능
		
		System.out.println("num1: " + num1 + ", num2 : " + num2);
	
		
		//byte -128 ~ 127
		byte var1 = -128;
		
		var1 -= 1;
		
		
         System.out.println(var1);

     int n = 10;
     //n= n  + 1;   
     n += 1;

System.out.println(n);


	}

}
