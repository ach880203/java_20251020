package ex7;

public class ExceptionEX06 {

	public static void main(String[] args) throws ArithmeticException { // 이렇게 던져버릴 수도 있지만... 이러면 코드를 만든 의미가 없겠지?

		System.out.println("프로그램 시작...");

		
			func1(5, 0);
		

		System.out.println("프로그램 종료...");

	}

	private static void func1(int i, int j) throws ArithmeticException {

		func2(i, j);
	}

	private static void func2(int i, int j) throws ArithmeticException {

		int result = i / j;
		System.out.println(result);
	}

}
