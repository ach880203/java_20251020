package ex01;

import java.util.Scanner;

public class DoWhileEx01{

	public static void main(String[] args) {


				
		 int sum = 0;
		 int i = 0;
		 
		 do {
			 i++;
			 sum += i;
			 }
		 while(i<5);
		 
		 System.out.println(" 합 " + sum);

	}
}
