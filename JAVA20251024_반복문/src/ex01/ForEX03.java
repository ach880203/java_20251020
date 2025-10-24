package ex01;

public class ForEX03 {

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
		int i=1;
		
		
		for(; i<=100 ; ) {
		       if( i % 2 == 0)
		         sum += i;
		         i++;
		}
	
		 System.out.println("합 : " + sum);
		 
		 /*for 조건창 안해 주문이 다 들어있어도 되지만 그렇지 않은 경우도 있다.
		  * 결과는 달라지지 않는다. 그러나 전반 적으로 for안 쪽으로 주문을 넣는 것이 일반적이다.
		  */
	}
}
