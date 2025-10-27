package ex02;

/*
 * 정수 배열 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구햇거 출력
 */
public class ArrayEx01 {

	public static void main(String[] args) {

		int[] numArr = new int[5];
		
		numArr[0] = 90;
		numArr[1] = 80;
		numArr[2] = 70;
		numArr[3] = 60;
		numArr[4] = 50;
		
		int sum=0;
		/*↑위에 것을 더 간략하세 적을 순 없을까??
		 * 다음클래스로 고고~
		 */
		
		
		
		
		/*sum = numArr[0]+numArr[1]+numArr[2]+numArr[3]+numArr[4]
		 *이렇게도 할 수 있으나 수가 많아지면 효율이 떯어진다.
		 */
		
		for(int i=0; i<5; i++)
			 sum += numArr[i];
		/* ↑ 위 코드의 의미는
		 * sum = sum + numArr[0];
		 * sum = sum + numArr[1];
		 * sum = sum + numArr[2];
		 * sum = sum + numArr[3];
		 * sum = sum + numArr[4];
		 * 을 반복한다는 의미 이다. 
		 */
		System.out.println("총합 : " + sum);
		
		
	}

}
