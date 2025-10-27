package ex01;

import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {

		int money = 0;
		int number = 0;

		while (true) {

			System.out.println("------------------------------------------------");
			System.out.println("-------- 1.예금 | 2. 출금 | 3. 잔고 | 4종료 --------");
			System.out.println("------------------------------------------------");

			Scanner sc = new Scanner(System.in);
			System.out.println(" 선택 > ");
			// 키보드로 인식한 숫자를 문자열로 인식아므로
			// 문자열로 인식된 Integer.parswInt 통해서 정수로 변환
			number = Integer.parseInt(sc.nextLine());

			System.out.println(number);

			// if or swich

			switch (number) {
			case 1:
				System.out.println("예금액> ");
				money += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액> ");
				money -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(money);
				break;
			case 4:
				break;
			default:
				System.out.println("1~4까지 정수만 입력해주세요.");
			}

			if(number ==4)break;
		}
System.out.println( " 프로그램 종료!! ");
	}
}

/*
 * if(sc.nextInt("1")) {
 * 
 * System.out.println("입금 " + money); }
 * 
 * else if(str.equals("2")) { money--; System.out.println("출금" + money); }
 * 
 * else if(str.equals("2")) { money--; System.out.println("출금" + money); }
 */

/*
 * else if(str.equals("3")) { run = false; System.out.println("꾀꼬닥..."); } else
 * { System.out.println(" 1 ~ 3 까지만 입력하세요 ");
 */
