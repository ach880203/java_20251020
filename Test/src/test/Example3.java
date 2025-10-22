package test;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		System.out.println(" 이름 : " + name);
		//Long.parse, Double.parse, Integer.parse)
		//int age = Integer.parseInt(sc.nextLine());
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(" 나이 : " + age + "살");
		String address = sc.nextLine();
		System.out.println(" 주소 : " + address);
		double weight = Double.parseDouble(sc.nextLine());
		System.out.println(" 무게 : " + weight + "Kg");
		long money = Long.parseLong(sc.nextLine());
		System.out.println(" 자산 : " + money + "냥");
		double foot =sc.nextDouble();
		System.out.println(" 발치수 : " + foot + "mm");
		int fam = sc.nextInt();
		System.out.println(" 가족원 : " + fam + "명");
		

		System.out.println("end!");
		
	}

}
