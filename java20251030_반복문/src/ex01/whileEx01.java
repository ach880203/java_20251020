package ex01;

public class whileEx01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;

//		for(int i=0; i<=5; i++) {
//			sum += i; // sum = sum + i 로도 쓸 수 있다.4
//		}

		while (i < 3) {

			i++; // 이렇게 i를 위에 사용하면 부등호를 주의해야 한다. 값이 오바 될 수 있다.
			sum += i;

		}
		System.out.println("총합 : " + sum);

	}

}
