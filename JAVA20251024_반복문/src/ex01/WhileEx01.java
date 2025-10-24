package ex01;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 1 ~ 5까지 합
		 * (While(초기값; 조건; 등가값)
		 *    조건만하면 실행될  코드(실행 코드)
		 *    실행 순서
		 *    처음 : 초기값 -> 조건 -> 실행코드 -> 증가값
		 *    이후 : 조건 -> 실행코드 -> 증가값
		 */
		
		/*
		 * 1부터 100까지의 합 for예시
		 * int sum = 0;
		
		for(int i=1; i<=100; i++) {
		          sum += i;
		          System.out.println("합 : " + sum);
		 */
		

		int sum1 = 0;
		int i= 0 ;
		
		while(i<655549) {
			i++;
			sum1 += i;
		}
		
		System.out.println("합 : " + sum1 );

		

		int sum = 0;
		int i1= 1 ;
		
		while(i1<=655549) {
			i1++;
			sum += i1;
		}
		
		System.out.println("합 : " + sum );
		
		
		/*
		 *  for, while 문에서 i변수를 입력할떄 1을 사용해도 상관은 없으나 배열을 배우게 되면 대부분 0을 쓴다는 것을 알게 된다.
		 *  
		 */
	}

}
