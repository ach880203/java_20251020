package ex01;

public class WhileEx03 {

	public static void main(String[] args) {

		/*
		 * 중첩 while문 - 구구단 출력 - 5단까지 출력
		 */

		int i = 1;
		int j = 1;

		while (i <= 5) {
			System.out.println("-------------" + i + "단---------------");

			j = 1;
			while (j <= 9) {

				System.out.println(i + " 곱하기 " + j + " = " + i * j);
				j++;
			}
			i++;
		}

	}
}
