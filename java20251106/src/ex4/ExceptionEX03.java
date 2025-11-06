package ex4;

public class ExceptionEX03 {

	public static void main(String[] args) {

		
System.out.println("프로그램 시작...");
		
		
		
		int a = 5;
		int b = 2;
		
		
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
		
		
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 에러 발생");
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("배열 크기를 벗어 났습니다.");
			System.out.println(e1);
		}catch(Exception e2) {
			System.out.println("null값은 길이를 구할수 없네!");
			System.out.println(e2);
		};
		
		
		
		
		
		
		System.out.println("프로그램 종료...");
		
		
		
	}

}