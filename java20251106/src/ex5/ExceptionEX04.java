package ex5;

public class ExceptionEX04 {

	public static void main(String[] args) {

		
System.out.println("프로그램 시작...");
		
		
		
		int a = 5;
		int b = 2;
		int c = 0;
		int[] num = new int[5];
		String str = null;
		
		/*
		 * 과거에는 코드를 입혀서 만들었다
		 * if(b != 0){
		 * int c  = a/b;
		System.out.println(c);
		}
		 * 요렇게
		 */
		
		
		try { //try블럭에는 예외가 발생할 개연성이 있는 코드를 넣어준다.
		
		
		System.out.println(num[3]);
		
		System.out.println(str.length());
		
		c  = a/b; //에러가 발생하는 경우는 b가 0인경우 예외 발생
		
		
		}catch(Exception e2) {
			System.out.println("예외 발생!");
			System.out.println(e2);
		}finally {//예외가 발생하던 안하든 출력한다!
			System.out.println(c);
		};
		
		
		
		System.out.println("프로그램 종료...");
		
		
		
	}

}