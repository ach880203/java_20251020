

package ex4;

import java.util.function.Predicate;

//람다식으로 정수를 전달하면 짝수 인지 홀수인지 판별하는 람다식 구현

public class L6_Rambda5 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = num -> num % 2 == 0 ? true : false;
			
		boolean f = p.test(10);
		if( f = true)
			System.out.printf("양수");
		else
			System.out.printf("홀수"); 

	}
}
