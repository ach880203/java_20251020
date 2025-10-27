package ex02;

import java.util.Arrays;

/*
 * 정수 배열 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구햇거 출력
 * 
 * -- 배열 복사
 */
public class ArrayEx04 {

	public static void main(String[] args) {

		int[] numArr = {90,80,70,60,50};
		
		System.out.println("old numArr 길 :" + numArr.length);
		System.out.println(Arrays.toString(numArr));
        				
		//열을 10개로 확장
		int[] temp = new int[10];
		for(int i=0; i<numArr.length; i++) {
			   temp[i] = numArr[i];
		}
		
		numArr = temp;
		System.out.println("New numArr 길이 : " + numArr.length);
		System.out.println(Arrays.toString(numArr));
		
		//평수를 넓혀 이사하는 것으로 생각하면 간단하다.
		//작은 평수에서 큰평수로 이사하고 짐을 옮긴다.
		// ArrayEx01 클래스와 합쳡지지면 더 이해가 쉬울 것 같다.
	}

}
