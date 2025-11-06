package ex3;

public class ExceptionEX02 {

	public static void main(String[] args) {

		
		
		System.out.println("프로그램 시작...");
		
		
		
		int a = 5;
		int b = 0;
		
		
		/*
		 * 과거에는 코드를 입혀서 만들었다
		 * if(b != 0){
		 * int c  = a/b;
		System.out.println(c);
		}
		 * 요렇게
		 */
		
		
		
		try { //try블럭에는 예외가 발생할 개연성이 있는 코드를 넣어준다.
		
			int c  = a/b; //에러가 발생하는 경우는 b가 0인경우 예외 발생
		System.out.println(c);
		
		int[] num = new int[5];
		System.out.println(num[3]);
		
		String str = null;
		System.out.println(str.length());
		
		
		}catch(Exception e) {//에러 종류를 기입하여 예외를 찾을 수 있지만 그냥 최상위인 Exception으로도 가능하다.
			System.out.println("예외 발생");
			System.out.println(e);
		
		
		
		
		
		System.out.println("프로그램 종료...");
		
		
		
	}

}}
