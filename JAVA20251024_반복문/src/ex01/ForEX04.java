package ex01;

public class ForEX04 {

	public static void main(String[] args) {

		
		/*
		 * 중첩 for문 - 구구단 출력 2단
		 * 2x1=2
		 * 2x2=4
		 * 2x3=6
		 * ...
		 * 2x9=18
		 * 
		 * 작성해보자~
		 */
		
		for(int i=2; i<=9 ; i++) {
			 System.out.println("-------------" + i + "단---------------");
			   for(int j=1; j<=9; j++)
			System.out.println(i + " x " + j + " = " + j*i);
		}
	
		
		 
	}
}
