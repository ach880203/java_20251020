package ex01;

public class ForEX02 {

	public static void main(String[] args) {

		
		/*
		 * 1 ~ 5까지 합
		 * (for(초기값; 조건; 등가값)
		 *    조건만하면 실행될  코드(실행 코드)
		 *    실행 순서
		 *    처음 : 초기값 -> 조건 -> 실행코드 -> 증가값
		 *    이후 : 조건 -> 실행코드 -> 증가값
		 */
		
		/*
		 * 1부터 100까지의 짝수의 합
		 */
		
		int sum = 0;
		
		/*for(int i=2; i<=100; i = i+2) {       
		sum += i;
		}*/
		
		for(int i=1; i<=100 ; i++) {
		       if( i % 2 == 0)
		         sum += i;
		}
	
		 System.out.println("합 : " + sum);
		 
	}
}
