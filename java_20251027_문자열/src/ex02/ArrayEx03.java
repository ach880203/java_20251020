package ex02;

/*
 * 정수 배열 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구햇거 출력
 */
public class ArrayEx03 {

	public static void main(String[] args) {

		int[] numArr = {90,80,70,60,50,40,30,20,10,0,110,120,130,140,150};
		
		int sum=0;
		 System.out.println(numArr.length);
		 
		for(int i=0; i<numArr.length; i++)
			 sum += numArr[i];

		System.out.println("총합 : " + sum);
		
		System.out.println("놀랍고도 어려운 코드의세계~ 짜란~ 쏐");
	}

}
