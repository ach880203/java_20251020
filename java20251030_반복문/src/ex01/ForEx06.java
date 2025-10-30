package ex01;

public class ForEx06 {

	public static void main(String[] args) {

		for(int i=2; i<=5 ; i++) {
			 System.out.println("-------------" + i + "단---------------");
			   for(int j=1; j<=9; j++) {
			   if(i == j) break;
			   System.out.println(i + " x " + j + " = " + j*i);
}
}}}